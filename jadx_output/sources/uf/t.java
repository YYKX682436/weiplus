package uf;

/* loaded from: classes7.dex */
public final class t implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427102a;

    public t(uf.o0 o0Var) {
        this.f427102a = o0Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "getMediaInfo fail");
        this.f427102a.f427064g = true;
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        java.util.Map map;
        aa1.a aVar;
        uf.o0 o0Var = this.f427102a;
        if (o0Var.f427064g) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf((eVar == null || (map = eVar.f2489b) == null || (aVar = (aa1.a) map.get("CurrentURI")) == null) ? null : aVar.f2481a);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "getMediaInfo: currentUrl = ".concat(valueOf));
        if (r26.n0.N(r26.n0.u0(valueOf).toString()) || kotlin.jvm.internal.o.b(valueOf, "null") || kotlin.jvm.internal.o.b(valueOf, ((uf.o1) o0Var.f427058a).f427076h)) {
            return;
        }
        o0Var.f427059b.i();
    }
}
