package lz5;

/* loaded from: classes14.dex */
public final class o extends kz5.n {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.m f322419d;

    public o(lz5.m backing) {
        kotlin.jvm.internal.o.g(backing, "backing");
        this.f322419d = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f322419d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f322419d.containsKey(obj);
    }

    @Override // kz5.n
    public int d() {
        return this.f322419d.f322413o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f322419d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        lz5.m mVar = this.f322419d;
        mVar.getClass();
        return new lz5.k(mVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        lz5.m mVar = this.f322419d;
        mVar.c();
        int h17 = mVar.h(obj);
        if (h17 < 0) {
            return false;
        }
        mVar.l(h17);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        this.f322419d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        this.f322419d.c();
        return super.retainAll(elements);
    }
}
