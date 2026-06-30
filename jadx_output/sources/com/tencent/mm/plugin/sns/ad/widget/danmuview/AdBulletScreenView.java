package com.tencent.mm.plugin.sns.ad.widget.danmuview;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenView;", "Landroid/widget/FrameLayout;", "Ls34/c;", "bulletInfo", "Ljz5/f0;", "setBulletScreenInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "r84/d", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdBulletScreenView extends android.widget.FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f163544t = 0;

    /* renamed from: d, reason: collision with root package name */
    public s34.c f163545d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView f163546e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f163547f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f163548g;

    /* renamed from: h, reason: collision with root package name */
    public final int f163549h;

    /* renamed from: i, reason: collision with root package name */
    public final int f163550i;

    /* renamed from: m, reason: collision with root package name */
    public final int f163551m;

    /* renamed from: n, reason: collision with root package name */
    public final r84.f f163552n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f163553o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f163554p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f163555q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f163556r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Paint f163557s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdBulletScreenView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDrawableBitmap", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        try {
            drawable.setBounds(0, 0, getWidth(), i17);
            int width = getWidth();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenView", "getDrawableBitmap", "(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenView", "getDrawableBitmap", "(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            drawable.draw(new android.graphics.Canvas(createBitmap));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDrawableBitmap", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
            return createBitmap;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdBulletScreenView", "getDrawableBitmap, exp=", th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDrawableBitmap", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        try {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.dispatchDraw(canvas);
            if (getHeight() != 0) {
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if ((layoutParams != null && getHeight() == layoutParams.height) && (this.f163555q == null || this.f163556r == null)) {
                    com.tencent.mars.xlog.Log.i("AdBulletScreenView", "init mask bitmap");
                    this.f163555q = a(this.f163553o, (int) (getHeight() * 0.12f));
                    this.f163556r = a(this.f163554p, (int) (getHeight() * 0.36f));
                }
            }
            android.graphics.Bitmap bitmap = this.f163555q;
            android.graphics.Paint paint = this.f163557s;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            android.graphics.Bitmap bitmap2 = this.f163555q;
            float height = bitmap2 != null ? bitmap2.getHeight() : 0;
            android.graphics.Bitmap bitmap3 = this.f163556r;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, 0.0f, height, paint);
            }
            canvas.restoreToCount(saveLayer);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdBulletScreenView", "dispatchDraw, exp=", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("AdBulletScreenView", "onDetachedFromWindow");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.tencent.mars.xlog.Log.i("AdBulletScreenView", "stopAnim");
        this.f163548g = false;
        this.f163547f = true;
        this.f163552n.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
    }

    public final void setBulletScreenInfo(s34.c bulletInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBulletScreenInfo", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        kotlin.jvm.internal.o.g(bulletInfo, "bulletInfo");
        this.f163545d = bulletInfo;
        int a17 = bulletInfo.a();
        int i17 = this.f163549h;
        int i18 = this.f163551m;
        int i19 = (a17 * (i17 + i18)) - i18;
        com.tencent.mars.xlog.Log.i("AdBulletScreenView", "setBulletScreenInfo, vH=" + i19 + ", laoutParams.h=" + getLayoutParams().height);
        if (getLayoutParams().height != i19) {
            getLayoutParams().height = i19;
            this.f163555q = null;
            this.f163556r = null;
            requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.tencent.mars.xlog.Log.i("AdBulletScreenView", "stopAnim");
        this.f163548g = false;
        this.f163547f = true;
        this.f163552n.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView adBulletScreenRecyclerView = this.f163546e;
        if (adBulletScreenRecyclerView != null) {
            adBulletScreenRecyclerView.setAdapter(new r84.d(bulletInfo, i17, this.f163550i, i18));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBulletScreenInfo", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdBulletScreenView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163549h = ca4.m0.s(25);
        this.f163550i = ca4.m0.s(100);
        this.f163551m = ca4.m0.s(3);
        this.f163552n = new r84.f(this, android.os.Looper.getMainLooper());
        this.f163553o = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.parseColor("#00FFFFFF"), android.graphics.Color.parseColor("#00FFFFFF")});
        this.f163554p = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.parseColor("#00FFFFFF"), android.graphics.Color.parseColor("#FFFFFFFF")});
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        this.f163557s = paint;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView adBulletScreenRecyclerView = new com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView(context, null);
        adBulletScreenRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
        this.f163546e = adBulletScreenRecyclerView;
        addView(adBulletScreenRecyclerView, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
    }
}
