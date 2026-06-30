package qz5;

/* loaded from: classes14.dex */
public abstract class k extends qz5.j implements kotlin.jvm.internal.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f367944d;

    public k(int i17, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f367944d = i17;
    }

    @Override // kotlin.jvm.internal.k
    public int getArity() {
        return this.f367944d;
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
