package vb1;

/* loaded from: classes7.dex */
public final class x extends gb1.f {
    public static final int CTRL_INDEX = 596;
    public static final java.lang.String NAME = "removeWebGLCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.getInt("canvasId");
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.page.n7 component = (com.tencent.mm.plugin.appbrand.page.n7) tVar;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("JsApiRemoveHTMLCanvasElement", "remove HTMLCanvasElement for canvasId[" + i17 + ']');
        vb1.b bVar = vb1.d.f434473c;
        java.lang.String appId = component.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        bVar.a(appId).f434476b.remove(java.lang.Integer.valueOf(i17));
        return true;
    }
}
