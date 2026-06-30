package kz5;

/* loaded from: classes5.dex */
public final class p implements java.util.Collection, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object[] f313994d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f313995e;

    public p(java.lang.Object[] values, boolean z17) {
        kotlin.jvm.internal.o.g(values, "values");
        this.f313994d = values;
        this.f313995e = z17;
    }

    @Override // java.util.Collection
    public boolean add(java.lang.Object obj) {
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
    public boolean contains(java.lang.Object obj) {
        return kz5.z.G(this.f313994d, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f313994d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return kotlin.jvm.internal.c.a(this.f313994d);
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
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f313994d.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.f313994d;
        kotlin.jvm.internal.o.g(objArr, "<this>");
        if (this.f313995e && kotlin.jvm.internal.o.b(objArr.getClass(), java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
