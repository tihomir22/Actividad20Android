package com.simarro.practica.aplicacion20.principal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simarro.practica.aplicacion20.R;
import com.simarro.practica.aplicacion20.fragment.Activity_Fragment_Detalle;
import com.simarro.practica.aplicacion20.fragment.Activity_Fragment_Lista;
import com.simarro.practica.aplicacion20.fragment.CorreoListener;
import com.simarro.practica.aplicacion20.pojo.Correo;

public class Activity_Principal extends AppCompatActivity implements CorreoListener {

    Activity_Fragment_Lista fgrListado=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_principal);
        this.fgrListado= (Activity_Fragment_Lista) getSupportFragmentManager().findFragmentById(R.id.frgListado);
        this.fgrListado.setCorreosListener(this);
    }

    @Override
    public void onCorreoSelect(Correo c) {
        boolean hayDetalle=(getSupportFragmentManager().findFragmentById(R.id.frgDetalle)!=null);
        if(hayDetalle){
            ((Activity_Fragment_Detalle)getSupportFragmentManager().findFragmentById(R.id.frgDetalle)).mostrarDetalle(c.getText());
        }else{
            Intent intento=new Intent(this,Activity_Detalle.class);
            intento.putExtra("textoDetalle",c.getText());
            startActivity(intento);
        }

    }
}
