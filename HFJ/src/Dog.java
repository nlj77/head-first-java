class Dog {
  String name;
  int size;
  
  public static void main (String [] args)  {
	  Dog dog1 = new Dog();
	  dog1.name = "Bart";
	  dog1.size = 40;
	  
	  Dog[] myDogs = new Dog[3];
	  
	  myDogs[0] = new Dog();
	  myDogs[1] = new Dog();
	  myDogs[2] = dog1;
	  
	  myDogs[0].name = "Fred";
	  myDogs[0].size = 86;
	  myDogs[1].name = "Marge";
	  myDogs[1].size = 7;
	  dog1.bark(3);

	  
	  System.out.println("The last dog's name is " + myDogs[2].name);
	  
	  int x = 0;
	  while(x < myDogs.length) {
		myDogs[x].bark(3);
		x = x + 1;
	  }
  }


public void bark(int numOfBarks) {
	while (numOfBarks > 0) {
	if (size > 60) {
		System.out.println(name + " says Woof Woof!!");
	}
	else if (size > 14) {
		System.out.println(name + " says ruff ruff!!");
	}
	else {
	System.out.println(name + " says yip yip yip yip yip!");
    }
	numOfBarks = numOfBarks -1;
	}
}
}