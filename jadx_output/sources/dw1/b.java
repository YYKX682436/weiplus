package dw1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f244102d = 0;

    public b(dw1.c cVar, dw1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f244102d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f244102d;
        this.f244102d = i17 + 1;
        if (i17 == 0) {
            return dw1.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
