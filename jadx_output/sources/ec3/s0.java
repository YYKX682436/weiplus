package ec3;

/* loaded from: classes.dex */
public final class s0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251089a;

    public s0(ec3.g1 g1Var) {
        this.f251089a = g1Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openLiteAppForYuanBao] OpenLiteApp failed");
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.r0(this.f251089a));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openLiteAppForYuanBao] OpenLiteApp success");
    }
}
