package wt3;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f449378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(kotlin.jvm.internal.h0 h0Var) {
        super(2);
        this.f449378d = h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        kotlin.jvm.internal.h0 h0Var = this.f449378d;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var.f310123d;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (!booleanValue) {
                str = null;
            }
            continuation.resumeWith(kotlin.Result.m521constructorimpl(str));
        }
        h0Var.f310123d = null;
        return jz5.f0.f302826a;
    }
}
