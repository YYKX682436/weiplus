package zg0;

/* loaded from: classes6.dex */
public class h2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f472741d = 0;

    public h2(zg0.i2 i2Var, zg0.g2 g2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f472741d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f472741d;
        this.f472741d = i17 + 1;
        if (i17 == 0) {
            return yg0.v4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
