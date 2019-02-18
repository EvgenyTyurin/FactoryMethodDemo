/**
 * Concrete product class - xml-writer
 */

public class XmlWriter implements FileWriter {
    @Override
    public void write(String data) {
        System.out.println("<xml><data=" + data + "/></xml>");
    }
}
