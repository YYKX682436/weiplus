package sv;

/* loaded from: classes6.dex */
public class q0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f413198d = 0;

    public q0(sv.r0 r0Var, sv.p0 p0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f413198d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f413198d;
        this.f413198d = i17 + 1;
        if (i17 == 0) {
            return sv.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
