package f23;

/* loaded from: classes.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259002d = 0;

    public h0(f23.i0 i0Var, f23.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259002d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259002d;
        this.f259002d = i17 + 1;
        if (i17 == 0) {
            return f23.u2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
