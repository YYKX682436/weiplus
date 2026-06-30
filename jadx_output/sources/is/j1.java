package is;

/* loaded from: classes6.dex */
public class j1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f294347d = 0;

    public j1(is.k1 k1Var, is.i1 i1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f294347d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f294347d;
        this.f294347d = i17 + 1;
        if (i17 == 0) {
            return is.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
