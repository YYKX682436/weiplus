package ls4;

/* loaded from: classes8.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f321071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr4.o f321072e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kotlin.coroutines.Continuation continuation, pr4.o oVar) {
        super(1);
        this.f321071d = continuation;
        this.f321072e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.b it = (pr4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ot5.g.c("WeCoinSubscribeMemberLogic", ya.b.SUCCESS);
        try {
            kotlin.coroutines.Continuation continuation = this.f321071d;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new pr4.f(pr4.g.f357999f, this.f321072e)));
        } catch (java.lang.IllegalStateException e17) {
            ot5.g.a("WeCoinSubscribeMemberLogic", e17);
        }
        return jz5.f0.f302826a;
    }
}
