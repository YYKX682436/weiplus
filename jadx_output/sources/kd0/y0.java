package kd0;

/* loaded from: classes6.dex */
public class y0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306692d = 0;

    public y0(kd0.z0 z0Var, kd0.x0 x0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306692d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306692d;
        this.f306692d = i17 + 1;
        if (i17 == 0) {
            return jd0.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
