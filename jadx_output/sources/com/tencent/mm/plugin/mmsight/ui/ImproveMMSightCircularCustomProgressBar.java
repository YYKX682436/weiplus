package com.tencent.mm.plugin.mmsight.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/ui/ImproveMMSightCircularCustomProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ImproveMMSightCircularCustomProgressBar extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f149128d;

    /* renamed from: e, reason: collision with root package name */
    public final int f149129e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f149130f;

    /* renamed from: g, reason: collision with root package name */
    public float f149131g;

    /* renamed from: h, reason: collision with root package name */
    public float f149132h;

    /* renamed from: i, reason: collision with root package name */
    public float f149133i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f149134m;

    public ImproveMMSightCircularCustomProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149128d = android.graphics.Color.parseColor("#FFFFFF");
        this.f149129e = 102;
        this.f149134m = context;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        android.graphics.Paint paint = this.f149130f;
        if (paint != null) {
            canvas.drawCircle(width, height, this.f149133i, paint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.content.res.Resources resources;
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightCircularCustomProgressBar", "initData " + getWidth() + ", " + getHeight());
        android.content.Context context = this.f149134m;
        float dimensionPixelSize = (context == null || (resources = context.getResources()) == null) ? 0.0f : resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn);
        this.f149131g = dimensionPixelSize;
        this.f149132h = dimensionPixelSize / 2;
        this.f149133i = (getWidth() / 2.0f) - this.f149132h;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f149130f = paint;
        paint.setColor(this.f149128d);
        paint.setAlpha(this.f149129e);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f149131g);
        paint.setAntiAlias(true);
    }

    public ImproveMMSightCircularCustomProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f149128d = android.graphics.Color.parseColor("#FFFFFF");
        this.f149129e = 102;
        this.f149134m = context;
    }
}
