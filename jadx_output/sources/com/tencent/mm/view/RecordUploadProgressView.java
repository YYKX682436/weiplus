package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006 "}, d2 = {"Lcom/tencent/mm/view/RecordUploadProgressView;", "Landroid/view/View;", "Landroid/graphics/Paint;", "d", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "paint", "", "e", "I", "getProgress", "()I", "setProgress", "(I)V", "progress", "f", "getBackColor", "setBackColor", "backColor", "g", "getForeColor", "setForeColor", "foreColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-selectcontact_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RecordUploadProgressView extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.graphics.Paint paint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int progress;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int backColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int foreColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordUploadProgressView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        setPaint(new android.graphics.Paint());
        getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        getPaint().setStrokeWidth(getResources().getDimension(com.tencent.mm.R.dimen.a9l));
        getPaint().setAntiAlias(true);
        this.backColor = getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1);
        this.foreColor = getResources().getColor(com.tencent.mm.R.color.Brand_100);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.draw(canvas);
        int width = getWidth() / 2;
        float f17 = width;
        int strokeWidth = (int) (f17 - (getPaint().getStrokeWidth() / 2));
        getPaint().setColor(this.backColor);
        getPaint().setAntiAlias(true);
        getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        canvas.drawCircle(f17, f17, strokeWidth, getPaint());
        getPaint().setColor(this.foreColor);
        float f18 = width - strokeWidth;
        float f19 = width + strokeWidth;
        canvas.drawArc(new android.graphics.RectF(f18, f18, f19, f19), -90.0f, (this.progress * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 100.0f, false, getPaint());
    }

    public final int getBackColor() {
        return this.backColor;
    }

    public final int getForeColor() {
        return this.foreColor;
    }

    public final android.graphics.Paint getPaint() {
        android.graphics.Paint paint = this.paint;
        if (paint != null) {
            return paint;
        }
        kotlin.jvm.internal.o.o("paint");
        throw null;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final void setBackColor(int i17) {
        this.backColor = i17;
    }

    public final void setForeColor(int i17) {
        this.foreColor = i17;
    }

    public final void setPaint(android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(paint, "<set-?>");
        this.paint = paint;
    }

    public final void setProgress(int i17) {
        this.progress = i17;
    }
}
