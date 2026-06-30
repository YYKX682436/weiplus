package com.tencent.mm.plugin.mmsight.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/ui/ImproveMMSightCircularProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ImproveMMSightCircularProgressBar extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f149135d;

    /* renamed from: e, reason: collision with root package name */
    public final int f149136e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f149137f;

    /* renamed from: g, reason: collision with root package name */
    public float f149138g;

    /* renamed from: h, reason: collision with root package name */
    public float f149139h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f149140i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.b2 f149141m;

    /* renamed from: n, reason: collision with root package name */
    public float f149142n;

    /* renamed from: o, reason: collision with root package name */
    public float f149143o;

    /* renamed from: p, reason: collision with root package name */
    public float f149144p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f149145q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.q f149146r;

    public ImproveMMSightCircularProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149135d = android.graphics.Color.parseColor("#07C160");
        this.f149136e = 255;
        this.f149140i = new android.graphics.RectF();
        this.f149143o = 100.0f;
        this.f149145q = context;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Paint paint = this.f149137f;
        if (paint != null) {
            canvas.drawArc(this.f149140i, -90.0f, (this.f149142n / this.f149143o) * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1, false, paint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.content.res.Resources resources;
        super.onLayout(z17, i17, i18, i19, i27);
        android.content.Context context = this.f149145q;
        float dimensionPixelSize = (context == null || (resources = context.getResources()) == null) ? 0.0f : resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn);
        this.f149138g = dimensionPixelSize;
        float f17 = dimensionPixelSize / 2;
        this.f149139h = f17;
        android.graphics.RectF rectF = this.f149140i;
        rectF.top = f17;
        rectF.left = f17;
        rectF.right = getWidth() - this.f149139h;
        rectF.bottom = getHeight() - this.f149139h;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f149137f = paint;
        paint.setColor(this.f149135d);
        paint.setAlpha(this.f149136e);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f149138g);
        paint.setAntiAlias(true);
    }

    public ImproveMMSightCircularProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f149135d = android.graphics.Color.parseColor("#07C160");
        this.f149136e = 255;
        this.f149140i = new android.graphics.RectF();
        this.f149143o = 100.0f;
        this.f149145q = context;
    }
}
