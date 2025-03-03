public class HelloWorld {
	public static void main(String[] args){

		if (args.length > 0){
			System.out.print("Hello");
			for (String a : args) {
				System.out.print(" " + a);
			}
			System.out.println("");
		} else {
			System.out.println("Hello World!");
		}
	}
}
