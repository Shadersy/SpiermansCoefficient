
import jdk.nashorn.internal.ir.IdentNode;

import java.lang.reflect.Array;
import java.util.*;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;



public class Main {

    public static void main(String args[]) {

//Программа для вычисления ранговой корелляции Спирмена
//Входные данные: массив e1, e2(одинакового размера), массив WorkSpace с количеством 0.0,
// соотв. кол-ву элементов е1 и е2.
        double [] e1 = {1.0, 2.5, 2.5, 4.0, 5.5, 5.5, 7.0, 8.0};
        double [] e2 = {2.0, 1.0, 3.5, 3.5, 6.0, 7.0, 5.0, 8.0};
        double [] WorkSpace = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        int size = e1.length;


        SpirmansCoefficient obj1 = new SpirmansCoefficient();




        WorkSpace = obj1.SolveDifference(e1, e2);
        System.out.println("Разница между элементами массива: ");
        for(int i=0; i<WorkSpace.length; i++){
            System.out.print(WorkSpace[i]+ " ");
        }


        System.out.println("\n");

        double d = obj1.SolveD(WorkSpace);
        System.out.println("d = " + d);

        System.out.println("\n");
        System.out.println(obj1.SolveFinnalyCoefficient(d, size));



   

    }
}
