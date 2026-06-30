package v84;

/* loaded from: classes4.dex */
public abstract class a extends v84.c {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f434083f;

    public a(android.content.Context context, android.widget.FrameLayout frameLayout, v84.b bVar) {
        super(context, bVar);
        this.f434083f = frameLayout;
        b();
    }

    @Override // v84.c
    public void a(android.graphics.Rect rect) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
        android.widget.ImageView imageView = new android.widget.ImageView(this.f434094d);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        int abs = java.lang.Math.abs(rect.right - rect.left);
        int abs2 = java.lang.Math.abs(rect.top - rect.bottom);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(abs, abs2);
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        imageView.setImageBitmap(this.f434091a.f434084a);
        this.f434083f.addView(imageView, layoutParams);
        f(imageView, (abs / 2) + rect.left, rect.top + (abs2 / 2), abs, abs2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
    }

    @Override // v84.c
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
        synchronized (this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            this.f434095e.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        }
        this.f434083f.removeAllViews();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
    }

    public abstract void f(android.view.View view, int i17, int i18, int i19, int i27);
}
