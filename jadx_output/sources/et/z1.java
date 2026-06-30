package et;

/* loaded from: classes6.dex */
public class z1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f256525d = 0;

    public z1(et.a2 a2Var, et.y1 y1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f256525d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f256525d;
        this.f256525d = i17 + 1;
        if (i17 == 0) {
            return et.j2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
