package com.simarro.practica.aplicacion20.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.simarro.practica.aplicacion20.R;

public class Activity_Fragment_Detalle extends Fragment {

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
       return inflater.inflate(R.layout.layout_fragment_detalle,container,false);
    }

    public void mostrarDetalle(String text){
        TextView txtDetalle=getView().findViewById(R.id.txtDetalle);
        txtDetalle.setText(text);
    }
}
