package zk1;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f473403d = 0;

    public c(zk1.d dVar, zk1.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f473403d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f473403d;
        this.f473403d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
