package nr2;

/* loaded from: classes8.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f339293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f339293d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#orderAndPay onFailed type:");
        pr4.j jVar = it.f357985a;
        sb6.append(jVar);
        com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPayUIC", sb6.toString());
        kotlin.jvm.internal.h0 h0Var = this.f339293d;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new nr2.k0(false, "orderAndPay onFailed type:" + jVar, "", 0)));
        }
        h0Var.f310123d = null;
        return jz5.f0.f302826a;
    }
}
