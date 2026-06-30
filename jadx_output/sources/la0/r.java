package la0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317486d = 0;

    public r(la0.s sVar, la0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317486d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317486d;
        this.f317486d = i17 + 1;
        if (i17 == 0) {
            return la0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
