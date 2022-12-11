public class XMLDecorator extends BaseDecorator {


    public XMLDecorator(IReadWriter source) {
        super(source);
    }

    @Override
    public void write(String data) {
        super.write(data);
        System.out.println("XML data were written:\n" + data);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("XML data were read");
    }
}