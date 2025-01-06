import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

// OOP Java etiquette
// Very python alike

//Creating a class call user
public class user {

    // Attributes
    private final String name;
    private final LocalDate birthDay;
    public ArrayList<books> Book = new ArrayList<books>();


    // Construction method, function to accept objects into the class, same as python with the __innit__
    user(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);

    }


    // The getters are the same as the @property in Python, get the variable without compromising it if its private
    public String getName(){
        return this.name;
    }

    public LocalDate getBirthDay(){
        return this.birthDay;

    }


    public String borrowed(){
        return this.Book.toString();
    }
    public void borrow(books book){
        this.Book.add(book);

    }

    // Function of age
    public int age(){
        // (this) is to refer to the current variable value, important.
        Period age = Period.between(this.birthDay, LocalDate.now());

        return age.getYears();
    }
}
