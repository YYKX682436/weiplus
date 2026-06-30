package com.tencent.mm.plugin.finder.report;

/* loaded from: classes.dex */
public abstract class q4 {
    public static final org.json.JSONObject a(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) it.next();
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                kotlin.jvm.internal.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderStackObjectReporter", "mergeJsonObjects: current result:" + jSONObject, e17);
        }
        return jSONObject;
    }
}
