/**
 * Concrete creator - export to tag-file.
 */

class TagExport extends FileExport {
    @Override
    FileWriter createWriter() {
        return new TagWriter();
    }
}
