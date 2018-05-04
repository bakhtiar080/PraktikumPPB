package bakhtiar.ppb.praktikumppb.modul3;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import bakhtiar.ppb.praktikumppb.R;


public class modul3 extends AppCompatActivity {

    //Defining the Views
    EditText e1,e2, e4,e5,tanggal;
    Button bt,tgl;
    Spinner s;
    SimpleDateFormat dateFormatter;

    //Data for populating in Spinner
    String [] dept_array={"CSE","ECE","IT","Mech","Civil"};

    String name, reg, dept, kota, hobi, tglLahir;

    public void showDateDialog(){
        Calendar newCalender = Calendar.getInstance ();
        DatePickerDialog datePickerDialog = new DatePickerDialog ( this, new DatePickerDialog.OnDateSetListener () {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance ();
                newDate.set ( year, month, dayOfMonth );

                tanggal.setText ( dateFormatter.format ( newDate.getTime () ) );
            }
        }, newCalender.get ( Calendar.YEAR ), newCalender.get ( Calendar.MONTH ), newCalender.get ( Calendar.DAY_OF_MONTH ));
        datePickerDialog.show ();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modul3_activity);

        //Refering the Views
        e1=(EditText)findViewById ( R.id.editText1 );
        e2=(EditText)findViewById ( R.id.editText2 );
        e4=(EditText ) findViewById ( R.id.editText4 );
        e5=(EditText ) findViewById ( R.id.editText5 );
        tanggal=(EditText ) findViewById ( R.id.editTextTgl );
        bt=(Button)findViewById ( R.id.button );
        s=(Spinner)findViewById ( R.id.spinner );

        dateFormatter = new SimpleDateFormat ( "dd-MM-yyyy", Locale.US );
        tanggal = (EditText ) findViewById ( R.id.editTextTgl );
        tgl=(Button ) findViewById ( R.id.buttonTanggal );

        //Creating Adapter for Spinner for adapting the data from array to Spinner
        ArrayAdapter adapter=new ArrayAdapter(modul3.this,android.R.layout.simple_spinner_item,dept_array);
        s.setAdapter(adapter);

        //Creating Listener for Button
        bt.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                //Getting the Values from Views(Edittext & Spinner)
                name=e1.getText ().toString ();
                reg=e2.getText ().toString ();
                tglLahir=tanggal.getText ().toString ();
                kota=e4.getText ().toString ();
                hobi=e5.getText ().toString ();
                dept=s.getSelectedItem ().toString ();

                //Intent for Navigating to Second Activity
                Intent i = new Intent(modul3.this,secondActivity.class);

                //For Passing the Values to Second Activity
                i.putExtra ( "name_key", name );
                i.putExtra ( "reg_key", reg );
                i.putExtra ( "dept_key", dept );
                i.putExtra ( "tglLahir_key", tglLahir );
                i.putExtra ( "kota_key", kota );
                i.putExtra ( "hobi_key",hobi );

                startActivity ( i );
            }
        });
        dateFormatter = new SimpleDateFormat ( "dd-MM-yyyy", Locale.US );
        tanggal =(EditText) findViewById ( R.id.editTextTgl );
        tgl = (Button) findViewById ( R.id.buttonTanggal );
        tgl.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                showDateDialog ();
            }
        } );
    }
}
