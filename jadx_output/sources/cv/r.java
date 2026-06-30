package cv;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222508d = 0;

    public r(cv.s sVar, cv.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222508d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222508d;
        this.f222508d = i17 + 1;
        if (i17 == 0) {
            return bv.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
