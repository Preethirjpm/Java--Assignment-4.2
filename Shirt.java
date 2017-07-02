
public class Shirt {
	
    private int collar, sleeve;

    private String material;

    Shirt(int c, int s){
    	
    	
    	 collar = c;
         sleeve = s;
         material = "cotton";

      }

	public void display() {
		

		System.out.println(collar + " size" + sleeve + " long" + material + " material");}
 }

