package i84;

/* loaded from: classes10.dex */
public final class a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f289647d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f289648e;

    /* renamed from: f, reason: collision with root package name */
    public final float f289649f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f289650g;

    public a(android.content.Context context, float f17, int i17) {
        super(context);
        android.view.Display defaultDisplay;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f289648e = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(i17);
        paint.setStrokeWidth(f17);
        java.lang.Object systemService = context != null ? context.getSystemService("window") : null;
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        float refreshRate = (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 60.0f : defaultDisplay.getRefreshRate();
        this.f289649f = refreshRate >= 30.0f ? refreshRate : 60.0f;
    }

    public final float getCurrentFPS() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentFPS", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentFPS", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        return this.f289649f;
    }

    public final android.graphics.Paint getPaint() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPaint", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        android.graphics.Paint paint = this.f289648e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPaint", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        return paint;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f289648e;
        float strokeWidth = paint.getStrokeWidth();
        int width = getWidth();
        int height = getHeight();
        if (this.f289650g) {
            float f17 = strokeWidth + 0.0f;
            canvas.drawArc(f17, f17, width - strokeWidth, height - strokeWidth, this.f289647d + 270, 330.0f, false, paint);
            this.f289647d = (this.f289647d + (180.0f / this.f289649f)) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            invalidate();
        } else {
            float f18 = strokeWidth + 0.0f;
            canvas.drawArc(f18, f18, width - strokeWidth, height - strokeWidth, 0.0f, 360.0f, false, paint);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
    }

    public final void setLoading(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
        this.f289650g = z17;
        invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLoading", "com.tencent.mm.plugin.sns.ad.widget.admedia.PlayActionButton$AnimCircleView");
    }
}
