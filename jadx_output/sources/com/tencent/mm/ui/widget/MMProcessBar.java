package com.tencent.mm.ui.widget;

/* loaded from: classes10.dex */
public class MMProcessBar extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f211337d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Animation f211338e;

    public MMProcessBar(android.content.Context context) {
        super(context);
        this.f211337d = 0.0f;
        this.f211338e = new android.view.animation.RotateAnimation(0.0f, 360.0f);
    }

    public void a(float f17, float f18) {
        e();
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 72000.0f, f17, f18);
        this.f211338e = rotateAnimation;
        rotateAnimation.setRepeatMode(-1);
        this.f211338e.setRepeatCount(-1);
        this.f211338e.setDuration(70000L);
        this.f211338e.setInterpolator(new android.view.animation.LinearInterpolator());
        if (getVisibility() == 0) {
            d();
        }
    }

    public void b(float f17) {
        android.view.animation.Animation animation = this.f211338e;
        if (animation != null && !animation.hasEnded()) {
            this.f211338e.cancel();
        }
        float f18 = this.f211337d + f17;
        this.f211337d = f18;
        setRotation(f18 * 360.0f);
    }

    public void c(int i17, int i18) {
        try {
            android.graphics.drawable.Drawable drawable = getResources().getDrawable(i17);
            drawable.setColorFilter(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_70), android.graphics.PorterDuff.Mode.SRC_ATOP);
            if (i18 != 0) {
                f3.b.h(drawable, android.content.res.ColorStateList.valueOf(i18));
            }
            setBackground(drawable);
        } catch (java.lang.Exception unused) {
        }
    }

    public void d() {
        if (getVisibility() == 0) {
            startAnimation(this.f211338e);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMProcessBar", "[startRotate] startRotate fail. this view Visibility=%s", java.lang.Integer.valueOf(getVisibility()));
        }
    }

    public void e() {
        android.view.animation.Animation animation = this.f211338e;
        if (animation != null) {
            animation.cancel();
        }
        clearAnimation();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            a(getWidth() / 2.0f, getHeight() / 2.0f);
        }
    }

    public void setDuration(long j17) {
        this.f211338e.setDuration(j17);
    }

    public void setInterpolator(android.view.animation.Interpolator interpolator) {
        this.f211338e.setInterpolator(interpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            d();
        } else {
            e();
        }
    }

    public MMProcessBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211337d = 0.0f;
        this.f211338e = new android.view.animation.RotateAnimation(0.0f, 360.0f);
    }

    public MMProcessBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211337d = 0.0f;
        this.f211338e = new android.view.animation.RotateAnimation(0.0f, 360.0f);
    }
}
