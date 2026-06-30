package fz4;

/* loaded from: classes5.dex */
public final class p implements java.util.Set, zz5.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f267330d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f267331e = new java.util.LinkedHashSet();

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        return this.f267331e.add(new java.lang.ref.WeakReference(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return this.f267330d.addAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f267331e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f267330d.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return this.f267330d.containsAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f267330d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        java.util.Set set = this.f267331e;
        set.removeIf(fz4.n.f267328a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((java.lang.ref.WeakReference) it.next()).get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return kz5.n0.W0(arrayList).iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.f267331e.removeIf(new fz4.o(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return this.f267330d.removeAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return this.f267330d.retainAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        java.util.Set set = this.f267331e;
        set.removeIf(fz4.n.f267328a);
        return set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
