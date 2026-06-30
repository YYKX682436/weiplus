package rk1;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f396441d = 0;

    public p(rk1.q qVar, rk1.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f396441d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f396441d;
        this.f396441d = i17 + 1;
        if (i17 == 0) {
            return rk1.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
