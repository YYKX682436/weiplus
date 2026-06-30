package nd1;

/* loaded from: classes7.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f336341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336344g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336345h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f336346i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f336347m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ nd1.p0 f336348n;

    public n0(com.tencent.mm.plugin.appbrand.page.i3 i3Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.y yVar, int i18, nd1.p0 p0Var) {
        this.f336341d = i3Var;
        this.f336342e = i17;
        this.f336343f = str;
        this.f336344g = str2;
        this.f336345h = str3;
        this.f336346i = yVar;
        this.f336347m = i18;
        this.f336348n = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nd1.p0 p0Var = this.f336348n;
        int i17 = this.f336347m;
        com.tencent.mm.plugin.appbrand.y yVar = this.f336346i;
        try {
            yVar.a(i17, p0Var.o(this.f336341d.b0(this.f336342e, this.f336343f, this.f336344g, this.f336345h) ? "ok" : "fail"));
        } catch (java.lang.UnsupportedOperationException unused) {
            yVar.a(i17, p0Var.o("fail:not supported"));
        }
    }
}
