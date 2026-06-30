package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class v implements a84.y {
    public void a(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$23");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        synchronized (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pubBitmapToCache", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (!android.text.TextUtils.isEmpty(str) && bitmap != null && !bitmap.isRecycled()) {
                ((kk.l) com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.W).j(str, bitmap);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pubBitmapToCache", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3900", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$23");
    }
}
