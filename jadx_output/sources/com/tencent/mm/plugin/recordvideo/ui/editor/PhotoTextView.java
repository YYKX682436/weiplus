package com.tencent.mm.plugin.recordvideo.ui.editor;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/PhotoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "color", "Ljz5/f0;", "setTextBackground", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PhotoTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public int f156070g;

    /* renamed from: h, reason: collision with root package name */
    public final float f156071h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Path f156072i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f156073m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f156074n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f156072i = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f156073m = paint;
        this.f156074n = new android.graphics.RectF();
        this.f156071h = i65.a.b(context, 12);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.f156070g != 0) {
            java.lang.CharSequence text = getText();
            if (!(text == null || text.length() == 0)) {
                android.graphics.Paint paint = this.f156073m;
                paint.setColor(this.f156070g);
                float f17 = this.f156071h;
                float f18 = 2 * f17;
                android.graphics.Path path = this.f156072i;
                path.reset();
                if (getLineCount() != 0) {
                    float lineBottom = getLayout().getLineBottom(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
                    int lineCount = getLineCount();
                    android.graphics.RectF rectF = this.f156074n;
                    if (lineCount == 1) {
                        rectF.set(0.0f, 0.0f, getLayout().getLineWidth(0) + getPaddingLeft() + getPaddingRight(), lineBottom);
                        path.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CW);
                    } else {
                        float measuredWidth = getMeasuredWidth();
                        float lineWidth = getLayout().getLineWidth(getLineCount() - 1);
                        float f19 = measuredWidth - f18;
                        if (lineWidth >= (f19 - getPaddingLeft()) - getPaddingRight()) {
                            rectF.set(0.0f, 0.0f, measuredWidth, lineBottom);
                            path.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CW);
                        } else {
                            float lineTop = getLayout().getLineTop(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
                            float paddingRight = lineWidth + getPaddingRight() + getPaddingLeft();
                            path.moveTo(0.0f, f17);
                            rectF.set(0.0f, 0.0f, f18, f18);
                            path.arcTo(rectF, 180.0f, 90.0f);
                            path.lineTo(f19, 0.0f);
                            rectF.set(f19, 0.0f, measuredWidth, f18);
                            path.arcTo(rectF, 270.0f, 90.0f);
                            path.lineTo(measuredWidth, lineTop - f17);
                            rectF.set(f19, lineTop - f18, measuredWidth, lineTop);
                            path.arcTo(rectF, 0.0f, 90.0f);
                            path.lineTo(paddingRight + f17, lineTop);
                            rectF.set(paddingRight, lineTop, paddingRight + f18, lineTop + f18);
                            path.arcTo(rectF, 270.0f, -90.0f);
                            path.lineTo(paddingRight, lineBottom - f17);
                            float f27 = lineBottom - f18;
                            rectF.set(paddingRight - f18, f27, paddingRight, lineBottom);
                            path.arcTo(rectF, 0.0f, 90.0f);
                            path.lineTo(f17, lineBottom);
                            rectF.set(0.0f, f27, f18, lineBottom);
                            path.arcTo(rectF, 90.0f, 90.0f);
                            path.lineTo(0.0f, f17);
                        }
                    }
                    path.close();
                    canvas.drawPath(path, paint);
                }
            }
        }
        super.onDraw(canvas);
    }

    public final void setTextBackground(int i17) {
        this.f156070g = i17;
        invalidate();
    }
}
