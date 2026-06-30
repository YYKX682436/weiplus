package zk4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f473527d = 0;

    public b(zk4.c cVar, zk4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f473527d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f473527d;
        this.f473527d = i17 + 1;
        if (i17 == 0) {
            return zk4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
