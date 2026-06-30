package ft;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266418d = 0;

    public q(ft.r rVar, ft.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266418d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266418d;
        this.f266418d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.w.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.feature.appbrand.support.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
