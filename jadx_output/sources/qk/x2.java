package qk;

/* loaded from: classes6.dex */
public class x2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364356d = 0;

    public x2(qk.y2 y2Var, qk.w2 w2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364356d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364356d;
        this.f364356d = i17 + 1;
        if (i17 == 0) {
            return gf0.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
