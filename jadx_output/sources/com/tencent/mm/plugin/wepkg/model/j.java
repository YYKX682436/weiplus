package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public abstract class j {
    public static void a(com.tencent.mm.plugin.wepkg.model.k kVar) {
        java.lang.String str;
        if (x51.o1.V) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterLiteAppManager", "updateLiteAppInfo, but ignoreGameLiteCheck, patchId: ", kVar.f188433c);
            return;
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo Bj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(kVar.f188431a);
        if (Bj != null && (str = Bj.patchId) != null && str.equals(kVar.f188433c)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterLiteAppManager", "updateLiteAppInfo, patchId is same : ", kVar.f188433c);
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = new com.tencent.liteapp.storage.WxaLiteAppInfo();
        wxaLiteAppInfo.appId = kVar.f188431a;
        wxaLiteAppInfo.patchId = kVar.f188433c;
        wxaLiteAppInfo.path = kVar.f188434d;
        wxaLiteAppInfo.signatureKey = kVar.f188432b;
        wxaLiteAppInfo.type = "release";
        wxaLiteAppInfo.updateTime = java.lang.System.currentTimeMillis() / 1000;
        wxaLiteAppInfo.version = com.tencent.mm.plugin.lite.LiteAppCenter.getLiteAppVersion(kVar.f188434d, kVar.f188431a, kVar.f188432b);
        wxaLiteAppInfo.groupId = "game";
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        try {
            com.tencent.mm.plugin.lite.logic.g1.s().V(wxaLiteAppInfo);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppFeatureService", e17, "", new java.lang.Object[0]);
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.lang.String str2 = wxaLiteAppInfo.appId;
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        try {
            com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().mergeConfig(str2);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppFeatureService", e18, "", new java.lang.Object[0]);
        }
    }
}
