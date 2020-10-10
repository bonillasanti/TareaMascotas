package com.example.tareamascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;

public class DetalleMascostas extends AppCompatActivity {

    ArrayList<ListaMascotas> listaDatos;
    RecyclerView recyclerr;

//CREAR EL RECYCLER DESDE CERO EN LA SEGUNDA
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_detalle_mascostas );


        listaDatos = new ArrayList<> ();
        recyclerr = (RecyclerView) findViewById ( R.id.recy2 );

        Toolbar miActionBar = (Toolbar) findViewById ( R.id.miactionbar );
        setSupportActionBar ( miActionBar );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

        recyclerr.setLayoutManager ( new GridLayoutManager ( this, 1 ) );

        llenarD ();

        AdapterDatos adapter = new AdapterDatos ( listaDatos );
        recyclerr.setAdapter ( adapter );


    }

    private void llenarD() {

        listaDatos.add ( new ListaMascotas ( "Gato", R.drawable.gatito, "6" ) );
        listaDatos.add ( new ListaMascotas ( "Ardilla", R.drawable.ardillita, "5" ) );

    }

}
