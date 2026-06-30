package r01;

/* loaded from: classes6.dex */
public class h2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368104d = 0;

    public h2(r01.i2 i2Var, r01.g2 g2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368104d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368104d;
        this.f368104d = i17 + 1;
        if (i17 == 0) {
            return r01.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
