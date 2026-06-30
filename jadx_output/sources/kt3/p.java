package kt3;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f312018d = 0;

    public p(kt3.q qVar, kt3.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312018d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f312018d;
        this.f312018d = i17 + 1;
        if (i17 == 0) {
            return kt3.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
