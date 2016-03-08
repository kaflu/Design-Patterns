// Main driver program for Observer and Subject pattern
public class Main
{
	public static void main( String[] args )
	{
		/** BEGIN CREATION **/
		System.out.println( "===== CREATING OBSERVERS AND SUBJECTS  =====" );

		// Creating observers
		ConcreteObserver obs1 = new ConcreteObserver( "Observer 1" );
		ConcreteObserver obs2 = new ConcreteObserver( "Observer 2" );

		// Creating Subect
		ConcreteSubject subj = new ConcreteSubject( "Subject1" );

		/** BEGIN REGISTERING **/
		System.out.println();
		System.out.println( "===== REGISTERING  =====" );

		// Registering observers with subject
		subj.registerObserver( obs1 );
		subj.registerObserver( obs2 );

		/** BEGIN NOTIFY **/
		System.out.println();
		System.out.println( "===== NOTIFYING ALL OBSERVERS =====" );

		// Update observers
		subj.notifyAllObservers();

		/** BEGIN DEREGISTERING **/
		System.out.println();
		System.out.println( "===== DEREGESTERING OBSERVERS =====" );

		// Unregister obsever with subject
		subj.deregisterObserver( obs1 );
		subj.deregisterObserver( obs2 );

		/** BEGIN NOTIFY **/
		System.out.println();
		System.out.println( "===== NOTIFYING ALL OBSERVERS =====" );

		// Update observers
		subj.notifyAllObservers();
	}
}