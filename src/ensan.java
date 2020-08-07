import java.util.Scanner;

public class ensan {

    public static void main(String[] args) {

        /* 変数宣言 */
        double a;
        double b;
        double c;
        double add,sub,mul,div;
        String msg = "整数を入力 > ";


        /* 入力受付 */
        System.out.print(msg);
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        scan.close();

        /* 計算 */
        mul = a * b;
        div = a / b;
        add = a + b;
        sub = a - b;


        /* 結果出力 */
        System.out.println("mul=" + mul);
        System.out.println("div=" + div);
        System.out.println("add=" + add);
        System.out.println("sub=" + sub);


    }

}
    

