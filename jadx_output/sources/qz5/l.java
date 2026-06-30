package qz5;

/* loaded from: classes14.dex */
public abstract class l extends qz5.d implements kotlin.jvm.internal.k {
    private final int arity;

    public l(int i17, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.arity = i17;
    }

    @Override // kotlin.jvm.internal.k
    public int getArity() {
        return this.arity;
    }

    @Override // qz5.a
    public java.lang.String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        java.lang.String h17 = kotlin.jvm.internal.i0.f310124a.h(this);
        kotlin.jvm.internal.o.f(h17, "renderLambdaToString(...)");
        return h17;
    }
}
