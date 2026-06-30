package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class x2 extends kotlinx.coroutines.r {

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.c3 f310699i;

    public x2(kotlin.coroutines.Continuation continuation, kotlinx.coroutines.c3 c3Var) {
        super(continuation, 1);
        this.f310699i = c3Var;
    }

    @Override // kotlinx.coroutines.r
    public java.lang.Throwable i(kotlinx.coroutines.r2 r2Var) {
        java.lang.Throwable c17;
        java.lang.Object P = this.f310699i.P();
        return (!(P instanceof kotlinx.coroutines.z2) || (c17 = ((kotlinx.coroutines.z2) P).c()) == null) ? P instanceof kotlinx.coroutines.e0 ? ((kotlinx.coroutines.e0) P).f310172a : r2Var.x() : c17;
    }

    @Override // kotlinx.coroutines.r
    public java.lang.String q() {
        return "AwaitContinuation";
    }
}
