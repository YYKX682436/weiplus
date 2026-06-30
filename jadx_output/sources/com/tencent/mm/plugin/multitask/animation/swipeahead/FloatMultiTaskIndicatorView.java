package com.tencent.mm.plugin.multitask.animation.swipeahead;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/multitask/animation/swipeahead/FloatMultiTaskIndicatorView;", "Landroid/widget/FrameLayout;", "", "Landroid/view/View;", "getView", "Landroid/graphics/drawable/Drawable;", "drawable", "Ljz5/f0;", "setIconDrawable", "Ldk3/g;", "orientationChangedListener", "setOnOrientationChangedListener", "Landroid/widget/ImageView;", "getInnerIndicatorImageView", "Landroid/widget/TextView;", "getInnerIndicatorTextView", "e", "Landroid/widget/ImageView;", "getIndicatorImageView", "()Landroid/widget/ImageView;", "setIndicatorImageView", "(Landroid/widget/ImageView;)V", "indicatorImageView", "f", "Landroid/widget/TextView;", "getIndicatorTextView", "()Landroid/widget/TextView;", "setIndicatorTextView", "(Landroid/widget/TextView;)V", "indicatorTextView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FloatMultiTaskIndicatorView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f150412d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.widget.ImageView indicatorImageView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView indicatorTextView;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Vibrator f150415g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.Animator f150416h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.Animator f150417i;

    /* renamed from: m, reason: collision with root package name */
    public dk3.g f150418m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f150419n;

    public FloatMultiTaskIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean a() {
        return ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di();
    }

    public final android.widget.ImageView getIndicatorImageView() {
        return this.indicatorImageView;
    }

    public final android.widget.TextView getIndicatorTextView() {
        return this.indicatorTextView;
    }

    public android.widget.ImageView getInnerIndicatorImageView() {
        return this.indicatorImageView;
    }

    public android.widget.TextView getInnerIndicatorTextView() {
        return this.indicatorTextView;
    }

    public android.view.View getView() {
        return this;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        dk3.g gVar = this.f150418m;
        if (gVar != null) {
            boolean z17 = newConfig.orientation == 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "onOrientationChanged, isLandscape:%s", java.lang.Boolean.valueOf(z17));
            dk3.e eVar = ((dk3.a) gVar).f234445a;
            eVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "updateOrientation, isLandscape:%b", java.lang.Boolean.valueOf(z17));
            eVar.f234456h = z17;
            eVar.d();
            android.widget.FrameLayout.LayoutParams layoutParams = eVar.f234455g;
            if (layoutParams != null) {
                layoutParams.bottomMargin = eVar.f234454f;
            }
            if (layoutParams != null) {
                layoutParams.rightMargin = eVar.f234453e;
            }
            com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = eVar.f234452d;
            if (floatMultiTaskIndicatorView != null) {
                floatMultiTaskIndicatorView.setLayoutParams(layoutParams);
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            android.widget.FrameLayout.LayoutParams layoutParams2 = eVar.f234455g;
            objArr[0] = layoutParams2 != null ? java.lang.Integer.valueOf(layoutParams2.rightMargin) : null;
            android.widget.FrameLayout.LayoutParams layoutParams3 = eVar.f234455g;
            objArr[1] = layoutParams3 != null ? java.lang.Integer.valueOf(layoutParams3.bottomMargin) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "onOrientationChanged layoutParams, right:%s, bottom:%s", objArr);
        }
    }

    public void setIconDrawable(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f150419n = drawable;
        android.widget.ImageView imageView = this.indicatorImageView;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setIndicatorImageView(android.widget.ImageView imageView) {
        this.indicatorImageView = imageView;
    }

    public final void setIndicatorTextView(android.widget.TextView textView) {
        this.indicatorTextView = textView;
    }

    public void setOnOrientationChangedListener(dk3.g gVar) {
        this.f150418m = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatMultiTaskIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.d(context);
        android.view.View.inflate(context, com.tencent.mm.R.layout.bof, this);
        this.f150412d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.aaj);
        this.indicatorImageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hc8);
        this.indicatorTextView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hc9);
        java.lang.Object systemService = context.getSystemService("vibrator");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f150415g = (android.os.Vibrator) systemService;
        float f17 = com.tencent.mm.plugin.multitask.q0.f150490g;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f150412d, "scaleX", f17, 1.0f);
        ofFloat.setDuration(200L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f150412d, "scaleY", f17, 1.0f);
        ofFloat2.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f150416h = animatorSet;
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.f150412d, "scaleX", 1.0f, f17);
        ofFloat3.setDuration(200L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f150412d, "scaleY", 1.0f, f17);
        ofFloat4.setDuration(200L);
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        this.f150417i = animatorSet2;
    }

    public /* synthetic */ FloatMultiTaskIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }
}
