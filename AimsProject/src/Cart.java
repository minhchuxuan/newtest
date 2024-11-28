public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered + 1 == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println(String.format("Disc %d has been added", qtyOrdered));
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == 0){
            System.out.println("There is no disk in the cart");
        } else {
            for (int i = 0; i < qtyOrdered; i++){
                if (itemsOrdered[i].equals(disc)){
                    System.out.println(itemsOrdered[i].getTitle() + " has been removed.");
                    for(int j = i; j < qtyOrdered - 1; j++) {
						itemsOrdered[j] = itemsOrdered[j+1];
					}
                    break;
                }
            }
        }
        qtyOrdered--;
    }
    public float totalCost(){
        float cost = 0f;
        for(int i = 0; i < qtyOrdered; i++){
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }

    public void displayCart(){
        if (qtyOrdered > 0){
            System.out.println("Number of disks in the cart: " + qtyOrdered);
			System.out.println("The disks in the cart: ");
			for (int i = 0; i < qtyOrdered; i++) {
				System.out.println(itemsOrdered[i].getTitle());
			}
			System.out.println();
		} else {
			System.out.println("Your cart has no disk.");
        }
    }
}
