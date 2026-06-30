package cw2;

/* loaded from: classes10.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderAudioVolumeController f223943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f223944e;

    public q(com.tencent.mm.plugin.finder.video.FinderAudioVolumeController finderAudioVolumeController, android.content.Context context) {
        this.f223943d = finderAudioVolumeController;
        this.f223944e = context;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.finder.video.FinderAudioVolumeController finderAudioVolumeController = this.f223943d;
        finderAudioVolumeController.f130500n = "";
        cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).S6(this.f223944e);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = S6 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) S6 : null;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.setVolume(1.0f);
        }
        finderAudioVolumeController.f130497h = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
