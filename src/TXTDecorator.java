public class TXTDecorator implements IReadWriter {

    @Override
    public void write(String data) {
        System.out.println("Txt data were written:\n" + data);
    }

    @Override
    public void read() {
        System.out.println("Txt data were read");
    }
}
