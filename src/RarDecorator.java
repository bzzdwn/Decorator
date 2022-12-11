public class RarDecorator extends BaseDecorator {


    public RarDecorator(IReadWriter source) {
        super(source);
    }

    @Override
    public void write(String data) {
        super.write(data);
        System.out.println("Rar data were written:\n" + data);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Rar data were read");
    }
}