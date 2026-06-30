package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/i2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int optInt = jSONObject != null ? jSONObject.optInt("isPushing") : 0;
        int optInt2 = jSONObject != null ? jSONObject.optInt("enterScene") : 9;
        if (optInt != 0 && optInt != 1) {
            this.f143443f.a("enterEmojiStore:fail_missing arguments");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12065, java.lang.Integer.valueOf(optInt2));
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var;
        c4Var.getClass();
        qk.z zVar = new qk.z();
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e(c4Var.f66207d, "unable to get emoticon liteapp feature service");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(c17, zVar);
        }
        this.f143443f.d(false);
    }
}
