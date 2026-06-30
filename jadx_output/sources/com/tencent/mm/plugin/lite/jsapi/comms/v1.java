package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/v1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class v1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSingleStatus", "invoke: " + str + ", " + jSONObject);
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("md5s") : null;
        if (optJSONArray == null) {
            this.f143443f.a("emoticonSingleStatus:fail_missing arguments");
            return;
        }
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            linkedList.add(optJSONArray.getString(i17));
        }
        ((com.tencent.mm.feature.emoji.c4) ((com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class))).getClass();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.ArrayList a17 = gr.t.g().a();
        for (java.lang.String str2 : linkedList) {
            if (!a17.isEmpty()) {
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.storage.emotion.EmojiInfo) it.next()).getMd5(), str2)) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            linkedList2.add(java.lang.Boolean.valueOf(!z18));
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        int i18 = 0;
        for (java.lang.Object obj : linkedList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("canAdd", ((java.lang.Boolean) linkedList2.get(i18)).booleanValue() ? 1 : 0);
            jSONObject3.put((java.lang.String) obj, jSONObject4);
            i18 = i19;
        }
        jSONObject2.put("result", jSONObject3);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSingleStatus", "emoticonSingleStatus result: " + jSONObject2);
        this.f143443f.c(jSONObject2, false);
    }
}
