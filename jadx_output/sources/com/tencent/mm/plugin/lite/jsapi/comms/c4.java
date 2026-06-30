package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/c4;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c4 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        try {
            java.lang.String string = data.getString("messageSvrId");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            long parseLong = java.lang.Long.parseLong(string);
            java.lang.String string2 = data.getString("chatName");
            com.tencent.mm.storage.f9 l17 = pt0.f0.f358209b1.l(string2, parseLong);
            if (l17 == null) {
                throw new java.lang.IllegalStateException("msgInfo".toString());
            }
            ct.x2 x2Var = (ct.x2) i95.n0.c(ct.x2.class);
            android.content.Context c17 = c();
            kotlin.jvm.internal.o.f(c17, "getContext(...)");
            ((qg5.h2) x2Var).wi(c17, l17.getMsgId(), string2);
            this.f143442e.d();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiOpenMessageFileSource", e17.getMessage() + ": " + jz5.a.b(e17));
            this.f143442e.a();
        }
    }
}
