package ls4;

/* loaded from: classes8.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f321057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr4.o f321058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ls4.n0 f321059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(kotlin.coroutines.Continuation continuation, pr4.o oVar, ls4.n0 n0Var) {
        super(1);
        this.f321057d = continuation;
        this.f321058e = oVar;
        this.f321059f = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.n it = (pr4.n) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int ordinal = it.f358039a.ordinal();
        pr4.o oVar = this.f321058e;
        kotlin.coroutines.Continuation continuation = this.f321057d;
        if (ordinal == 0) {
            ot5.g.c("WeCoinSubscribeMemberLogic", "fail");
            this.f321059f.b();
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new pr4.f(pr4.g.f357997d, oVar)));
        } else if (ordinal == 1) {
            ot5.g.c("WeCoinSubscribeMemberLogic", "cancel");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new pr4.f(pr4.g.f357998e, oVar)));
        } else if (ordinal == 2) {
            ot5.g.c("WeCoinSubscribeMemberLogic", ya.b.SUCCESS);
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new pr4.f(pr4.g.f357999f, oVar)));
        }
        return jz5.f0.f302826a;
    }
}
