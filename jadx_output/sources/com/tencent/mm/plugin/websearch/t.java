package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f181622d;

    public t(com.tencent.mm.plugin.websearch.a0 a0Var, java.util.Map map) {
        this.f181622d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map map = this.f181622d;
        if (map != null && map.size() > 0) {
            try {
                jSONObject.put("requestId", map.get("requestId"));
                jSONObject.put("searchId", map.get("searchId"));
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, map.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
                jSONObject.put("type", map.get("type"));
                jSONObject.put("url", map.get("url"));
                jSONObject.put("parentSearchID", map.get("parentSearchID"));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FTSWebSearchLogic", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "searchData, " + jSONObject.toString());
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putString("sos_fts_search_data_tmp", jSONObject.toString());
    }
}
