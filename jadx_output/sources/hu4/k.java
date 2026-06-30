package hu4;

/* loaded from: classes9.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    public static final hu4.k[][] f285231c = (hu4.k[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) hu4.k.class, 3, 3);

    /* renamed from: a, reason: collision with root package name */
    public final int f285232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f285233b;

    static {
        for (int i17 = 0; i17 < 3; i17++) {
            for (int i18 = 0; i18 < 3; i18++) {
                f285231c[i17][i18] = new hu4.k(i17, i18);
            }
        }
    }

    public k(int i17, int i18) {
        this.f285232a = 0;
        this.f285233b = 0;
        this.f285232a = i17;
        this.f285233b = i18;
    }

    public static synchronized hu4.k a(int i17, int i18) {
        hu4.k kVar;
        synchronized (hu4.k.class) {
            if (i17 < 0 || i17 > 2) {
                throw new java.lang.IllegalArgumentException("row id should be in range [0..2]");
            }
            if (i18 < 0 || i18 > 2) {
                throw new java.lang.IllegalArgumentException("col id should be in range [0..2]");
            }
            kVar = f285231c[i17][i18];
        }
        return kVar;
    }

    public java.lang.String toString() {
        return java.lang.String.format("{row: %d, col: %d}", java.lang.Integer.valueOf(this.f285232a), java.lang.Integer.valueOf(this.f285233b));
    }
}
