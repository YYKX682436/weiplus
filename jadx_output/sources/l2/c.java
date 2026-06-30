package l2;

/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f315108a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f315109b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f315110c;

    static {
        a(0);
        a(50);
        f315108a = 50;
        a(-1);
        f315109b = -1;
        a(100);
        f315110c = 100;
    }

    public static int a(int i17) {
        boolean z17 = true;
        if (!(i17 >= 0 && i17 < 101) && i17 != -1) {
            z17 = false;
        }
        if (z17) {
            return i17;
        }
        throw new java.lang.IllegalStateException("topRatio should be in [0..100] range or -1".toString());
    }
}
