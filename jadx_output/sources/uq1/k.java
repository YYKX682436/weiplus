package uq1;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f430215d = 0;

    public k(uq1.l lVar, uq1.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f430215d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f430215d;
        this.f430215d = i17 + 1;
        if (i17 == 0) {
            return uq1.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
