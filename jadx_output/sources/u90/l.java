package u90;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425801d = 0;

    public l(u90.m mVar, u90.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425801d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425801d;
        this.f425801d = i17 + 1;
        if (i17 == 0) {
            return u90.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
