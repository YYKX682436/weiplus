package x34;

/* loaded from: classes4.dex */
public abstract class b {
    public static org.json.JSONObject a(android.content.Context context) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSysInfoInfoForWUA", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("build_version_release", android.os.Build.VERSION.RELEASE);
            jSONObject.put("build_model", wo.w0.m());
            jSONObject.put("build_version_codename", android.os.Build.VERSION.CODENAME);
            jSONObject.put("build_id", android.os.Build.ID);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenWidthBucket", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
            try {
                i17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getInteger(com.tencent.mm.R.integer.f487822p);
            } catch (java.lang.Exception unused) {
                i17 = 1;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenWidthBucket", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
            jSONObject.put("sw_size", i17);
            jSONObject.put("build_manufacturer", android.os.Build.MANUFACTURER);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVersionReleaseOrCodename", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
            java.lang.String str = android.os.Build.VERSION.RELEASE;
            try {
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    str = android.os.Build.VERSION.RELEASE_OR_CODENAME;
                }
            } catch (java.lang.Exception unused2) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVersionReleaseOrCodename", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
            jSONObject.put("build_release_or_codename", str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdDeviceInfo.ua.UserAgentUtils", "getSysInfoInfoForWUA exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSysInfoInfoForWUA", "com.tencent.mm.plugin.sns.ad.device.utils.ua.UserAgentUtils");
        return jSONObject;
    }
}
