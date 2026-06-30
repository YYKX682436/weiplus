package dd0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f228926d = 0;

    public n(dd0.o oVar, dd0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f228926d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f228926d;
        this.f228926d = i17 + 1;
        if (i17 == 0) {
            return dd0.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
