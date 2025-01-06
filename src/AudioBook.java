// Inheritance of classes

public class AudioBook extends books {
    private int runTime;

    //Super is to bring the attributes of the parent class same as python

    AudioBook(String title, String author, int runTime){
        super(title, author, 0);

        this.runTime = runTime;

    }

}
