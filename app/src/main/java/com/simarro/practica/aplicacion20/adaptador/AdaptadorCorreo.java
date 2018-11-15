package com.simarro.practica.aplicacion20.adaptador;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.simarro.practica.aplicacion20.R;
import com.simarro.practica.aplicacion20.pojo.Correo;

import java.util.ArrayList;

public class AdaptadorCorreo extends ArrayAdapter<Correo> {

    Activity context;
    ArrayList<Correo> datos=new ArrayList<>();
    private ListView listView;



    public AdaptadorCorreo(Fragment context, ArrayList<Correo> datos) {
        super(context.getActivity(), R.layout.layout_elemento_lista, datos);
        this.context=context.getActivity();
        this.datos=datos;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View item=inflater.inflate(R.layout.layout_elemento_lista,null);

        TextView lblDe=item.findViewById(R.id.lblDe);
        lblDe.setText(datos.get(position).getDe());

        TextView lblAsunto=item.findViewById(R.id.lblAsunto);
        lblAsunto.setText(datos.get(position).getAsunto());


        return item;
    }
}
