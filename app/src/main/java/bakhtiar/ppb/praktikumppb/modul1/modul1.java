package bakhtiar.ppb.praktikumppb.modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bakhtiar.ppb.praktikumppb.R;

public class modul1 extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul1);
        button = (Button) findViewById(R.id.btn_pdmodul1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(modul1.this,isiModul1.class);
                startActivity(intent);
            }
        });
    }
}

