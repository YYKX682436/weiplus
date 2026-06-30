package go2;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f273983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f273983d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#orderAndPay consumeData onFailed errorType:");
        pr4.j jVar = it.f357985a;
        sb6.append(jVar);
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberPayUIC", sb6.toString());
        kotlin.jvm.internal.h0 h0Var = this.f273983d;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new go2.d0(false, "orderAndPay consumeData onFailed errorType:" + jVar, "")));
        }
        h0Var.f310123d = null;
        return jz5.f0.f302826a;
    }
}
