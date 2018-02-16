package mx.edu.utng.unidad2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View view) {
        startActivity(new Intent( this, UbicacionActivity.class));
    }
    public void click2(View view) {
        startActivity(new Intent( this, NotificacionesActivity.class));
    }
    public void click3(View view) {
        startActivity(new Intent( this, ReservacionesActivity.class));
    }
    public void click4(View view) {
        startActivity(new Intent( this, EventosActivity.class));
    }
    public void click5(View view) {
        startActivity(new Intent( this, BebidasActivity.class));
    }
    public void click6(View view) {
        startActivity(new Intent( this, AdminActivity.class));
    }
}
