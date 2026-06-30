package ra0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393462d = 0;

    public b(ra0.c cVar, ra0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393462d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393462d;
        this.f393462d = i17 + 1;
        if (i17 == 0) {
            return mn3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
