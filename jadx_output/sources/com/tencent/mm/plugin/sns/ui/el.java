package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class el implements a84.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f168250a;

    /* renamed from: b, reason: collision with root package name */
    public final int f168251b;

    public el(com.tencent.mm.plugin.sns.ui.SnsLikesTextView snsLikesTextView) {
        this.f168250a = new java.lang.ref.WeakReference(snsLikesTextView);
        this.f168251b = i65.a.b(snsLikesTextView.getContext(), 16);
    }

    @Override // a84.l
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
        try {
            weakReference = this.f168250a;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsLikesTextView", "onDownloadResult, exp=" + th6.toString());
        }
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
            return;
        }
        com.tencent.mm.plugin.sns.ui.SnsLikesTextView snsLikesTextView = (com.tencent.mm.plugin.sns.ui.SnsLikesTextView) weakReference.get();
        if (snsLikesTextView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = snsLikesTextView.f167246m;
        java.lang.Object tag = snsLikesTextView.f167245i.getTag(com.tencent.mm.R.id.n5q);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        java.lang.String str = snsLikesTextView.f167256w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        if (tag instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) tag;
            if (!android.text.TextUtils.isEmpty(str) && str.equals(str2) && spannableStringBuilder != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                android.graphics.drawable.Drawable drawable = snsLikesTextView.f167255v;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                if (z17 && bitmap != null) {
                    drawable = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap);
                    int i17 = this.f168251b;
                    drawable.setBounds(0, 0, i17, i17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                    snsLikesTextView.f167257x = drawable;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                }
                spannableStringBuilder.setSpan(new al5.w(drawable, 1), 0, 1, 33);
                snsLikesTextView.f167245i.setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLikesTextView", "onDownloadResult, set likeicon " + str2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
    }
}
