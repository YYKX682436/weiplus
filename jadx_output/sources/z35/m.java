package z35;

/* loaded from: classes4.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView f470020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f470021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f470022f;

    public m(com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView, boolean z17, boolean z18) {
        this.f470020d = expandableHeroSeekBarView;
        this.f470021e = z17;
        this.f470022f = z18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f470020d;
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView mediaControlBar = expandableHeroSeekBarView.getMediaControlBar();
        boolean z17 = this.f470021e;
        mediaControlBar.setVisibility(z17 ? 4 : 0);
        if (z17) {
            expandableHeroSeekBarView.c(this.f470022f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f470020d.getMediaControlBar().setVisibility(0);
    }
}
