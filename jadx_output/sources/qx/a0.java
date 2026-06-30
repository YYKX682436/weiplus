package qx;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f367244d = 0;

    public a0(qx.b0 b0Var, qx.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367244d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f367244d;
        this.f367244d = i17 + 1;
        if (i17 == 0) {
            return y11.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
