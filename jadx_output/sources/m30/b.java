package m30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323099d = 0;

    public b(m30.c cVar, m30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323099d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323099d;
        this.f323099d = i17 + 1;
        if (i17 == 0) {
            return m30.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
