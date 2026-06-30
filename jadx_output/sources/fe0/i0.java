package fe0;

/* loaded from: classes6.dex */
public class i0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261398d = 0;

    public i0(fe0.j0 j0Var, fe0.h0 h0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261398d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261398d;
        this.f261398d = i17 + 1;
        if (i17 == 0) {
            return ee0.s3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
