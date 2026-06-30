package com.tencent.mm.plugin.game.commlib.view;

/* loaded from: classes4.dex */
public class FixAspectRatioImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name */
    public int f139424f;

    /* renamed from: g, reason: collision with root package name */
    public int f139425g;

    /* renamed from: h, reason: collision with root package name */
    public float f139426h;

    /* renamed from: i, reason: collision with root package name */
    public int f139427i;

    /* renamed from: m, reason: collision with root package name */
    public int f139428m;

    /* renamed from: n, reason: collision with root package name */
    public int f139429n;

    /* renamed from: o, reason: collision with root package name */
    public int f139430o;

    /* renamed from: p, reason: collision with root package name */
    public int f139431p;

    public FixAspectRatioImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f139426h = 0.0f;
        this.f139427i = 0;
        this.f139428m = 0;
        this.f139429n = 0;
        this.f139430o = 0;
        this.f139431p = 0;
        n(context, attributeSet, 0);
    }

    public final void n(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hj0.a.f281575a, i17, 0);
        this.f139426h = obtainStyledAttributes.getFloat(0, 0.0f);
        this.f139427i = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f139428m = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f139429n = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        this.f139430o = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.f139431p = dimensionPixelOffset;
        int i18 = this.f139428m;
        if (i18 == 0) {
            i18 = this.f139427i;
        }
        this.f139428m = i18;
        int i19 = this.f139429n;
        if (i19 == 0) {
            i19 = this.f139427i;
        }
        this.f139429n = i19;
        int i27 = this.f139430o;
        if (i27 == 0) {
            i27 = this.f139427i;
        }
        this.f139430o = i27;
        if (dimensionPixelOffset == 0) {
            dimensionPixelOffset = this.f139427i;
        }
        this.f139431p = dimensionPixelOffset;
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int max = java.lang.Math.max(this.f139428m, this.f139430o) + java.lang.Math.max(this.f139429n, this.f139431p);
        int max2 = java.lang.Math.max(this.f139428m, this.f139429n) + java.lang.Math.max(this.f139430o, this.f139431p);
        if (this.f139424f >= max && this.f139425g >= max2) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(this.f139428m, 0.0f);
            path.lineTo(this.f139424f - this.f139429n, 0.0f);
            int i17 = this.f139424f;
            path.quadTo(i17, 0.0f, i17, this.f139429n);
            path.lineTo(this.f139424f, this.f139425g - this.f139431p);
            int i18 = this.f139424f;
            int i19 = this.f139425g;
            path.quadTo(i18, i19, i18 - this.f139431p, i19);
            path.lineTo(this.f139430o, this.f139425g);
            path.quadTo(0.0f, this.f139425g, 0.0f, r1 - this.f139430o);
            path.lineTo(0.0f, this.f139428m);
            path.quadTo(0.0f, 0.0f, this.f139428m, 0.0f);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f139424f = getWidth();
        this.f139425g = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f139426h == 0.0f) {
            super.onMeasure(i17, i18);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((int) (this.f139426h * size), 1073741824));
    }

    public FixAspectRatioImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f139426h = 0.0f;
        this.f139427i = 0;
        this.f139428m = 0;
        this.f139429n = 0;
        this.f139430o = 0;
        this.f139431p = 0;
        n(context, attributeSet, i17);
    }
}
