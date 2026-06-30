package jm0;

/* loaded from: classes4.dex */
public abstract class k extends n75.a {

    /* renamed from: h, reason: collision with root package name */
    public static final jm0.i f300269h = new jm0.i(null);

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f300270i = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f300271e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f300272f;

    /* renamed from: g, reason: collision with root package name */
    public l75.k0 f300273g;

    public final boolean O6(java.lang.String dbPath) {
        long j17;
        d95.b0 b0Var;
        boolean S;
        d95.b0 b0Var2;
        kotlin.jvm.internal.o.g(dbPath, "dbPath");
        synchronized (this.f300271e) {
            boolean z17 = false;
            if (this.f300272f || this.f300273g != null) {
                l75.k0 k0Var = this.f300273g;
                if (k0Var != null && !k0Var.J()) {
                    z17 = true;
                }
                return z17;
            }
            long c17 = c01.id.c();
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(dbPath);
            if (!com.tencent.mm.vfs.w6.j(r17)) {
                com.tencent.mm.vfs.w6.u(r17);
            }
            d95.b0 b0Var3 = new d95.b0();
            java.util.HashMap hashMap = new java.util.HashMap();
            if (Q6()) {
                j17 = c17;
                b0Var = b0Var3;
                S = b0Var3.R("", dbPath, "", gm0.j1.b().h(), wo.w0.g(true), hashMap, false);
            } else {
                j17 = c17;
                b0Var = b0Var3;
                S = b0Var.S(dbPath, hashMap, false, true);
            }
            if (S) {
                b0Var2 = b0Var;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MMMvvmDB", "create db error, dbPath:".concat(dbPath));
                b0Var2 = null;
            }
            this.f300273g = b0Var2;
            java.util.Iterator it = N6().iterator();
            while (it.hasNext()) {
                ((l75.f0) it.next()).createMyTable(this.f300273g);
            }
            long c18 = c01.id.c();
            this.f300272f = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MMMvvmDB", "initDB params %d %s %s", java.lang.Long.valueOf(c18 - j17), com.tencent.mm.sdk.platformtools.t8.i0(com.tencent.mm.vfs.w6.k(dbPath), 100.0d), dbPath);
            return S;
        }
    }

    public final com.tencent.mm.sdk.storage.mvvm.MvvmStorage P6(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(this.f335457d, new jm0.j(this)).a(modelClass);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.sdk.storage.mvvm.MvvmStorage) a17;
    }

    public l75.k0 Q4() {
        synchronized (this.f300271e) {
            l75.k0 k0Var = this.f300273g;
            boolean z17 = false;
            if (k0Var != null && !k0Var.J()) {
                z17 = true;
            }
            if (!z17) {
                return null;
            }
            return this.f300273g;
        }
    }

    public abstract boolean Q6();

    @Override // n75.a, androidx.lifecycle.c1
    public void onCleared() {
        l75.k0 k0Var;
        super.onCleared();
        l75.k0 k0Var2 = this.f300273g;
        if (((k0Var2 == null || k0Var2.J()) ? false : true) && (k0Var = this.f300273g) != null) {
            k0Var.close();
        }
        this.f300272f = false;
        this.f300273g = null;
    }
}
