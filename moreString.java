// public class moreString {
  
// }

// import java.util.Scanner;
// import java.util.regex.*;

// public class Solution {
//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     int testCases = Integer.parseInt(in.nextLine());
//     while (testCases > 0) {
//       String pattern = in.nextLine();
//       // Write your code
//       try {
//         Pattern p = Pattern.compile(pattern);
//         System.out.println("Valid");
//       } catch (Exception e) {
//         System.out.println("Invalid");
//       }
//       testCases--;
//     }
//   }
// }

//Ip address validation
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
// import java.util.Scanner;

// class Solution {

//   public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     while (in.hasNext()) {
//       String IP = in.next();
//       System.out.println(IP.matches(new MyRegex().pattern));
//     }

//   }
// }
// // Write your code here

// class MyRegex {
//   // private Matcher m;

//   String pattern
//   /// option 1
//   // =
//   // "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
//   // option 2
// https://mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/
// Description
// ^		#start of the line
//  (		#  start of group #1
//    [01]?\\d\\d? #    Can be one or two digits. If three digits appear, it must start either 0 or 1
// 		#    e.g ([0-9], [0-9][0-9],[0-1][0-9][0-9])
//     |		#    ...or
//    2[0-4]\\d	#    start with 2, follow by 0-4 and end with any digit (2[0-4][0-9])
//     |           #    ...or
//    25[0-5]      #    start with 2, follow by 5 and ends with 0-5 (25[0-5])
//  )		#  end of group #2
//   \.            #  follow by a dot "."
// ....            # repeat with 3 times (3x)
// $		#end of the line
// Whole combination means, digit from 0 to 255 and follow by a dot “.”, repeat 4 time and ending with no dot “.” Valid IP address format is “0-255.0-255.0-255.0-255”.

//       = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
//           + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
// }
// import java.util.Scanner;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class DuplicateWords {

//     public static void main(String[] args) {

//         String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
//         Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

//         Scanner in = new Scanner(System.in);
//         int numSentences = Integer.parseInt(in.nextLine());
        
//         while (numSentences-- > 0) {
//             String input = in.nextLine();
            
//             Matcher m = p.matcher(input);
            
//             // Check for subsequences of input that match the compiled pattern
//             while (m.find()) {
//                 input = input.replaceAll(m.group(0), m.group(1));
//             }
            
//             // Prints the modified sentence.
//             System.out.println(input);
//         }
        
//         in.close();
//     }
// }