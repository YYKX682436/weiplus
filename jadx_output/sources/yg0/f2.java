package yg0;

/* loaded from: classes6.dex */
public class f2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f462178d = 0;

    public f2(yg0.g2 g2Var, yg0.e2 e2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f462178d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f462178d;
        this.f462178d = i17 + 1;
        if (i17 == 0) {
            return yg0.r4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
