public class Document {
    //lazy class
    public String format,text;
    public int size;

    public Document() {
    }

    public Document(String format, String text, int size) {
        this.format = format;
        this.text = text;
        this.size = size;
    }
}
