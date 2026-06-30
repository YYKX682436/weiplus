package m11;

/* loaded from: classes.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f322731d = 0;

    public l(m11.m mVar, m11.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f322731d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f322731d;
        this.f322731d = i17 + 1;
        if (i17 == 0) {
            return m11.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
