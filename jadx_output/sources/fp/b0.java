package fp;

/* loaded from: classes5.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final fp.b0 f265163a = new fp.a0(null);

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f265164b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile fp.b0 f265165c;

    public b0(fp.x xVar) {
    }

    public static fp.b0 a() {
        if (f265165c == null) {
            synchronized (f265164b) {
                if (f265165c == null) {
                    if (!com.tencent.mm.sdk.platformtools.x2.r() && com.tencent.mm.sdk.platformtools.z.f193123s) {
                        f265165c = new fp.z(null);
                    }
                    f265165c = f265163a;
                }
            }
        }
        return f265165c;
    }

    public abstract void b(java.lang.String str);

    public abstract java.lang.String c(java.lang.String str);

    public abstract java.lang.String d(java.lang.String str);
}
