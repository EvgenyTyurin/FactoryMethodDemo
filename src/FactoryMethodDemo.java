/**
 * Factory Method Pattern Demo
 * Creator - FileExport, Product - FileWriter
 *
 * Feb 2019 Evgeny Tyurin
 */

public class FactoryMethodDemo {

    /** Export data to file by FileExport sub-class method (xml, tag, etc...) */
    private static void exportFile(FileExport export, String data) {
        export.writeFile(data);
    }

    /** Run point */
    public static void main(String[] args) {
        // Data to export
        String data = "Important data";
        // XML export
        exportFile(new XMLExport(), data);
        // Tag export
        exportFile(new TagExport(), data);
    }
}
