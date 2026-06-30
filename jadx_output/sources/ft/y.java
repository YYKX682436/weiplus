package ft;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266445d = 0;

    public y(ft.z zVar, ft.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266445d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266445d;
        this.f266445d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
