package homework0124;

public class Gbeishu {
	public static void main(String[] args) {
		int a=16;
		int b=12;
		int c=a>b?a:b;
		int d=a<b?a:b;
		for(int i=1;i<=d;i++) {
			if(c*i<=a*b&&(c*i)%d==0) {
				System.out.println(c*i);
				break;
			}
		
			
		}
		for(int j=d;j>0;j--) {
			if(d%j==0&&c%j==0) {
				System.out.println(j);
				break;
			}
		}
	}

}
