package wv;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f449884d = 0;

    public l(wv.m mVar, wv.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f449884d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f449884d;
        this.f449884d = i17 + 1;
        if (i17 == 0) {
            return wv.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
