package hello.core.singleton;

public class SingleTonService {

    private static final SingleTonService instance = new SingleTonService();

    public static SingleTonService getInstance() {
        return instance;
    }

    private SingleTonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객채 로직 호");
    }
}
