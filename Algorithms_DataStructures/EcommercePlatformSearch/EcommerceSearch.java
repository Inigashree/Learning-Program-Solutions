
import java.util.*;

public class EcommerceSearch {

    public static int linearSearch(Product[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String target) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(target);

            if (comparison == 0)
                return mid;
            else if (comparison < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "T-shirt", "Apparel"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Book", "Education")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String input = scanner.nextLine();

        // Linear Search
        int linearResult = linearSearch(products, input);
        if (linearResult != -1)
            System.out.println("Linear Search: Found at index " + linearResult);
        else
            System.out.println("Linear Search: Product not found");

        // Sort products by name for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        int binaryResult = binarySearch(products, input);
        if (binaryResult != -1)
            System.out.println("Binary Search: Found at index " + binaryResult + " (sorted)");
        else
            System.out.println("Binary Search: Product not found");
        scanner.close();
    }
}

