package zv;

/* loaded from: classes7.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv.e2 f475992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(zv.e2 e2Var) {
        super(0);
        this.f475992d = e2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_expose_warm_up_engine_group, 1) == 1);
        boolean booleanValue = valueOf.booleanValue();
        com.tencent.mars.xlog.Log.i(this.f475992d.f475946d, "alwaysWarmUpEngineGroup " + booleanValue);
        return valueOf;
    }
}
