package ec3;

/* loaded from: classes9.dex */
public final class z0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251106a;

    public z0(ec3.g1 g1Var) {
        this.f251106a = g1Var;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openClickLiteApp] callback actionName: " + str);
        if (!kotlin.jvm.internal.o.b("returntomakeredenvelopspage", str)) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.y0(this.f251106a));
        return false;
    }
}
