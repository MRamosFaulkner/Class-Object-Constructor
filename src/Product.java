
public class Product {
    public static void main(String[] args) {

        Product gas = new Product(4.0, 10, "Gallon of gas");
        gas.printProduct();
        gas.totalCost();

        //Attributes that can only be used in this class (private)
        private double costOfProduct;
        private int quantity;
        private String name;

    }

    public Product(double costOfProduct, int quantity, String name) {
        this.costOfProduct = costOfProduct;
        this.quantity = quantity;
        this.name = name;
    }

    public void totalCost() {
        double totalPurchase = costOfProduct * quantity;
        System.out.println("Total costs is");
    }

    public void printProduct() {
        System.out.println(name + " costs " + costOfProduct + " and " + quantity + " units were purchased");
    }
}

