package com.tencent.mm.ui.widget.imageview;

/* loaded from: classes5.dex */
public class WeImageButton extends com.tencent.mm.view.x2c.X2CAppCompatImageButton {

    /* renamed from: f, reason: collision with root package name */
    public int f212127f;

    /* renamed from: g, reason: collision with root package name */
    public int f212128g;

    /* renamed from: h, reason: collision with root package name */
    public float f212129h;

    /* renamed from: i, reason: collision with root package name */
    public int f212130i;

    /* renamed from: m, reason: collision with root package name */
    public int f212131m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f212132n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f212133o;

    public WeImageButton(android.content.Context context) {
        super(context, null);
        this.f212129h = 1.0f;
        this.f212130i = 255;
        this.f212131m = 255;
        this.f212132n = true;
        this.f212133o = true;
        c(context, null);
    }

    public final void c(android.content.Context context, android.util.AttributeSet attributeSet) {
        int color = context.getResources().getColor(com.tencent.mm.R.color.FG_0);
        this.f212128g = color;
        if (attributeSet == null) {
            this.f212127f = color;
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463115v);
        this.f212127f = obtainStyledAttributes.getColor(1, this.f212128g);
        this.f212129h = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i17 = this.f212130i;
        if (isPressed()) {
            i17 = 127;
        } else if (isEnabled()) {
            i17 = this.f212130i;
        }
        if (!isEnabled() || !isFocusable()) {
            i17 = 255;
        }
        if (i17 != this.f212131m) {
            this.f212131m = i17;
            if (getDrawable() != null) {
                getDrawable().setAlpha(i17);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        boolean z17 = this.f212133o;
        if (!z17 && getDrawable() != null && this.f212132n) {
            getDrawable().clearColorFilter();
            this.f212132n = false;
            return;
        }
        if (z17 && getDrawable() != null && this.f212132n) {
            int i17 = this.f212127f;
            int i18 = i17 != 0 ? (16777215 & i17) | (-16777216) : i17;
            int alpha = android.graphics.Color.alpha(i17);
            float f17 = this.f212129h;
            if (f17 != 1.0f) {
                alpha = (int) (f17 * 255.0f);
            }
            getDrawable().setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
            if (this.f212127f != 0) {
                this.f212130i = alpha;
                getDrawable().setAlpha(alpha);
            }
            this.f212132n = false;
        }
    }

    public void setIconColor(int i17) {
        this.f212127f = i17;
        this.f212132n = true;
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i17) {
        super.setImageResource(i17);
        setIconColor(this.f212127f);
    }

    public WeImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212129h = 1.0f;
        this.f212130i = 255;
        this.f212131m = 255;
        this.f212132n = true;
        this.f212133o = true;
        c(context, attributeSet);
    }

    public WeImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212129h = 1.0f;
        this.f212130i = 255;
        this.f212131m = 255;
        this.f212132n = true;
        this.f212133o = true;
        c(context, attributeSet);
    }
}
