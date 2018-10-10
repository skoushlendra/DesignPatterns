package behavioral.observer;

public class ObserverExample {
	public static void main(String args[]) {
        NewDeals deals = new NewDeals();
        
        FirstSubscriber reader1 = new FirstSubscriber();
        SecondSubscriber reader2 = new SecondSubscriber();
        deals.addObserver(reader1);
        deals.addObserver(reader2);

        String[] dealsArray = {"Mobile @1299", "Laptop @37999", "TV @7999"};
        for(String deal: dealsArray){
            try {
                Thread.sleep(3000);
                deals.addNewDeal(deal);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
        }
        
    }
}
