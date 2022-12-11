public class ZipDecorator extends BaseDecorator {


    public ZipDecorator(IReadWriter source) {
        super(source);
    }

    @Override
    public void write(String data) {
        super.write(data);
        System.out.println("Zip data were written:\n" + data);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Zip data were read");
    }
}