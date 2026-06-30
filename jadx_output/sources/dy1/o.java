package dy1;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f244570d = 0;

    public o(dy1.p pVar, dy1.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f244570d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f244570d;
        this.f244570d = i17 + 1;
        if (i17 == 0) {
            return kz1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
