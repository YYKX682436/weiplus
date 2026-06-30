package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class g1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI f141272d;

    public g1(com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI gameWebTabUI) {
        this.f141272d = gameWebTabUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel h5CgiPreloadModel = (com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel) obj;
        if (h5CgiPreloadModel != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("timeStamp", h5CgiPreloadModel.f139852d);
                jSONObject.put("cgiReponseStr", h5CgiPreloadModel.f139855g);
                jSONObject.put("cgiCostTimeMs", h5CgiPreloadModel.f139853e);
                jSONObject.put("isRequestFail", h5CgiPreloadModel.f139854f);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameWebTabUI", e17.getMessage());
            }
            java.lang.String format = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameIndexPreloadData__= %s; })()", jSONObject);
            com.tencent.mm.ipcinvoker.r rVar = com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.f141196v;
            this.f141272d.f139497g.o(format, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "gamelog.setInjectJsPreloadDataCallback.onCallback preloadJsonObj = " + jSONObject);
        }
    }
}
