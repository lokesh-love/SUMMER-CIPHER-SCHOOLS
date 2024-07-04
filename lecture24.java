import java.util.*;

public class StringStudy {
    public static void main(String[] args) {
        String name = "Cipher Schools";
        String name2 = "Cipher Schools";
        String name3 = new String("Cipher Schools");
        String name4 = new String("Cipher Schools");

        // Check if strings reference the same object
        System.out.println(name == name2); // true, because they reference the same interned string
        System.out.println(name3 == name4); // false, because they reference different objects
        System.out.println(name == name3); // false, because one is interned and the other is a new object

        String s1 = "Hello";
        s1 = s1 + " peeps";
        System.out.println(s1);
        System.out.println(s1 + ", how're you doing");
        System.out.println(s1);

        String s2 = new String("Hello");
        String s3 = new String("People");
        s2 = s2.concat(s3);
        // s4 is not defined, so we remove the following line:
        // System.out.println(s4);
        System.out.println(s2);

        System.out.println("*******************");

        System.out.println("CHECKING STRINGS ARE EQUAL IN VALUE");

        // Name should be changed to name to match the variable defined earlier
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

        System.out.println("*******************");

        System.out.println("3) Creating new string object from character array");

        char arr[] = {'C', 'I', 'P', 'H', 'E', 'R'};
        String partialStrFromArr = new String(arr, 1, 3);
        System.out.println(partialStrFromArr);

        String partialStrFromArr2 = new String(arr, 2, 3);
        System.out.println(partialStrFromArr2);

        // Changing cases
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name);

        System.out.println("*******************");

        // Splitting
        System.out.println("Splitting");
        System.out.println("Please enter your full name");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String strArr[] = fullName.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        String csvText = sc.nextLine();
        String csvArr[] = csvText.split(",");
        for (int i = 0; i < csvArr.length; i++) {
            System.out.println(csvArr[i]);
        }

        String dotText = sc.nextLine();
        String dotArr[] = dotText.split("\\.");
        for (int i = 0; i < dotArr.length; i++) {
            System.out.println(dotArr[i]);
        }

        String backSlashText = "Hello, I attend \"Java\" class";
        String backSlashArr[] = backSlashText.split(",");
        for (int i = 0; i < backSlashArr.length; i++) {
            System.out.println(backSlashArr[i]);
        }

        // Length of string
        System.out.println("*******************");
        System.out.println("Length of string");
        int len = name.length();
        System.out.println("length of: " + name + " is: " + len);

        // Finding index of a char in a string
        System.out.println("*******************");
        System.out.println("Finding index of string");

        int index = name.indexOf('e');
        System.out.println("index of 'e' in: " + name + " is: " + index);

        int index2 = name.indexOf('E');
        System.out.println("index of 'E' in: " + name + " is: " + index2);

        int index3 = name.indexOf("School");
        System.out.println("index of 'School' in: " + name + " is: " + index3);

        int index4 = name.indexOf('o', 10);
        System.out.println("index of 'o' after index 10 in: " + name + " is: " + index4);

        int indexOfO = 0;
        while (true) {
            indexOfO = name.indexOf('o', indexOfO + 1);
            if (indexOfO == -1) break;
            System.out.println("O found at : " + indexOfO);
        }
        System.out.println("*******************");
        System.out.println("10 Finding the character at the given index");
        System.out.println(name.charAt(2));
        char acha = name.charAt(6);
        System.out.println("char At Index"+acha);
        System.out.println();
        

        System.out.println("=========================================");
        System.out.println("11 String to char array");
        char [] arry = name.toCharArray();
        for(int i=0;i<name.length();i++){
            System.out.println(arry[i]);
        }
        System.out.println("=========================================");
        //checking if string is empty or not
        System.out.println("checkiung if String is empty or not");
        String emptyString = new String();
        String emptyString1 = "";
        String blankString = "      ";
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString.isBlank());
        System.out.println(blankString.isEmpty());
        System.out.println(blankString.isBlank());

        System.out.println("=========================================");
        System.out.println("Comparing Stringd lexographically in alphabatical order");
        String str1 = "abc";
        String str2 = "DEF";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

    System.out.println("=========================================");
    System.out.println("using the trim function");
    String str3 = "   abc   ";
    System.out.println(str3.trim());
    String str4 = "    hello           world    ";
    System.out.println("str4. trimming"+str4.trim());

    System.out.println("=============================================");
    System.out.println("Replacng a character");
    System.out.println(name.replace("iphe","loki"));




        
    }
}
