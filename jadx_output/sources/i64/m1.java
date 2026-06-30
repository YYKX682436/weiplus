package i64;

/* loaded from: classes4.dex */
public class m1 {

    /* renamed from: c, reason: collision with root package name */
    public static final i64.m1 f289238c = new i64.m1();

    /* renamed from: a, reason: collision with root package name */
    public final lt0.l f289239a = new lt0.l(5);

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f289240b = new com.tencent.mm.sdk.platformtools.r2(10);

    public final boolean a(android.widget.ImageView imageView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView is null or filepath is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
        java.lang.String str2 = (java.lang.String) a84.y0.d(imageView, com.tencent.mm.R.id.nae);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView does not attach one url, in fillImageViewWithCache");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
        if (!str.equalsIgnoreCase(za4.t0.l("adId", str2))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsTimelineAdResourceMgr", "the bitmap file path is not same as the attachFilePath, in fillImageViewWithCache!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f289240b.get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsTimelineAdResourceMgr", "the bitmap is null or recycled!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return false;
        }
        imageView.setImageBitmap(bitmap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillImageViewWithCache", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        return true;
    }

    public android.graphics.Bitmap b(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        lt0.l lVar = this.f289239a;
        if (lVar.k(str) && (bitmap = (android.graphics.Bitmap) lVar.i(str)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimelineAdResourceMgr", "hit cache %s", str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return bitmap;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimelineAdResourceMgr", "not hit cache %s", str);
        android.graphics.Bitmap b17 = r94.a.b(str, null, 0.1f);
        if (b17 != null) {
            lVar.put(str, b17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        return b17;
    }

    public void c(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageToImageView", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        try {
            if (!a(imageView, str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimelineAdResourceMgr", "there is no cache bitmap, it should reload from flash!");
                d(imageView, str, i17);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "there is something wrong in setImageToImageView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageToImageView", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
    }

    public final void d(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView is null or filepath is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
            return;
        }
        java.lang.String str2 = (java.lang.String) a84.y0.d(imageView, com.tencent.mm.R.id.nae);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "the imageView does not attach one url");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        } else {
            if (!str.equalsIgnoreCase(za4.t0.l("adId", str2))) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsTimelineAdResourceMgr", "the bitmap file path is not same as the attachFilePath!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                return;
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            ((ku5.t0) ku5.t0.f312615d).g(new i64.l1(this, i17, width, height, str, str2, imageView));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageToImageViewInner", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
        }
    }
}
