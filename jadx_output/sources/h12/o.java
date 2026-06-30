package h12;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278104d = 0;

    public o(h12.p pVar, h12.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278104d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278104d;
        this.f278104d = i17 + 1;
        if (i17 == 0) {
            return h12.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
