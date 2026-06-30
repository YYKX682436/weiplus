package y03;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f458635d = 0;

    public b(y03.c cVar, y03.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f458635d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f458635d;
        this.f458635d = i17 + 1;
        if (i17 == 0) {
            return g50.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
