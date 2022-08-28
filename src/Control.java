import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control {

    public static List<product> productList = Control.readToFile("listProduct.txt");

    //xoa san pham
    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham can xoa");
        int id = scanner.nextInt();

        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(productList.get(i));
            }
        }
    }

    //hien thi san pham
    public static void displayList() {
        for (product show : productList
        ) {
            System.out.println(show);
        }
    }

    //tim kiem san pham theo id
    public static void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham can sua");
        int id = scanner.nextInt();

        // dieu kien tim xem co tim thay id ko
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {

                System.out.println(productList.get(i));

            }
        }
    }

    //them moi san pham
    public static void addProduct() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Nhap id san pham:");
        int id = sc1.nextInt();

        System.out.println("Nhap ten san pham:");
        String nameProduct = sc2.nextLine();

        System.out.println("Nhap ten hang san xuat:");
        String manufacturer = sc2.nextLine();

        System.out.println("Nhap gia san pham:");
        double price = sc3.nextDouble();

        System.out.println("Nhap ghi chu khac:");
        String other = sc2.nextLine();

        product product = new product(id, nameProduct, manufacturer, price, other);

        productList.add(product);

        writeToFile("ListProduct.txt", productList);
    }

    public static void writeToFile(String path, List<product> productList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<product> readToFile(String path) {
        List<product> productList = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void menu() {
        System.out.println("1.Them san pham : ");
        System.out.println("2.Xoa san pham : ");
        System.out.println("3.Tim san pham : ");
        System.out.println("4.Hien thi san pham : ");
        System.out.println("0.Exit. ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lua chon cua ban:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                deleteProduct();
                break;
            case 3:
                searchProduct();
                break;
            case 4:
                displayList();
                break;
            case 0:
                System.exit(0);
        }
    }
}
