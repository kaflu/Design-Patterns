// Subject observers report to

// Subject class
public abstract interface Subject
{
	// Attach observer
	public abstract void registerObserver( Observer observer );

	// Remove observer
	public abstract void deregisterObserver( Observer observer );

	// Notify observers
	public abstract void notifyAllObservers();
	
	// Get identifier
	public abstract String getName();
}
