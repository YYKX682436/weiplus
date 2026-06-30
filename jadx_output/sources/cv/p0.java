package cv;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222507d = 0;

    public p0(cv.q0 q0Var, cv.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222507d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222507d;
        this.f222507d = i17 + 1;
        if (i17 == 0) {
            return bv.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
