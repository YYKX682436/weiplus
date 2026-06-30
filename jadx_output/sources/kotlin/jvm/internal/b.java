package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public final class b implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object[] f310109d;

    /* renamed from: e, reason: collision with root package name */
    public int f310110e;

    public b(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        this.f310109d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f310110e < this.f310109d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        try {
            java.lang.Object[] objArr = this.f310109d;
            int i17 = this.f310110e;
            this.f310110e = i17 + 1;
            return objArr[i17];
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            this.f310110e--;
            throw new java.util.NoSuchElementException(e17.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
