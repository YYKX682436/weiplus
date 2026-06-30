package f50;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259588d = 0;

    public r(f50.s sVar, f50.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259588d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259588d;
        this.f259588d = i17 + 1;
        if (i17 == 0) {
            return vd0.r3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
