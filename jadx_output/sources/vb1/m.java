package vb1;

/* loaded from: classes7.dex */
public class m extends gb1.h {
    public static final int CTRL_INDEX = 69;
    public static final java.lang.String NAME = "drawCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("canvasId");
    }

    @Override // gb1.h
    public boolean L(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of CoverViewContainer.(%s)", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.KeyEvent.Callback callback = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (!(callback instanceof h91.b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDrawCanvas", "drawCanvas failed, view is not a instance of AppBrandDrawableView.(%s)", java.lang.Integer.valueOf(i17));
            return false;
        }
        java.lang.System.currentTimeMillis();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        h91.b bVar = (h91.b) callback;
        if (jSONObject.optBoolean("reserve")) {
            bVar.e(optJSONArray, new vb1.k(this, nVar));
        } else {
            bVar.c(optJSONArray, new vb1.l(this, nVar));
        }
        bVar.a();
        java.lang.System.currentTimeMillis();
        return true;
    }
}
