package qy1;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final qy1.c f367717a = new qy1.c();

    /* renamed from: b, reason: collision with root package name */
    public static x51.k0 f367718b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f367719c;

    /* renamed from: d, reason: collision with root package name */
    public static qy1.d f367720d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f367721e;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f367719c = hashMap;
        f367721e = new java.lang.Object();
        hashMap.put(428459010, qy1.a.f367692a);
    }

    public final void a() {
        synchronized (f367721e) {
            x51.k0 k0Var = f367718b;
            if (k0Var != null) {
                if (k0Var != null) {
                    k0Var.W(f367717a.hashCode());
                }
                f367718b = null;
            }
        }
        if (f367720d != null) {
            f367720d = null;
        }
    }

    public final x51.k0 b() {
        if (!gm0.j1.a()) {
            return null;
        }
        if (f367718b == null) {
            f367718b = x51.l0.a(hashCode(), gm0.j1.u().h() + "WxCgiReport.db", f367719c, true, true);
        }
        return f367718b;
    }

    public final void c() {
        if (f367720d == null) {
            synchronized (f367721e) {
                if (f367720d == null) {
                    try {
                        x51.k0 b17 = f367717a.b();
                        if (b17 != null) {
                            f367720d = new qy1.d(b17);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CgiDBHelper", "create db or table err! " + e17);
                    }
                }
            }
        }
    }
}
