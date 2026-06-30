package rx4;

/* loaded from: classes8.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public final rx4.l a(org.json.JSONObject parentObj, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(parentObj, "parentObj");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.String optString = jSONObject != null ? jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "") : null;
        if (optString == null) {
            optString = "";
        }
        jSONObject2.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, optString);
        jSONObject2.put("parenttype", parentObj.optInt("parenttype", 68));
        jSONObject2.put("bgImage", parentObj.optString("bgImage", ""));
        jSONObject2.put("bgImageDark", parentObj.optString("bgImageDark", ""));
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("list") : null;
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        jSONObject2.put("items", optJSONArray);
        return new rx4.l(jSONObject2);
    }
}
