public class Singleton {

    private static Singleton instance;

    private int count;

    private Singleton() {
        System.out.println("Hi Singleton");
        count = 0;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();

        }
        return instance;
    }

    public int getCount() {
        return count;
    }

    public void addOne() {
        count++;
    }

}
