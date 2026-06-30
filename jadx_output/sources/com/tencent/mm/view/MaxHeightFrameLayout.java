package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0002B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/view/MaxHeightFrameLayout;", "Landroid/widget/FrameLayout;", "Lym5/m2;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnUPSlideListener", "", "height", "setMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MaxHeightFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f213343d;

    /* renamed from: e, reason: collision with root package name */
    public float f213344e;

    /* renamed from: f, reason: collision with root package name */
    public float f213345f;

    /* renamed from: g, reason: collision with root package name */
    public ym5.m2 f213346g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightFrameLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f213346g == null) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            this.f213345f = event.getX();
            this.f213344e = event.getY();
            return false;
        }
        if (action != 2) {
            return false;
        }
        float x17 = event.getX() - this.f213345f;
        float y17 = event.getY() - this.f213344e;
        if (java.lang.Math.abs(y17) <= java.lang.Math.abs(x17) || y17 >= 0.0f || java.lang.Math.abs(y17) <= 10.0f) {
            return false;
        }
        ym5.m2 m2Var = this.f213346g;
        if (m2Var != null) {
            bh5.w0 w0Var = (bh5.w0) m2Var;
            com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment mMHalfScreenMaxHeightDialogFragment = w0Var.f20969a;
            android.view.ViewGroup.LayoutParams layoutParams = mMHalfScreenMaxHeightDialogFragment.o0().getLayoutParams();
            if (layoutParams != null) {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(layoutParams.height, w0Var.f20970b);
                ofInt.addUpdateListener(new bh5.v0(layoutParams, mMHalfScreenMaxHeightDialogFragment));
                ofInt.setDuration(200L);
                ofInt.start();
            }
        }
        this.f213346g = null;
        java.lang.Math.abs(y17);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f213343d > 0) {
            int size = android.view.View.MeasureSpec.getSize(i18);
            int mode = android.view.View.MeasureSpec.getMode(i18);
            if (mode == Integer.MIN_VALUE) {
                int i19 = this.f213343d;
                if (size > i19) {
                    size = i19;
                }
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            } else if (mode == 0) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(this.f213343d, Integer.MIN_VALUE);
            } else if (mode == 1073741824) {
                int i27 = this.f213343d;
                if (size > i27) {
                    size = i27;
                }
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            }
        }
        super.onMeasure(i17, i18);
    }

    public final void setMaxHeight(int i17) {
        this.f213343d = i17;
    }

    public final void setOnUPSlideListener(ym5.m2 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f213346g = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightFrameLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
