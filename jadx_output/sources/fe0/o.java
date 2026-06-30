package fe0;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261425d = 0;

    public o(fe0.p pVar, fe0.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261425d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261425d;
        this.f261425d = i17 + 1;
        if (i17 == 0) {
            return ee0.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
