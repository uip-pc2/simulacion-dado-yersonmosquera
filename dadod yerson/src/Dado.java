import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class Dado {
    private ArrayList<Integer> lanzamientos = new ArrayList<Integer>();
    Random random = new Random();

    public int lanzar(){
        int ram =  1 + random.nextInt(6);

        setLanzamientos(ram);

        return ram;
    }
    public void resultados(){

        for (int x=0; x < lanzamientos.size(); x++ ){
            System.out.println( "Lanzamiento #"+ (x+1) + " Resultado: "+ lanzamientos.get(x));
        }
    }


    public void setLanzamientos(int lanzamientos) {
        this.lanzamientos.add(lanzamientos);
    }
}
