package q26;

/* loaded from: classes12.dex */
public final class a implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f359824a;

    public a(q26.n sequence) {
        kotlin.jvm.internal.o.g(sequence, "sequence");
        this.f359824a = new java.util.concurrent.atomic.AtomicReference(sequence);
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        q26.n nVar = (q26.n) this.f359824a.getAndSet(null);
        if (nVar != null) {
            return nVar.iterator();
        }
        throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
    }
}
