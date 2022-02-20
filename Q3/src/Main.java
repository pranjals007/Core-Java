import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String str = "Java String pool refers to collection of Strings which are stored in heap memory";



    String str1 = str.toLowerCase(Locale.ROOT);   //part a
         System.out.println(str1);


        String str2 = str.toUpperCase(Locale.ROOT);       //part b
        System.out.println(str2);

    String str3 = str.replace("a", "$");                   //part c
        //System.out.println(str3);

        System.out.println(str.contains("collection"));     //part d

        String str4 = "java string pool refers to collection of strings which are stored in heap memory";    //part e
        if (str.equals(str4)){
            System.out.println("Both strings match");
        } else{
            System.out.println("Strings Do not match");
        }

        if (str.compareTo(str4)==0){                //part f
            System.out.println("both same");
        } else{
            System.out.println("not same");
        }

    }
}
