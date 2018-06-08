package bakhtiar.ppb.praktikumppb.modul5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import bakhtiar.ppb.praktikumppb.R;

public class Modul5 extends AppCompatActivity {

    Fragment_01 fragmentOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fragmentOne = new Fragment_01 ();
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_modul5 );
    }

    public void onButtonClick ( View v ) {
        Fragment_02 fragmentTwo = (Fragment_02) getFragmentManager ().findFragmentById ( R.id.fragment_two);

        switch ( v. getId ()) {
            case R. id . btn_one_create_new :
                if ( fragmentTwo == null ) {

                    Intent i = new Intent ( this , DrawingActivity. class );
                    startActivity ( i );
                } else {

                    Toast. makeText ( this , "Will be implemented later" , Toast. LENGTH_SHORT ) . show ();
                }
                break ;
            case R. id . btn_one_open_existing :
                Toast. makeText ( this , "Will be implemented later" , Toast. LENGTH_SHORT ) . show ();
                break ;
            default :
        }
    }
}
