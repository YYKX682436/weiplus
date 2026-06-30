package lf0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318231d = 0;

    public r(lf0.s sVar, lf0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318231d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318231d;
        this.f318231d = i17 + 1;
        if (i17 == 0) {
            return lf0.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
