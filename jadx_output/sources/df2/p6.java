package df2;

/* loaded from: classes.dex */
public final class p6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f231042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f231042d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) this.f231042d.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(0));
        }
        return jz5.f0.f302826a;
    }
}
