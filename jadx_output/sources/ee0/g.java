package ee0;

@j95.b
/* loaded from: classes4.dex */
public class g extends i95.w implements fe0.m3 {
    public java.lang.String Ai() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllDeviceInfoForJsapi", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        java.lang.String b17 = v34.b.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllDeviceInfoForJsapi", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        return b17;
    }

    public java.lang.String Bi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImeiWx", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        v34.b.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImeiWx", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        return "";
    }

    public java.lang.String k9() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, "com.tencent.mm.feature.sns.AdDeviceInfoService");
        java.lang.String d17 = v34.b.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, "com.tencent.mm.feature.sns.AdDeviceInfoService");
        return d17;
    }

    public java.lang.String wi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllDeviceInfo", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        java.lang.String a17 = v34.b.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllDeviceInfo", "com.tencent.mm.feature.sns.AdDeviceInfoService");
        return a17;
    }
}
