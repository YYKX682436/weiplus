package rd0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f394235d = 0;

    public z(rd0.a0 a0Var, rd0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f394235d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f394235d;
        this.f394235d = i17 + 1;
        if (i17 == 0) {
            return qd0.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
