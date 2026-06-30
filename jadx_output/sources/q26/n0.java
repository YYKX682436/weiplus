package q26;

/* loaded from: classes14.dex */
public final class n0 implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f359876a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f359877b;

    public n0(q26.n sequence, yz5.l predicate) {
        kotlin.jvm.internal.o.g(sequence, "sequence");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        this.f359876a = sequence;
        this.f359877b = predicate;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new q26.m0(this);
    }
}
