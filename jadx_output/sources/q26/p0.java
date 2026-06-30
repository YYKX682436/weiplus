package q26;

/* loaded from: classes8.dex */
public final class p0 implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f359885a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f359886b;

    public p0(q26.n sequence, yz5.p transformer) {
        kotlin.jvm.internal.o.g(sequence, "sequence");
        kotlin.jvm.internal.o.g(transformer, "transformer");
        this.f359885a = sequence;
        this.f359886b = transformer;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new q26.o0(this);
    }
}
