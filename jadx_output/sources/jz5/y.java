package jz5;

/* loaded from: classes10.dex */
public final class y implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f302853d;

    /* renamed from: e, reason: collision with root package name */
    public int f302854e;

    public y(long[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        this.f302853d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302854e < this.f302853d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302854e;
        long[] jArr = this.f302853d;
        if (i17 >= jArr.length) {
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f302854e));
        }
        this.f302854e = i17 + 1;
        return new jz5.x(jArr[i17]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
