package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public abstract class u9 {
    public static boolean a() {
        java.lang.String p17 = com.tencent.mm.sdk.platformtools.m2.p(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        if (p17.equals("language_default")) {
            p17 = d17;
        }
        if (!p17.equals("zh_CN")) {
            return true;
        }
        if (java.util.TimeZone.getDefault().getRawOffset() != java.util.TimeZone.getTimeZone("GMT+08:00").getRawOffset()) {
            return true;
        }
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
        if (telephonyManager != null) {
            java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(networkCountryIso) && !networkCountryIso.contains("cn") && !networkCountryIso.contains("CN")) {
                return true;
            }
        }
        return false;
    }
}
