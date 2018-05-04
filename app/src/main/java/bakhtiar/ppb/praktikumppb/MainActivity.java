package bakhtiar.ppb.praktikumppb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bakhtiar.ppb.praktikumppb.modul1.modul1;
import bakhtiar.ppb.praktikumppb.modul2.modul2;
import bakhtiar.ppb.praktikumppb.modul3.modul3;
import bakhtiar.ppb.praktikumppb.modul4.listView;

public class MainActivity extends AppCompatActivity {

    Button buttonModul1, buttonModul2, buttonModul3, buttonModul4,
            buttonModul5, buttonModul6, buttonModul7, buttonModul8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonModul1 = (Button) findViewById(R.id.btnmodul1);
        buttonModul2 = (Button) findViewById(R.id.btnmodul2);
        buttonModul3 = (Button) findViewById(R.id.btnmodul3);
        buttonModul4 = (Button) findViewById(R.id.btnmodul4);


        //Method utk klik tombol modul 1
        buttonModul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, modul1.class);
                startActivity(intent);
            }
        });

        //Method untuk klik tombol modul 2
        buttonModul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, modul2.class);
                startActivity(intent);
            }
        });

        //Method untuk klik tombol modul 3
        buttonModul3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, modul3.class);
                startActivity(intent);
            }
        });

        //Method untuk klik tombol modul 4
        buttonModul4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, listView.class);
                startActivity(intent);
            }
        });
    }
}


