package rv;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399888d = 0;

    public o(rv.p pVar, rv.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399888d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399888d;
        this.f399888d = i17 + 1;
        if (i17 == 0) {
            return mm1.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
