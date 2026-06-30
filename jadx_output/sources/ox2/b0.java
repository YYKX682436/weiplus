package ox2;

/* loaded from: classes10.dex */
public final class b0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview f349644d;

    public b0(com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview centerInteractionEasterEggDarkPreview) {
        this.f349644d = centerInteractionEasterEggDarkPreview;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f349644d.f132390g;
        if (mMPAGView == null) {
            return;
        }
        try {
            mMPAGView.setScaleX(1.0f);
            mMPAGView.setVisibility(0);
            mMPAGView.setProgress(0.0d);
            mMPAGView.setRepeatCount(1);
            mMPAGView.g();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("CenterInteractionEasterEggDarkPreview", "playThumbPagAnimation e:" + th6);
        }
    }
}
