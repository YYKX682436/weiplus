package ft;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266433d = 0;

    public u(ft.v vVar, ft.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266433d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266433d;
        this.f266433d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
