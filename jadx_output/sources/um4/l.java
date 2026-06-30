package um4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/l;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenK1KWebView", "openK1kWebView: " + jSONObject);
        if (jSONObject != null) {
            try {
                if (jSONObject.optInt("actionType") == 6) {
                    ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Di(jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 53), jSONObject.optInt("subScene", 5), c());
                } else {
                    ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ui(c(), jSONObject.toString());
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenK1KWebView", "openK1kWebView failed: " + e17);
                this.f143443f.a("fail");
                return;
            }
        }
        this.f143443f.d(false);
    }
}
