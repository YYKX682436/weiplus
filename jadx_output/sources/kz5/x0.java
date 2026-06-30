package kz5;

/* loaded from: classes5.dex */
public abstract class x0 implements java.util.Iterator, zz5.a {
    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
