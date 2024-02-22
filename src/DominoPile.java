import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DominoPile extends Domino{
    private ArrayList<Domino> dominoArrayList;
    public DominoPile() {
        this.dominoArrayList = new ArrayList();
    }

    public ArrayList<Domino> getPile() {
        return dominoArrayList;
    }





    public void newStack6() {
        dominoArrayList.clear();
        for(int i = 0; i<=6; i++) {
            for (int j = 0; j<=6; j++) {
                if (j<i) continue;
                Domino domino = new Domino(i,j);
                System.out.println(String.valueOf(i) + String.valueOf(j));
                dominoArrayList.add(domino);
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(dominoArrayList);
    }

}
