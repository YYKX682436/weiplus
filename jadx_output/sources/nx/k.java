package nx;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341048d = 0;

    public k(nx.l lVar, nx.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341048d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341048d;
        this.f341048d = i17 + 1;
        if (i17 == 0) {
            return nx.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
