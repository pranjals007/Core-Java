import java.util.ArrayList;
import java.util.Arrays;

public class lambdaAssignment4 {
    ArrayList<String> employeeList = new ArrayList<String> (Arrays.asList("Paddy OFurniture","laya", "Olive Yew", "Aida Bugg", "Maureen Biologist"));
            employeeList.removeIf(s -> ((s.length())%2 != 0));
            System.out.println(employeeList);
}
    }
}
