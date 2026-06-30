package jy4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302523d = 0;

    public b(jy4.c cVar, jy4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302523d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302523d;
        this.f302523d = i17 + 1;
        if (i17 == 0) {
            return jy4.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
