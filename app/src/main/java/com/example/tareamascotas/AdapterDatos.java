package com.example.tareamascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    ArrayList<ListaMascotas> listaDatos;

    public AdapterDatos(ArrayList<ListaMascotas> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @NonNull
    @Override
    public AdapterDatos.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //View view = LayoutInflater.from ( parent.getContext () ).inflate ( R.layout.item_list,null,false );
        View view = LayoutInflater.from ( parent.getContext () ).inflate ( R.layout.cardimagenes,null,false );


        return new ViewHolderDatos ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterDatos.ViewHolderDatos holder, final int position) {

        holder.btnLike.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //Toast toast = new Toast.makeText (  , "Diste like a ", Toast.LENGTH_SHORT).show ();

                Toast.makeText(v.getContext(), "Diste like a "+ listaDatos.get ( position ).getNombre (),
                        Toast.LENGTH_SHORT).show();

            }
        } );
        //holder.asignarDatos(listaDatos.get ( position ));
        holder.nomb.setText ( listaDatos.get ( position ).getNombre () );
        holder.img.setImageResource ( listaDatos.get ( position ).getImagenn () );
        holder.contadorLike.setText ( listaDatos.get ( position ).getContadorLike () );

    }

    @Override
    public int getItemCount() {
        return listaDatos.size ();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView nomb;
        ImageView img;
        TextView contadorLike;
        ImageButton btnLike;

        public ViewHolderDatos(@NonNull View itemView) {
            super ( itemView );
            //dato = (TextView) itemView.findViewById ( R.id.idDato );
            nomb = (TextView) itemView.findViewById ( R.id.TxV1 );
            img = (ImageView) itemView.findViewById ( R.id.imgVer );
            contadorLike = (TextView) itemView.findViewById ( R.id.ContadorLike );
            btnLike = (ImageButton) itemView.findViewById ( R.id.ImgHuesoLike );

        }

       /* public void asignarDatos(String datos) {

            dato.setText ( datos );

        }*/
    }

}
