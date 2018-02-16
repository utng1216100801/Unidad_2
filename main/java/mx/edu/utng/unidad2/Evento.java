package mx.edu.utng.unidad2;

/**
 * Created by Diana Manzano on 15/02/2018.
 */

public class Evento {
    private int photo;
    private String name;

    public Evento(int photo, String name){
        this.photo = photo;
        this.name = name;
    }

    public Evento(){
        this(android.R.mipmap.sym_def_app_icon,"unamed");
    }
    public int getPhoto (){
        return photo;
    }
    public  String getName(){
        return name;
    }
}
