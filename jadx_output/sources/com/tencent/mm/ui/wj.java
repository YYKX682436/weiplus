package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class wj implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.TopStoryIconViewTipPreference f212534d;

    public wj(com.tencent.mm.ui.TopStoryIconViewTipPreference topStoryIconViewTipPreference) {
        this.f212534d = topStoryIconViewTipPreference;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.ui.TopStoryIconViewTipPreference topStoryIconViewTipPreference = this.f212534d;
        android.view.View view = topStoryIconViewTipPreference.Z1;
        if (view != null) {
            view.setBackground(topStoryIconViewTipPreference.f196697j2.getResources().getDrawable(com.tencent.mm.R.drawable.azm));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
