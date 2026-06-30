package com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay;

/* loaded from: classes.dex */
public abstract class i {
    public static final java.util.List a(org.json.JSONArray jSONArray) {
        kotlin.jvm.internal.o.g(jSONArray, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = jSONArray.get(i17);
            if (obj instanceof org.json.JSONObject) {
                arrayList.add(b((org.json.JSONObject) obj));
            } else if (obj instanceof org.json.JSONArray) {
                arrayList.add(a((org.json.JSONArray) obj));
            } else {
                kotlin.jvm.internal.o.d(obj);
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.Map b(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject.get(next);
            if (obj instanceof org.json.JSONObject) {
                kotlin.jvm.internal.o.d(next);
                linkedHashMap.put(next, b((org.json.JSONObject) obj));
            } else if (obj instanceof org.json.JSONArray) {
                kotlin.jvm.internal.o.d(next);
                linkedHashMap.put(next, a((org.json.JSONArray) obj));
            } else {
                kotlin.jvm.internal.o.d(next);
                kotlin.jvm.internal.o.d(obj);
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }
}
