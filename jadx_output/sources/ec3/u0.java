package ec3;

/* loaded from: classes9.dex */
public final class u0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251093a;

    public u0(ec3.g1 g1Var) {
        this.f251093a = g1Var;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openLiteAppForYuanBao] callback actionName: " + str);
        if (!kotlin.jvm.internal.o.b("returntomakeredenvelopspage", str)) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.t0(this.f251093a));
        return false;
    }
}
