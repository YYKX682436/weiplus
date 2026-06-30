package q26;

/* loaded from: classes5.dex */
public final class r0 implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f359890a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f359891b;

    public r0(q26.n sequence, yz5.l transformer) {
        kotlin.jvm.internal.o.g(sequence, "sequence");
        kotlin.jvm.internal.o.g(transformer, "transformer");
        this.f359890a = sequence;
        this.f359891b = transformer;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new q26.q0(this);
    }
}
