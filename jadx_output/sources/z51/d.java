package z51;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.g f470178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer f470179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f470180f;

    public d(z51.g gVar, com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer, android.widget.FrameLayout frameLayout) {
        this.f470178d = gVar;
        this.f470179e = thumbPlayerViewContainer;
        this.f470180f = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.AnimatorSet.Builder play;
        android.animation.AnimatorSet.Builder with;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        z51.g gVar = this.f470178d;
        gVar.f470185f = animatorSet;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f470179e;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(thumbPlayerViewContainer, "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(thumbPlayerViewContainer, "scaleX", 1.0f, 1.05f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(thumbPlayerViewContainer, "scaleY", 1.0f, 1.05f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("aniToPlayView >> centerWidth: ");
        android.widget.FrameLayout frameLayout = this.f470180f;
        sb6.append(frameLayout.getWidth() / 2.0f);
        sb6.append(" centerHeight: ");
        sb6.append(frameLayout.getHeight() / 2.0f);
        gVar.f(sb6.toString());
        thumbPlayerViewContainer.setPivotX(frameLayout.getWidth() / 2.0f);
        thumbPlayerViewContainer.setPivotY(frameLayout.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet2 = gVar.f470185f;
        if (animatorSet2 != null) {
            animatorSet2.setDuration(300L);
        }
        android.animation.AnimatorSet animatorSet3 = gVar.f470185f;
        if (animatorSet3 != null) {
            animatorSet3.setInterpolator(new android.view.animation.DecelerateInterpolator());
        }
        android.animation.AnimatorSet animatorSet4 = gVar.f470185f;
        if (animatorSet4 != null && (play = animatorSet4.play(ofFloat2)) != null && (with = play.with(ofFloat3)) != null) {
            with.with(ofFloat);
        }
        android.animation.AnimatorSet animatorSet5 = gVar.f470185f;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }
}
