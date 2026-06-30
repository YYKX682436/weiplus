package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/i1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String lensId = jSONObject != null ? jSONObject.optString("lensId") : null;
        if (lensId == null || lensId.length() == 0) {
            this.f143443f.a("emoticonOpenSelfie:fail_missing arguments");
            return;
        }
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        ((com.tencent.mm.feature.emoji.c4) o6Var).getClass();
        kotlin.jvm.internal.o.g(lensId, "lensId");
        o22.i.d(c17, null, 1111, 0, lensId, "");
        this.f143443f.d(false);
    }
}
