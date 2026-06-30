package l26;

/* loaded from: classes14.dex */
public final class b0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f315216d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l26.c0 f315217e;

    public b0(l26.c0 c0Var) {
        this.f315217e = c0Var;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f315216d;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f315216d) {
            throw new java.util.NoSuchElementException();
        }
        this.f315216d = false;
        return this.f315217e.f315218d;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
