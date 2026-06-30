package lz5;

/* loaded from: classes16.dex */
public final class e extends kz5.l implements java.util.RandomAccess, java.io.Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final lz5.e f322394g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f322395d;

    /* renamed from: e, reason: collision with root package name */
    public int f322396e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322397f;

    static {
        lz5.e eVar = new lz5.e(0);
        eVar.f322397f = true;
        f322394g = eVar;
    }

    public e(int i17) {
        this.f322395d = lz5.f.c(i17);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        k();
        int i17 = this.f322396e;
        ((java.util.AbstractList) this).modCount++;
        l(i17, 1);
        this.f322395d[i17] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        k();
        int size = elements.size();
        h(this.f322396e, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        k();
        n(0, this.f322396e);
    }

    @Override // kz5.l
    public int d() {
        return this.f322396e;
    }

    @Override // kz5.l
    public java.lang.Object e(int i17) {
        k();
        int i18 = this.f322396e;
        if (i17 >= 0 && i17 < i18) {
            return m(i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (!(obj instanceof java.util.List)) {
                return false;
            }
            if (!lz5.f.a(this.f322395d, 0, this.f322396e, (java.util.List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        int i18 = this.f322396e;
        if (i17 >= 0 && i17 < i18) {
            return this.f322395d[i17];
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    public final void h(int i17, java.util.Collection collection, int i18) {
        ((java.util.AbstractList) this).modCount++;
        l(i17, i18);
        java.util.Iterator it = collection.iterator();
        for (int i19 = 0; i19 < i18; i19++) {
            this.f322395d[i17 + i19] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        java.lang.Object[] objArr = this.f322395d;
        int i17 = this.f322396e;
        int i18 = 1;
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.Object obj = objArr[0 + i19];
            i18 = (i18 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i18;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        for (int i17 = 0; i17 < this.f322396e; i17++) {
            if (kotlin.jvm.internal.o.b(this.f322395d[i17], obj)) {
                return i17;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f322396e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i17, java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        l(i17, 1);
        this.f322395d[i17] = obj;
    }

    public final void k() {
        if (this.f322397f) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void l(int i17, int i18) {
        int i19 = this.f322396e + i18;
        if (i19 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.Object[] objArr = this.f322395d;
        if (i19 > objArr.length) {
            int length = objArr.length;
            int i27 = length + (length >> 1);
            if (i27 - i19 < 0) {
                i27 = i19;
            }
            if (i27 - 2147483639 > 0) {
                i27 = i19 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, i27);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
            this.f322395d = copyOf;
        }
        java.lang.Object[] objArr2 = this.f322395d;
        kz5.v.k(objArr2, objArr2, i17 + i18, i17, this.f322396e);
        this.f322396e += i18;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        for (int i17 = this.f322396e - 1; i17 >= 0; i17--) {
            if (kotlin.jvm.internal.o.b(this.f322395d[i17], obj)) {
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
        ((java.util.AbstractList) this).modCount++;
        java.lang.Object[] objArr = this.f322395d;
        java.lang.Object obj = objArr[i17];
        kz5.v.k(objArr, objArr, i17, i17 + 1, this.f322396e);
        java.lang.Object[] objArr2 = this.f322395d;
        int i18 = this.f322396e - 1;
        kotlin.jvm.internal.o.g(objArr2, "<this>");
        objArr2[i18] = null;
        this.f322396e--;
        return obj;
    }

    public final void n(int i17, int i18) {
        if (i18 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        java.lang.Object[] objArr = this.f322395d;
        kz5.v.k(objArr, objArr, i17, i17 + i18, this.f322396e);
        java.lang.Object[] objArr2 = this.f322395d;
        int i19 = this.f322396e;
        lz5.f.d(objArr2, i19 - i18, i19);
        this.f322396e -= i18;
    }

    public final int o(int i17, int i18, java.util.Collection collection, boolean z17) {
        int i19 = 0;
        int i27 = 0;
        while (i19 < i18) {
            int i28 = i17 + i19;
            if (collection.contains(this.f322395d[i28]) == z17) {
                java.lang.Object[] objArr = this.f322395d;
                i19++;
                objArr[i27 + i17] = objArr[i28];
                i27++;
            } else {
                i19++;
            }
        }
        int i29 = i18 - i27;
        java.lang.Object[] objArr2 = this.f322395d;
        kz5.v.k(objArr2, objArr2, i17 + i27, i18 + i17, this.f322396e);
        java.lang.Object[] objArr3 = this.f322395d;
        int i37 = this.f322396e;
        lz5.f.d(objArr3, i37 - i29, i37);
        if (i29 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.f322396e -= i29;
        return i29;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
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
        k();
        return o(0, this.f322396e, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        k();
        return o(0, this.f322396e, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        k();
        int i18 = this.f322396e;
        if (i17 >= 0 && i17 < i18) {
            java.lang.Object[] objArr = this.f322395d;
            java.lang.Object obj2 = objArr[i17];
            objArr[i17] = obj;
            return obj2;
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.List subList(int i17, int i18) {
        kz5.h.f313973d.a(i17, i18, this.f322396e);
        return new lz5.c(this.f322395d, i17, i18 - i17, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        int length = array.length;
        int i17 = this.f322396e;
        if (length < i17) {
            java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(this.f322395d, 0, i17, array.getClass());
            kotlin.jvm.internal.o.f(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        kz5.v.k(this.f322395d, array, 0, 0, i17);
        int i18 = this.f322396e;
        if (i18 < array.length) {
            array[i18] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return lz5.f.b(this.f322395d, 0, this.f322396e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        int i18 = this.f322396e;
        if (i17 >= 0 && i17 <= i18) {
            return new lz5.d(this, i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        k();
        int i18 = this.f322396e;
        if (i17 >= 0 && i17 <= i18) {
            int size = elements.size();
            h(i17, elements, size);
            return size > 0;
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        k();
        int i18 = this.f322396e;
        if (i17 >= 0 && i17 <= i18) {
            ((java.util.AbstractList) this).modCount++;
            l(i17, 1);
            this.f322395d[i17] = obj;
        } else {
            throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        return kz5.v.s(this.f322395d, 0, this.f322396e);
    }
}
