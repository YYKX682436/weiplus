package jz5;

/* loaded from: classes12.dex */
public final class c0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final short[] f302818d;

    /* renamed from: e, reason: collision with root package name */
    public int f302819e;

    public c0(short[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        this.f302818d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302819e < this.f302818d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302819e;
        short[] sArr = this.f302818d;
        if (i17 >= sArr.length) {
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f302819e));
        }
        this.f302819e = i17 + 1;
        return new jz5.b0(sArr[i17]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
