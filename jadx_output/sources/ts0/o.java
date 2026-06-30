package ts0;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421562d = 0;

    public o(ts0.p pVar, ts0.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421562d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421562d;
        this.f421562d = i17 + 1;
        if (i17 == 0) {
            return mr0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
