package od2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f344608d = 0;

    public b(od2.c cVar, od2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f344608d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f344608d;
        this.f344608d = i17 + 1;
        if (i17 == 0) {
            return od2.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
