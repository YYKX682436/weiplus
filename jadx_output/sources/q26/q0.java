package q26;

/* loaded from: classes5.dex */
public final class q0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f359888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q26.r0 f359889e;

    public q0(q26.r0 r0Var) {
        this.f359889e = r0Var;
        this.f359888d = r0Var.f359890a.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359888d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return this.f359889e.f359891b.invoke(this.f359888d.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
