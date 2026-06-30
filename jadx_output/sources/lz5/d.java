package lz5;

/* loaded from: classes16.dex */
public final class d implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.e f322390d;

    /* renamed from: e, reason: collision with root package name */
    public int f322391e;

    /* renamed from: f, reason: collision with root package name */
    public int f322392f;

    /* renamed from: g, reason: collision with root package name */
    public int f322393g;

    public d(lz5.e list, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(list, "list");
        this.f322390d = list;
        this.f322391e = i17;
        this.f322392f = -1;
        i18 = ((java.util.AbstractList) list).modCount;
        this.f322393g = i18;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        int i17;
        b();
        int i18 = this.f322391e;
        this.f322391e = i18 + 1;
        lz5.e eVar = this.f322390d;
        eVar.add(i18, obj);
        this.f322392f = -1;
        i17 = ((java.util.AbstractList) eVar).modCount;
        this.f322393g = i17;
    }

    public final void b() {
        int i17;
        i17 = ((java.util.AbstractList) this.f322390d).modCount;
        if (i17 != this.f322393g) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f322391e < this.f322390d.f322396e;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f322391e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f322391e;
        lz5.e eVar = this.f322390d;
        if (i17 >= eVar.f322396e) {
            throw new java.util.NoSuchElementException();
        }
        this.f322391e = i17 + 1;
        this.f322392f = i17;
        return eVar.f322395d[i17];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f322391e;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        b();
        int i17 = this.f322391e;
        if (i17 <= 0) {
            throw new java.util.NoSuchElementException();
        }
        int i18 = i17 - 1;
        this.f322391e = i18;
        this.f322392f = i18;
        return this.f322390d.f322395d[i18];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f322391e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i17;
        b();
        int i18 = this.f322392f;
        if (!(i18 != -1)) {
            throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        lz5.e eVar = this.f322390d;
        eVar.e(i18);
        this.f322391e = this.f322392f;
        this.f322392f = -1;
        i17 = ((java.util.AbstractList) eVar).modCount;
        this.f322393g = i17;
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        b();
        int i17 = this.f322392f;
        if (!(i17 != -1)) {
            throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.f322390d.set(i17, obj);
    }
}
