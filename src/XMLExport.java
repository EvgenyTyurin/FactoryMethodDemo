/**
 * Concrete creator - export to xml file
 */

class XMLExport extends FileExport {
    @Override
    FileWriter createWriter() {
        return new XmlWriter();
    }
}
