package gg;

/* loaded from: classes7.dex */
public class b implements gg.d {
    private static gg.b sInstance;

    private b() {
    }

    public static gg.b getInstance() {
        if (sInstance == null) {
            sInstance = new gg.b();
        }
        return sInstance;
    }

    @Override // gg.d
    public gg.c createClientProxy() {
        return new gg.a();
    }
}
