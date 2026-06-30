package gt;

/* loaded from: classes.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f275256d = 0;

    public l(gt.m mVar, gt.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f275256d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f275256d;
        this.f275256d = i17 + 1;
        if (i17 == 0) {
            return gt.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
