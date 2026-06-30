package ft;

/* loaded from: classes6.dex */
public class c0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266370d = 0;

    public c0(ft.d0 d0Var, ft.b0 b0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266370d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266370d;
        this.f266370d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
