package co.gov.mintic.misiontic.ciclo4.usa.cilo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActividadY extends AppCompatActivity {

    String datoX;
    EditText campoDato;
    Button botonDato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad_y);
        datoX = getIntent().getStringExtra("datox");
        campoDato = (EditText) findViewById(R.id.campoDatoY);
        botonDato = (Button) findViewById(R.id.btnY);
    }

    @Override
    protected void onStart() {
        super.onStart();
        /*
        Intent intento = getIntent();
        Bundle datosExtras = intento.getExtras();
        String dato = datosExtras.getString("datox");
        */
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(datoX != null && !datoX.isEmpty()){
            Toast.makeText(this, "DATOX: "+datoX, Toast.LENGTH_SHORT).show();
        }
    }


    public void abrirActivdadX(View view) {
        String datoY = campoDato.getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("datoy", datoY);
        startActivity(i);
    }
}