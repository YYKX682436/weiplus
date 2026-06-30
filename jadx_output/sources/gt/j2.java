package gt;

/* loaded from: classes6.dex */
public class j2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f275248d = 0;

    public j2(gt.k2 k2Var, gt.i2 i2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f275248d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f275248d;
        this.f275248d = i17 + 1;
        if (i17 == 0) {
            return gt.o5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
