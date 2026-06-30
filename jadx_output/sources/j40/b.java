package j40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297592d = 0;

    public b(j40.c cVar, j40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297592d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f297592d;
        this.f297592d = i17 + 1;
        if (i17 == 0) {
            return j40.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
