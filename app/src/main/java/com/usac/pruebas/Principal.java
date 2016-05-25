package com.usac.pruebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_principal);
        TextView n = new TextView(this);
        n.setText("AQUI ESTOY DEFINIENDO QUE UNICAMENTE EL TEXTO VA A APARECER");
        setContentView(n);
    }
}
