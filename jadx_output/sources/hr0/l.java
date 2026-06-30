package hr0;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f283308d = 0;

    public l(hr0.m mVar, hr0.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f283308d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f283308d;
        this.f283308d = i17 + 1;
        if (i17 == 0) {
            return hr0.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
