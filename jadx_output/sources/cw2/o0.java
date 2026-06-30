package cw2;

/* loaded from: classes2.dex */
public final class o0 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout f223893d;

    public o0(com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout) {
        this.f223893d = finderFeedNewSeekBarLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = this.f223893d;
        finderFeedNewSeekBarLayout.setSeekBarVisibility(4);
        finderFeedNewSeekBarLayout.setAlpha(1.0f);
    }
}
