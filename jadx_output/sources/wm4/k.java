package wm4;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447294d = 0;

    public k(wm4.l lVar, wm4.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447294d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447294d;
        this.f447294d = i17 + 1;
        if (i17 == 0) {
            return wm4.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
