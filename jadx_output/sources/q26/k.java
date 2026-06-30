package q26;

/* loaded from: classes12.dex */
public final class k implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f359860a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f359861b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f359862c;

    public k(q26.n sequence, yz5.l transformer, yz5.l iterator) {
        kotlin.jvm.internal.o.g(sequence, "sequence");
        kotlin.jvm.internal.o.g(transformer, "transformer");
        kotlin.jvm.internal.o.g(iterator, "iterator");
        this.f359860a = sequence;
        this.f359861b = transformer;
        this.f359862c = iterator;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new q26.j(this);
    }
}
