// import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int i = 2;
    while (i <= 9) {
        System.out.println("---" + i + "단 ---");
        i ++;
        int j = 1;
        while (j <= 9) {
            System.out.println(i + "x " + j + "=" + (i * j));
            j++;
        }
    }
    }
}