package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class t6 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.LiteAppGameTabUI f141766d;

    public t6(com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI) {
        this.f141766d = liteAppGameTabUI;
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
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppGameTabUI", e17.getMessage());
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("__gameIndexPreloadData__", jSONObject.toString());
            this.f141766d.f140994p.d(hashMap);
        }
    }
}
