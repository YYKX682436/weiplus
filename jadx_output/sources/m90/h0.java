package m90;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324871d = 0;

    public h0(m90.i0 i0Var, m90.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324871d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324871d;
        this.f324871d = i17 + 1;
        if (i17 == 0) {
            return m90.a2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
