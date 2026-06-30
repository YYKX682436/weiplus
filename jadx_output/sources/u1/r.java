package u1;

/* loaded from: classes13.dex */
public final class r implements java.util.List, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f423662d;

    /* renamed from: e, reason: collision with root package name */
    public final int f423663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.s f423664f;

    public r(u1.s sVar, int i17, int i18) {
        this.f423664f = sVar;
        this.f423662d = i17;
        this.f423663e = i18;
    }

    @Override // java.util.List
    public void add(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        return this.f423664f.f423665d[i17 + this.f423662d];
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        int i17 = this.f423662d;
        int i18 = this.f423663e;
        if (i17 > i18) {
            return -1;
        }
        int i19 = i17;
        while (!kotlin.jvm.internal.o.b(this.f423664f.f423665d[i19], obj)) {
            if (i19 == i18) {
                return -1;
            }
            i19++;
        }
        return i19 - i17;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f423663e - this.f423662d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        int i17 = this.f423662d;
        return new u1.q(this.f423664f, i17, i17, this.f423663e);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        int i17 = this.f423663e;
        int i18 = this.f423662d;
        if (i18 > i17) {
            return -1;
        }
        while (!kotlin.jvm.internal.o.b(this.f423664f.f423665d[i17], obj)) {
            if (i17 == i18) {
                return -1;
            }
            i17--;
        }
        return i17 - i18;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        int i17 = this.f423662d;
        return new u1.q(this.f423664f, i17, i17, this.f423663e);
    }

    @Override // java.util.List
    public java.lang.Object remove(int i17) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f423663e - this.f423662d;
    }

    @Override // java.util.List
    public void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        int i19 = this.f423662d;
        return new u1.r(this.f423664f, i17 + i19, i19 + i18);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        int i18 = this.f423662d;
        int i19 = this.f423663e;
        return new u1.q(this.f423664f, i17 + i18, i18, i19);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }
}
