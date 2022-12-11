public class BaseDecorator implements IReadWriter {
    private IReadWriter wrappee;
    public BaseDecorator(IReadWriter source){
        this.wrappee = source;
    }

    @Override
    public void write(String file) {
        wrappee.write(file);
    }

    @Override
    public void read() {
        wrappee.read();
    }
}
