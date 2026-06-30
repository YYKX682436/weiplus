package tx2;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f422558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f422558d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.h0 h0Var = this.f422558d;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        }
        h0Var.f310123d = null;
        return jz5.f0.f302826a;
    }
}
