import java.util.Scanner;

public class stringFormat {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("================================");
    for (int i = 0; i < 3; i++) {
      String s1 = sc.next();
      int x = sc.nextInt();
      // Complete this line
      System.out.printf("%-15s%03d%n", s1, x);
    }
    System.out.println("================================");

  }
}

// Sample Input

// java 100 
// cpp 65 
// python 50
// Sample Output

// ================================
// java       100 
// cpp        065 
// python     050
// ================================




// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

//   public static void main(String[] args) {
//     /*
//      * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
//      * class should be named Solution.
//      */
//     boolean flag = true;
//     Scanner sc = new Scanner(System.in);
//     int counter = 1;

//     while (flag) {
//       if (sc.hasNext()) {
//         String line = sc.nextLine();
//         System.out.println(counter + " " + line);
//         counter++;
//       } else {
//         flag = false;
//       }
//     }
//     sc.close();
//   }
// }


// import java.util.*;
// import java.io.*;

// class Solution {
//   public static void main(String[] argh) {

//     Scanner sc = new Scanner(System.in);
//     int t = sc.nextInt();

//     for (int i = 0; i < t; i++) {

//       try {
//         long x = sc.nextLong();
//         System.out.println(x + " can be fitted in:");
//         if (x >= -128 && x <= 127)
//           System.out.println("* byte");
//         // if( x >= -Math.pow(2, 15) && x <= Math.pow(2, 15))
//         if (x >= -32768 && x <= 32767)
//           System.out.println("* short");
//         if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
//           System.out.println("* int");
//         if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
//           System.out.println("* long");
//         // Complete the code
//       } catch (Exception e) {
//         System.out.println(sc.next() + " can't be fitted anywhere.");
//       }

//     }
//   }
// }


//integer value to string
// Scanner sc = new Scanner(System.in);
// // n = String.valueOf(n);
// // System.out.println(n);
// String s = String.valueOf(n);sc.close()
// ;

//      * The function is expected to return a STRING.
//      * The function accepts following parameters:
//      *  1. INTEGER month
//      *  2. INTEGER day
//      *  3. INTEGER year
//      */

//     public static String findDay(int month, int day, int year) {
//         Calendar cal = Calendar.getInstance();
//          cal.set(year, month -1, day);
//         // cal.set(Calendar.MONTH, month-1);
//         // cal.set(Calendar.DAY_OF_MONTH, day);
//         // cal.set(Calendar.YEAR, year);
//         int d = Calendar.DAY_OF_WEEK;
//         System.out.println(cal);
//         System.out.println(d);

//         return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        
//     }

// }