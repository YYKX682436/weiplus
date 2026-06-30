package t53;

/* loaded from: classes8.dex */
public final class h0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f415766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t53.j f415767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t53.m0 f415771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u53.c0 f415772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f415773h;

    public h0(com.tencent.mm.ui.widget.dialog.z2 z2Var, t53.j jVar, ik1.b0 b0Var, ik1.b0 b0Var2, ik1.b0 b0Var3, t53.m0 m0Var, u53.c0 c0Var, int i17) {
        this.f415766a = z2Var;
        this.f415767b = jVar;
        this.f415768c = b0Var;
        this.f415769d = b0Var2;
        this.f415770e = b0Var3;
        this.f415771f = m0Var;
        this.f415772g = c0Var;
        this.f415773h = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        boolean z17;
        this.f415766a.B();
        t53.j jVar = this.f415767b;
        if (jVar != null) {
            java.lang.Object value = this.f415768c.f291824a;
            kotlin.jvm.internal.o.f(value, "value");
            com.tencent.mm.ui.oi oiVar = (com.tencent.mm.ui.oi) jVar;
            oiVar.f209478a.runOnUiThread(new com.tencent.mm.ui.ni(oiVar, ((java.lang.Boolean) value).booleanValue()));
        }
        ik1.b0 b0Var = this.f415769d;
        if (b0Var != null) {
            java.lang.Object value2 = b0Var.f291824a;
            kotlin.jvm.internal.o.f(value2, "value");
            if (((java.lang.Boolean) value2).booleanValue()) {
                java.lang.Object value3 = this.f415770e.f291824a;
                kotlin.jvm.internal.o.f(value3, "value");
                if (((java.lang.Boolean) value3).booleanValue()) {
                    z17 = true;
                    this.f415771f.fj(6, 4L, ((f63.e) this.f415772g).u0(), ((f63.e) this.f415772g).t0(), ((f63.e) this.f415772g).v0(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f415773h), (java.lang.Boolean) this.f415769d.f291824a);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList isAssociateWithWAGame null hideDialog");
        }
        z17 = false;
        this.f415771f.fj(6, 4L, ((f63.e) this.f415772g).u0(), ((f63.e) this.f415772g).t0(), ((f63.e) this.f415772g).v0(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f415773h), (java.lang.Boolean) this.f415769d.f291824a);
    }
}
