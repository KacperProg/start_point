public class Computer {
    
    int storageSpace;
    String printerModel;
    boolean connected;

    public Computer(int inputStorage, String inputModel){
        this.storageSpace = inputStorage;
        this.printerModel = inputModel;
        this.connected = false;
    }

    public int getStorageSpace(){
        return this.storageSpace;
    }

    public void setStorageSpace(){
        this.storageSpace += 10;
    }
}
