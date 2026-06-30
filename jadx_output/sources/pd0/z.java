package pd0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353525d = 0;

    public z(pd0.a0 a0Var, pd0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353525d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353525d;
        this.f353525d = i17 + 1;
        if (i17 == 0) {
            return pd0.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
