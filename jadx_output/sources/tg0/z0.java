package tg0;

/* loaded from: classes6.dex */
public class z0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419121d = 0;

    public z0(tg0.a1 a1Var, tg0.y0 y0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419121d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419121d;
        this.f419121d = i17 + 1;
        if (i17 == 0) {
            return sg0.x3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
