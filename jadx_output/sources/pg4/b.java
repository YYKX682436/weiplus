package pg4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354232d = 0;

    public b(pg4.c cVar, pg4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354232d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354232d;
        this.f354232d = i17 + 1;
        if (i17 == 0) {
            return pg4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
