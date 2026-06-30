package z51;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer f470182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.g f470183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f470184f;

    public f(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer, z51.g gVar, android.widget.FrameLayout frameLayout) {
        this.f470182d = thumbPlayerViewContainer;
        this.f470183e = gVar;
        this.f470184f = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.AnimatorSet.Builder play;
        android.animation.AnimatorSet.Builder with;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f470182d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(thumbPlayerViewContainer, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(thumbPlayerViewContainer, "scaleX", 1.05f, 1.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(thumbPlayerViewContainer, "scaleY", 1.05f, 1.0f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("aniToThumbView >> centerWidth: ");
        android.widget.FrameLayout frameLayout = this.f470184f;
        sb6.append(frameLayout.getWidth() / 2.0f);
        sb6.append(" centerHeight: ");
        sb6.append(frameLayout.getHeight() / 2.0f);
        java.lang.String sb7 = sb6.toString();
        z51.g gVar = this.f470183e;
        gVar.f(sb7);
        thumbPlayerViewContainer.setPivotX(frameLayout.getWidth() / 2.0f);
        thumbPlayerViewContainer.setPivotY(frameLayout.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = gVar.f470186g;
        if (animatorSet != null) {
            animatorSet.setDuration(300L);
        }
        android.animation.AnimatorSet animatorSet2 = gVar.f470186g;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new android.view.animation.DecelerateInterpolator());
        }
        android.animation.AnimatorSet animatorSet3 = gVar.f470186g;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new z51.e(thumbPlayerViewContainer));
        }
        android.animation.AnimatorSet animatorSet4 = gVar.f470186g;
        if (animatorSet4 != null && (play = animatorSet4.play(ofFloat2)) != null && (with = play.with(ofFloat3)) != null) {
            with.with(ofFloat);
        }
        android.animation.AnimatorSet animatorSet5 = gVar.f470186g;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }
}
