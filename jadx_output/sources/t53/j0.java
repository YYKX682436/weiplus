package t53;

/* loaded from: classes8.dex */
public final class j0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f415779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415781c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t53.m0 f415783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u53.c0 f415784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f415785g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415786h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f415787i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t53.j f415788j;

    public j0(com.tencent.mm.ui.widget.dialog.z2 z2Var, ik1.b0 b0Var, ik1.b0 b0Var2, java.lang.String str, t53.m0 m0Var, u53.c0 c0Var, int i17, ik1.b0 b0Var3, android.content.Context context, t53.j jVar) {
        this.f415779a = z2Var;
        this.f415780b = b0Var;
        this.f415781c = b0Var2;
        this.f415782d = str;
        this.f415783e = m0Var;
        this.f415784f = c0Var;
        this.f415785g = i17;
        this.f415786h = b0Var3;
        this.f415787i = context;
        this.f415788j = jVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        boolean z17;
        this.f415779a.B();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        ik1.b0 b0Var = this.f415780b;
        if (b0Var != null) {
            java.lang.Object value = b0Var.f291824a;
            kotlin.jvm.internal.o.f(value, "value");
            if (((java.lang.Boolean) value).booleanValue()) {
                java.lang.Object value2 = this.f415781c.f291824a;
                kotlin.jvm.internal.o.f(value2, "value");
                if (((java.lang.Boolean) value2).booleanValue()) {
                    z17 = true;
                    c0Var.f310112d = z17;
                }
            }
            z17 = false;
            c0Var.f310112d = z17;
        } else {
            com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList isAssociateWithWAGame null");
        }
        u53.y yVar = (u53.y) i95.n0.c(u53.y.class);
        java.lang.String str = this.f415782d;
        ((y53.x) yVar).Ri(str, true, c0Var.f310112d, new t53.i0(str, c0Var, this.f415786h, this.f415787i, this.f415788j));
        this.f415783e.fj(6, 65L, ((f63.e) this.f415784f).u0(), ((f63.e) this.f415784f).t0(), ((f63.e) this.f415784f).v0(), java.lang.Boolean.valueOf(c0Var.f310112d), java.lang.Integer.valueOf(this.f415785g), (java.lang.Boolean) this.f415780b.f291824a);
    }
}
