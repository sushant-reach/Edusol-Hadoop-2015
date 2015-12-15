
public class MaxSize {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer Num =10;
		@SuppressWarnings("unused")
		int num = 0;
		
		System.out.println(Num.MAX_VALUE);
		System.out.println(Num.SIZE);
		System.out.println(Integer.valueOf(((int)Math.pow(2, 31))));
		System.out.print(-((Integer.valueOf(((int)Math.pow(2, 31))))-1));
		System.out.print(" to ");
		System.out.print(Integer.valueOf(((int)Math.pow(2, 31))));		

	}

}
