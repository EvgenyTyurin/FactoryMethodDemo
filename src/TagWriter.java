/**
 * Concrete product - tag-writer
 */

class TagWriter implements FileWriter {
    @Override
    public void write(String data) {
        System.out.println("Data=" + data);
    }
}
