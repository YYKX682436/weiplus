package com.tencent.mm.plugin.lite.dynamic_module;

/* loaded from: classes7.dex */
public class LiteAppModuleWx extends bd.d {
    private static final java.lang.String TAG = "LiteAppModuleWx";

    @bd.c(uiThread = false)
    public org.json.JSONObject getAccountInfo() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str) || "CN".equalsIgnoreCase(str));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isRegInChina", valueOf);
        return new org.json.JSONObject(hashMap);
    }

    @bd.c(uiThread = false)
    public boolean isCNPayWalletRegion() {
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, -1)).intValue();
        return intValue == 0 || intValue == 1;
    }
}
