package lm4;

/* loaded from: classes14.dex */
public final class i extends lm4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout f319567d;

    public i(com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout tingPlayerDraggableLayout) {
        this.f319567d = tingPlayerDraggableLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f319567d.setSettling(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f319567d.setSettling(false);
    }
}
