package t53;

/* loaded from: classes8.dex */
public final class e0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t53.j f415740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f415742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t53.m0 f415745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u53.c0 f415746g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f415747h;

    public e0(t53.j jVar, ik1.b0 b0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var, ik1.b0 b0Var2, ik1.b0 b0Var3, t53.m0 m0Var, u53.c0 c0Var, int i17) {
        this.f415740a = jVar;
        this.f415741b = b0Var;
        this.f415742c = z2Var;
        this.f415743d = b0Var2;
        this.f415744e = b0Var3;
        this.f415745f = m0Var;
        this.f415746g = c0Var;
        this.f415747h = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        boolean z17;
        t53.j jVar = this.f415740a;
        if (jVar != null) {
            java.lang.Object value = this.f415741b.f291824a;
            kotlin.jvm.internal.o.f(value, "value");
            com.tencent.mm.ui.oi oiVar = (com.tencent.mm.ui.oi) jVar;
            oiVar.f209478a.runOnUiThread(new com.tencent.mm.ui.ni(oiVar, ((java.lang.Boolean) value).booleanValue()));
        }
        this.f415742c.B();
        ik1.b0 b0Var = this.f415743d;
        if (b0Var != null) {
            java.lang.Object value2 = b0Var.f291824a;
            kotlin.jvm.internal.o.f(value2, "value");
            if (((java.lang.Boolean) value2).booleanValue()) {
                java.lang.Object value3 = this.f415744e.f291824a;
                kotlin.jvm.internal.o.f(value3, "value");
                if (((java.lang.Boolean) value3).booleanValue()) {
                    z17 = true;
                    this.f415745f.fj(7, 4L, ((f63.e) this.f415746g).u0(), ((f63.e) this.f415746g).t0(), ((f63.e) this.f415746g).v0(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f415747h), (java.lang.Boolean) this.f415743d.f291824a);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList isAssociateWithWAGame null hideDialog");
        }
        z17 = false;
        this.f415745f.fj(7, 4L, ((f63.e) this.f415746g).u0(), ((f63.e) this.f415746g).t0(), ((f63.e) this.f415746g).v0(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f415747h), (java.lang.Boolean) this.f415743d.f291824a);
    }
}
