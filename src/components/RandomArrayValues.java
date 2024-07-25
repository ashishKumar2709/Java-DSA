package components;

import java.util.Random;

public class RandomArrayValues {
    public void addArrayValues(int[] array){
        Random random = new Random();
        for(int i=0;i<array.length;i++){
            array[i]= random.nextInt(1000);
        }
    }
}
