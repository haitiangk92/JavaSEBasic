public class Lesson1{
	public static void main(String[] args) {
		int value = 10;
		int squared = (int) Math.pow(value, 2);
		int cubed = (int) Math.pow(value, 3);
		
		System.out.println(String.format("Ten Squared: %d", squared));
		System.out.println(String.format("Ten Cubed: %d", cubed));
		}
}