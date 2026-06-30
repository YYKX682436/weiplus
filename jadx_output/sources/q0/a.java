package q0;

/* loaded from: classes14.dex */
public abstract class a implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f359216d;

    /* renamed from: e, reason: collision with root package name */
    public int f359217e;

    public a(int i17, int i18) {
        this.f359216d = i17;
        this.f359217e = i18;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f359216d < this.f359217e;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f359216d > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f359216d;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f359216d - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
