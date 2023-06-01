package enumExamples;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday, Saturday, Sunday;
        //there are enum constants
        // public, static, and final
        // since its final u can create child enum
        Week(){
            System.out.println("Constructor called for " + this);
        }
        //this is not public or protected, only private or default
        //why? We dont want to create new objects
        //this is not the enum concept, thats why
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for (Week day: Week.values()){
//            System.out.println(day);
        }
}

