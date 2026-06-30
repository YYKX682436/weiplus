package dv4;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f244009a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f244010b;

    public g(org.json.JSONObject json) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String d17;
        kotlin.jvm.internal.o.g(json, "json");
        java.lang.String optString = json.optString("extReqParams");
        java.lang.String optString2 = json.optString("extParams");
        str = "";
        kotlin.jvm.internal.o.d(optString2);
        try {
            str2 = java.net.URLDecoder.decode(optString2, com.tencent.mapsdk.internal.rv.f51270c);
            kotlin.jvm.internal.o.d(str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FTSWebSearchPreGetData", "safeUrlDecode error: ".concat(optString2), e17);
            str2 = "";
        }
        if (str2.length() > 0) {
            org.json.JSONObject f17 = pv4.a.f(str2);
            java.lang.Object obj = null;
            java.lang.String optString3 = f17 != null ? f17.optString("parentSearchID", "") : null;
            str = optString3 != null ? optString3 : "";
            org.json.JSONArray optJSONArray = f17 != null ? f17.optJSONArray("crossExtReqParams") : null;
            kotlin.jvm.internal.o.d(optString);
            org.json.JSONArray e18 = pv4.a.e(optString);
            java.util.List<org.json.JSONObject> V0 = optJSONArray != null ? kz5.n0.V0(pv4.a.g(optJSONArray)) : new java.util.ArrayList();
            if (e18 != null) {
                java.util.Iterator it = pv4.a.g(e18).iterator();
                while (it.hasNext()) {
                    V0.add((org.json.JSONObject) it.next());
                }
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (org.json.JSONObject jSONObject : V0) {
                java.lang.String optString4 = jSONObject.optString("key");
                kotlin.jvm.internal.o.f(optString4, "optString(...)");
                if (linkedHashSet.add(optString4)) {
                    arrayList.add(jSONObject);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (kotlin.jvm.internal.o.b(((org.json.JSONObject) next).optString("key"), "parentSearchID")) {
                    obj = next;
                    break;
                }
            }
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
            if (jSONObject2 != null && (d17 = pv4.a.d(jSONObject2, "textValue")) != null) {
                str = d17;
            }
            if (!arrayList.isEmpty()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    jSONArray.put((org.json.JSONObject) it7.next());
                }
                optString = jSONArray.toString();
                kotlin.jvm.internal.o.d(optString);
            }
            this.f244009a = optString;
        } else {
            kotlin.jvm.internal.o.d(optString);
            this.f244009a = optString;
        }
        this.f244010b = str;
    }
}
