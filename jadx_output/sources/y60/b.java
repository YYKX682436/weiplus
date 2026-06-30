package y60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459615d = 0;

    public b(y60.c cVar, y60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459615d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459615d;
        this.f459615d = i17 + 1;
        if (i17 == 0) {
            return x60.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
