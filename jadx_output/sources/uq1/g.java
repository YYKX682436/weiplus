package uq1;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f430212d = 0;

    public g(uq1.h hVar, uq1.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f430212d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f430212d;
        this.f430212d = i17 + 1;
        if (i17 == 0) {
            return uq1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
