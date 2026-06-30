package k84;

/* loaded from: classes4.dex */
public final class r4 {
    public r4(kotlin.jvm.internal.i iVar) {
    }

    public static final boolean a(k84.r4 r4Var, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
        r4Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
        int i17 = android.os.Build.VERSION.SDK_INT;
        boolean z17 = true;
        if (i17 <= 28) {
            com.tencent.mars.xlog.Log.i("AdSocialPatComponent", "isWeakDevice is true, for os version, sdk is " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
        } else {
            int[] c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(context);
            if (c17[0] * c17[1] <= 921600) {
                com.tencent.mars.xlog.Log.i("AdSocialPatComponent", "isWeakDevice is true, for screen size, screenWidth is " + c17[0] + ", screenHeight is " + c17[1]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
            } else {
                com.tencent.mars.xlog.Log.i("AdSocialPatComponent", "isWeakDevice, ret is false");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
                z17 = false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
        return z17;
    }
}
