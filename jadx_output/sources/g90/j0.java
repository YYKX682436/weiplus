package g90;

/* loaded from: classes6.dex */
public class j0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269705d = 0;

    public j0(g90.k0 k0Var, g90.i0 i0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269705d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269705d;
        this.f269705d = i17 + 1;
        if (i17 == 0) {
            return g90.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
