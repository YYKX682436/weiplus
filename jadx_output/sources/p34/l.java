package p34;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351683d = 0;

    public l(p34.m mVar, p34.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351683d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351683d;
        this.f351683d = i17 + 1;
        if (i17 == 0) {
            return p34.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
