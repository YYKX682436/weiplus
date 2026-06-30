package ft;

/* loaded from: classes6.dex */
public class o2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266415d = 0;

    public o2(ft.p2 p2Var, ft.n2 n2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266415d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266415d;
        this.f266415d = i17 + 1;
        if (i17 == 0) {
            return et.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
