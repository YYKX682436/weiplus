package i84;

/* loaded from: classes4.dex */
public final class b extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f289651d;

    public b(android.content.Context context) {
        super(context);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        this.f289651d = paint;
    }

    public final android.graphics.Paint getP() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getP", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        android.graphics.Paint paint = this.f289651d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getP", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        return paint;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(0.0f, 0.0f, getHeight(), getHeight(), 0.0f, 360.0f, false, this.f289651d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
    }

    public final void setColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setColor", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        this.f289651d.setColor(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setColor", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
    }
}
