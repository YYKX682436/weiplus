package dt;

/* loaded from: classes6.dex */
public class r0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f243057d = 0;

    public r0(dt.s0 s0Var, dt.q0 q0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f243057d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f243057d;
        this.f243057d = i17 + 1;
        if (i17 == 0) {
            return dt.y3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
