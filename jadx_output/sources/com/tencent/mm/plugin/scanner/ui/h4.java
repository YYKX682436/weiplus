package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class h4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.TranslationResultUI f159561d;

    public h4(com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI) {
        this.f159561d = translationResultUI;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159561d;
        translationResultUI.finish();
        translationResultUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159561d;
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = translationResultUI.f159478q;
        if (multiTouchImageView != null) {
            if (multiTouchImageView.getScale() > 1.0f) {
                translationResultUI.f159478q.i();
            }
            translationResultUI.f159486y = translationResultUI.f159478q.getTranslationX();
            translationResultUI.f159487z = translationResultUI.f159478q.getTranslationY();
            translationResultUI.f159484w = translationResultUI.f159478q.getScaleX();
            translationResultUI.f159485x = translationResultUI.f159478q.getScaleY();
        }
    }
}
