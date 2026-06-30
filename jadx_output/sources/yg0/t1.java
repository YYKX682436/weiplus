package yg0;

/* loaded from: classes6.dex */
public class t1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f462269d = 0;

    public t1(yg0.u1 u1Var, yg0.s1 s1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f462269d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f462269d;
        this.f462269d = i17 + 1;
        if (i17 == 0) {
            return yg0.l4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
