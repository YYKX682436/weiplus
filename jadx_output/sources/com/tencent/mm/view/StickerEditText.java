package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/view/StickerEditText;", "Lcom/tencent/mm/view/PhotoEditText;", "", "maxLength", "Ljz5/f0;", "setupInputFilter", "color", "setTextBackground", "", "getRoundRectRadius", "alpha", "setBgColorAlpha", "limit", "setLineBreakCountLimit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-photoedit-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StickerEditText extends com.tencent.mm.view.PhotoEditText {

    /* renamed from: i, reason: collision with root package name */
    public int f213495i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Path f213496m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f213497n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.RectF f213498o;

    /* renamed from: p, reason: collision with root package name */
    public android.text.TextWatcher f213499p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213495i = -1;
        this.f213496m = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f213497n = paint;
        this.f213498o = new android.graphics.RectF();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    private final void setupInputFilter(int i17) {
        if (i17 > 0) {
            setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
        }
    }

    @Override // com.tencent.mm.view.PhotoEditText
    public void c(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float roundRectRadius = getRoundRectRadius();
        android.graphics.Paint paint = this.f213497n;
        paint.setColor(this.f213376f);
        float f17 = 2 * roundRectRadius;
        android.graphics.Path path = this.f213496m;
        path.reset();
        if (getLineCount() == 0) {
            return;
        }
        float lineBottom = getLayout().getLineBottom(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
        int lineCount = getLineCount();
        android.graphics.RectF rectF = this.f213498o;
        if (lineCount == 1) {
            rectF.set(0.0f, 0.0f, getLayout().getLineWidth(0) + getPaddingLeft() + getPaddingRight(), lineBottom);
            path.addRoundRect(rectF, roundRectRadius, roundRectRadius, android.graphics.Path.Direction.CW);
        } else {
            float measuredWidth = getMeasuredWidth();
            float lineWidth = getLayout().getLineWidth(getLineCount() - 1);
            float f18 = measuredWidth - f17;
            if (lineWidth >= (f18 - getPaddingLeft()) - getPaddingRight()) {
                rectF.set(0.0f, 0.0f, measuredWidth, lineBottom);
                path.addRoundRect(rectF, roundRectRadius, roundRectRadius, android.graphics.Path.Direction.CW);
            } else {
                float lineTop = getLayout().getLineTop(getLineCount() - 1) + getPaddingTop() + getPaddingBottom();
                float paddingRight = lineWidth + getPaddingRight() + getPaddingLeft();
                path.moveTo(0.0f, roundRectRadius);
                rectF.set(0.0f, 0.0f, f17, f17);
                path.arcTo(rectF, 180.0f, 90.0f);
                path.lineTo(f18, 0.0f);
                rectF.set(f18, 0.0f, measuredWidth, f17);
                path.arcTo(rectF, 270.0f, 90.0f);
                path.lineTo(measuredWidth, lineTop - roundRectRadius);
                rectF.set(f18, lineTop - f17, measuredWidth, lineTop);
                path.arcTo(rectF, 0.0f, 90.0f);
                path.lineTo(paddingRight + roundRectRadius, lineTop);
                rectF.set(paddingRight, lineTop, paddingRight + f17, lineTop + f17);
                path.arcTo(rectF, 270.0f, -90.0f);
                path.lineTo(paddingRight, lineBottom - roundRectRadius);
                float f19 = lineBottom - f17;
                rectF.set(paddingRight - f17, f19, paddingRight, lineBottom);
                path.arcTo(rectF, 0.0f, 90.0f);
                path.lineTo(roundRectRadius, lineBottom);
                rectF.set(0.0f, f19, f17, lineBottom);
                path.arcTo(rectF, 90.0f, 90.0f);
                path.lineTo(0.0f, roundRectRadius);
            }
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    public final void d(int i17) {
        setupInputFilter(i17);
    }

    public final float getRoundRectRadius() {
        return i65.a.b(getContext(), 8);
    }

    public final void setBgColorAlpha(int i17) {
        this.f213495i = i17;
    }

    public final void setLineBreakCountLimit(int i17) {
        android.text.TextWatcher textWatcher = this.f213499p;
        if (textWatcher != null) {
            removeTextChangedListener(textWatcher);
            this.f213499p = null;
        }
        if (i17 > 0) {
            ym5.z5 z5Var = new ym5.z5(this, i17);
            this.f213499p = z5Var;
            addTextChangedListener(z5Var);
        }
    }

    @Override // com.tencent.mm.view.PhotoEditText
    public void setTextBackground(int i17) {
        int i18 = this.f213495i;
        if (i18 != -1) {
            i17 &= i18;
        }
        super.setTextBackground(i17);
    }
}
