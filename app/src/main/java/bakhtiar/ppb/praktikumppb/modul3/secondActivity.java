package bakhtiar.ppb.praktikumppb.modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import bakhtiar.ppb.praktikumppb.R;

public class secondActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6;

    String name, reg, dept, kota, hobi, tglLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modul3_second_activity);

        t1=(TextView) findViewById ( R.id.textView1 );
        t2=(TextView) findViewById ( R.id.textView2 );
        t3=(TextView) findViewById ( R.id.textView3 );
        t4=(TextView)findViewById ( R.id.textView4 );
        t5=(TextView )findViewById ( R.id.textView5 );
        t6=(TextView )findViewById ( R.id.textView6 );

        //Getiing the Intent
        Intent i = getIntent();

        //Getting the Values from FIrst Activity using the internet received
        name=i.getStringExtra ( "name_key" );
        reg=i.getStringExtra ( "reg_key" );
        dept=i.getStringExtra ( "dept_key" );
        tglLahir=i.getStringExtra ( "tglLahir_key" );
        kota=i.getStringExtra ( "kota_key" );
        hobi=i.getStringExtra ( "hobi_key" );

        //Setting the Values to Intent
        t1.setText ( name );
        t2.setText ( reg );
        t3.setText ( dept );
        t4.setText ( tglLahir );
        t5.setText ( kota );
        t6.setText ( hobi );
    }
}
