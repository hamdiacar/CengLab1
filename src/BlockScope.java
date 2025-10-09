public class BlockScope {

    public static void main(String[] args){

        int x = 5;

        if (x == 5){
        int y = 15;
        System.out.println("inner x: " + x);
        System.out.println("inner y: " + y);

        }

        System.out.println("outer x: " + x);

    }

}
