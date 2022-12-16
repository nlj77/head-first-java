class GoodDog {
	
	private int size;
	private String name;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int s) {
		size = s;
	}
	public void setName(String n) {
	    name = n;
	}
	public String getName() {
		return name;
	}
	public void bark() {
		
		if (size > 60) {
			System.out.println(name + " says Woof Woof!!");
		}
		else if (size > 14) {
			System.out.println(name + " says ruff ruff!!");
		}
		else {
		System.out.println(name + " says yip yip yip yip yip!");
	    }
	}
}
class GoodDogTestDrive {
	public static void main (String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(70);
		one.setName("Jeff");
		GoodDog two = new GoodDog();
		two.setSize(12);
		two.setName("Bert");
		
		System.out.println("Dog one: " + one.getName() + " " + one.getSize() + " pounds");
		System.out.println("Dog two: " + two.getName() + " " + two.getSize() + " pounds");
		one.bark();
		two.bark();
		
		GoodDog[] pets; 
		pets = new GoodDog[7];
		pets[0] = new GoodDog();
		pets[1] = new GoodDog();
		pets[0].setSize(30);
		pets[0].setName("Kyle");
		pets[1].setSize(45);
		pets[1].setName("Nick");
		
		
		
		
	}

}
