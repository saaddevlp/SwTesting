public class PackageCalculator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PackageCalculator <itemSize>");
            return;
        }
        
        double itemSize;
        try {
            itemSize = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for item size.");
            return;
        }
        
        // Calculate package dimensions (1.5 times item size)
        double packageLength = itemSize * 1.5;
        double packageWidth = itemSize * 1.5;
        double packageHeight = itemSize * 1.5;
        
        System.out.println("For an item of size: " + itemSize);
        System.out.println("Required package dimensions are:");
        System.out.println("Length: " + packageLength);
        System.out.println("Width: " + packageWidth);
        System.out.println("Height: " + packageHeight);
    }
}