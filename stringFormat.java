// import java.util.Scanner;

// public class stringFormat {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("================================");
//     for (int i = 0; i < 3; i++) {
//       String s1 = sc.next();
//       int x = sc.nextInt();
//       // Complete this line
//       System.out.printf("%-15s%03d%n", s1, x);
//     }
//     sc.close();
//     System.out.println("================================");
//   }
// }

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


// java.util.*;
// import java.text.*;
// import java.util.Locale;

// public class Solution {

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     double payment = scanner.nextDouble();
//     scanner.close();

//     // Write your code here.

//     Locale us_loc = new Locale("en", "US");
//     Currency us = Currency.getInstance(us_loc);
//     NumberFormat currencyFormatterUs = NumberFormat.getCurrencyInstance(us_loc);
//     Locale india_loc = new Locale("en", "IN");
//     NumberFormat currencyFormatterIn = NumberFormat.getCurrencyInstance(india_loc);
//     Locale china_loc = new Locale("zh", "CN");
//     NumberFormat currencyFormatterCh = NumberFormat.getCurrencyInstance(china_loc);
//     Locale france_loc = new Locale("fr", "FR");
//     NumberFormat currencyFormatterFr = NumberFormat.getCurrencyInstance(france_loc);

//     System.out.println("US: " + currencyFormatterUs.format(payment));
//     System.out.println("India: " + currencyFormatterIn.format(payment));
//     System.out.println("China: " + currencyFormatterCh.format(payment));
//     System.out.println("France: " + currencyFormatterFr.format(payment));
//   }
// }



// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

//   // Write your code here
//   static Scanner sc = new Scanner(System.in);
//   static boolean flag = true;
//   static int B = sc.nextInt();
//   static int H = sc.nextInt();

//   static {
//         try{
//             if(B <= 0 || H <= 0){
//                 flag = false;
//                 throw new Exception("Breadth and height must be positive");
//             }
//         } catch(Exception e){
//             System.out.println(e);
//         }
//     }

// public static void main(String[] args){



  ///=========================================================
  ///String related exercises
  // import java.util.Scanner;

  // public class Solution {

  //   static boolean isAnagram(String a, String b) {
  //       // Complete the function
  //       java.util.Map<Character, Integer> counter = new java.util.HashMap<>();
  //       for(int i = 0; i < a.length(); i++){
  //           char curChar = a.charAt(i);
  //           curChar = Character.toLowerCase(curChar);
  //           if(counter.containsKey(curChar)){
  //               int val =  counter.get(curChar);
  //               counter.put(curChar, val + 1);
  //           } else {
  //               counter.put(curChar, 1);
  //           }
  //       }
  //       // System.out.println(counter);

  //       for(int j = 0; j < b.length(); j++){
  //           char curChar2 = b.charAt(j);
  //           curChar2 = Character.toLowerCase(curChar2);
  //           if(counter.containsKey(curChar2)){
  //               int val2 = counter.get(curChar2);
  //               counter.put(curChar2, val2 - 1);
  //               if(counter.get(curChar2) == 0){
  //                   counter.remove(curChar2);
  //               }
  //           } else {
  //               return false;
  //           }
  //       }
  //       // System.out.println(counter.values());
  //       boolean res = counter.size() == 0;
  //       return res;
  //       // return true;
  //   }

  // public static void main(String[] args) {


  //   import java.io.*;
  // import java.util.*;

  // public class Solution {

  //   public static void main(String[] args) {
  //     Scanner scan = new Scanner(System.in);
  //     String s = scan.nextLine();
  //     // Write your code here.
  //     if (s.trim().length() == 0 || s.trim().length() > 400000) {
  //       System.out.println(0);
  //       // System.println(s.trim().length());
  //       return;
  //     }

  //     String[] tokens = s.trim().split("[!,?._'@\\s]+");
  //     System.out.println(tokens.length);

  //     for (String temp : tokens) {
  //       System.out.println(temp);
  //     }

  //     scan.close();
  //   }
  }
