package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/q0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class q0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("md5s") : null;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("pid") : null;
        if (optString == null || optJSONArray == null) {
            this.f143443f.a("emoticonGetDesc:fail_missing arguments");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        c75.c.d(optJSONArray, new com.tencent.mm.plugin.lite.jsapi.comms.o0(arrayList));
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.lite.jsapi.comms.p0(optString, arrayList, this, null), 3, null);
    }
}
