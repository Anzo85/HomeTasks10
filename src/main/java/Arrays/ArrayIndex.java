package Arrays;

/**
 * Created by anzo0316 on 9/12/2016.
 */
public class ArrayIndex {

    int [] array ;
    int element;

    public ArrayIndex(int [] array , int element){
        this.array = array;
        this.element = element;
    }

    public int findeIndex(){


        int low = 0;
        int high = array.length-1;

        while (low <= high){
            int midle = (low+high)/2;
            if(array[midle] == element){
                return midle;
            }
            if(array[midle] < element){
                low = midle+1;
            }
            if(array[midle] > element){
                high = midle -1;
            }

        }

        return -1;
    }
}
