package qk;

/* loaded from: classes6.dex */
public class t4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364335d = 0;

    public t4(qk.u4 u4Var, qk.s4 s4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364335d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364335d;
        this.f364335d = i17 + 1;
        if (i17 == 0) {
            return ef0.n3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
