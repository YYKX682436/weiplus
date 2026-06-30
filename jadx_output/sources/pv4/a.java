package pv4;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(org.json.JSONObject jSONObject, yz5.p action) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(action, "action");
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                kotlin.jvm.internal.o.d(next);
                action.invoke(next, optJSONObject);
            }
        }
    }

    public static final java.lang.Integer b(org.json.JSONObject jSONObject, java.lang.String key) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        if (jSONObject.has(key)) {
            return java.lang.Integer.valueOf(jSONObject.optInt(key));
        }
        return null;
    }

    public static final java.lang.Long c(org.json.JSONObject jSONObject, java.lang.String key) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        if (jSONObject.has(key)) {
            return java.lang.Long.valueOf(jSONObject.optLong(key));
        }
        return null;
    }

    public static final java.lang.String d(org.json.JSONObject jSONObject, java.lang.String key) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        if (jSONObject.has(key)) {
            return jSONObject.optString(key);
        }
        return null;
    }

    public static final org.json.JSONArray e(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        try {
            return new org.json.JSONArray(str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("String.toJSONArray", "error", e17);
            return null;
        }
    }

    public static final org.json.JSONObject f(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("String.toJSONObject", "error", e17);
            return null;
        }
    }

    public static final java.util.List g(org.json.JSONArray jSONArray) {
        kotlin.jvm.internal.o.g(jSONArray, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                arrayList.add(optJSONObject);
            }
        }
        return arrayList;
    }
}
