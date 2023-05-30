package properties.inheratance;

public class Main {
    public static void main(String[] args) {
    BoxWeight mat = new BoxWeight(1.3);
        System.out.println(mat.w + " " + mat.h + " " + mat.l + " " + mat.weight);



        BoxPrice box = new BoxPrice(5,3,200);
        System.out.println(box.cost);
    }
}
