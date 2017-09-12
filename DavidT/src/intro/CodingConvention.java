package intro;

public class CodingConvention {

	//FIELDS ARE AT THE TOP!!!
	private String name;//NOTE: DECKARE FIELDS ONLY, INSTANTITATE IN THE CONSTRUCTOR
	/*
	 * IOW, don't do this
	 * private String name = "David";
	 * 
	 */
	
	private String description;
	
	/*
	 * this is a constructor, it is like a method except the "return type" is an instance of the class
	 * for this reason, a constructor must ALWAYS be named after the class 
	 */
	
	public CodingConvention(String name, int descriptionIndex) {
		//INSTANTIATE VARIABLES NOW:
		
		//there are two variables called "name" the local vairiable and the field
		//distinguish between the two using the reserved word "this"(field)
		this.name = name;
		//this is a static call to a constant
		description = IntroMain.DESCRIPTIONS[descriptionIndex];
	}
	
	//normal method "void" is the return type
	public void doStuff() {
		String output = name + description;
		System.out.println(output);
	}
}