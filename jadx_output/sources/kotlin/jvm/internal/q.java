package kotlin.jvm.internal;

/* loaded from: classes14.dex */
public abstract class q implements kotlin.jvm.internal.k, java.io.Serializable {
    private final int arity;

    public q(int i17) {
        this.arity = i17;
    }

    @Override // kotlin.jvm.internal.k
    public int getArity() {
        return this.arity;
    }

    public java.lang.String toString() {
        java.lang.String i17 = kotlin.jvm.internal.i0.f310124a.i(this);
        kotlin.jvm.internal.o.f(i17, "renderLambdaToString(...)");
        return i17;
    }
}
