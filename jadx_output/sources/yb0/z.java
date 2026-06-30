package yb0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f460648d = 0;

    public z(yb0.a0 a0Var, yb0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f460648d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f460648d;
        this.f460648d = i17 + 1;
        if (i17 == 0) {
            return yb0.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
