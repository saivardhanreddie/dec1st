package november29th;

public class Animals {

	
		// TODO Auto-generated method stub

	
	String name;
	String color;
	String sound;
static	int counter=0;
 static   String forest="amazon";
	
	Animals(String name, String color){
		this.name=name;
		this.color=color;
		
		
	}Animals(String name, String color,String sound){
		this(name,color);
		this.sound=sound;
		this.counter++;
		
	}Animals(String name, String color,String sound,String forest){
		this(name,color,sound);
	this.forest=forest;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String name,String color) {
		this.color= color;
	}
	
	
	public void Display() {
		System.out.println(counter+" "+ name +" "+ color +" "+ sound  +" "+forest);
	}
	static public void getNoOfAnimals() {
		int num =0;
      System.out.println(counter);
	}
	 
	public static void main(String[] args) {
	Animals cat = new Animals("charlie","brown","meow");
	cat.name ="charlie";
	cat.color="brown";
	cat.sound="meow";
	
	
	Animals dog = new Animals("zeus", "Black"," boww boww");
	dog.name="Zeus";
	dog.color="Black";
	dog.sound="bow bow";

	
	Animals elephant = new Animals("jumbo","grey","uhuuuaaaaaaaa","Black");
	elephant.name="Jumbo";
	elephant.color="Grey";
    elephant.sound="UUUUhhaa";
    elephant.forest="";    
    
	Animals cow = new Animals("Ongole"," black and White" , " maaaaaaaa", "wild");
      
      
     cat.Display();
    Animals.getNoOfAnimals();
      dog.Display();
     Animals.getNoOfAnimals();
      elephant.Display();
     Animals.getNoOfAnimals();
       cow.Display();
     Animals.getNoOfAnimals();
       Animals.forest="Black Forest";
	   
    
       System.out.println(Animals.counter);
	
	}
	
}



class Animals2{
	String fast;
	public void Run(){
		System.out.println("Running");
	}
	
}























