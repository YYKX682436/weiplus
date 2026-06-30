package gi1;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f272245d = 0;

    public k(gi1.l lVar, gi1.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f272245d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f272245d;
        this.f272245d = i17 + 1;
        if (i17 == 0) {
            return gi1.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
