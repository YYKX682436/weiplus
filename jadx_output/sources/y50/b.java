package y50;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459442d = 0;

    public b(y50.c cVar, y50.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459442d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459442d;
        this.f459442d = i17 + 1;
        if (i17 == 0) {
            return y50.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
