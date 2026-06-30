package cy2;

/* loaded from: classes3.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView f224743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f224744e;

    public d(com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView finderWhatsNewView, android.view.View view) {
        this.f224743d = finderWhatsNewView;
        this.f224744e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView finderWhatsNewView = this.f224743d;
        android.view.ViewParent parent = finderWhatsNewView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) parent).removeView(this.f224744e);
        finderWhatsNewView.getDetachFinish().invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
