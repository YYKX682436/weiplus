package lz5;

/* loaded from: classes16.dex */
public final class c extends kz5.l implements java.util.RandomAccess, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f322385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f322386e;

    /* renamed from: f, reason: collision with root package name */
    public int f322387f;

    /* renamed from: g, reason: collision with root package name */
    public final lz5.c f322388g;

    /* renamed from: h, reason: collision with root package name */
    public final lz5.e f322389h;

    public c(java.lang.Object[] backing, int i17, int i18, lz5.c cVar, lz5.e root) {
        int i19;
        kotlin.jvm.internal.o.g(backing, "backing");
        kotlin.jvm.internal.o.g(root, "root");
        this.f322385d = backing;
        this.f322386e = i17;
        this.f322387f = i18;
        this.f322388g = cVar;
        this.f322389h = root;
        i19 = ((java.util.AbstractList) root).modCount;
        ((java.util.AbstractList) this).modCount = i19;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        l();
        k();
        j(this.f322386e + this.f322387f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        l();
        k();
        int size = elements.size();
        h(this.f322386e + this.f322387f, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        l();
        k();
        n(this.f322386e, this.f322387f);
    }

    @Override // kz5.l
    public int d() {
        k();
        return this.f322387f;
    }

    @Override // kz5.l
    public java.lang.Object e(int i17) {
        l();
        k();
        int i18 = this.f322387f;
        if (i17 >= 0 && i17 < i18) {
            return m(this.f322386e + i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        k();
        if (obj != this) {
            if (obj instanceof java.util.List) {
                if (lz5.f.a(this.f322385d, this.f322386e, this.f322387f, (java.util.List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        k();
        int i18 = this.f322387f;
        if (i17 >= 0 && i17 < i18) {
            return this.f322385d[this.f322386e + i17];
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    public final void h(int i17, java.util.Collection collection, int i18) {
        ((java.util.AbstractList) this).modCount++;
        lz5.e eVar = this.f322389h;
        lz5.c cVar = this.f322388g;
        if (cVar != null) {
            cVar.h(i17, collection, i18);
        } else {
            lz5.e eVar2 = lz5.e.f322394g;
            eVar.h(i17, collection, i18);
        }
        this.f322385d = eVar.f322395d;
        this.f322387f += i18;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        k();
        java.lang.Object[] objArr = this.f322385d;
        int i17 = this.f322387f;
        int i18 = 1;
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.Object obj = objArr[this.f322386e + i19];
            i18 = (i18 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i18;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        k();
        for (int i17 = 0; i17 < this.f322387f; i17++) {
            if (kotlin.jvm.internal.o.b(this.f322385d[this.f322386e + i17], obj)) {
                return i17;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        k();
        return this.f322387f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i17, java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        lz5.e eVar = this.f322389h;
        lz5.c cVar = this.f322388g;
        if (cVar != null) {
            cVar.j(i17, obj);
        } else {
            lz5.e eVar2 = lz5.e.f322394g;
            eVar.j(i17, obj);
        }
        this.f322385d = eVar.f322395d;
        this.f322387f++;
    }

    public final void k() {
        int i17;
        i17 = ((java.util.AbstractList) this.f322389h).modCount;
        if (i17 != ((java.util.AbstractList) this).modCount) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void l() {
        if (this.f322389h.f322397f) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        k();
        for (int i17 = this.f322387f - 1; i17 >= 0; i17--) {
            if (kotlin.jvm.internal.o.b(this.f322385d[this.f322386e + i17], obj)) {
                return i17;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    public final java.lang.Object m(int i17) {
        java.lang.Object m17;
        ((java.util.AbstractList) this).modCount++;
        lz5.c cVar = this.f322388g;
        if (cVar != null) {
            m17 = cVar.m(i17);
        } else {
            lz5.e eVar = lz5.e.f322394g;
            m17 = this.f322389h.m(i17);
        }
        this.f322387f--;
        return m17;
    }

    public final void n(int i17, int i18) {
        if (i18 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        lz5.c cVar = this.f322388g;
        if (cVar != null) {
            cVar.n(i17, i18);
        } else {
            lz5.e eVar = lz5.e.f322394g;
            this.f322389h.n(i17, i18);
        }
        this.f322387f -= i18;
    }

    public final int o(int i17, int i18, java.util.Collection collection, boolean z17) {
        int o17;
        lz5.c cVar = this.f322388g;
        if (cVar != null) {
            o17 = cVar.o(i17, i18, collection, z17);
        } else {
            lz5.e eVar = lz5.e.f322394g;
            o17 = this.f322389h.o(i17, i18, collection, z17);
        }
        if (o17 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.f322387f -= o17;
        return o17;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        l();
        k();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        l();
        k();
        return o(this.f322386e, this.f322387f, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        l();
        k();
        return o(this.f322386e, this.f322387f, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        l();
        k();
        int i18 = this.f322387f;
        if (i17 < 0 || i17 >= i18) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
        }
        java.lang.Object[] objArr = this.f322385d;
        int i19 = this.f322386e;
        java.lang.Object obj2 = objArr[i19 + i17];
        objArr[i19 + i17] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.List subList(int i17, int i18) {
        kz5.h.f313973d.a(i17, i18, this.f322387f);
        return new lz5.c(this.f322385d, this.f322386e + i17, i18 - i17, this, this.f322389h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        k();
        int length = array.length;
        int i17 = this.f322387f;
        int i18 = this.f322386e;
        if (length < i17) {
            java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(this.f322385d, i18, i17 + i18, array.getClass());
            kotlin.jvm.internal.o.f(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        kz5.v.k(this.f322385d, array, 0, i18, i17 + i18);
        int i19 = this.f322387f;
        if (i19 < array.length) {
            array[i19] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        k();
        return lz5.f.b(this.f322385d, this.f322386e, this.f322387f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        k();
        int i18 = this.f322387f;
        if (i17 >= 0 && i17 <= i18) {
            return new lz5.b(this, i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        l();
        k();
        int i18 = this.f322387f;
        if (i17 >= 0 && i17 <= i18) {
            j(this.f322386e + i17, obj);
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        l();
        k();
        int i18 = this.f322387f;
        if (i17 >= 0 && i17 <= i18) {
            int size = elements.size();
            h(this.f322386e + i17, elements, size);
            return size > 0;
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        k();
        java.lang.Object[] objArr = this.f322385d;
        int i17 = this.f322387f;
        int i18 = this.f322386e;
        return kz5.v.s(objArr, i18, i17 + i18);
    }
}
