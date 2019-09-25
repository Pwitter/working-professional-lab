
public class Pliers extends Tool{

	private String colour;
	
	
	public Pliers(String brand, String colour) {
		super(brand);
		this.colour = colour;
	}

	public Pliers(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean fix(Breakableitem breakableitem) {
		// TODO Auto-generated method stub
		return false;
	}

}
