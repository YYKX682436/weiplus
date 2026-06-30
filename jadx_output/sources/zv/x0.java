package zv;

/* loaded from: classes6.dex */
public class x0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f476128d = 0;

    public x0(zv.y0 y0Var, zv.w0 w0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f476128d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f476128d;
        this.f476128d = i17 + 1;
        if (i17 == 0) {
            return zv.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
