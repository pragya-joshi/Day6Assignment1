package day6;

public class GenericArrayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float[]weight=new float[] {86.24f,63.75f,87.65f};
		String[]names=new String[] {"James","Paul","David"};
		double[]price=new double[] {654.25,864.00,1452.50};
		
		GenericArray<Integer>genInt=new GenericArray<>(3);
		genInt.set(0, 10);
		genInt.set(1, 20);
		genInt.set(2, 30);
		GenericArray<Float>genFloat=new GenericArray<>(3);
		genFloat.set(0, 86.24f);
		genFloat.set(1, 63.57f);
		genFloat.set(2, 87.65f);
		GenericArray<String>genString=new GenericArray<>(3);
		genString.set(0, "James");
		genString.set(1, "Paul");
		genString.set(2, "David");		
		GenericArray<Double>genDouble=new GenericArray<>(3);
		genDouble.set(0, 8674.24);
		genDouble.set(1, 6364.57);
		genDouble.set(2, 8710.65);
		
		genInt.display();
		genFloat.display();
		genString.display();
		genDouble.display();
		
	

	}

}
