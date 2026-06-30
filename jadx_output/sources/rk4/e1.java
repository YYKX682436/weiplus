package rk4;

/* loaded from: classes8.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yz5.l lVar) {
        super(1);
        this.f396625d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consumeWCCoin onFailed, errorType: ");
        pr4.j jVar = it.f357985a;
        sb6.append(jVar);
        com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", sb6.toString());
        int ordinal = jVar.ordinal();
        yz5.l lVar = this.f396625d;
        if (ordinal == 1) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(99993, "consumeWCCoin onFailed, no money!", new byte[0]))));
        } else if (ordinal != 2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(99992, "consumeWCCoin onFailed, defaultError!", new byte[0]))));
        } else {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.AsyncResult(99994, "consumeWCCoin onFailed, intercept!", new byte[0]))));
        }
        return jz5.f0.f302826a;
    }
}
