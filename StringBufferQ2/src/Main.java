public class Main {

    public static void main(String[] args) {
	String str = "It is used to _ at the specified index position";
    StringBuffer sb = new StringBuffer(str);
    sb.replace(14,15,"");
        System.out.println(sb.insert(14,"insert text"));
    }
}
