package rv;

/* loaded from: classes6.dex */
public class g1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399849d = 0;

    public g1(rv.h1 h1Var, rv.f1 f1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399849d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399849d;
        this.f399849d = i17 + 1;
        if (i17 == 0) {
            return qv.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
