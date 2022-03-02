import java.lang.annotation.*;

public class AnnotaionQ1 {
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @ interface Test{

    }
    static class pika{
        @Test
        public void sunny(){
            System.out.println("Test-case");
        }
    }
    public static void main(String[] args) {
        pika obj=new pika();
        obj.sunny();
    }

}
