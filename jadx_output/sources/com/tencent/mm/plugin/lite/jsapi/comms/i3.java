package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/i3;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i3 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("biz")) : null;
        if (str == null || valueOf == null) {
            this.f143443f.a("limitedModeStatus:fail_missing arguments");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiLimitedModeStatus", "invoke: " + c());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        int intValue = valueOf.intValue();
        if (intValue == 1) {
            ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
            jSONObject2.put(ya.b.LEVEL, ((uh4.c0) i95.n0.c(uh4.c0.class)).G8());
        } else if (intValue == 2) {
            ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
            jSONObject2.put(ya.b.LEVEL, ((uh4.c0) i95.n0.c(uh4.c0.class)).hd());
        } else if (intValue == 3) {
            ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
            jSONObject2.put(ya.b.LEVEL, ((uh4.c0) i95.n0.c(uh4.c0.class)).h4());
        } else if (intValue != 12) {
            jSONObject2.put(ya.b.LEVEL, ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).isTeenMode() ? 2 : 1);
        } else {
            ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
            jSONObject2.put(ya.b.LEVEL, ((uh4.c0) i95.n0.c(uh4.c0.class)).ag());
        }
        this.f143443f.c(jSONObject2, false);
    }
}
