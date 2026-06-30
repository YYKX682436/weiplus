package y14;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f458902d = 0;

    public b(y14.c cVar, y14.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f458902d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f458902d;
        this.f458902d = i17 + 1;
        if (i17 == 0) {
            return y14.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
