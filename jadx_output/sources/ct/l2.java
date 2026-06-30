package ct;

/* loaded from: classes6.dex */
public class l2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222170d = 0;

    public l2(ct.m2 m2Var, ct.k2 k2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222170d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222170d;
        this.f222170d = i17 + 1;
        if (i17 == 0) {
            return qg5.f3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
