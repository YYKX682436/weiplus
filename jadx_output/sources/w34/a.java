package w34;

/* loaded from: classes4.dex */
public abstract class a {
    public static boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_harmony_os_info_switch, 1);
            if (Ni == 0) {
                com.tencent.mars.xlog.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportHarmonyOSInfo is false");
            }
            boolean z17 = Ni == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportHarmonyOSInfo, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    public static boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportOAID", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_oaid_switch, 1);
            if (Ni == 0) {
                com.tencent.mars.xlog.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportOAID is false");
            }
            boolean z17 = Ni == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportOAID", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportOAID, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportOAID", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    public static boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportSysUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_sys_ua_switch, 1);
            if (Ni == 0) {
                com.tencent.mars.xlog.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportSysUA is false");
            }
            boolean z17 = Ni == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportSysUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportSysUA, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportSysUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    public static boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReportWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_webview_ua_build_info_switch, 0);
            if (Ni == 0) {
                com.tencent.mars.xlog.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportWebViewUABuildInfo is false");
            }
            boolean z17 = Ni == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportWebViewUABuildInfo, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReportWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    public static boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVisitDexOrODexForWebViewUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_chrome_ver_visit_dex_switch, 1);
            if (Ni == 0) {
                com.tencent.mars.xlog.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isVisitDexOrODexForWebViewUA is false");
            }
            boolean z17 = Ni == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVisitDexOrODexForWebViewUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isVisitDexOrODexForWebViewUA, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVisitDexOrODexForWebViewUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }
}
