package ee0;

/* loaded from: classes6.dex */
public class o0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f251500d = 0;

    public o0(ee0.p0 p0Var, ee0.n0 n0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f251500d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f251500d;
        this.f251500d = i17 + 1;
        if (i17 == 0) {
            return ee0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
