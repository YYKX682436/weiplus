package n90;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335818d = 0;

    public p0(n90.q0 q0Var, n90.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335818d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335818d;
        this.f335818d = i17 + 1;
        if (i17 == 0) {
            return n90.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
