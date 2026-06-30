package la1;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.appbrand.jsapi.webrtc.i {

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f317497g;

    public g(android.util.SparseArray captureDelegateContainer) {
        kotlin.jvm.internal.o.g(captureDelegateContainer, "captureDelegateContainer");
        this.f317497g = captureDelegateContainer;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webrtc.i
    public com.tencent.mm.plugin.appbrand.jsapi.webrtc.e P() {
        return com.tencent.mm.plugin.appbrand.jsapi.webrtc.e.f83802d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webrtc.i
    public void Q(com.tencent.luggage.sdk.jsapi.component.b component, int i17) {
        kotlin.jvm.internal.o.g(component, "component");
        super.Q(component, i17);
        ce.g gVar = (ce.g) component.B1(ce.g.class);
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "hy: manually notify first frame ready from webrtc view");
            ((ce.o) gVar).Y();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webrtc.i, gb1.d
    /* renamed from: R */
    public void N(com.tencent.luggage.sdk.jsapi.component.b bVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        super.N(bVar, i17, view, jSONObject);
        kotlin.jvm.internal.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
        com.tencent.mm.plugin.appbrand.service.c0 U1 = ((pa1.o) bVar).U1();
        ae.q qVar = U1 != null ? (ae.q) U1.z1(ae.q.class) : null;
        if (qVar == null) {
            com.tencent.mars.xlog.Log.w("JsApiInsertHTMLCanvasElement", "hy: mb extension not exists!");
            return;
        }
        com.tencent.magicbrush.MagicBrush w17 = ((ae.a) qVar).w();
        if (kotlin.jvm.internal.o.b(java.lang.Boolean.TRUE, G(jSONObject))) {
            w17.f48590n.forEach(la1.d.f317494d);
            if (!((java.lang.Boolean) ha1.q.f279784c.e()).booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "hy: use js thread choreographer");
                w17.u(gh.b.ChoreographerInJsThread);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "hy: use main thread choreographer");
            if (((java.lang.Boolean) ha1.s.f279786c.e()).booleanValue()) {
                w17.u(gh.b.NativeLocker);
            } else {
                w17.u(gh.b.ChoreographerInMainThread);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webrtc.i
    public void S(com.tencent.luggage.sdk.jsapi.component.b bVar, org.webrtc.IRenderer renderView, int i17) {
        ce.g gVar;
        kotlin.jvm.internal.o.g(renderView, "renderView");
        if (bVar == null || (gVar = (ce.g) bVar.B1(ce.g.class)) == null) {
            return;
        }
        la1.e eVar = new la1.e(renderView);
        this.f317497g.put(i17, eVar);
        ((ce.o) gVar).f40696t.add(0, eVar);
    }
}
