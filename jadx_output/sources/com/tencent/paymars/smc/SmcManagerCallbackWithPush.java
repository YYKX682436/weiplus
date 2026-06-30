package com.tencent.paymars.smc;

/* loaded from: classes12.dex */
public class SmcManagerCallbackWithPush implements com.tencent.paymars.smc.SmcManager.CallBack {
    private static final java.lang.String TAG = "MicroMsg.SmcManagerCallbackWithPush";
    private android.content.Context context;
    private com.tencent.mm.plugin.report.service.IKVReportNotify kvReportNotify = null;

    public SmcManagerCallbackWithPush(android.content.Context context) {
        this.context = context;
    }

    private java.lang.String getAppFilePath() {
        if (this.context == null) {
            return null;
        }
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.context.getFilesDir().getPath() + "/pay");
            if (!r6Var.m()) {
                r6Var.J();
            }
            return r6Var.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.tencent.paymars.smc.SmcManager.CallBack
    public java.lang.String getKVCommPath() {
        java.lang.String str = getAppFilePath() + "/kvcomm-push/";
        com.tencent.mars.xlog.Log.i(TAG, "[TEST-PATH (Smc)]path:" + getAppFilePath());
        return str;
    }

    @Override // com.tencent.paymars.smc.SmcManager.CallBack
    public com.tencent.paymars.smc.SmcManager.BaseInfo getKVCommReqBaseInfo() {
        com.tencent.paymars.smc.SmcManager.BaseInfo baseInfo = new com.tencent.paymars.smc.SmcManager.BaseInfo();
        baseInfo.deviceModel = wo.w0.m() + android.os.Build.CPU_ABI;
        baseInfo.deviceBrand = android.os.Build.BRAND;
        baseInfo.osName = "android-" + android.os.Build.MANUFACTURER;
        baseInfo.osVersion = "" + android.os.Build.VERSION.SDK_INT;
        baseInfo.languageVer = com.tencent.mm.sdk.platformtools.m2.d();
        return baseInfo;
    }

    @Override // com.tencent.paymars.smc.SmcManager.CallBack
    public int getSingleReportBufSizeB() {
        return 20480;
    }

    @Override // com.tencent.paymars.smc.SmcManager.CallBack
    public void onReportDataReady(byte[] bArr, byte[] bArr2, int i17, java.lang.String str) {
        try {
            com.tencent.mm.plugin.report.service.IKVReportNotify iKVReportNotify = this.kvReportNotify;
            if (iKVReportNotify == null || bArr2 == null || bArr2.length <= 0) {
                return;
            }
            iKVReportNotify.onReportKVDataReady(bArr, bArr2, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("KVReportJni", e17.getMessage());
        }
    }

    @Override // com.tencent.paymars.smc.SmcManager.CallBack
    public boolean onRequestGetStrategy(byte[] bArr, int i17) {
        try {
            if (com.tencent.mm.sdk.platformtools.a0.f192447j && com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("gprs_alert", true)) {
                com.tencent.mars.xlog.Log.i(TAG, "onRequestGetStrategy gprs alert return false");
                return false;
            }
            synchronized (this) {
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("KVReportJni", "onRequestGetStrategy error: " + e17.getMessage());
            return false;
        }
    }

    @Override // com.tencent.paymars.smc.SmcManager.CallBack
    public boolean onSelfMonitorOpLogReady(byte[] bArr) {
        if (!gm0.j1.b().n()) {
            com.tencent.mars.xlog.Log.e(TAG, "onReportKVDaSelfMonitorOpLogReady account not ready");
            return false;
        }
        try {
            p45.k kVar = new p45.k();
            kVar.parseFrom(bArr);
            if (com.tencent.paymars.smc.SmcProtoBufUtil.toMMSelfMonitor(kVar).f392453d <= 0) {
                com.tencent.mars.xlog.Log.e("KVReportJni", "error selfmonitor count");
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("KVReportJni", e17.getMessage());
            return false;
        }
    }

    @Override // com.tencent.paymars.smc.SmcManager.CallBack
    public void parseKVPluginMsg(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w(TAG, "msg content is null");
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "receive msg: " + str);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
        if (d17 == null || d17.size() == 0) {
            com.tencent.mars.xlog.Log.e(TAG, "plugin msg parse fail:" + str);
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.$type");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str2.equalsIgnoreCase("getkvidkeystg")) {
            com.tencent.mars.xlog.Log.e(TAG, "plugin msg parse fail:" + str);
            return;
        }
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.generalversion"), -1L);
        long V2 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.specialversion"), -1L);
        long V3 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.whiteorblackuinversion"), -1L);
        long V4 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.timeinterval"), -1L);
        long V5 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.kvgeneralversion"), -1L);
        long V6 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.kvspecialversion"), -1L);
        long V7 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.kvwhiteorblackuinversion"), -1L);
        if (V == -1 || V2 == -1 || V3 == -1 || V4 == -1 || -1 == V5 || -1 == V6 || -1 == V7) {
            com.tencent.mars.xlog.Log.e(TAG, "plugin msg parse fail:" + str);
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "plugin msg version:" + V + ", " + V2 + ", " + V3);
        ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.smc.SmcManager.class)).OnPluginMsg(V5, V6, V7, V, V2, V4);
    }

    public void setKvReportNotify(com.tencent.mm.plugin.report.service.IKVReportNotify iKVReportNotify) {
        this.kvReportNotify = iKVReportNotify;
    }
}
