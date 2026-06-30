package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/view/SmoothFrameLayout;", "Landroid/widget/FrameLayout;", "", "d", "Z", "getAnimEnabled", "()Z", "setAnimEnabled", "(Z)V", "animEnabled", "", "e", "J", "getAnimDuration", "()J", "setAnimDuration", "(J)V", "animDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SmoothFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean animEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long animDuration;

    /* renamed from: f, reason: collision with root package name */
    public int f213484f;

    /* renamed from: g, reason: collision with root package name */
    public int f213485g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.ValueAnimator f213486h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f213487i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmoothFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final long getAnimDuration() {
        return this.animDuration;
    }

    public final boolean getAnimEnabled() {
        return this.animEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f213486h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f213486h = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        if (this.animEnabled && (i28 = this.f213485g) > 0) {
            i27 = i18 + i28;
        }
        int childCount = getChildCount();
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                childAt.layout(getPaddingLeft(), getPaddingTop(), (i19 - i17) - getPaddingRight(), (i27 - i18) - getPaddingBottom());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (!this.animEnabled) {
            this.f213484f = getMeasuredHeight();
            this.f213485g = getMeasuredHeight();
            this.f213487i = true;
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (!this.f213487i) {
            this.f213484f = measuredHeight;
            this.f213485g = measuredHeight;
            this.f213487i = true;
            return;
        }
        if (measuredHeight == this.f213485g) {
            setMeasuredDimension(getMeasuredWidth(), this.f213484f);
            return;
        }
        int i19 = this.f213484f;
        this.f213485g = measuredHeight;
        android.animation.ValueAnimator valueAnimator = this.f213486h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i19, measuredHeight);
        ofInt.setDuration(this.animDuration);
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f));
        ofInt.addUpdateListener(new ym5.j5(this));
        ofInt.start();
        this.f213486h = ofInt;
        setMeasuredDimension(getMeasuredWidth(), this.f213484f);
    }

    public final void setAnimDuration(long j17) {
        this.animDuration = j17;
    }

    public final void setAnimEnabled(boolean z17) {
        this.animEnabled = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.animDuration = 300L;
        setClipChildren(true);
        setClipToPadding(true);
    }
}
