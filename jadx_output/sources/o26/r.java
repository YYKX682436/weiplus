package o26;

/* loaded from: classes7.dex */
public final class r implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f342611d;

    public r(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        this.f342611d = kotlin.jvm.internal.c.a(array);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return ((kotlin.jvm.internal.b) this.f342611d).hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return ((kotlin.jvm.internal.b) this.f342611d).next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
