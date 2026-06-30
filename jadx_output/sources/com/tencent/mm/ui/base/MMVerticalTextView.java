package com.tencent.mm.ui.base;

/* loaded from: classes13.dex */
public class MMVerticalTextView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.text.TextPaint f197602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f197603e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f197604f;

    /* renamed from: g, reason: collision with root package name */
    public final int f197605g;

    /* renamed from: h, reason: collision with root package name */
    public int f197606h;

    public MMVerticalTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197604f = new android.graphics.Rect();
        this.f197606h = 0;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f197602d = textPaint;
        textPaint.setAntiAlias(true);
        this.f197602d.setTextSize(15.0f);
        this.f197602d.setColor(-16777216);
        this.f197602d.setTextAlign(android.graphics.Paint.Align.CENTER);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.N);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.f197603e = context.getString(resourceId);
        }
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 15);
        if (dimensionPixelOffset > 0) {
            this.f197602d.setTextSize(dimensionPixelOffset);
        }
        this.f197602d.setColor(obtainStyledAttributes.getColor(3, -16777216));
        this.f197605g = obtainStyledAttributes.getInt(0, 0);
        this.f197602d.setFakeBoldText(obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
        requestLayout();
        invalidate();
    }

    public float getTextSize() {
        return this.f197602d.getTextSize();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        android.graphics.Path path = new android.graphics.Path();
        int i17 = this.f197605g;
        android.graphics.Rect rect = this.f197604f;
        int i18 = 0;
        if (i17 == 0) {
            int width = (getWidth() - rect.height()) / 2;
            float f17 = 0;
            path.moveTo(f17, f17);
            path.lineTo(f17, height);
            i18 = width;
        } else {
            float width2 = (getWidth() >> 1) + (rect.height() >> 1);
            path.moveTo(width2, height);
            path.lineTo(width2, 0);
        }
        canvas.drawTextOnPath(this.f197603e, path, 0.0f, -i18, this.f197602d);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i17 = this.f197606h;
        if (i17 == 0) {
            accessibilityNodeInfo.setClassName(com.tencent.mm.accessibility.core.provider.TypeModifier.TEXTVIEW_CLASS);
        } else if (i17 == 1) {
            accessibilityNodeInfo.setClassName(com.tencent.mm.accessibility.core.provider.TypeModifier.BUTTON_CLASS);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.text.TextPaint textPaint = this.f197602d;
        java.lang.String str = this.f197603e;
        textPaint.getTextBounds(str, 0, str.length(), this.f197604f);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode != 1073741824) {
            int i19 = (int) (this.f197602d.getFontMetrics().bottom - this.f197602d.getFontMetrics().top);
            size = mode == Integer.MIN_VALUE ? java.lang.Math.min(i19, size) : i19;
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode2 != 1073741824) {
            int ceil = (int) java.lang.Math.ceil(this.f197602d.measureText(this.f197603e));
            size2 = mode2 == Integer.MIN_VALUE ? java.lang.Math.min(ceil, size2) : ceil;
        }
        setMeasuredDimension(size, size2);
    }

    public void setAccessibilityViewType(int i17) {
        this.f197606h = i17;
    }

    public void setMediumBold(boolean z17) {
        this.f197602d.setFakeBoldText(z17);
    }

    public void setText(java.lang.String str) {
        this.f197603e = str;
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i17) {
        this.f197602d.setColor(i17);
        invalidate();
    }

    public void setTextSize(int i17) {
        this.f197602d.setTextSize(i17);
        requestLayout();
        invalidate();
    }

    public void setTextSize(float f17) {
        this.f197602d.setTextSize(f17);
        requestLayout();
        invalidate();
    }
}
