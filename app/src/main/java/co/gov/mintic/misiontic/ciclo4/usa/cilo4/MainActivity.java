package co.gov.mintic.misiontic.ciclo4.usa.cilo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText campoDato;
    Button botonDato;
    String datoY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoDato = (EditText) findViewById(R.id.campoDatoX);
        botonDato = (Button) findViewById(R.id.btnX);
        botonDato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPantallaY();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "DatoY: "+getIntent().getStringExtra("datoy"),
                        Toast.LENGTH_SHORT).show();
    }

    public void abrirPantallaY(){
        String dato = campoDato.getText().toString();
        Intent intento = new Intent(this,ActividadY.class);
        intento.putExtra("datox",dato);
        startActivity(intento);
    }



}