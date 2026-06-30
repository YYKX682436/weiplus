package ge0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f270917d = 0;

    public r(ge0.s sVar, ge0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f270917d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f270917d;
        this.f270917d = i17 + 1;
        if (i17 == 0) {
            return ge0.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
