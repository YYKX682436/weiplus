package qe;

/* loaded from: classes7.dex */
public class t0 implements com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener {
    public t0(qe.d1 d1Var) {
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener
    public int getNetworkType() {
        try {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "getStatisticsNetType ret:%d", java.lang.Integer.valueOf(netType));
            if (netType == -1) {
                return -1;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                return 3;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                return 4;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                return 5;
            }
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(netType)) {
                return 1;
            }
            return com.tencent.mars.comm.NetStatusUtil.isWap(netType) ? 2 : 6;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WcWssNativeInstallHelper", e17, "getStatisticsNetType_", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener
    public void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < iArr.length; i17++) {
            arrayList.add(new com.tencent.mars.smc.IDKey(iArr[i17], iArr2[i17], iArr3[i17]));
        }
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener
    public void onKvStat(int i17, java.lang.String str) {
        ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true))).b(i17, str);
    }
}
