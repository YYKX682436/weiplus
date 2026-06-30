package uh1;

/* loaded from: classes7.dex */
public final class f implements uh1.w {

    /* renamed from: b, reason: collision with root package name */
    public final int f427785b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f427786c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f427787d;

    /* renamed from: e, reason: collision with root package name */
    public final javax.net.ssl.SSLContext f427788e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f427789f;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f427791h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f427792i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f427790g = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f427793j = new java.util.ArrayList();

    public f(com.tencent.mm.plugin.appbrand.jsapi.l lVar, boolean z17) {
        this.f427787d = false;
        this.f427791h = lVar;
        uh1.a aVar = (uh1.a) lVar.b(uh1.a.class);
        this.f427785b = aVar.f427748o;
        this.f427789f = aVar.B;
        this.f427788e = uh1.j0.p(aVar);
        this.f427792i = new java.util.Hashtable(10);
        this.f427787d = z17;
        java.lang.String D = lp0.b.D();
        this.f427786c = (D.endsWith("/") ? D : D.concat("/")) + "networkfiles/";
    }

    public final void a(java.lang.String str) {
        if (str == null) {
            return;
        }
        synchronized (this.f427793j) {
            java.util.Iterator it = this.f427793j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                vh1.f fVar = (vh1.f) it.next();
                if (str.equals(fVar.f437033v)) {
                    this.f427793j.remove(fVar);
                    break;
                }
            }
        }
    }

    @Override // uh1.w
    public void release() {
        synchronized (this.f427793j) {
            java.util.Iterator it = this.f427793j.iterator();
            while (it.hasNext()) {
                ((vh1.f) it.next()).f437021g = false;
            }
            this.f427793j.clear();
        }
    }
}
