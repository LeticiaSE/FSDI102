public class sportSystem {
    public static void main(String[] args) {
        //DaraType(Class) varName = new Class();
        Player messi = new Player("Lionel Messi","Argentina",123456.78,33);
        messi.printName();
        System.out.println(messi.getAge());

        Player cr7 = new Player("Cristiano Roldano","Portugal",123455.77,35);
        cr7.printName();
        System.out.println(cr7.getAge());

        // add an object
        Player jordan = new Player("Michael Jordan","United States",234574.54,40);
        jordan.printName();
        System.out.println(jordan.getAge());
    }
}