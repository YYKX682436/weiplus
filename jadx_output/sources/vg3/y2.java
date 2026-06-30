package vg3;

/* loaded from: classes6.dex */
public class y2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436773d = 0;

    public y2(vg3.z2 z2Var, vg3.x2 x2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436773d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436773d;
        this.f436773d = i17 + 1;
        if (i17 == 0) {
            return b60.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
