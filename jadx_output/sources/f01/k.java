package f01;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258360d = 0;

    public k(f01.l lVar, f01.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258360d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258360d;
        this.f258360d = i17 + 1;
        if (i17 == 0) {
            return f01.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
