package yc4;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f460856d = 0;

    public l(yc4.m mVar, yc4.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f460856d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f460856d;
        this.f460856d = i17 + 1;
        if (i17 == 0) {
            return yc4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
