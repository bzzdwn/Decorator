public class FolderDecorator extends BaseDecorator {


    public FolderDecorator(IReadWriter source) {
        super(source);
    }

    @Override
    public void write(String data) {
        super.write(data);
        System.out.println(data + " was added to folder.");
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Data were read from folder");
    }
}