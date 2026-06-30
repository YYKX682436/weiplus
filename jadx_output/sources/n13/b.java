package n13;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334105d = 0;

    public b(n13.c cVar, n13.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334105d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334105d;
        this.f334105d = i17 + 1;
        if (i17 == 0) {
            return go.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
