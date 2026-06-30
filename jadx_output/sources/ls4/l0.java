package ls4;

/* loaded from: classes8.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f321078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr4.o f321079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlin.coroutines.Continuation continuation, pr4.o oVar) {
        super(0);
        this.f321078d = continuation;
        this.f321079e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ot5.g.c("WeCoinSubscribeMemberLogic", "cancel");
        try {
            kotlin.coroutines.Continuation continuation = this.f321078d;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new pr4.f(pr4.g.f357998e, this.f321079e)));
        } catch (java.lang.IllegalStateException e17) {
            ot5.g.a("WeCoinSubscribeMemberLogic", e17);
        }
        return jz5.f0.f302826a;
    }
}
