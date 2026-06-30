package l81;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317070d = 0;

    public o(l81.p pVar, l81.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317070d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317070d;
        this.f317070d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.appcache.t5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
