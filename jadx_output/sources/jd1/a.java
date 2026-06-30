package jd1;

/* loaded from: classes.dex */
public abstract class a {
    public static final java.util.List a(org.json.JSONArray jSONArray, yz5.l transform) {
        kotlin.jvm.internal.o.g(jSONArray, "<this>");
        kotlin.jvm.internal.o.g(transform, "transform");
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = jSONArray.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            java.lang.Object invoke = transform.invoke(obj);
            if (invoke instanceof org.json.JSONObject) {
                invoke = b((org.json.JSONObject) invoke, transform);
            } else if (invoke instanceof org.json.JSONArray) {
                invoke = a((org.json.JSONArray) invoke, transform);
            }
            arrayList.add(invoke);
        }
        return arrayList;
    }

    public static final java.util.Map b(org.json.JSONObject jSONObject, yz5.l transform) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(transform, "transform");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject.get(next);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            java.lang.Object invoke = transform.invoke(obj);
            kotlin.jvm.internal.o.d(next);
            if (invoke instanceof org.json.JSONObject) {
                invoke = b((org.json.JSONObject) invoke, transform);
            } else if (invoke instanceof org.json.JSONArray) {
                invoke = a((org.json.JSONArray) invoke, transform);
            }
            hashMap.put(next, invoke);
        }
        return hashMap;
    }
}
