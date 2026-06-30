package vb1;

/* loaded from: classes7.dex */
public final class z extends gb1.h {
    public static final int CTRL_INDEX = 595;
    public static final java.lang.String NAME = "updateWebGLCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.getInt("canvasId");
    }

    @Override // gb1.h
    public boolean I() {
        return true;
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("JsApiUpdateHTMLCanvasElement", "update HTMLCanvasElement for canvasId[" + i17 + ']');
        return true;
    }
}
