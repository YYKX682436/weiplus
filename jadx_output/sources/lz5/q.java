package lz5;

/* loaded from: classes14.dex */
public final class q extends kz5.n implements java.io.Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final lz5.q f322421e;

    /* renamed from: d, reason: collision with root package name */
    public final lz5.m f322422d;

    static {
        lz5.m mVar = lz5.m.f322404t;
        f322421e = new lz5.q(lz5.m.f322404t);
    }

    public q(lz5.m backing) {
        kotlin.jvm.internal.o.g(backing, "backing");
        this.f322422d = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        return this.f322422d.b(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        this.f322422d.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f322422d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f322422d.containsKey(obj);
    }

    @Override // kz5.n
    public int d() {
        return this.f322422d.f322413o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f322422d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        lz5.m mVar = this.f322422d;
        mVar.getClass();
        return new lz5.k(mVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        lz5.m mVar = this.f322422d;
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
        this.f322422d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        this.f322422d.c();
        return super.retainAll(elements);
    }

    public q() {
        this(new lz5.m());
    }
}
