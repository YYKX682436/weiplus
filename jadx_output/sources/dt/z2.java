package dt;

/* loaded from: classes6.dex */
public class z2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f243116d = 0;

    public z2(dt.a3 a3Var, dt.y2 y2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f243116d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f243116d;
        this.f243116d = i17 + 1;
        if (i17 == 0) {
            return dt.s5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
