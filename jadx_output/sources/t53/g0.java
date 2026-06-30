package t53;

/* loaded from: classes8.dex */
public final class g0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f415754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t53.m0 f415758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u53.c0 f415759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f415760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415761h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f415762i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t53.j f415763j;

    public g0(com.tencent.mm.ui.widget.dialog.z2 z2Var, ik1.b0 b0Var, ik1.b0 b0Var2, java.lang.String str, t53.m0 m0Var, u53.c0 c0Var, int i17, ik1.b0 b0Var3, android.content.Context context, t53.j jVar) {
        this.f415754a = z2Var;
        this.f415755b = b0Var;
        this.f415756c = b0Var2;
        this.f415757d = str;
        this.f415758e = m0Var;
        this.f415759f = c0Var;
        this.f415760g = i17;
        this.f415761h = b0Var3;
        this.f415762i = context;
        this.f415763j = jVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        boolean z17;
        this.f415754a.B();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        ik1.b0 b0Var = this.f415755b;
        if (b0Var != null) {
            java.lang.Object value = b0Var.f291824a;
            kotlin.jvm.internal.o.f(value, "value");
            if (((java.lang.Boolean) value).booleanValue()) {
                java.lang.Object value2 = this.f415756c.f291824a;
                kotlin.jvm.internal.o.f(value2, "value");
                if (((java.lang.Boolean) value2).booleanValue()) {
                    z17 = true;
                    c0Var.f310112d = z17;
                }
            }
            z17 = false;
            c0Var.f310112d = z17;
        } else {
            com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame removeBlackList isAssociateWithWAGame null");
        }
        u53.y yVar = (u53.y) i95.n0.c(u53.y.class);
        java.lang.String str = this.f415757d;
        ((y53.x) yVar).Ri(str, false, c0Var.f310112d, new t53.f0(str, c0Var, this.f415761h, this.f415762i, this.f415763j));
        this.f415758e.fj(7, 64L, ((f63.e) this.f415759f).u0(), ((f63.e) this.f415759f).t0(), ((f63.e) this.f415759f).v0(), java.lang.Boolean.valueOf(c0Var.f310112d), java.lang.Integer.valueOf(this.f415760g), (java.lang.Boolean) this.f415755b.f291824a);
    }
}
