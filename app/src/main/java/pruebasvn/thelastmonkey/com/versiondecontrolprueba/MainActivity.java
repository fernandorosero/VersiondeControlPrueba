package pruebasvn.thelastmonkey.com.versiondecontrolprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSaludos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaludos = (Button)findViewById(R.id.btnSaluditos);

        btnSaludos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(getApplicationContext(),"Saludos desde el click de la app",Toast.LENGTH_SHORT).show();
               Toast.makeText(MainActivity.this, "Toshiba i5", Toast.LENGTH_SHORT).show();
               Toast.makeText(getApplicationContext(),"Lenovo i5 ",Toast.LENGTH_SHORT).show();
               Toast.makeText(MainActivity.this, "Mejor otro boton", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
