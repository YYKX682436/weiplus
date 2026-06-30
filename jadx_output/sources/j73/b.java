package j73;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298048d = 0;

    public b(j73.c cVar, j73.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298048d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298048d;
        this.f298048d = i17 + 1;
        if (i17 == 0) {
            return i73.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
