public class ItemDemo {
    public static void main(String[] args){
        Item itemname1 = new Item("Laptop");
        Item itemname2 = new Item("Smartphone");
        Item itemname3 = new Item("Tablet");
        itemname1.displayItem();
        itemname2.displayItem();
        itemname3.displayItem();
        Item.displayObjectCount();
    }
}
class Item{
    static int objectCount = 0;
    String itemName;
    public Item(String itemName){
        this.itemName = itemName;
        objectCount++;
    }
    public static void displayObjectCount(){
        System.out.println("Total object created: " + objectCount);

    }
    public void displayItem(){
        System.out.println("Item: " + itemName);

        
    }
}
