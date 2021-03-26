package com.dhimas.tgs2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TxtTampil, TxtJudul;
    EditText EdtNpm, EdtNama, EdtJurusan, EdtFakultas;
    Button BtnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtJudul = (TextView) findViewById(R.id.TxtJudul);
        TxtJudul.setText("Data Diri");
        TxtTampil = (TextView) findViewById(R.id.TxtTampil);

        EdtNpm = (EditText) findViewById(R.id.EdtNpm);
        EdtNama = (EditText) findViewById(R.id.EdtNama);
        EdtFakultas = (EditText) findViewById(R.id.EdtFakultas);
        EdtJurusan = (EditText) findViewById(R.id.EdtJurusan);
        BtnSubmit = (Button) findViewById(R.id.BtnSubmit);

        BtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = EdtNpm.getText().toString();
                String strNama = EdtNama.getText().toString();
                String strFakultas = EdtFakultas.getText().toString();
                String strJurusan = EdtJurusan.getText().toString();
                TxtTampil.setText(strNpm + "\n" + strNama + "\n" + strJurusan+ "\n" + strJurusan);
            }
        });
    }
}