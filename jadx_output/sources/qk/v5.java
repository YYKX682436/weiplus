package qk;

/* loaded from: classes6.dex */
public class v5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364350d = 0;

    public v5(qk.w5 w5Var, qk.u5 u5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364350d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364350d;
        this.f364350d = i17 + 1;
        if (i17 == 0) {
            return ef0.e4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
