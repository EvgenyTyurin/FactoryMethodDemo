/**
 * Creator - export to abstract file by unknown writer
 */

abstract class FileExport {

    void writeFile(String data) {
        FileWriter writer = createWriter();
        writer.write(data);
    }
    abstract FileWriter createWriter();
}
