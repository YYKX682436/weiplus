package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/c1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonOpenDetailVC", "invoke: " + jSONObject);
        java.lang.String productId = jSONObject != null ? jSONObject.optString("pid") : null;
        int optInt = jSONObject != null ? jSONObject.optInt("emotionScene", 47) : 47;
        int optInt2 = jSONObject != null ? jSONObject.optInt("precedingScene", 17) : 17;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("requestID") : null;
        if (optString == null) {
            optString = "";
        }
        if (productId == null || productId.length() == 0) {
            this.f143443f.a("emoticonOpenDetailVC:fail_missing arguments");
            return;
        }
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var;
        c4Var.getClass();
        kotlin.jvm.internal.o.g(productId, "productId");
        qk.c0 c0Var = new qk.c0(productId);
        c0Var.f364155a = optInt;
        c0Var.f364198g = optInt2;
        c0Var.f364157c = optString;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e(c4Var.f66207d, "emoticon liteapp service not found");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(c17, c0Var);
        }
        this.f143443f.d(false);
    }
}
