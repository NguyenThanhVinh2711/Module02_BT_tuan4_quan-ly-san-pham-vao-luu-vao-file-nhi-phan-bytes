import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class product implements Serializable {
    private int id;
    private String nameProduct;
    private String manufacturer;
    private double price;
    private String other;


    public product(int id, String nameProduct, String manufacturer, double price, String other) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.price = price;
        this.other = other;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "ManagerProduct{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", other='" + other + '\'' +
                '}';
    }
//    public ManagerProduct deleteProduct (int id ){
//        return productList.remove(id);
//    }
//
//    public void  displayList(){
//        System.out.println(productList);
//    }
//    public void searchProduct(){
//        productList.indexOf(id);
//    }

}
