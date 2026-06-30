package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/n5;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class n5 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        try {
            org.json.JSONArray jSONArray = data.getJSONArray("fileList");
            kotlin.jvm.internal.o.d(jSONArray);
            java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.Object obj = jSONArray.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                java.lang.String string = ((org.json.JSONObject) obj).getString("fileId");
                kotlin.jvm.internal.o.f(string, "getString(...)");
                arrayList.add(string);
            }
            java.util.Map bj6 = ((d40.t) ((e40.c0) i95.n0.c(e40.c0.class))).bj(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(bj6.size());
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) bj6).entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                e40.b0 b0Var = (e40.b0) entry.getValue();
                e40.a0 a0Var = b0Var.f247612a;
                java.lang.Float f17 = b0Var.f247613b;
                arrayList2.add(new com.tencent.mm.plugin.lite.jsapi.comms.r5(a0Var, str2, f17 != null ? java.lang.Integer.valueOf((int) f17.floatValue()) : null, null, 8, null));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                jSONArray2.put(((com.tencent.mm.plugin.lite.jsapi.comms.r5) it.next()).a());
            }
            jSONObject.put("fileList", jSONArray2);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiQuerySaveFileStatus", "callbackResponse = " + jSONObject);
            this.f143442e.f(jSONObject, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiQuerySaveFileStatus", e17.getMessage() + ": " + jz5.a.b(e17));
            this.f143442e.a();
        }
    }
}
