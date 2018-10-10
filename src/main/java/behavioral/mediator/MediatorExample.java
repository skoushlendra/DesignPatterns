package behavioral.mediator;

public class MediatorExample {
	public static void main(String[] args) {
		
		ChatMediator mediator = new ChatMediatorImpl();
		
		User arvind = new UserImpl(mediator, "Arvind");
		User saurabh = new UserImpl(mediator, "Saurabh");
		User ksp = new UserImpl(mediator, "KSP");
		User uttam = new UserImpl(mediator, "Uttam");
		
		mediator.addUser(arvind);
		mediator.addUser(saurabh);
		mediator.addUser(ksp);
		mediator.addUser(uttam);

		ksp.send("Hi All");
	}
}
