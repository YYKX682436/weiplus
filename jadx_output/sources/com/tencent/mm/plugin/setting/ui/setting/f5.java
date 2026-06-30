package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.f5 f161024a = new com.tencent.mm.plugin.setting.ui.setting.f5();

    public final org.json.JSONObject a(com.tencent.matrix.util.MemInfo[] memInfoArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put("count", memInfoArr.length);
            jSONObject.put("detail", jSONArray);
            java.util.ArrayList arrayList = new java.util.ArrayList(memInfoArr.length);
            for (com.tencent.matrix.util.MemInfo memInfo : memInfoArr) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.tencent.matrix.util.ProcessInfo processInfo = memInfo.f53097e;
                    kotlin.jvm.internal.o.d(processInfo);
                    jSONObject2.put("process", processInfo.f53109e);
                    com.tencent.matrix.util.ProcessInfo processInfo2 = memInfo.f53097e;
                    kotlin.jvm.internal.o.d(processInfo2);
                    jSONObject2.put("pid", processInfo2.f53108d);
                    com.tencent.matrix.util.PssInfo pssInfo = memInfo.f53102m;
                    kotlin.jvm.internal.o.d(pssInfo);
                    jSONObject2.put("amsPss", pssInfo.a());
                } catch (java.lang.Throwable th6) {
                    oj.j.d("MicroMsg.SettingsAboutMMHeaderReporter", th6, "", new java.lang.Object[0]);
                }
                arrayList.add(jSONObject2);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((org.json.JSONObject) it.next());
            }
        } catch (java.lang.Throwable th7) {
            oj.j.d("MicroMsg.SettingsAboutMMHeaderReporter", th7, "", new java.lang.Object[0]);
        }
        return jSONObject;
    }
}
