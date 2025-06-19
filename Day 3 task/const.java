public class Oops {
	String name,last;
	int year;
	Oops(String name,int year,String last){
		this.name=name;
		this.year=year;
		this.last=last;
			}
r
	public Oops(Oops abd2) {
		this.name=abd2.name; 
		this.year=abd2.year;
		this.last=abd2.last;
		
	}

	void Display() {
		System.out.println("Oops"+" "+name+" "+year+" "+last);
	}
	public static void main(String[] args) {
		System.out.println("og constructor");
		Oops abd = new Oops("rijay",2006,"Waheed");
		abd.Display();
		Oops abd2 = new Oops(abd);
		abd2.Display();
		
	}
}
