package gg1;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f271533d = 0;

    public c(gg1.d dVar, gg1.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f271533d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f271533d;
        this.f271533d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.report.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
