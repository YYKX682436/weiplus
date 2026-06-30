package tg3;

/* loaded from: classes6.dex */
public class r0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419212d = 0;

    public r0(tg3.s0 s0Var, tg3.q0 q0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419212d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419212d;
        this.f419212d = i17 + 1;
        if (i17 == 0) {
            return jh3.s.INSTANCE;
        }
        if (i17 == 1) {
            return jh3.p.INSTANCE;
        }
        if (i17 == 2) {
            return jh3.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
