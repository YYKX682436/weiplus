package q26;

/* loaded from: classes5.dex */
public final class i implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f359847a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f359848b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f359849c;

    public i(q26.n sequence, boolean z17, yz5.l predicate) {
        kotlin.jvm.internal.o.g(sequence, "sequence");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        this.f359847a = sequence;
        this.f359848b = z17;
        this.f359849c = predicate;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new q26.h(this);
    }
}
