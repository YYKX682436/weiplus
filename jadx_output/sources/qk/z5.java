package qk;

/* loaded from: classes6.dex */
public class z5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364396d = 0;

    public z5(qk.a6 a6Var, qk.y5 y5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364396d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364396d;
        this.f364396d = i17 + 1;
        if (i17 == 0) {
            return ef0.m4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
