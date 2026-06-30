package ct;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222135d = 0;

    public b(ct.c cVar, ct.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222135d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222135d;
        this.f222135d = i17 + 1;
        if (i17 == 0) {
            return o71.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
