package o0;

/* loaded from: classes14.dex */
public final class d implements java.util.Set, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f341838d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f341839e = new java.lang.Object[16];

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object value) {
        int i17;
        kotlin.jvm.internal.o.g(value, "value");
        if (this.f341838d > 0) {
            i17 = d(value);
            if (i17 >= 0) {
                return false;
            }
        } else {
            i17 = -1;
        }
        int i18 = -(i17 + 1);
        int i19 = this.f341838d;
        java.lang.Object[] objArr = this.f341839e;
        if (i19 == objArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[objArr.length * 2];
            kz5.v.k(objArr, objArr2, i18 + 1, i18, i19);
            kz5.v.p(this.f341839e, objArr2, 0, 0, i18, 6, null);
            this.f341839e = objArr2;
        } else {
            kz5.v.k(objArr, objArr, i18 + 1, i18, i19);
        }
        this.f341839e[i18] = value;
        this.f341838d++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i17 = this.f341838d;
        for (int i18 = 0; i18 < i17; i18++) {
            this.f341839e[i18] = null;
        }
        this.f341838d = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return obj != null && d(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
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

    public final int d(java.lang.Object obj) {
        int i17 = this.f341838d - 1;
        int identityHashCode = java.lang.System.identityHashCode(obj);
        int i18 = 0;
        while (i18 <= i17) {
            int i19 = (i18 + i17) >>> 1;
            java.lang.Object obj2 = this.f341839e[i19];
            if (obj2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            int identityHashCode2 = java.lang.System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i18 = i19 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    if (obj2 == obj) {
                        return i19;
                    }
                    for (int i27 = i19 - 1; -1 < i27; i27--) {
                        java.lang.Object obj3 = this.f341839e[i27];
                        if (obj3 == obj) {
                            return i27;
                        }
                        if (java.lang.System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                    }
                    int i28 = i19 + 1;
                    int i29 = this.f341838d;
                    while (true) {
                        if (i28 >= i29) {
                            i28 = this.f341838d;
                            break;
                        }
                        java.lang.Object obj4 = this.f341839e[i28];
                        if (obj4 == obj) {
                            return i28;
                        }
                        if (java.lang.System.identityHashCode(obj4) != identityHashCode) {
                            break;
                        }
                        i28++;
                    }
                    return -(i28 + 1);
                }
                i17 = i19 - 1;
            }
        }
        return -(i18 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f341838d == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new o0.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int d17;
        if (obj == null || (d17 = d(obj)) < 0) {
            return false;
        }
        int i17 = this.f341838d;
        if (d17 < i17 - 1) {
            java.lang.Object[] objArr = this.f341839e;
            kz5.v.k(objArr, objArr, d17, d17 + 1, i17);
        }
        int i18 = this.f341838d - 1;
        this.f341838d = i18;
        this.f341839e[i18] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f341838d;
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
