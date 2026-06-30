package n34;

/* loaded from: classes6.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334738d = 0;

    public u0(n34.v0 v0Var, n34.t0 t0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334738d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334738d;
        this.f334738d = i17 + 1;
        if (i17 == 0) {
            return n34.r2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
