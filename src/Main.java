//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Singleton test = Singleton.getInstance();

        System.out.println(test);

        Singleton test2 = Singleton.getInstance();
        System.out.println(test2);

    }
}