package mm1;

/* loaded from: classes6.dex */
public class j0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f328670d = 0;

    public j0(mm1.k0 k0Var, mm1.i0 i0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f328670d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f328670d;
        this.f328670d = i17 + 1;
        if (i17 == 0) {
            return mm1.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
