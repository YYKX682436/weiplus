package z51;

/* loaded from: classes3.dex */
public final class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer f470181d;

    public e(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer) {
        this.f470181d = thumbPlayerViewContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f470181d.setVisibility(8);
    }
}
