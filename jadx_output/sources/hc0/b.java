package hc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280273d = 0;

    public b(hc0.c cVar, hc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280273d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280273d;
        this.f280273d = i17 + 1;
        if (i17 == 0) {
            return hc0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
