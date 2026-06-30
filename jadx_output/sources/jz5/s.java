package jz5;

/* loaded from: classes7.dex */
public final class s implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f302845d;

    /* renamed from: e, reason: collision with root package name */
    public int f302846e;

    public s(byte[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        this.f302845d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302846e < this.f302845d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302846e;
        byte[] bArr = this.f302845d;
        if (i17 >= bArr.length) {
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f302846e));
        }
        this.f302846e = i17 + 1;
        return new jz5.r(bArr[i17]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
