package bakhtiar.ppb.praktikumppb.modul4;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.ListActivity;
import android.database.Cursor;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import bakhtiar.ppb.praktikumppb.R;

public class listView extends ListActivity {

    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modul4_activity);
        cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        startManagingCursor(cursor);
        String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER,
                ContactsContract.CommonDataKinds.Phone._ID};
        int[] to = {android.R.id.text1, android.R.id.text2};
        SimpleCursorAdapter listadapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, cursor, from, to);
        setListAdapter(listadapter);
    }
}
