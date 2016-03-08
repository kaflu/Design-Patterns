// Abstract observer class
public abstract interface Observer
{
	// Update method each concrete observer must implement
	public abstract void update();
	
	// Get identifier
	public abstract String getName();
}
