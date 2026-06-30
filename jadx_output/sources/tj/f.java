package tj;

/* loaded from: classes7.dex */
public final class f extends gb1.f {
    public static final int CTRL_INDEX = 1196;
    public static final java.lang.String NAME = "removeMiniProgramPlayableView";

    @Override // gb1.f, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiRemoveMiniProgramPlayableView", "invoke");
        B(lVar, jSONObject, i17, lVar.getJsRuntime());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = data.getInt("viewId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiRemoveMiniProgramPlayableView", "getViewId: " + i17);
        return i17;
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiRemoveMiniProgramPlayableView", "onRemoveView");
        uj.f.f428152a.a();
        return true;
    }
}
