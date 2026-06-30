package d00;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final d00.b f225252a = new d00.b();

    public final java.util.Map a(java.lang.String json) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(json, "json");
        try {
            jSONObject = new org.json.JSONObject(json);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("GetFeatureListTask", e17.getMessage());
            jSONObject = new org.json.JSONObject();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (jSONObject.length() == 0) {
            return linkedHashMap;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("feature_list");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject.toString());
                }
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject((java.lang.String) it.next());
                int optInt = jSONObject2.optInt("feature_id");
                java.lang.String optString = jSONObject2.optString("feature_version");
                java.lang.Integer valueOf = java.lang.Integer.valueOf(optInt);
                kotlin.jvm.internal.o.d(optString);
                linkedHashMap2.put(valueOf, optString);
            } catch (java.lang.Exception unused) {
            }
        }
        return linkedHashMap2;
    }
}
