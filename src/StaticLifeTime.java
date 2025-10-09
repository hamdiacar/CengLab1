public class StaticLifeTime {

    static int varCounter = 0;

    public void increamentCounter(){

        varCounter++;

        System.out.println("Increamneted counter: " + varCounter);
    }

    public static void main(String[] args){

        StaticLifeTime object1 = new StaticLifeTime();
        StaticLifeTime object2 = new StaticLifeTime();

        object1.increamentCounter();
        object2.increamentCounter();

    }
}





