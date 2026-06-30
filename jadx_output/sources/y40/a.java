package y40;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y40.i0 f459278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y40.i0 i0Var) {
        super(0);
        this.f459278d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_expose_warm_up_engine_group, 1) == 1);
        boolean booleanValue = valueOf.booleanValue();
        com.tencent.mars.xlog.Log.i(this.f459278d.f459295d, "alwaysWarmUpEngineGroup " + booleanValue);
        return valueOf;
    }
}
