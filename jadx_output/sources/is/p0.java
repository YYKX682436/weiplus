package is;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f294357d = 0;

    public p0(is.q0 q0Var, is.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f294357d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f294357d;
        this.f294357d = i17 + 1;
        if (i17 == 0) {
            return is.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
