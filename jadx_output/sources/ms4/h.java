package ms4;

/* loaded from: classes8.dex */
public final class h extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final js4.n f331028d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331029e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331030f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331031g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331032h;

    /* renamed from: i, reason: collision with root package name */
    public ks4.g f331033i;

    /* renamed from: m, reason: collision with root package name */
    public int f331034m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f331035n;

    /* renamed from: o, reason: collision with root package name */
    public int f331036o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f331037p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f331038q;

    public h(js4.n mParams) {
        kotlin.jvm.internal.o.g(mParams, "mParams");
        this.f331028d = mParams;
        this.f331029e = new androidx.lifecycle.j0();
        this.f331030f = new androidx.lifecycle.j0();
        this.f331031g = new androidx.lifecycle.j0();
        this.f331032h = new androidx.lifecycle.j0();
        this.f331036o = -1;
    }

    public final void N6(int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(this.f331036o);
        java.lang.String str2 = this.f331037p;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("mSceneSessionID");
            throw null;
        }
        objArr[1] = str2;
        java.lang.String str3 = this.f331038q;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("mSessionid");
            throw null;
        }
        objArr[2] = str3;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(i18);
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = str;
        g0Var.d(22129, objArr);
    }

    public final void O6(int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(this.f331036o);
        java.lang.String str = this.f331037p;
        if (str == null) {
            kotlin.jvm.internal.o.o("mSceneSessionID");
            throw null;
        }
        objArr[1] = str;
        java.lang.String str2 = this.f331038q;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("mSessionid");
            throw null;
        }
        objArr[2] = str2;
        objArr[3] = java.lang.Integer.valueOf(i17);
        g0Var.d(21651, objArr);
    }

    public final void P6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RechargeProductsDialogViewModel", "resetCacheValue:");
        os4.a.a(this.f331029e, null);
        os4.a.a(this.f331031g, null);
    }
}
