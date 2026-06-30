package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/a1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonOpenBrowseVC", "invoke: " + jSONObject);
        java.lang.String optString = jSONObject != null ? jSONObject.optString("md5") : null;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("emojiInfoBuf") : null;
        int optInt = jSONObject != null ? jSONObject.optInt("emotionScene", 47) : 47;
        boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("halfScreen", false) : false;
        if (optString == null || optString.length() == 0) {
            this.f143443f.a("emoticonOpenBrowseVC:fail_missing arguments");
            return;
        }
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        ((com.tencent.mm.feature.emoji.c4) o6Var).oj(c17, optString, optString2, java.lang.Integer.valueOf(optInt), optBoolean);
        this.f143443f.d(false);
    }
}
