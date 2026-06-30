package vh4;

/* loaded from: classes.dex */
public class q0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437120d = 0;

    public q0(vh4.r0 r0Var, vh4.p0 p0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437120d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437120d;
        this.f437120d = i17 + 1;
        if (i17 == 0) {
            return vh4.u2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
