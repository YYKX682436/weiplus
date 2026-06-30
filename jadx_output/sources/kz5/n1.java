package kz5;

/* loaded from: classes14.dex */
public final class n1 extends kz5.h implements java.util.RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object[] f313989e;

    /* renamed from: f, reason: collision with root package name */
    public final int f313990f;

    /* renamed from: g, reason: collision with root package name */
    public int f313991g;

    /* renamed from: h, reason: collision with root package name */
    public int f313992h;

    public n1(java.lang.Object[] buffer, int i17) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.f313989e = buffer;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i17).toString());
        }
        if (i17 <= buffer.length) {
            this.f313990f = buffer.length;
            this.f313992h = i17;
        } else {
            throw new java.lang.IllegalArgumentException(("ring buffer filled size: " + i17 + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
    }

    @Override // kz5.b
    public int d() {
        return this.f313992h;
    }

    public final void e(int i17) {
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("n shouldn't be negative but it is " + i17).toString());
        }
        if (!(i17 <= d())) {
            throw new java.lang.IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i17 + ", size = " + d()).toString());
        }
        if (i17 > 0) {
            int i18 = this.f313991g;
            int i19 = this.f313990f;
            int i27 = (i18 + i17) % i19;
            java.lang.Object[] objArr = this.f313989e;
            if (i18 > i27) {
                kz5.v.t(objArr, null, i18, i19);
                kz5.v.t(objArr, null, 0, i27);
            } else {
                kz5.v.t(objArr, null, i18, i27);
            }
            this.f313991g = i27;
            this.f313992h = d() - i17;
        }
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        int d17 = d();
        if (i17 >= 0 && i17 < d17) {
            return this.f313989e[(this.f313991g + i17) % this.f313990f];
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + d17);
    }

    @Override // kz5.h, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new kz5.m1(this);
    }

    @Override // kz5.b, java.util.Collection
    public java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[d()]);
    }

    @Override // kz5.b, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        java.lang.Object[] objArr;
        kotlin.jvm.internal.o.g(array, "array");
        int length = array.length;
        int i17 = this.f313992h;
        if (length < i17) {
            array = java.util.Arrays.copyOf(array, i17);
            kotlin.jvm.internal.o.f(array, "copyOf(...)");
        }
        int i18 = this.f313992h;
        int i19 = this.f313991g;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            objArr = this.f313989e;
            if (i28 >= i18 || i19 >= this.f313990f) {
                break;
            }
            array[i28] = objArr[i19];
            i28++;
            i19++;
        }
        while (i28 < i18) {
            array[i28] = objArr[i27];
            i28++;
            i27++;
        }
        if (i18 < array.length) {
            array[i18] = null;
        }
        return array;
    }
}
