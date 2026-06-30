package ec3;

/* loaded from: classes9.dex */
public final class y implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251103b;

    public y(ec3.g1 g1Var, java.lang.String str) {
        this.f251102a = g1Var;
        this.f251103b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] resp: " + fVar);
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.x(fVar, this.f251102a, this.f251103b));
        return null;
    }
}
