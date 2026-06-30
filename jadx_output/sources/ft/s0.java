package ft;

/* loaded from: classes6.dex */
public class s0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266427d = 0;

    public s0(ft.t0 t0Var, ft.r0 r0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266427d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266427d;
        this.f266427d = i17 + 1;
        if (i17 == 0) {
            return et.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
