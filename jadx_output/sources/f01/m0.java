package f01;

/* loaded from: classes.dex */
public class m0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258368d = 0;

    public m0(f01.n0 n0Var, f01.l0 l0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258368d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258368d;
        this.f258368d = i17 + 1;
        if (i17 == 0) {
            return f01.q1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
