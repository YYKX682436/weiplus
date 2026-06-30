package ec4;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f251180d = 0;

    public p(ec4.q qVar, ec4.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f251180d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f251180d;
        this.f251180d = i17 + 1;
        if (i17 == 0) {
            return ec4.k0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
