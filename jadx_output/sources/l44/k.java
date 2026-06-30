package l44;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static long f316211a;

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkWriteGiftCodeAndShowTip", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
        if (!android.text.TextUtils.isEmpty(str)) {
            c(str);
            if (!android.text.TextUtils.isEmpty(str2)) {
                long j17 = f316211a;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (java.lang.System.currentTimeMillis() - j17 > 1500) {
                    f316211a = java.lang.System.currentTimeMillis();
                    com.tencent.mm.sdk.platformtools.u3.i(new l44.j(context, str2), 800L);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWriteGiftCodeAndShowTip", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeDelayDeepLink", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeDelayDeepLink", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("wx_ad_pkgname", str);
            jSONObject.put("wx_ad_deeplink", str2);
            com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, "wx_ad_deeplink", jSONObject.toString(), null);
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeDelayDeepLink", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
    }

    public static void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeGiftCode", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeGiftCode", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, "wx_ad_giftcode", str, null);
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeGiftCode", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
    }
}
