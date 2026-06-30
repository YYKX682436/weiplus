package he0;

/* loaded from: classes6.dex */
public class z2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280850d = 0;

    public z2(he0.a3 a3Var, he0.y2 y2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280850d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280850d;
        this.f280850d = i17 + 1;
        if (i17 == 0) {
            return he0.v5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
