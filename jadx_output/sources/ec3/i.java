package ec3;

/* loaded from: classes9.dex */
public final class i implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec3.l f251036a;

    public i(ec3.l lVar) {
        this.f251036a = lVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell] back from liteapp, callback actionName: " + str);
        if (!kotlin.jvm.internal.o.b("returntomakeredenvelopspage", str)) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.h(this.f251036a));
        return false;
    }
}
