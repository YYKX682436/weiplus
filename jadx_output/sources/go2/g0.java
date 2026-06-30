package go2;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f273979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f273979d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.b it = (pr4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberPayUIC", "#orderAndPay consumeData onSuccess");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_MEMBER_PAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        kotlin.jvm.internal.h0 h0Var = this.f273979d;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new go2.d0(true, "", "")));
        }
        h0Var.f310123d = null;
        return jz5.f0.f302826a;
    }
}
