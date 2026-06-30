package uy;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431884d = 0;

    public b(uy.c cVar, uy.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431884d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431884d;
        this.f431884d = i17 + 1;
        if (i17 == 0) {
            return uy.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
