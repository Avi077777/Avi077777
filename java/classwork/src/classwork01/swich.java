package classwork01;

public class swich {

	public static void main(String[] args) {

		int size = args.length;

		switch (size) {
		
		case 0:
			System.out.println("hello java" + args[0]);
			break;
	
		case 2:
			System.out.println("hello" + args[0]);
			break;
		
		default:
			for (int i = 0; i < size; i++) {
				System.out.println(i + "hello " + args[i]);
			}

		}

	}
}
