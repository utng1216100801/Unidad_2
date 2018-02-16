package mx.edu.utng.unidad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ReservacionesActivity extends AppCompatActivity {
    private Spinner spnNum;
    private String[] personas = {"1", "2", "3", "4","5","6","7","8","9","10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservaciones);
        spnNum = (Spinner)findViewById(R.id.spn_num);

        ArrayAdapter<String> foodAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item
                , personas);
        spnNum.setAdapter(foodAdapter);

        spnNum.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ReservacionesActivity.this, "You selected: " + personas[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
