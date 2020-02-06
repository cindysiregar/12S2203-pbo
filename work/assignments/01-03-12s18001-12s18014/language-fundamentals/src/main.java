
/**
 *
 * @author 03-12s18001 Cindy Siregar
 * @author 03-12s18014 Giovanni Situmorang
 */
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
 /* program emtry point */
    public static void main (String[] _args) {
        System.out.println("Hello, world!");
        // declaring and manipulating primitive variables
int gear = 1;
boolean result = true;
char capitalC = 'C';
byte b = 100;

System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);

gear++;
result = !result;
capitalC += 4;

System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);

// 26 in hexademical and binary
int hexVal = 0x1a;
int binVal = 0b11010;

System.out.println(hexVal + ", " + binVal);
// intantiating and manipulating objects
String name = "Wiro Sableng";
Short gearObject = 1;
Boolean resultObj = true;

System.out.println(name + ", " + gearObject + ", " + resultObj);

name = name.toUpperCase();
gearObject++;
resultObj = (result == false) || !resultObj;

System.out.println(name + ", " + gearObject + ", " +resultObj);

//Array List
   ArrayList<ArrayList<Integer>> angka = new ArrayList<ArrayList<Integer>>();
   System.out.print("jumlah_data");
   int jumlah_data = new Scanner(System.in).nextInt();
   for (int p = 0; p < jumlah_data; ++p) {
       angka.add(new ArrayList<Integer>());
       for(int q = 0; q < jumlah_data; ++q) {
           angka.get(p).add(p+q);
       }
   }

for (int p = 0; p < jumlah_data; ++p) {
    for (int q = 0; q < jumlah_data; ++q) {
    System.out.print (angka.get(p).get(q) + " ");
}
     System.out.println();
    
}
    }   
 }
