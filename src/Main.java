public class Main {
    public static void main(String[] args){
        BaseDecorator file = new FolderDecorator(new JsonDecorator(new ZipDecorator(new TXTDecorator())));
        file.write("value");
        file.read();
    }
}