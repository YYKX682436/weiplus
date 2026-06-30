package pv;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358498d = 0;

    public r(pv.s sVar, pv.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358498d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358498d;
        this.f358498d = i17 + 1;
        if (i17 == 0) {
            return ov.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
