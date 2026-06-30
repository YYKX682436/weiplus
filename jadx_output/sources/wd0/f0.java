package wd0;

/* loaded from: classes6.dex */
public class f0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444712d = 0;

    public f0(wd0.g0 g0Var, wd0.e0 e0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444712d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444712d;
        this.f444712d = i17 + 1;
        if (i17 == 0) {
            return vd0.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
