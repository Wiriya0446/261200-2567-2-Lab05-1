import java.time.LocalDate;

public class Admin extends User {
    protected Admin(String name , int year , int month , int day){
        super(name, year, month, day);
    }

    @Override
    protected void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin");
    }
    protected void displayInfo(boolean full) {
        super.displayInfo();
        System.out.println("User type: admin");
        if( full == true){
            System.out.println("To day is : "+LocalDate.now());
        }
    }
}
