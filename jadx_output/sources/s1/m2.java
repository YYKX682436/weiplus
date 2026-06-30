package s1;

/* loaded from: classes13.dex */
public final class m2 implements java.util.Collection, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f402038d;

    public m2(java.util.Set set, int i17, kotlin.jvm.internal.i iVar) {
        set = (i17 & 1) != 0 ? new java.util.LinkedHashSet() : set;
        kotlin.jvm.internal.o.g(set, "set");
        this.f402038d = set;
    }

    @Override // java.util.Collection
    public boolean add(java.lang.Object obj) {
        return this.f402038d.add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f402038d.clear();
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f402038d.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return this.f402038d.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f402038d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f402038d.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.f402038d.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection slotIds) {
        kotlin.jvm.internal.o.g(slotIds, "slotIds");
        return this.f402038d.remove(slotIds);
    }

    @Override // java.util.Collection
    public boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection slotIds) {
        kotlin.jvm.internal.o.g(slotIds, "slotIds");
        return this.f402038d.retainAll(slotIds);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f402038d.size();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
