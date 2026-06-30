package gt;

/* loaded from: classes6.dex */
public class z2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f275360d = 0;

    public z2(gt.a3 a3Var, gt.y2 y2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f275360d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f275360d;
        this.f275360d = i17 + 1;
        if (i17 == 0) {
            return gt.b6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
