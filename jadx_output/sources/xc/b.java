package xc;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f453014d = 0;

    public b(xc.c cVar, xc.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f453014d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f453014d;
        this.f453014d = i17 + 1;
        if (i17 == 0) {
            return xc.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
