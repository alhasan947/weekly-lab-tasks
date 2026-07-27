class Singleton {
    public String str;

    private static Singleton singleInstance = null;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}
