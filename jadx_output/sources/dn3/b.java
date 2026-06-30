package dn3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f241997d = 0;

    public b(dn3.c cVar, dn3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f241997d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f241997d;
        this.f241997d = i17 + 1;
        if (i17 == 0) {
            return dn3.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
