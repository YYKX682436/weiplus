package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0002B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/tencent/mm/view/SmoothLinearLayout;", "Landroid/widget/LinearLayout;", "Lym5/k5;", "d", "Lym5/k5;", "getOnSmoothHeightChangeListener", "()Lym5/k5;", "setOnSmoothHeightChangeListener", "(Lym5/k5;)V", "onSmoothHeightChangeListener", "", "value", "e", "Z", "getAnimEnabled", "()Z", "setAnimEnabled", "(Z)V", "animEnabled", "", "f", "J", "getAnimDuration", "()J", "setAnimDuration", "(J)V", "animDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SmoothLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ym5.k5 onSmoothHeightChangeListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean animEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long animDuration;

    /* renamed from: g, reason: collision with root package name */
    public int f213491g;

    /* renamed from: h, reason: collision with root package name */
    public int f213492h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f213493i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f213494m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmoothLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final long getAnimDuration() {
        return this.animDuration;
    }

    public final boolean getAnimEnabled() {
        return this.animEnabled;
    }

    public final ym5.k5 getOnSmoothHeightChangeListener() {
        return this.onSmoothHeightChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f213493i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f213493i = null;
        this.onSmoothHeightChangeListener = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        if (!this.animEnabled || (i28 = this.f213492h) <= 0) {
            super.onLayout(z17, i17, i18, i19, i27);
        } else {
            super.onLayout(z17, i17, i18, i19, i18 + i28);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (!this.animEnabled) {
            this.f213491g = getMeasuredHeight();
            this.f213492h = getMeasuredHeight();
            this.f213494m = true;
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (!this.f213494m) {
            this.f213491g = measuredHeight;
            this.f213492h = measuredHeight;
            this.f213494m = true;
            return;
        }
        if (measuredHeight == this.f213492h) {
            setMeasuredDimension(getMeasuredWidth(), this.f213491g);
            return;
        }
        int i19 = this.f213491g;
        this.f213492h = measuredHeight;
        android.animation.ValueAnimator valueAnimator = this.f213493i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i19, measuredHeight);
        ofInt.setDuration(this.animDuration);
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f));
        ofInt.addUpdateListener(new ym5.l5(this));
        ofInt.start();
        this.f213493i = ofInt;
        setMeasuredDimension(getMeasuredWidth(), this.f213491g);
    }

    public final void setAnimDuration(long j17) {
        this.animDuration = j17;
    }

    public final void setAnimEnabled(boolean z17) {
        if (this.animEnabled == z17) {
            return;
        }
        this.animEnabled = z17;
        if (z17) {
            return;
        }
        android.animation.ValueAnimator valueAnimator = this.f213493i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f213493i = null;
    }

    public final void setOnSmoothHeightChangeListener(ym5.k5 k5Var) {
        this.onSmoothHeightChangeListener = k5Var;
    }

    public /* synthetic */ SmoothLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.animDuration = 300L;
        setClipChildren(true);
        setClipToPadding(true);
    }
}
