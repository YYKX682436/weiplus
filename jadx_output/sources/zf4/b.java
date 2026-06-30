package zf4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f472646d = 0;

    public b(zf4.c cVar, zf4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f472646d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f472646d;
        this.f472646d = i17 + 1;
        if (i17 == 0) {
            return zf4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
