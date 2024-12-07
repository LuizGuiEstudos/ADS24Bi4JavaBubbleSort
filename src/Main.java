import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrToOrder  = { 100 ,10 ,4, 5, 2, 3, 1, -5 };

        System.out.println( " Array antes de ordenar: " );
        System.out.println(  Arrays.toString(arrToOrder) );
        System.out.println();

        arrToOrder = bubbleSort( arrToOrder );

        System.out.println(" Array ordenado:" );
        System.out.println( Arrays.toString(arrToOrder) );

    }


    private static int[] bubbleSort( int[] arr ) {
        int leng = arr.length;
        boolean trocou = false; //otimizacao, break de loopings

        //ativa o loop abaixo x vezes
        for( int i=0; i < leng; i++ )
        {
            trocou = false;
            //passa em sequencia por cada numero - a quantidade de vezes já passou pelo looping
            //  pois os ultimos que foram organizados já estao necessariamente organizados
            for( int j=0; j< leng - i -1; j++ )
            {
                int el = arr[j];
                int nextEl = arr[ j+1 ];
                int hold;

                if( el > nextEl )       {
                    //troca
                    arr[j] = nextEl;
                    arr[j +1] = el;

                    trocou = true;

                }
            }
            //se não houve nenhuma troca no looping, quebrar loopings pois tudo já está ordenado
            if ( trocou == false )      {
                break;
            }
        }

        return arr; //RETURN

    } //bubbleSort


}