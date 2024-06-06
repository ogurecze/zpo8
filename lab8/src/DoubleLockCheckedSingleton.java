public class DoubleLockCheckedSingleton {
    private volatile static DoubleLockCheckedSingleton instance;
    private DoubleLockCheckedSingleton(){

    }

    public static DoubleLockCheckedSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleLockCheckedSingleton.class){
                if(instance==null){
                    instance= new DoubleLockCheckedSingleton();
                }
            }
        }
        return instance;
    }
}