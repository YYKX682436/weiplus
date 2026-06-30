package nr2;

/* loaded from: classes8.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f339286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f339287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(boolean z17, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f339286d = z17;
        this.f339287e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.b it = (pr4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPayUIC", "#orderAndPay onSuccess");
        if (this.f339286d) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_COURSE_PAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_DRAMA_PAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        kotlin.jvm.internal.h0 h0Var = this.f339287e;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new nr2.k0(true, "", "", 0)));
        }
        h0Var.f310123d = null;
        return jz5.f0.f302826a;
    }
}
