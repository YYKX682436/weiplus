package zg0;

/* loaded from: classes6.dex */
public class z1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f472805d = 0;

    public z1(zg0.a2 a2Var, zg0.y1 y1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f472805d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f472805d;
        this.f472805d = i17 + 1;
        if (i17 == 0) {
            return yg0.r4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
