public class inheritance1 {
	void Message() {
		System.out.println("1st inheritance");
	}
	
    
}
class subclass extends inheritance1{
	Void View() {
	System.out.println("extends inheritance");
	return null;

}
	
}
class main{
public static void main(String[] args) {
subclass see =new subclass();
see.Message();
see.View();

	}
}
