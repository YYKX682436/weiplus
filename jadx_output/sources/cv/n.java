package cv;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222502d = 0;

    public n(cv.o oVar, cv.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222502d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222502d;
        this.f222502d = i17 + 1;
        if (i17 == 0) {
            return bv.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
