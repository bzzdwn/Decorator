public class JsonDecorator extends BaseDecorator {

    public JsonDecorator(IReadWriter source) {
        super(source);
    }

    @Override
    public void write(String data) {
        super.write(data);
        System.out.println("Json data were written:\n" + data);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Json data were read");
    }
}
