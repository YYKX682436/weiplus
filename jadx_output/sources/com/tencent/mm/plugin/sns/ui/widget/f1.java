package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes.dex */
public class f1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f171126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f171128c;

    public f1(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, java.lang.String str, android.widget.TextView textView) {
        this.f171126a = weImageView;
        this.f171127b = str;
        this.f171128c = textView;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f171126a;
        weImageView.setTag(com.tencent.mm.R.id.n1z, "");
        weImageView.setVisibility(8);
        com.tencent.mars.xlog.Log.e("SnsCardAdTagUtils", "onDownloadError, hash=" + weImageView.hashCode() + ", url=" + this.f171127b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f171126a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        try {
            java.lang.String str2 = (java.lang.String) weImageView.getTag(com.tencent.mm.R.id.n1z);
            java.lang.String l17 = android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId", str2);
            if (!android.text.TextUtils.isEmpty(str) && str.equals(l17)) {
                android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
                if (J2 != null) {
                    weImageView.setImageBitmap(J2);
                    weImageView.setVisibility(0);
                    android.widget.TextView textView = this.f171128c;
                    if (textView != null && (textView.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams)) {
                        ((android.widget.LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin = 0;
                    }
                    weImageView.hashCode();
                } else {
                    com.tencent.mars.xlog.Log.e("SnsCardAdTagUtils", "onDownloaded, bitmap==null");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsCardAdTagUtils", "onDownloaded, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
    }
}
