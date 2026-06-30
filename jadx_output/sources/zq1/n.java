package zq1;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475015d = 0;

    public n(zq1.o oVar, zq1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475015d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475015d;
        this.f475015d = i17 + 1;
        if (i17 == 0) {
            return zv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
