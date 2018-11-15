package com.simarro.practica.aplicacion20.principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simarro.practica.aplicacion20.R;
import com.simarro.practica.aplicacion20.fragment.Activity_Fragment_Detalle;

public class Activity_Detalle extends AppCompatActivity {

    private Activity_Fragment_Detalle detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_detalle);

    this.detalle=((Activity_Fragment_Detalle)getSupportFragmentManager().findFragmentById(R.id.frgDetalle));
    this.detalle.mostrarDetalle(getIntent().getStringExtra("textoDetalle"));
    }
}
