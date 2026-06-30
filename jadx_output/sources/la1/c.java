package la1;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 6;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "insertVideoPlayer";

    @Override // gb1.i
    public java.lang.Boolean G(org.json.JSONObject jSONObject) {
        java.lang.Boolean bool = null;
        if (jSONObject != null) {
            try {
                bool = java.lang.Boolean.valueOf(jSONObject.getBoolean("underGameView"));
            } catch (org.json.JSONException unused) {
            }
        }
        com.tencent.mars.xlog.Log.i("Luggage.WAGameJsApiInsertVideoPlayer", "getUnderView " + bool);
        return bool;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.a, gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t component, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(component, "component");
        super.N(component, i17, view, jSONObject);
        if (!(component instanceof pa1.o)) {
            com.tencent.mars.xlog.Log.w("Luggage.WAGameJsApiInsertVideoPlayer", "wrong component: %s", kotlin.jvm.internal.i0.a(component.getClass()).g());
            return;
        }
        com.tencent.mm.plugin.appbrand.service.c0 U1 = ((pa1.o) component).U1();
        ae.q qVar = U1 != null ? (ae.q) U1.z1(ae.q.class) : null;
        if (qVar == null) {
            com.tencent.mars.xlog.Log.w("JsApiInsertHTMLCanvasElement", "hy: webgl extension not exists!");
            return;
        }
        com.tencent.magicbrush.MagicBrush w17 = ((ae.a) qVar).w();
        if (kotlin.jvm.internal.o.b(java.lang.Boolean.TRUE, G(jSONObject))) {
            w17.f48590n.forEach(new la1.b(component));
            if (!((java.lang.Boolean) ha1.q.f279784c.e()).booleanValue()) {
                com.tencent.mars.xlog.Log.i("Luggage.WAGameJsApiInsertVideoPlayer", "hy: use js thread choreographer");
                w17.u(gh.b.ChoreographerInJsThread);
                return;
            }
            com.tencent.mars.xlog.Log.i("Luggage.WAGameJsApiInsertVideoPlayer", "hy: use main thread choreographer");
            if (((java.lang.Boolean) ha1.s.f279786c.e()).booleanValue()) {
                w17.u(gh.b.NativeLocker);
            } else {
                w17.u(gh.b.ChoreographerInMainThread);
            }
        }
    }
}
