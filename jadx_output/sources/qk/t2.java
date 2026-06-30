package qk;

/* loaded from: classes6.dex */
public class t2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364332d = 0;

    public t2(qk.u2 u2Var, qk.s2 s2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364332d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364332d;
        this.f364332d = i17 + 1;
        if (i17 == 0) {
            return ef0.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
