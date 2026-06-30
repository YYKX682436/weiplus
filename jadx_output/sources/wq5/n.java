package wq5;

/* loaded from: classes8.dex */
public abstract class n {
    public static final void a(org.json.JSONObject jSONObject, java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        jSONObject.put("__attr__".concat(key), value);
    }

    public static final org.json.JSONArray b(org.json.JSONObject jSONObject, java.lang.String key) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(key);
        if (optJSONObject != null) {
            org.json.JSONArray put = new org.json.JSONArray().put(optJSONObject);
            kotlin.jvm.internal.o.f(put, "put(...)");
            return put;
        }
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(key);
        kotlin.jvm.internal.o.f(jSONArray, "getJSONArray(...)");
        return jSONArray;
    }
}
