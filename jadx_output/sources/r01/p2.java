package r01;

/* loaded from: classes6.dex */
public class p2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368183d = 0;

    public p2(r01.q2 q2Var, r01.o2 o2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368183d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368183d;
        this.f368183d = i17 + 1;
        if (i17 == 0) {
            return r01.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
