package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/f2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int i17;
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("pids") : null;
        if (str == null || optJSONArray == null) {
            this.f143443f.a("emoticonStoreStatus:fail_missing arguments");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonStoreStatus", "invoke emoticonStoreStatus: " + c() + ", " + this.f143442e.f299024a + ", " + str);
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        long j17 = this.f143442e.f299024a;
        ((com.tencent.mm.feature.emoji.c4) o6Var).getClass();
        if (j17 != 0) {
            com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel.f66004h.a(j17).f66006d = j17;
        }
        int length = optJSONArray.length();
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String string = optJSONArray.getString(i18);
            kotlin.jvm.internal.o.f(c(), "getContext(...)");
            long j18 = this.f143442e.f299024a;
            kotlin.jvm.internal.o.d(string);
            boolean S = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(string);
            com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel.f66004h.a(j18).f66007e.add(string);
            float f17 = 0.0f;
            if (S) {
                i17 = 3;
            } else {
                int b17 = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ri().b(string);
                if (b17 >= 0 && b17 < 101) {
                    f17 = b17 / 100.0f;
                    i17 = 2;
                } else {
                    i17 = 1;
                }
            }
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("status", i17);
            if (i17 == 2) {
                jSONObject4.put("progress", java.lang.Float.valueOf(f17));
            }
            jSONObject3.put(string, jSONObject4);
        }
        jSONObject2.put("result", jSONObject3);
        this.f143443f.c(jSONObject2, false);
    }
}
