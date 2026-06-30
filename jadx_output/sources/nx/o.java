package nx;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341051d = 0;

    public o(nx.p pVar, nx.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341051d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341051d;
        this.f341051d = i17 + 1;
        if (i17 == 0) {
            return nx.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
