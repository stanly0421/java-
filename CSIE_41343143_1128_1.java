import java.util.Scanner;
public class CSIE_41343143_1128_2{
	public static void a(int n,char for1,char to,char min)
	{
	if(n==1) System.out.println(1+" from "+for1+" to "+to+".");
	else
	{
	a(n-1,for1,min,to);
	System.out.println(n+" from "+for1+" to "+to+".");
	a(n-1,min,to,for1);
	}
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
        int n = sc.nextInt();
        a(n, 'A', 'C', 'B');
    }
}