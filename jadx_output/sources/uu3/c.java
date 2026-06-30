package uu3;

/* loaded from: classes5.dex */
public final class c extends uu3.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout f431272d;

    public c(com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout mMCustomDraggableLayout) {
        this.f431272d = mMCustomDraggableLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f431272d.setSettling(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f431272d.setSettling(false);
    }
}
