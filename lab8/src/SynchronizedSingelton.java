public class SynchronizedSingelton {
    private static SynchronizedSingelton instance;
    private SynchronizedSingelton(){

    }

    public static synchronized SynchronizedSingelton getInstance(){
        if(instance==null){
            instance= new SynchronizedSingelton();
        }
        return instance;
    }
}