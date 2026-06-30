package rx4;

/* loaded from: classes8.dex */
public final class t {
    public t(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.List a(java.lang.String rawItems, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(rawItems, "rawItems");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(rawItems);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] parseHistoryItems, total=");
            sb6.append(jSONArray.length());
            sb6.append(", maxCount=");
            sb6.append(i17);
            sb6.append(", firstItem=");
            int i18 = 0;
            if (jSONArray.length() > 0) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(0);
                str = optJSONObject != null ? optJSONObject.toString() : null;
            } else {
                str = "null";
            }
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", sb6.toString());
            int min = java.lang.Math.min(jSONArray.length() - 1, i17 - 1);
            if (min >= 0) {
                while (true) {
                    org.json.JSONObject optJSONObject2 = jSONArray.optJSONObject(i18);
                    kotlin.jvm.internal.o.f(optJSONObject2, "optJSONObject(...)");
                    arrayList.add(new rx4.i(optJSONObject2));
                    if (i18 == min) {
                        break;
                    }
                    i18++;
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("FTSNativeTeachHistoryBoxUIC", "parseHistoryItems, rawItems: " + rawItems + ", error: " + e17);
        }
        return arrayList;
    }
}
