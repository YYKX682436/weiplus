package j41;

/* loaded from: classes11.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f297617a = "";

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f297618b = new java.util.LinkedList();

    public j41.d0 a(org.json.JSONObject jSONObject) {
        this.f297617a = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("detail");
        if (optJSONArray == null) {
            return this;
        }
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
            j41.e0 e0Var = new j41.e0();
            java.util.List list = this.f297618b;
            e0Var.f297619a = jSONObject2.optString("icon");
            e0Var.f297620b = jSONObject2.optString("desc");
            e0Var.f297621c = jSONObject2.optInt("desc_type");
            e0Var.f297622d = jSONObject2.optInt("action");
            e0Var.f297623e = jSONObject2.optString("action_param");
            e0Var.f297627i = jSONObject2.optJSONArray("image_url");
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(e0Var.f297623e);
                e0Var.f297624f = jSONObject3.optInt("iconwidth");
                e0Var.f297625g = jSONObject3.optInt("iconheight");
                e0Var.f297626h = jSONObject3.optString("ecsjumpinfo");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenIMCustomDetail", e17, "OpenIMCustomDetail parse error", new java.lang.Object[0]);
            }
            ((java.util.LinkedList) list).add(e0Var);
        }
        return this;
    }
}
