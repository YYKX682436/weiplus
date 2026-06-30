package s34;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int f402680a;

    /* renamed from: b, reason: collision with root package name */
    public int f402681b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f402682c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f402683d;

    @za4.k1(resType = 2)
    public java.lang.String dragImagUrl;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f402684e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f402685f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f402686g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f402687h = false;

    public static android.graphics.Rect a(android.graphics.Rect rect, int i17, android.graphics.Point point) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rect2.left = c(rect.left, i17) + point.x;
        rect2.top = c(rect.top, i17) + point.y;
        rect2.right = c(rect.right, i17) + point.x;
        rect2.bottom = c(rect.bottom, i17) + point.y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return rect2;
    }

    public static int c(float f17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        int i18 = (int) ((f17 * i17) / 1280.0f);
        if (r8 - i18 > 0.001d) {
            i18++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return i18;
    }

    public static android.graphics.Rect d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            return null;
        }
        try {
            java.lang.String[] split = str.split("\\|");
            if (split != null && split.length >= 4) {
                android.graphics.Rect rect = new android.graphics.Rect();
                rect.left = java.lang.Integer.parseInt(split[0]);
                rect.top = java.lang.Integer.parseInt(split[1]);
                rect.right = java.lang.Integer.parseInt(split[2]);
                rect.bottom = java.lang.Integer.parseInt(split[3]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
                return rect;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdDragInfo", "parseRect, exp=" + e17.toString() + ", data=" + str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseRect", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return null;
    }

    public android.graphics.Bitmap b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        if (android.text.TextUtils.isEmpty(this.dragImagUrl)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            return null;
        }
        android.graphics.Bitmap bitmap = this.f402686g;
        if (bitmap != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
            return bitmap;
        }
        java.lang.String e17 = a84.m.e(this.dragImagUrl);
        if (android.text.TextUtils.isEmpty(e17) || !com.tencent.mm.vfs.w6.j(e17)) {
            com.tencent.mars.xlog.Log.i("AdDragInfo", "no cache, try download, hash=" + hashCode() + ", isDownloading=" + this.f402687h + ", url=" + this.dragImagUrl);
            if (!this.f402687h) {
                this.f402687h = true;
                a84.m.d(this.dragImagUrl, new s34.j(this));
            }
        } else {
            com.tencent.mars.xlog.Log.i("AdDragInfo", "hit local cache, hash=" + hashCode());
            ((ku5.t0) ku5.t0.f312615d).g(new s34.h(this, e17));
        }
        android.graphics.Bitmap bitmap2 = this.f402686g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo");
        return bitmap2;
    }
}
