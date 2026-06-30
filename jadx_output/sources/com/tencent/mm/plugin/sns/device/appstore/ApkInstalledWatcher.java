package com.tencent.mm.plugin.sns.device.appstore;

/* loaded from: classes4.dex */
public abstract class ApkInstalledWatcher extends android.content.BroadcastReceiver {
    public abstract boolean a(android.content.Context context, java.lang.String str);

    public abstract boolean b(android.content.Context context, java.lang.String str);

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
        if (intent != null) {
            try {
                java.lang.String action = intent.getAction();
                java.lang.String str = "";
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    try {
                        str = intent.getData().getSchemeSpecificPart();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } catch (java.lang.Throwable unused) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                    if (android.text.TextUtils.isEmpty(str)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } else {
                        a(context, str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPackageAdd", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    try {
                        str = intent.getData().getSchemeSpecificPart();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } catch (java.lang.Throwable unused2) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                    if (android.text.TextUtils.isEmpty(str)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } else {
                        b(context, str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPackageRemove", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                }
            } catch (java.lang.Throwable unused3) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
    }
}
