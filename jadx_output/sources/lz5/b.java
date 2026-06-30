package lz5;

/* loaded from: classes16.dex */
public final class b implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.c f322381d;

    /* renamed from: e, reason: collision with root package name */
    public int f322382e;

    /* renamed from: f, reason: collision with root package name */
    public int f322383f;

    /* renamed from: g, reason: collision with root package name */
    public int f322384g;

    public b(lz5.c list, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(list, "list");
        this.f322381d = list;
        this.f322382e = i17;
        this.f322383f = -1;
        i18 = ((java.util.AbstractList) list).modCount;
        this.f322384g = i18;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        int i17;
        b();
        int i18 = this.f322382e;
        this.f322382e = i18 + 1;
        lz5.c cVar = this.f322381d;
        cVar.add(i18, obj);
        this.f322383f = -1;
        i17 = ((java.util.AbstractList) cVar).modCount;
        this.f322384g = i17;
    }

    public final void b() {
        int i17;
        i17 = ((java.util.AbstractList) this.f322381d.f322389h).modCount;
        if (i17 != this.f322384g) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f322382e < this.f322381d.f322387f;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f322382e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f322382e;
        lz5.c cVar = this.f322381d;
        if (i17 >= cVar.f322387f) {
            throw new java.util.NoSuchElementException();
        }
        this.f322382e = i17 + 1;
        this.f322383f = i17;
        return cVar.f322385d[cVar.f322386e + i17];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f322382e;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        b();
        int i17 = this.f322382e;
        if (i17 <= 0) {
            throw new java.util.NoSuchElementException();
        }
        int i18 = i17 - 1;
        this.f322382e = i18;
        this.f322383f = i18;
        lz5.c cVar = this.f322381d;
        return cVar.f322385d[cVar.f322386e + i18];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f322382e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i17;
        b();
        int i18 = this.f322383f;
        if (!(i18 != -1)) {
            throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        lz5.c cVar = this.f322381d;
        cVar.e(i18);
        this.f322382e = this.f322383f;
        this.f322383f = -1;
        i17 = ((java.util.AbstractList) cVar).modCount;
        this.f322384g = i17;
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        b();
        int i17 = this.f322383f;
        if (!(i17 != -1)) {
            throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.f322381d.set(i17, obj);
    }
}
