package qk;

/* loaded from: classes6.dex */
public class v1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364344d = 0;

    public v1(qk.w1 w1Var, qk.u1 u1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364344d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364344d;
        this.f364344d = i17 + 1;
        if (i17 == 0) {
            return hs.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
