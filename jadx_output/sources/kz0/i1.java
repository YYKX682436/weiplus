package kz0;

/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t0 f313744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313746g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(yz5.l lVar, com.tencent.mm.mj_template.sns.compose.widget.t0 t0Var, n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f313743d = lVar;
        this.f313744e = t0Var;
        this.f313745f = v2Var;
        this.f313746g = v2Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_template.sns.compose.widget.t0 t0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dismissBottomSheet ");
        n0.v2 v2Var = this.f313745f;
        sb6.append(kz0.k1.c(v2Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateUIPage", sb6.toString());
        if (kz0.k1.c(v2Var)) {
            v2Var.setValue(java.lang.Boolean.FALSE);
            this.f313743d.invoke(null);
            if (kz0.k1.e(this.f313746g) == kz0.a.f313645m && (t0Var = this.f313744e) != null) {
                t0Var.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
