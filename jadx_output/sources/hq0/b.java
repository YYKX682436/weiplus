package hq0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f282968d = 0;

    public b(hq0.c cVar, hq0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f282968d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f282968d;
        this.f282968d = i17 + 1;
        if (i17 == 0) {
            return nq0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
