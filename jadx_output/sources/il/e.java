package il;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static il.e f291982d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f291983a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f291984b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f291985c;

    public static il.e c() {
        if (f291982d == null) {
            synchronized (il.e.class) {
                if (f291982d == null) {
                    f291982d = new il.e();
                }
            }
        }
        return f291982d;
    }

    public synchronized boolean a(java.lang.String str) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "delete path:%s", str);
        java.lang.String a17 = rl.d.a("" + str.hashCode());
        if (!this.f291983a.contains(a17)) {
            this.f291983a.remove(a17);
        }
        return true;
    }

    public final com.tencent.mm.vfs.r6 b() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f291985c);
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.io.IOException e17) {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioCachePathMgr", e17, "getCacheFile", new java.lang.Object[0]);
            }
        }
        return r6Var;
    }

    public synchronized boolean d(java.lang.String str) {
        return this.f291983a.contains(rl.d.a("" + str.hashCode()));
    }
}
