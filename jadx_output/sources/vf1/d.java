package vf1;

/* loaded from: classes7.dex */
public class d implements tb1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f436315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vf1.g f436316b;

    public d(vf1.g gVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f436316b = gVar;
        this.f436315a = tVar;
    }

    @Override // tb1.z
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertXWebCamera", "onRelease");
        vf1.g gVar = this.f436316b;
        mi1.w0 w0Var = gVar.f436322h;
        if (w0Var != null) {
            w0Var.dismiss();
            gVar.f436322h = null;
        }
    }

    @Override // tb1.z
    public void onInit() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertXWebCamera", "onInit");
        vf1.g gVar = this.f436316b;
        if (gVar.f436322h == null) {
            com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f436315a;
            if (tVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
                gVar.f436322h = mi1.c.a(((com.tencent.mm.plugin.appbrand.page.v5) tVar).getRuntime()).h(mi1.d.CAMERA);
            }
        }
    }
}
