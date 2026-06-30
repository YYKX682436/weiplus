package h2;

/* loaded from: classes13.dex */
public final class d implements java.util.Collection, zz5.a {

    /* renamed from: f, reason: collision with root package name */
    public static final h2.c f278258f = new h2.c(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f278259d;

    /* renamed from: e, reason: collision with root package name */
    public final int f278260e;

    public d(java.util.List localeList) {
        kotlin.jvm.internal.o.g(localeList, "localeList");
        this.f278259d = localeList;
        this.f278260e = localeList.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof h2.b)) {
            return false;
        }
        h2.b element = (h2.b) obj;
        kotlin.jvm.internal.o.g(element, "element");
        return this.f278259d.contains(element);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return this.f278259d.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h2.d) {
            return kotlin.jvm.internal.o.b(this.f278259d, ((h2.d) obj).f278259d);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f278259d.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f278259d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f278259d.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f278260e;
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    public java.lang.String toString() {
        return "LocaleList(localeList=" + this.f278259d + ')';
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
