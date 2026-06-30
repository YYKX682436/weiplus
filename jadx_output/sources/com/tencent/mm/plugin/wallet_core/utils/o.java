package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.o f180953a = new com.tencent.mm.plugin.wallet_core.utils.o();

    public final java.util.HashMap a(r45.q74 q74Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (q74Var == null) {
            return hashMap;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = q74Var.f383734d;
            boolean z17 = true;
            if (str != null) {
                if (!(str.length() > 0)) {
                    str = null;
                }
                if (str != null) {
                    jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, str);
                }
            }
            java.lang.String str2 = q74Var.f383735e;
            if (str2 != null) {
                if (!(str2.length() > 0)) {
                    str2 = null;
                }
                if (str2 != null) {
                    jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
                }
            }
            java.lang.String str3 = q74Var.f383737g;
            if (str3 != null) {
                if (str3.length() <= 0) {
                    z17 = false;
                }
                java.lang.String str4 = z17 ? str3 : null;
                if (str4 != null) {
                    jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_MIN_VERSION, str4);
                }
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            hashMap.put("LiteAppOpenInfo", r26.i0.t(jSONObject2, ",", "\";\"", false));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("KindaReporterUtils", e17, "[KindaReport] buildLiteAppOpenInfoExtMap error", new java.lang.Object[0]);
        }
        return hashMap;
    }
}
