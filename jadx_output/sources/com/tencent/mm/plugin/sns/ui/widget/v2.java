package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class v2 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f171285b;

    public v2(java.lang.String str, android.widget.ImageView imageView) {
        this.f171284a = str;
        this.f171285b = imageView;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
        com.tencent.mars.xlog.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater onDownloadError, url=" + this.f171284a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.graphics.Bitmap b17;
        android.widget.ImageView imageView = this.f171285b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
        try {
            com.tencent.mars.xlog.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater onDownloadedSucc, url=" + this.f171284a);
            java.lang.String str2 = (java.lang.String) imageView.getTag(com.tencent.mm.R.id.nae);
            java.lang.String l17 = android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId", str2);
            if (!android.text.TextUtils.isEmpty(str) && str.equals(l17) && (b17 = i64.m1.f289238c.b(str)) != null) {
                imageView.setImageBitmap(b17);
                com.tencent.mars.xlog.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater setImageBitmap");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsCommentUtil", "trySetAdBossCommentAvater, download decode, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
    }
}
