package pc0;

/* loaded from: classes6.dex */
public class t0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353310d = 0;

    public t0(pc0.u0 u0Var, pc0.s0 s0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353310d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353310d;
        this.f353310d = i17 + 1;
        if (i17 == 0) {
            return pc0.f2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
