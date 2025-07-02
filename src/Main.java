import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print((char)System.in.read());
        System.out.print((char)System.in.read());
        System.out.print((char)System.in.read());
        // 123을 입력하게 되면, 순서대로 맨 첫 줄은 1, 그 다음 줄은 2, 맨 마지막 줄은 3을 읽어오는 건가 봄.
        // read() 명령어가 값을 1바이트씩만 읽어온다는 건 알았는데, 111 느낌으로 출력되는 줄 알았음...
    }
}