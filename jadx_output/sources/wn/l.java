package wn;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447376d = 0;

    public l(wn.m mVar, wn.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447376d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447376d;
        this.f447376d = i17 + 1;
        if (i17 == 0) {
            return rb5.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
