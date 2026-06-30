package yd4;

/* loaded from: classes4.dex */
public final class d extends al5.w {

    /* renamed from: f, reason: collision with root package name */
    public boolean f461084f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f461085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.graphics.drawable.Drawable drawable, int i17) {
        super(drawable, i17);
        kotlin.jvm.internal.o.g(drawable, "drawable");
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("draw", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f18 = ((((i27 * 2) + fontMetrics.ascent) + fontMetrics.descent) / 2) - ((getDrawable().getBounds().bottom + getDrawable().getBounds().top) / 2);
        canvas.save();
        canvas.translate(f17, f18);
        getDrawable().draw(canvas);
        canvas.restore();
        this.f461085g = new android.graphics.RectF(f17, f18, getDrawable().getBounds().width() + f17, getDrawable().getBounds().height() + f18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
    }
}
