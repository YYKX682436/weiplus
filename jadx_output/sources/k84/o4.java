package k84;

/* loaded from: classes3.dex */
public class o4 implements a84.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f305170a;

    /* renamed from: b, reason: collision with root package name */
    public final int f305171b;

    public o4(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        this.f305170a = new java.lang.ref.WeakReference(adSocialAttitudeView);
        this.f305171b = i65.a.b(adSocialAttitudeView.getContext(), 16);
    }

    @Override // a84.l
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
        try {
            weakReference = this.f305170a;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("DownloadCallback", "onDownloadResult, exp=" + th6.toString());
        }
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView) weakReference.get();
        if (adSocialAttitudeView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
            return;
        }
        java.lang.Object tag = com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.j(adSocialAttitudeView).getTag(com.tencent.mm.R.id.n5q);
        if (tag instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) tag;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            java.lang.String str2 = adSocialAttitudeView.S;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            if (!android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                java.lang.String str3 = adSocialAttitudeView.S;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                if (str3.equals(str) && com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.j(adSocialAttitudeView) != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    android.graphics.drawable.Drawable drawable = adSocialAttitudeView.R;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (z17 && bitmap != null) {
                        drawable = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap);
                        int i17 = this.f305171b;
                        drawable.setBounds(0, 0, i17, i17);
                    }
                    com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.j(adSocialAttitudeView).setImageDrawable(drawable);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
    }
}
