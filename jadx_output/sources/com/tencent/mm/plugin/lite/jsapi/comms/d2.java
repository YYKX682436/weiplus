package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/d2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("emoticonInfos") : null;
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("opType")) : null;
        int optInt = jSONObject != null ? jSONObject.optInt("operationScene") : 0;
        org.json.JSONArray optJSONArray2 = jSONObject != null ? jSONObject.optJSONArray("downloadTypes") : null;
        if (str == null || optJSONArray == null || valueOf == null) {
            this.f143443f.a("emoticonStoreOperation:fail_missing arguments");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LIteAppJsApiEmoticonStoreOperation", "invoke: " + c());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (optJSONArray2 != null) {
            c75.c.d(optJSONArray2, new com.tencent.mm.plugin.lite.jsapi.comms.b2(arrayList));
        }
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        long j17 = this.f143442e.f299024a;
        ((com.tencent.mm.feature.emoji.c4) o6Var).getClass();
        if (j17 != 0) {
            com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel.f66004h.a(j17).f66006d = j17;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.lite.jsapi.comms.c2(optJSONArray, valueOf, this, optInt, arrayList, null), 3, null);
    }
}
