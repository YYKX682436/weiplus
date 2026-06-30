package gg1;

/* loaded from: classes7.dex */
public final class c0 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271534a;

    public c0(gg1.c1 c1Var) {
        this.f271534a = c1Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "getMediaInfo fail");
        this.f271534a.f271549o = true;
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        java.util.Map map;
        aa1.a aVar;
        gg1.c1 c1Var = this.f271534a;
        if (c1Var.f271549o) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf((eVar == null || (map = eVar.f2489b) == null || (aVar = (aa1.a) map.get("CurrentURI")) == null) ? null : aVar.f2481a);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "getMediaInfo: currentUrl = ".concat(valueOf));
        if (r26.n0.N(r26.n0.u0(valueOf).toString()) || kotlin.jvm.internal.o.b(valueOf, "null") || kotlin.jvm.internal.o.b(valueOf, c1Var.f271537c.f261899e)) {
            return;
        }
        fg1.g gVar = (fg1.g) c1Var.f271536b;
        gVar.getClass();
        try {
            gVar.a(new uf.e2(), gVar.b());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onXWebCastingInterrupt fail", e17);
        }
    }
}
