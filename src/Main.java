import java.util.Scanner; //這行要打 才有Scanner
                          //import java.util.* 為全加
 public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num1, num2, num3, sum;
	System.out.print("請輸入一個整數");
	num1=input.nextInt();
	System.out.print("請再輸入一個整數");
	num2=input.nextInt();
	System.out.print("請再再輸入一個整數");
	num3=input.nextInt();
	sum = num1+num2-num3;
	System.out.printf("%d+%d-%d=%d",num1 ,num2 , num3 ,sum);
	input.close(); //此行可打可不打
    }
}
