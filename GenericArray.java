package day6;

public class GenericArray<T> {
	private Object[] array;

	public GenericArray(int capacity) {
		array = new Object[3];
	}

	public T get(int index)
	{
		return (T) array[index];
	}	
	public void set(int index, T element)
	{
		array[index] = element;
	}	

	public void display() {
		for(Object curr:array) {
			System.out.print(curr+" ");
		}
		System.out.println();
	}
	
}
