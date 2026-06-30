package cw2;

/* loaded from: classes10.dex */
public final class p implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderAudioVolumeController f223905d;

    public p(com.tencent.mm.plugin.finder.video.FinderAudioVolumeController finderAudioVolumeController) {
        this.f223905d = finderAudioVolumeController;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f223905d.f130497h = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
