package ec3;

/* loaded from: classes9.dex */
public final class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f250991a;

    public c0(ec3.g1 g1Var) {
        this.f250991a = g1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgiForFestival] resp: " + fVar);
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.b0(fVar, this.f250991a));
        return null;
    }
}
