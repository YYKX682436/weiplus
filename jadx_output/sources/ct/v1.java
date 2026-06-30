package ct;

/* loaded from: classes.dex */
public class v1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222194d = 0;

    public v1(ct.w1 w1Var, ct.u1 u1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222194d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222194d;
        this.f222194d = i17 + 1;
        if (i17 == 0) {
            return ls3.f.INSTANCE;
        }
        if (i17 == 1) {
            return lc0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
