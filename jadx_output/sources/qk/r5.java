package qk;

/* loaded from: classes6.dex */
public class r5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364326d = 0;

    public r5(qk.s5 s5Var, qk.q5 q5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364326d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364326d;
        this.f364326d = i17 + 1;
        if (i17 == 0) {
            return rk4.b9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
