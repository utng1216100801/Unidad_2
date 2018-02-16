package mx.edu.utng.unidad2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventosActivity extends AppCompatActivity {

    private Evento[] eventos = {
            new Evento(R.drawable.evento1, "Comentario"),
            new Evento(R.drawable.evento3, "Comentario"),
            new Evento(R.drawable.evento4, "Comentario"),
            new Evento(R.drawable.evento5, "Comentario"),
            new Evento(R.drawable.evento6, "Comentario"),
            new Evento(R.drawable.evento7, "Comentario"),
    };
    private ListView lsvEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);
        lsvEventos = findViewById(R.id.lsv_eventos);
        EventoAdapter adapter = new EventoAdapter(this, eventos);
        lsvEventos.setAdapter(adapter);

    }

    static class ViewHolder{
        TextView txvName;
        ImageView imvPhoto;
        CardView cardView;
    }

    class EventoAdapter extends ArrayAdapter<Evento> {
        public EventoAdapter(@NonNull Context context, Evento[] data){
            super(context, R.layout.cell_eventos, data);
        }
        @NonNull
        @Override
        public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
            View cell = convertView;
            EventosActivity.ViewHolder holder;
            if (cell == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                cell = inflater.inflate(R.layout.cell_eventos,null);

                holder = new EventosActivity.ViewHolder();
                holder.cardView = cell.findViewById(R.id.card1);
                holder.imvPhoto = cell.findViewById(R.id.imv_photo);
                holder.txvName = cell.findViewById(R.id.txv_name);


                cell.setTag(holder);
            }else{
                holder = (EventosActivity.ViewHolder) cell.getTag();
            }
            holder.imvPhoto.setImageResource(eventos[position].getPhoto());
            holder.txvName.setText(eventos[position].getName());
            return  cell;
        }
    }
}
