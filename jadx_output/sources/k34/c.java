package k34;

/* loaded from: classes.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303890d = 0;

    public c(k34.d dVar, k34.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303890d < 5;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303890d;
        this.f303890d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.webview.model.w4.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.webview.model.d0.INSTANCE;
        }
        if (i17 == 2) {
            return au2.j.INSTANCE;
        }
        if (i17 == 3) {
            return com.tencent.mm.plugin.appbrand.fg.INSTANCE;
        }
        if (i17 == 4) {
            return com.tencent.mm.plugin.appbrand.dg.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 5");
    }
}
