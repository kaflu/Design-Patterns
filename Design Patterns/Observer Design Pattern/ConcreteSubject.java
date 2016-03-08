import java.util.ArrayList;

public class ConcreteSubject implements Subject
{
	// Subject identifier
	private String subjectName;

	// List of observers
	private ArrayList< Observer > observerList;

	// Constructor
	public ConcreteSubject( String identifier )
	{
		super();
		this.subjectName = identifier;
		observerList = new ArrayList< Observer >();
		System.out.println( this.getName() + " " + "has been created." );
	}

	@Override
	public void registerObserver( Observer observer )
	{
		// Add observer to the list
		observerList.add( observer );
		System.out.println( observer.getName() + " " + "has being registered." );
	}

	@Override
	public void deregisterObserver( Observer observer )
	{
		// Remove observer from the list
		observerList.remove( observer );
		System.out.println( observer.getName() + " " + "has been deregistered." );
	}

	@Override
	public void notifyAllObservers()
	{
		// Check if there are no observers
		if ( observerList.isEmpty() )
		{
			System.out.println( "No observers found." );
		}
		else
		{
			// Update all registered observers
			for ( Observer observer : observerList )
			{
				observer.update();
			}
		}
	}

	// Get subject identifier
	@Override
	public String getName()
	{
		return subjectName;
	}
}
