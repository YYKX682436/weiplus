package u81;

/* loaded from: classes7.dex */
public final class x extends u81.i0 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f425486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425487h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u81.f0 f0Var, u81.k0 k0Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super(k0Var, appBrandRuntime);
        this.f425487h = f0Var;
    }

    @Override // u81.i0, u81.j0, k75.c
    public void a() {
        this.f425486g = false;
        u81.f0 f0Var = this.f425487h;
        if (f0Var.f425425w) {
            u81.e0 e0Var = f0Var.C;
            e0Var.f425412a = 0;
            u81.f0 f0Var2 = e0Var.f425413b;
            com.tencent.mars.xlog.Log.i(f0Var2.f425423u, "resetSuspendFlag, appId:%s", f0Var2.f425424v.f74803n);
        }
        super.a();
    }

    @Override // k75.c
    public void b() {
        this.f425486g = false;
        this.f425487h.H.b(this);
        this.f425438f = 0;
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterComponentCallbacks(this);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        if (r12.B0() != null) goto L68;
     */
    @Override // k75.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(android.os.Message r12) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u81.x.c(android.os.Message):boolean");
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return "|Background";
    }
}
