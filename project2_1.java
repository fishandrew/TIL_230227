public class project2_1 {
	public static void main(String[] args) {
		int j = -5;
		System.out.print("This is test!\n");
		if (0 < j) {
			for (int i = 0; i < j; i++)
				System.out.printf("test success %d\n", j);
		} else if (j == 0) {
			for (int i = -3; i < j; i++) {
				System.out.printf("test success %d\n", j);
			}
		} else {
			for (int i = 4; i < j; i++) {
				System.out.printf("test success %d\n", j);
			}
		}
		
		System.out.println("");
		int x =10;
		switch ( x ) {
		case 10:
			System.out.println("x는 10입니다");
			break;
		case 11:
			System.out.println("x는 11입니다");
			break;
		default:
			System.out.println("x는 12이상입니다");
		}
		
	}
}