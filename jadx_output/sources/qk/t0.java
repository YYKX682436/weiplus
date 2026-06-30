package qk;

/* loaded from: classes6.dex */
public class t0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364329d = 0;

    public t0(qk.u0 u0Var, qk.s0 s0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364329d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364329d;
        this.f364329d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.app.p7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
