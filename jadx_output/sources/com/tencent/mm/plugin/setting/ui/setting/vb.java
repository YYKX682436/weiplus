package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class vb {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.vb f161639a = new com.tencent.mm.plugin.setting.ui.setting.vb();

    /* renamed from: b, reason: collision with root package name */
    public static long f161640b;

    public final java.lang.String a() {
        if (b()) {
            return "0";
        }
        java.lang.String valueOf = java.lang.String.valueOf(30 - ((java.lang.System.currentTimeMillis() / 1000) - f161640b));
        com.tencent.mm.opensdk.utils.Log.i("SettingsFingerprintVerifyFailedTime", "[fingerprint login] getTimeRemaining time is " + f161640b + ",time is " + valueOf);
        return valueOf;
    }

    public final boolean b() {
        return f161640b == 0 || (java.lang.System.currentTimeMillis() / ((long) 1000)) - f161640b > 30;
    }
}
