package com.arjuna.quiz15jan_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etangka;
    TextView txthasil;
    Button btnhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etangka = (EditText) findViewById(R.id.etangka);
        btnhasil = (Button) findViewById(R.id.btnhasil);
        txthasil = (TextView) findViewById(R.id.txthasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nangka = etangka.getText().toString();

                int aAngka = Integer.parseInt(nangka);

                //kondisi panjang nya kosong
                if (aAngka >= 10) {
                    //memberikan warning berupa eror
                    txthasil.setText(" Bigger Than 10");
                } else {
                    txthasil.setText("Smaller Than 10");
                }


            }
        });
    }
}
