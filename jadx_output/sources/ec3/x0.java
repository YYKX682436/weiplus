package ec3;

/* loaded from: classes9.dex */
public final class x0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251101a;

    public x0(ec3.g1 g1Var) {
        this.f251101a = g1Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openClickLiteApp] OpenLiteApp failed");
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.v0(this.f251101a));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openClickLiteApp] OpenLiteApp success");
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.w0(this.f251101a));
    }
}
