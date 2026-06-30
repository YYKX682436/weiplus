package m90;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324910d = 0;

    public r(m90.s sVar, m90.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324910d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324910d;
        this.f324910d = i17 + 1;
        if (i17 == 0) {
            return m90.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
