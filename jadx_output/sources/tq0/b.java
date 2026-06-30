package tq0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421207d = 0;

    public b(tq0.c cVar, tq0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421207d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421207d;
        this.f421207d = i17 + 1;
        if (i17 == 0) {
            return sq0.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
