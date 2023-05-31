package comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main implements Generictype<Integer>{
    public static void main(String[] args) {
        Student mateusz = new Student(12,98.55f);
        Student michal = new Student(15,98.23f);
        Student emi = new Student(11,99.23f);
        Student nasti = new Student(8,89.23f);
        Student wiesiek = new Student(22,92.23f);

        Student[] list = {mateusz,michal,emi,nasti,wiesiek};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

//        if (mateusz.compareTo(michal)<0){
//            System.out.println(mateusz.compareTo(michal));
//            System.out.println("Michał has more marks");
//        }
    }

    @Override
    public void display(Integer value) {

    }
}
