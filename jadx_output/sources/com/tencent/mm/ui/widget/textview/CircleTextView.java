package com.tencent.mm.ui.widget.textview;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006R*\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/tencent/mm/ui/widget/textview/CircleTextView;", "Landroid/view/View;", "", "color", "Ljz5/f0;", "setTextColor", "", "textSize", "setTextSize", "alpha", "setTextAlpha", "startAngle", "setStartAngle", "getStartAngle", "textRadius", "setTextRadius", "getTextRadius", "", "value", "h", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CircleTextView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f212517d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f212518e;

    /* renamed from: f, reason: collision with root package name */
    public float f212519f;

    /* renamed from: g, reason: collision with root package name */
    public float f212520g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public java.lang.String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(-16777216);
        paint.setTextSize(17.0f);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f212517d = paint;
        this.f212518e = new android.graphics.Path();
        this.f212520g = 270.0f;
        this.text = "";
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463096c);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            paint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(3, 0));
            paint.setColor(obtainStyledAttributes.getColor(1, -16777216));
            this.f212519f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.f212520g = obtainStyledAttributes.getFloat(4, 270.0f);
            setText(java.lang.String.valueOf(obtainStyledAttributes.getString(0)));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: getStartAngle, reason: from getter */
    public final float getF212520g() {
        return this.f212520g;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: getTextRadius, reason: from getter */
    public final float getF212519f() {
        return this.f212519f;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f212517d;
        float measureText = paint.measureText(this.text);
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f17 = this.f212519f - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f);
        android.graphics.Path path = this.f212518e;
        path.reset();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, f17, android.graphics.Path.Direction.CW);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(0.8f);
        canvas.drawTextOnPath(this.text, path, ((new android.graphics.PathMeasure(path, false).getLength() * this.f212520g) / 360.0f) - (measureText / 2.0f), 0.0f, paint);
    }

    public final void setStartAngle(float f17) {
        this.f212520g = f17;
        invalidate();
    }

    public final void setText(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.text = value;
        invalidate();
    }

    public final void setTextAlpha(float f17) {
        this.f212517d.setAlpha((int) (f17 * 255));
        invalidate();
    }

    public final void setTextColor(int i17) {
        this.f212517d.setColor(i17);
        invalidate();
    }

    public final void setTextRadius(float f17) {
        if (this.f212519f == f17) {
            return;
        }
        this.f212519f = f17;
        invalidate();
    }

    public final void setTextSize(float f17) {
        this.f212517d.setTextSize(f17);
        invalidate();
    }
}
