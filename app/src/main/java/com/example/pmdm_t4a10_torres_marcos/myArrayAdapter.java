package com.example.pmdm_t4a10_torres_marcos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class myArrayAdapter<T> extends ArrayAdapter<T> {

    public myArrayAdapter(@NonNull Context context, List<T> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//Salvando la referencia del View de la fila
        View listItemView = convertView;
//Comprobando si el View no existe
        if (null == convertView) {
//Si no existe, entonces inflarlo con image_list_view.xml
            listItemView = inflater.inflate(
                    R.layout.image_list_item,
                    parent,
                    false);
        }
//Obteniendo instancias de los elementos
        TextView titulo = (TextView) listItemView.findViewById(R.id.text1);
        TextView subtitulo = (TextView) listItemView.findViewById(R.id.text2);
        ImageView categoria = (ImageView) listItemView.findViewById(R.id.category);

//Obteniendo instancia de la Tarea en la posición actual
        Arma item = (Arma) getItem(position);
        titulo.setText(item.getNombre());
        subtitulo.setText("Cuerpo: "+item.getDañoCuerpo()+"  Cabeza: "+item.getDañoCabeza()+"  Recarga: "+item.getRecarga());
        categoria.setImageResource(item.getCategoria());
//Devolver al ListView la fila creada
        return listItemView;
    }

}


