package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class k7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MultiTouchImageView f129419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI f129420e;

    public k7(com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView, com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI) {
        this.f129419d = multiTouchImageView;
        this.f129420e = finderImagePreviewUI;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI = this.f129420e;
        finderImagePreviewUI.finish();
        finderImagePreviewUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f129419d;
        if (multiTouchImageView.getScale() > 1.0f) {
            multiTouchImageView.i();
        }
        float translationX = multiTouchImageView.getTranslationX();
        com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI = this.f129420e;
        finderImagePreviewUI.E = translationX;
        finderImagePreviewUI.F = multiTouchImageView.getTranslationY();
        finderImagePreviewUI.C = multiTouchImageView.getScaleX();
        finderImagePreviewUI.D = multiTouchImageView.getScaleY();
    }
}
