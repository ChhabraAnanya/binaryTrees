import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTreeImpl bt = new BinaryTreeImpl();
        Scanner scanner = new Scanner(System.in);
        bt.populate(scanner);
        bt.display();
    }
}