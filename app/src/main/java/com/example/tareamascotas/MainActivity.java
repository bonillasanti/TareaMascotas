package com.example.tareamascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ListaMascotas> listaDatos;
    RecyclerView recycler;
    private ImageButton btn_linke;
    //Button strella;
    //private int conteo = 0;
    //private TextView contadorLike;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        //strella = (Button) findViewById ( R.id.ranqueo );
        listaDatos = new ArrayList<> ();
        recycler = (RecyclerView) findViewById ( R.id.mirecycle );
        btn_linke = (ImageButton) findViewById ( R.id.ImgHuesoLike );
        //empieza fragmento de menu

        Toolbar miActionBar = (Toolbar) findViewById ( R.id.miactionbar );
        setSupportActionBar ( miActionBar );
        //termina los menus

        //en forma de layout de lista vertical es asi como abajo se escribe
        //recycler.setLayoutManager ( new LinearLayoutManager ( this,LinearLayoutManager.VERTICAL,false ) );
        //en forma de grid es asi, y dentro del gridmanager definimos en de cuantas columnas
        recycler.setLayoutManager ( new GridLayoutManager ( this, 1 ) );

        llenarD ();
        //agregando 50 objetos con for
        /*listaDatos = new ArrayList<String> ();
        for ( int i = 0 ; i<=50 ; i++ ){
            listaDatos.add ( "Dato"+i+"asi" );
        }*/

        AdapterDatos adapter = new AdapterDatos ( listaDatos );
        recycler.setAdapter ( adapter );

    }

    private void llenarD() {

        listaDatos.add ( new ListaMascotas ( "Perro", R.drawable.perrito, "1" ) );
        listaDatos.add ( new ListaMascotas ( "Gato", R.drawable.gatito, "6" ) );
        listaDatos.add ( new ListaMascotas ( "Ardilla", R.drawable.ardillita, "5" ) );
        listaDatos.add ( new ListaMascotas ( "Conejo", R.drawable.conejo, "1" ) );

    }


    public void strella (){
        Intent intent = new Intent ( this,DetalleMascostas.class );
        startActivity ( intent );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater ();
        inflater.inflate ( R.menu.menuaction, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId ()){
            case R.id.ranqueo:
                Toast.makeText ( this,"ranquet",Toast.LENGTH_SHORT ).show ();
                //strella ();
                Intent intent = new Intent(this, DetalleMascostas.class);
                this.startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected ( item );
        }
        return true;
    }

}
