package program26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //setting values of the variables
        obj.setName("Viral");
        obj.setRollNo(19);
        obj.setAge(40);
        //Displaying values of the variables
        System.out.println("Prime's name :"+obj.getName());
        System.out.println("Prime's age :"+obj.getAge());
        System.out.println("Prime's roll no :"+obj.getRollNo());

    }
}
