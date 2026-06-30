package n44;

/* loaded from: classes.dex */
public final class n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f335001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f335002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.r f335003f;

    public n(com.tencent.mm.modelbase.m1 m1Var, kotlinx.coroutines.q qVar, yz5.r rVar) {
        this.f335001d = m1Var;
        this.f335002e = qVar;
        this.f335003f = rVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$request$2$_onSceneEnd$1");
        com.tencent.mm.modelbase.m1 m1Var2 = this.f335001d;
        if (kotlin.jvm.internal.o.b(m1Var, m1Var2)) {
            com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", "request onSceneEnd");
            gm0.j1.d().q(m1Var2.getType(), this);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f335002e.resumeWith(kotlin.Result.m521constructorimpl(this.f335003f.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var)));
        } else {
            com.tencent.mars.xlog.Log.w("AdHalfScreenJumpHelper", "request, scene is not netScene");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$request$2$_onSceneEnd$1");
    }
}
