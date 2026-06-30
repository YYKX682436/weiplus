package f13;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258678d = 0;

    public b(f13.c cVar, f13.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258678d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258678d;
        this.f258678d = i17 + 1;
        if (i17 == 0) {
            return h13.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
