package ft;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266403d = 0;

    public m(ft.n nVar, ft.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266403d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266403d;
        this.f266403d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.appbrand.support.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
