
public class ConcreteObserver implements Observer
{
	// Identifier
	private String observerName;

	// Constructor
	public ConcreteObserver( String identifier )
	{
		super();
		this.observerName = identifier;
		System.out.println( this.getName() + " " + "has being created." );
	}

	@Override
	public void update()
	{
		System.out.println( this.getName() + " " + "has being updated." );
	}

	// Get identifier
	@Override
	public String getName()
	{
		return this.observerName;
	}

}
