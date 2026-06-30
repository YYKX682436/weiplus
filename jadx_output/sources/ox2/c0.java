package ox2;

/* loaded from: classes10.dex */
public final class c0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f349647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview f349648e;

    public c0(com.tencent.mm.view.MMPAGView mMPAGView, com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview centerInteractionEasterEggDarkPreview) {
        this.f349647d = mMPAGView;
        this.f349648e = centerInteractionEasterEggDarkPreview;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f349647d.setAlpha(0.0f);
        int i17 = com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview.f132388r;
        this.f349648e.d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
