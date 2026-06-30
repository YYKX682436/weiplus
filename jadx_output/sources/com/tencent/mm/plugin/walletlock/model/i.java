package com.tencent.mm.plugin.walletlock.model;

/* loaded from: classes9.dex */
public class i implements cu4.f {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.walletlock.model.i f181365a;

    public boolean a(android.app.Activity activity) {
        android.content.ComponentName componentName = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1).get(0).topActivity;
        java.lang.String className = componentName != null ? componentName.getClassName() : "";
        return className == null || className.equals(activity.getClass().getName()) || !className.contains("com.tencent.mm") || !(className.contains("plugin.mall") || className.contains("plugin.card") || className.contains("plugin.wallet") || className.contains("plugin.wallet_index") || className.contains("plugin.webview") || className.contains("plugin.offline") || className.contains("plugin.recharge"));
    }
}
