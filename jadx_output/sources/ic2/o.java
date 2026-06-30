package ic2;

/* loaded from: classes.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f290354d = 0;

    public o(ic2.p pVar, ic2.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f290354d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f290354d;
        this.f290354d = i17 + 1;
        if (i17 == 0) {
            return ic2.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
