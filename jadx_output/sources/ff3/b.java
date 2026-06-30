package ff3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261639d = 0;

    public b(ff3.c cVar, ff3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261639d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261639d;
        this.f261639d = i17 + 1;
        if (i17 == 0) {
            return ff3.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
