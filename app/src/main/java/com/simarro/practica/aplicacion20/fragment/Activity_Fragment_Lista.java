package com.simarro.practica.aplicacion20.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.simarro.practica.aplicacion20.R;
import com.simarro.practica.aplicacion20.adaptador.AdaptadorCorreo;
import com.simarro.practica.aplicacion20.pojo.Correo;

import java.util.ArrayList;

public class Activity_Fragment_Lista extends Fragment implements AdapterView.OnItemClickListener {

    private ArrayList<Correo>datos=new ArrayList<Correo>();
    private ListView listado;
    private CorreoListener listener;


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_fragment_lista,container,false);
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        this.listado=getView().findViewById(R.id.listado);

        datos.add(new Correo("Ainsley Harriot","That meat","That meat needs some jerking"));
        datos.add(new Correo("Ainsley Harriot2","That meat2","That meat needs some jerking2"));
        datos.add(new Correo("Ainsley Harriot3","That meat3","That meat needs some jerking3"));
        datos.add(new Correo("Ainsley Harriot4","That meat4","That meat needs some jerking4"));
        datos.add(new Correo("Ainsley Harriot5","That meat5","That meat needs some jerking5"));

        this.listado.setAdapter(new AdaptadorCorreo(this,this.datos));

        this.listado.setOnItemClickListener(this);
    }

    public void setCorreosListener(CorreoListener listener){
        this.listener=listener;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(this.listener!=null){
            this.listener.onCorreoSelect((Correo)this.listado.getAdapter().getItem(position));
        }
    }
}
