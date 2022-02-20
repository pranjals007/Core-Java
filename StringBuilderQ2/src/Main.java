public class Main {

    public static void main(String[] args) {
	String str = "It is used to _ at the specified index position";
    StringBuilder sb = new StringBuilder(str);
    sb.replace(14,15," ");
    sb.replace(14,15,"insert text");
        System.out.println(sb);

    }
}
