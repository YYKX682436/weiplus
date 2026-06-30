package m73;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324494d = 0;

    public b(m73.c cVar, m73.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324494d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324494d;
        this.f324494d = i17 + 1;
        if (i17 == 0) {
            return m73.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
