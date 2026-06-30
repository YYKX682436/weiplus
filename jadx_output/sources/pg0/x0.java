package pg0;

/* loaded from: classes6.dex */
public class x0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354072d = 0;

    public x0(pg0.y0 y0Var, pg0.w0 w0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354072d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354072d;
        this.f354072d = i17 + 1;
        if (i17 == 0) {
            return pg0.k3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
