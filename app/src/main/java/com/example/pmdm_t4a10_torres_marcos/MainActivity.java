package com.example.pmdm_t4a10_torres_marcos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    myArrayAdapter<Arma> adaptador;
    WebView visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);
        adaptador = new myArrayAdapter<Arma>(this, DatosArmas.ARMAS);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Arma armaActual = (Arma) adaptador.getItem(position);
        String msg = armaActual.getNombreAbreviado();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        String link = armaActual.getWeb();
        visor = (WebView) findViewById(R.id.webView);
        visor.getSettings().setJavaScriptEnabled(true);
        visor.loadUrl(link);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}