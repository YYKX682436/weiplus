package qd0;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361528d = 0;

    public b0(qd0.c0 c0Var, qd0.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361528d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361528d;
        this.f361528d = i17 + 1;
        if (i17 == 0) {
            return qd0.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
