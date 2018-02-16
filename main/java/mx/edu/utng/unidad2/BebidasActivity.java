package mx.edu.utng.unidad2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class BebidasActivity extends AppCompatActivity {
    private Bebida[] bebidas = {
            new Bebida(R.drawable.bacardi, "Bacardí"),
            new Bebida(R.drawable.buchanans, "Buchanan's"),
            new Bebida(R.drawable.cosmopolitan, "Cosmopolitan"),
            new Bebida(R.drawable.margarita, "Margarita"),
            new Bebida(R.drawable.martini, "Martini"),
            new Bebida(R.drawable.mojito, "Mojito"),
            new Bebida(R.drawable.vodka, "vodka"),
            new Bebida(R.drawable.whiskey, "Whiskey"),
    };
    private ListView lsvBebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
        lsvBebidas = findViewById(R.id.lsv_bebidas);
        BebidaAdapter adapter = new BebidaAdapter(this, bebidas);
        lsvBebidas.setAdapter(adapter);

    }

    static class ViewHolder{
        TextView txvName;
        ImageView imvPhoto;
    }

    class BebidaAdapter extends ArrayAdapter<Bebida> {
        public BebidaAdapter(@NonNull Context context, Bebida[] data){
            super(context, R.layout.cell_bebidas, data);
        }
        @NonNull
        @Override
        public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
            View cell = convertView;
            ViewHolder holder;
            if (cell == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                cell = inflater.inflate(R.layout.cell_bebidas,null);

                holder = new ViewHolder();
                holder.imvPhoto = cell.findViewById(R.id.imv_photo);
                holder.txvName = cell.findViewById(R.id.txv_name);

                cell.setTag(holder);
            }else{
                holder = (ViewHolder) cell.getTag();
            }
            holder.imvPhoto.setImageResource(bebidas[position].getPhoto());
            holder.txvName.setText(bebidas[position].getName());
            return  cell;
        }
    }
}
