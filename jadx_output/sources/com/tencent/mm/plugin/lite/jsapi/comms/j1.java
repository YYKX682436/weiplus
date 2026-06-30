package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/j1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String pid = jSONObject != null ? jSONObject.optString("pid") : null;
        java.lang.String detailBufStr = jSONObject != null ? jSONObject.optString("detailBufStr") : null;
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("rewardScene")) : null;
        java.lang.Integer valueOf2 = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("extranceScene")) : null;
        if (!(pid == null || pid.length() == 0)) {
            if (!(detailBufStr == null || detailBufStr.length() == 0) && valueOf2 != null) {
                com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
                android.content.Context c17 = c();
                kotlin.jvm.internal.o.f(c17, "getContext(...)");
                int intValue = valueOf2.intValue();
                com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var;
                c4Var.getClass();
                kotlin.jvm.internal.o.g(pid, "pid");
                kotlin.jvm.internal.o.g(detailBufStr, "detailBufStr");
                qk.b0 b0Var = new qk.b0(pid);
                b0Var.f364155a = intValue;
                b0Var.f364190g = valueOf != null ? valueOf.intValue() : 1;
                com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                if (p6Var == null) {
                    com.tencent.mars.xlog.Log.e(c4Var.f66207d, "unable to get emoticon liteapp feature service");
                } else {
                    ((com.tencent.mm.feature.emoji.f4) p6Var).wi(c17, b0Var);
                }
                this.f143443f.d(false);
                return;
            }
        }
        this.f143443f.a("emoticonOpenStoreBegReward:fail_missing arguments");
    }
}
