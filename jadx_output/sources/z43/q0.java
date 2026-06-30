package z43;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (!jSONObject.has("url")) {
            this.f143443f.a("url is null");
            return;
        }
        try {
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent();
            am.nl nlVar = notifyGameWebviewOperationEvent.f54542g;
            nlVar.f7433a = 2;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", jSONObject.getString("url"));
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            intent.putExtra("nextAnimIn", ra3.h0.a(jSONObject));
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            intent.putExtra("currentAnimOut", ra3.h0.b(jSONObject));
            nlVar.f7434b = c();
            if (jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO)) {
                intent.putExtra("game_liteapp_pass_data", jSONObject.getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO).toString());
            }
            intent.putExtra("shouldCheckLimitedMode", java.lang.Boolean.valueOf(jSONObject.optBoolean("shouldCheckLimitedMode", true)));
            nlVar.f7435c = intent;
            notifyGameWebviewOperationEvent.e();
            this.f143443f.d(false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiStartGameWebview", e17, "get url", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
