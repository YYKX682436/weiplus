package nq1;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f338968d = 0;

    public p(nq1.q qVar, nq1.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338968d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f338968d;
        this.f338968d = i17 + 1;
        if (i17 == 0) {
            return nq1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
