package School.management.system;

public class Student{
    /**
     * these are characteristics of students
     * THIS STEP IS DECLARING THE FIELD
     */
    private int id;
    private String name;
    private int grade;
    private int fees_paid;
    private int fees_total;

    /**
     * initializing fields
     * inside constructor
     */

    public Student(int id, String name, int grade) {
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.fees_paid=0;
        this.fees_total=30000;
    }

    public void setGrade(int grade){
        this.grade=grade;
        /**
         * setgrade is used as grade are to updated
         * but student name and id will remain same all time
         * this is a setter method so void is used
         */
    }

    /**
     * fees is regularly paid by students
     * initial fees_paid was 0
     * fees_paid = fees_paid + fees
     * @param fees
     */

    public void updatefeespaid(int fees){
        fees_paid+=fees;
    }

    /**
     * to the values of id, grade, name, fees total and paid
     * @return
     */

    public int getId() {
        return id;
    }

    public int getFees_total() {
        return fees_total;
    }

    public int getFees_paid() {
        return fees_paid;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}