package u63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424965d = 0;

    public b(u63.c cVar, u63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424965d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424965d;
        this.f424965d = i17 + 1;
        if (i17 == 0) {
            return u63.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
