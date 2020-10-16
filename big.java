// // public class big {
  
// // }
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

// public class Solution {

//   private static final Scanner scanner = new Scanner(System.in);

//   public static void main(String[] args) {
//     String n = scanner.nextLine();

//     BigInteger bigInt = new BigInteger(n);
//     boolean res = bigInt.isProbablePrime(100);
//     // boolean res2 = bigInt.isProbablePrime(-1);

//     if (res) {
//       System.out.println("prime");
//     } else {
//       System.out.println("not prime");
//     }

//     scanner.close();
//   }
// }
// import java.io.*;
// import java.util.*;
// import java.math.*;

// public class Solution {

//   public static void main(String[] args) {
//     /*
//      * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
//      * class should be named Solution.
//      */
//     Scanner s = new Scanner(System.in);
//     String n1 = s.next();
//     String n2 = s.next();
//     BigInteger bigInt1 = new BigInteger(n1);
//     BigInteger bigInt2 = new BigInteger(n2);
//     // System.out.print(bigInt1);
//     // System.out.print(bigInt2);
//     BigInteger sum = bigInt1.add(bigInt2);
//     BigInteger prod = bigInt1.multiply(bigInt2);
//     System.out.println(sum);
//     System.out.println(prod);
//   }
// }



//==============================================
// 2D array problems
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

// public class Solution {

//   private static final Scanner scanner = new Scanner(System.in);

//   public static void main(String[] args) {
//     int[][] arr = new int[6][6];

//     for (int i = 0; i < 6; i++) {
//       String[] arrRowItems = scanner.nextLine().split(" ");
//       scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//       for (int j = 0; j < 6; j++) {
//         int arrItem = Integer.parseInt(arrRowItems[j]);
//         arr[i][j] = arrItem;
//       }
//     }
    // System.out.print(Arrays.deepToString(arr));

//     int maxSum = Integer.MIN_VALUE;

//     for (int row = 0; row <= 3; row++) {
//       for (int col = 0; col <= 3; col++) {

//         int val1 = arr[row][col];
//         int val2 = arr[row][col + 1];
//         int val3 = arr[row][col + 2];
//         int val4 = arr[row + 1][col + 1];
//         int val5 = arr[row + 2][col];
//         int val6 = arr[row + 2][col + 1];
//         int val7 = arr[row + 2][col + 2];
//         int sum = val1 + val2 + val3 + val4 + val5 + val6 + val7;
//         // System.out.println(sum);
//         // System.out.println("cur sum");
//         if (sum > maxSum)
//           maxSum = sum;
//       }
//     }
//     System.out.println(maxSum);

//     scanner.close();
//   }
// }


// import java.io.*;
// import java.util.*;

// public class Solution {

//   public static void main(String[] args) {
//     /*
//      * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
//      * class should be named Solution.
//      */
//     Scanner s = new Scanner(System.in);
//     int n = s.nextInt();

//     int[] arr = new int[n];
//     for (int i = 0; i < n; i++) {
//       int val = s.nextInt();
//       arr[i] = val;
//     }

//     int count = 0;

//     for (int startIdx = 0; startIdx < n; startIdx++) {
//       for (int endIdx = startIdx; endIdx < n; endIdx++) {
//         int sum = 0;
//         for (int j = startIdx; j <= endIdx; j++) {
//           sum += arr[j];
//         }
//         if (sum < 0)
//           count++;
//       }
//     }
//     System.out.println(count);
//   }
// }