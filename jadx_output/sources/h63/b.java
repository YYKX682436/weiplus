package h63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279207d = 0;

    public b(h63.c cVar, h63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279207d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279207d;
        this.f279207d = i17 + 1;
        if (i17 == 0) {
            return h63.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
