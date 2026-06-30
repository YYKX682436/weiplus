package ls4;

/* loaded from: classes8.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.n0 f321074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f321075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr4.o f321076f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ls4.n0 n0Var, kotlin.coroutines.Continuation continuation, pr4.o oVar) {
        super(1);
        this.f321074d = n0Var;
        this.f321075e = continuation;
        this.f321076f = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ot5.g.c("WeCoinSubscribeMemberLogic", "fail");
        if (it.f357985a != pr4.j.f358014f) {
            this.f321074d.b();
        }
        try {
            kotlin.coroutines.Continuation continuation = this.f321075e;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new pr4.f(pr4.g.f357997d, this.f321076f)));
        } catch (java.lang.IllegalStateException e17) {
            ot5.g.a("WeCoinSubscribeMemberLogic", e17);
        }
        return jz5.f0.f302826a;
    }
}
