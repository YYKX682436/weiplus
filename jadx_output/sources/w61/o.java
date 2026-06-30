package w61;

/* loaded from: classes.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443268d = 0;

    public o(w61.p pVar, w61.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443268d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443268d;
        this.f443268d = i17 + 1;
        if (i17 == 0) {
            return w61.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
