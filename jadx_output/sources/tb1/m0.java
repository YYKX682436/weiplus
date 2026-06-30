package tb1;

/* loaded from: classes7.dex */
public final class m0 extends tb1.k0 {

    /* renamed from: i, reason: collision with root package name */
    public mi1.w0 f416912i;

    @Override // gb1.d, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(component, "component");
        if ((component instanceof pa1.o) || (component instanceof fa1.t)) {
            java.lang.Boolean Bi = ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(component.getAppId(), ((k91.z0) component.b(k91.z0.class)).f305852r.f75399d);
            kotlin.jvm.internal.o.f(Bi, "isGameLiving(...)");
            if (Bi.booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertCameraWC", "is game living");
                component.a(i17, o("fail: " + i65.a.r(component.getF147807d(), com.tencent.mm.R.string.a0u)));
                return;
            }
        }
        B(component, jSONObject, i17, component.getF147808e());
    }

    @Override // tb1.k0, gb1.d
    public void O(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        super.O(tVar, i17, view, jSONObject, nVar);
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer");
        java.lang.Object d17 = ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        kotlin.jvm.internal.o.e(d17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.camera.ICameraView");
        ((tb1.a0) d17).setCameraLife(new tb1.l0(this, tVar));
    }
}
