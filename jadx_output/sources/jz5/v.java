package jz5;

/* loaded from: classes8.dex */
public final class v implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f302849d;

    /* renamed from: e, reason: collision with root package name */
    public int f302850e;

    public v(int[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        this.f302849d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302850e < this.f302849d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302850e;
        int[] iArr = this.f302849d;
        if (i17 >= iArr.length) {
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f302850e));
        }
        this.f302850e = i17 + 1;
        return new jz5.u(iArr[i17]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
