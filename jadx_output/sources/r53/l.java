package r53;

/* loaded from: classes8.dex */
public class l implements com.tencent.mm.ipcinvoker.r {
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
                com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUtil", e17.getMessage());
            }
            r53.f.f392657e.put("__gameIndexPreloadData__", jSONObject.toString());
        }
    }
}
