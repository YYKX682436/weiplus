package kz0;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f313654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t0 f313656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313658h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ty0.b1 b1Var, yz5.l lVar, com.tencent.mm.mj_template.sns.compose.widget.t0 t0Var, n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f313654d = b1Var;
        this.f313655e = lVar;
        this.f313656f = t0Var;
        this.f313657g = v2Var;
        this.f313658h = v2Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateUIPage", "TemplateUIPage: on search btn clicked");
        kz0.a aVar = kz0.a.f313645m;
        int i17 = kz0.k1.f313767a;
        n0.v2 v2Var = this.f313657g;
        v2Var.setValue(aVar);
        this.f313658h.setValue(java.lang.Boolean.valueOf(((java.lang.Boolean) this.f313654d.f422794d.getValue()).booleanValue()));
        this.f313655e.invoke(kz0.k1.e(v2Var));
        com.tencent.mm.mj_template.sns.compose.widget.t0 t0Var = this.f313656f;
        if (t0Var != null) {
            t0Var.a();
        }
        return jz5.f0.f302826a;
    }
}
