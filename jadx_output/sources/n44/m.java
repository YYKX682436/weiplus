package n44;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f334980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n44.n f334981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.modelbase.m1 m1Var, n44.n nVar) {
        super(1);
        this.f334980d = m1Var;
        this.f334981e = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$request$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$request$2$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request invokeOnCancellation, net scene type is ");
        com.tencent.mm.modelbase.m1 m1Var = this.f334980d;
        sb6.append(m1Var.getType());
        com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", sb6.toString());
        gm0.j1.d().q(m1Var.getType(), this.f334981e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$request$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$request$2$1");
        return f0Var;
    }
}
