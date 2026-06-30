package k91;

/* loaded from: classes6.dex */
public class y1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f305826d = 0;

    public y1(k91.z1 z1Var, k91.x1 x1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f305826d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f305826d;
        this.f305826d = i17 + 1;
        if (i17 == 0) {
            return k91.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
