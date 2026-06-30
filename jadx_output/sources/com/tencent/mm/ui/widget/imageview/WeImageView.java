package com.tencent.mm.ui.widget.imageview;

/* loaded from: classes5.dex */
public class WeImageView extends com.tencent.mm.view.x2c.X2CImageView {

    /* renamed from: f, reason: collision with root package name */
    public int f212134f;

    /* renamed from: g, reason: collision with root package name */
    public float f212135g;

    /* renamed from: h, reason: collision with root package name */
    public int f212136h;

    /* renamed from: i, reason: collision with root package name */
    public int f212137i;

    /* renamed from: m, reason: collision with root package name */
    public int f212138m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f212139n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f212140o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f212141p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f212142q;

    public WeImageView(android.content.Context context) {
        super(context);
        this.f212135g = 1.0f;
        this.f212137i = 255;
        this.f212138m = 255;
        this.f212139n = true;
        this.f212140o = false;
        this.f212141p = true;
        this.f212142q = false;
        n(context, null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i17 = this.f212137i;
        if (isPressed()) {
            i17 = 127;
        } else if (isEnabled()) {
            i17 = this.f212137i;
        }
        if (!isEnabled() || !isFocusable()) {
            i17 = 255;
        }
        if (isPressed() && this.f212142q) {
            i17 = (int) (this.f212137i * 0.5d);
        }
        if (i17 != this.f212138m) {
            this.f212138m = i17;
            if (getDrawable() != null) {
                getDrawable().setAlpha(i17);
            }
        }
    }

    public int getIconColor() {
        return this.f212134f;
    }

    public final void n(android.content.Context context, android.util.AttributeSet attributeSet) {
        int color = context.getResources().getColor(com.tencent.mm.R.color.FG_0);
        this.f212136h = color;
        if (attributeSet == null) {
            this.f212134f = color;
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463116w);
        this.f212134f = obtainStyledAttributes.getColor(1, this.f212136h);
        this.f212135g = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f212140o && this.f212139n && getDrawable() != null) {
            getDrawable().mutate().clearColorFilter();
            this.f212140o = false;
            this.f212139n = false;
            return;
        }
        if (!this.f212141p && getDrawable() != null && this.f212139n) {
            getDrawable().mutate().clearColorFilter();
            this.f212137i = 255;
            getDrawable().setAlpha(255);
            this.f212139n = false;
            return;
        }
        if (this.f212141p && getDrawable() != null && this.f212139n) {
            int i17 = this.f212134f;
            int i18 = i17 != 0 ? (16777215 & i17) | (-16777216) : i17;
            int alpha = android.graphics.Color.alpha(i17);
            float f17 = this.f212135g;
            if (f17 != 1.0f) {
                alpha = (int) (f17 * 255.0f);
            }
            getDrawable().mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
            if (this.f212134f != 0) {
                this.f212137i = alpha;
                getDrawable().setAlpha(alpha);
            }
            this.f212139n = false;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getContentDescription() != null || isClickable()) {
            return;
        }
        setImportantForAccessibility(2);
    }

    public void r(int i17, float f17) {
        this.f212134f = i17;
        this.f212135g = f17;
        this.f212139n = true;
        invalidate();
    }

    public void s(int i17, int i18) {
        setImageResource(i17);
        setIconColor(getContext().getResources().getColor(i18));
    }

    public void setClearColorFilter(boolean z17) {
        this.f212140o = z17;
        this.f212139n = true;
        invalidate();
    }

    public void setEnableColorFilter(boolean z17) {
        if (this.f212141p != z17) {
            this.f212141p = z17;
            this.f212139n = true;
            invalidate();
        }
        if (z17) {
            return;
        }
        this.f212137i = 255;
        if (this.f212139n) {
            return;
        }
        this.f212139n = true;
        invalidate();
    }

    public void setEnableHighlight(boolean z17) {
        this.f212142q = z17;
    }

    public void setIconAlpha(float f17) {
        this.f212135g = f17;
        this.f212139n = true;
        invalidate();
    }

    public void setIconColor(int i17) {
        this.f212134f = i17;
        this.f212139n = true;
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i17) {
        super.setImageResource(i17);
        setIconColor(this.f212134f);
    }

    public WeImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212135g = 1.0f;
        this.f212137i = 255;
        this.f212138m = 255;
        this.f212139n = true;
        this.f212140o = false;
        this.f212141p = true;
        this.f212142q = false;
        n(context, attributeSet);
    }

    public WeImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212135g = 1.0f;
        this.f212137i = 255;
        this.f212138m = 255;
        this.f212139n = true;
        this.f212140o = false;
        this.f212141p = true;
        this.f212142q = false;
        n(context, attributeSet);
    }
}
