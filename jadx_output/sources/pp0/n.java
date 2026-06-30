package pp0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f357380d = 0;

    public n(pp0.o oVar, pp0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f357380d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f357380d;
        this.f357380d = i17 + 1;
        if (i17 == 0) {
            return yy0.n7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
