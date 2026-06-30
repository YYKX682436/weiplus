package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/n0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class n0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.Object wj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).wj(this.f143442e.f299024a, "__LiteAppEmoticonContextTag");
        com.tencent.mm.plugin.lite.jsapi.comms.i iVar = wj6 instanceof com.tencent.mm.plugin.lite.jsapi.comms.i ? (com.tencent.mm.plugin.lite.jsapi.comms.i) wj6 : null;
        if (iVar == null) {
            this.f143443f.a("there is no emoticon panel");
        } else if (jSONObject == null || !jSONObject.has("enable")) {
            this.f143443f.a("params parse error");
        } else {
            iVar.f143606a.setSendButtonEnable(jSONObject.optBoolean("enable"));
            this.f143443f.d(false);
        }
    }
}
