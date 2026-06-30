package lx;

/* loaded from: classes9.dex */
public final class d5 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f321726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321727e;

    public d5(lx.m5 m5Var, yz5.l lVar) {
        this.f321726d = m5Var;
        this.f321727e = lVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 385) {
            gm0.j1.d().q(385, this);
            boolean Bi = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Bi();
            lx.m5.a(this.f321726d);
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "onSceneEnd: %s, %s, %s, unReg: %s", valueOf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(Bi));
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f321727e.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(!Bi))));
        }
    }
}
