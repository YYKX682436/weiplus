package ec3;

/* loaded from: classes9.dex */
public final class g implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.l f251008a;

    public g(ec3.l lVar) {
        this.f251008a = lVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell] OpenLiteApp failed");
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.f(this.f251008a));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell] OpenLiteApp success");
    }
}
