package fg1;

/* loaded from: classes7.dex */
public final class g1 implements pd1.j {

    /* renamed from: a, reason: collision with root package name */
    public final bg.f f261868a;

    /* renamed from: b, reason: collision with root package name */
    public final fg1.f1 f261869b = new fg1.f1(this, null);

    public g1(bg.f fVar) {
        this.f261868a = fVar;
        fg1.y0 y0Var = new fg1.y0(this);
        fVar.M1 = y0Var;
        dg.e eVar = fVar.f19765i;
        if (eVar != null) {
            fg1.b0 b0Var = (fg1.b0) eVar;
            synchronized (b0Var) {
                b0Var.f261849h = y0Var;
            }
        }
        fg1.z0 z0Var = new fg1.z0(this);
        fVar.N1 = z0Var;
        dg.e eVar2 = fVar.f19765i;
        if (eVar2 != null) {
            fg1.b0 b0Var2 = (fg1.b0) eVar2;
            synchronized (b0Var2) {
                b0Var2.f261850i = z0Var;
            }
        }
    }

    public boolean a() {
        return this.f261868a.T1.get();
    }

    @Override // pd1.j
    public void d(com.tencent.mm.plugin.appbrand.page.v5 v5Var, pd1.i iVar) {
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = v5Var.getJsRuntime();
        bg.f fVar = this.f261868a;
        if (jsRuntime == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, null == jsRuntime");
            iVar.a(fVar.C(), fVar.D());
            return;
        }
        java.lang.String str = "document.querySelector('embed[embed-id=\"" + fVar.f252497d + "\"]').getBoundingClientRect().toJSON()";
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, jsScript: " + str);
        jsRuntime.evaluateJavascript(str, new fg1.a1(this, iVar));
    }

    @Override // pd1.j
    public int i() {
        bg.f fVar = this.f261868a;
        int i17 = (int) (fVar.O1 * fVar.E);
        fVar.A();
        return i17;
    }

    @Override // pd1.j
    public boolean isPlaying() {
        return this.f261868a.G();
    }

    @Override // pd1.j
    public int k() {
        bg.f fVar = this.f261868a;
        int i17 = (int) (fVar.P1 * fVar.F);
        fVar.A();
        return i17;
    }

    @Override // pd1.j
    public android.graphics.Point m() {
        bg.f fVar = this.f261868a;
        return new android.graphics.Point(fVar.C(), fVar.D());
    }

    @Override // pd1.j
    public pd1.o n() {
        return this.f261869b;
    }
}
