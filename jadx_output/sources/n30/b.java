package n30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334458d = 0;

    public b(n30.c cVar, n30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334458d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334458d;
        this.f334458d = i17 + 1;
        if (i17 == 0) {
            return m30.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
