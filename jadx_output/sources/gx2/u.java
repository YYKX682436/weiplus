package gx2;

/* loaded from: classes2.dex */
public final class u extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout f277387d;

    public u(com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout finderDraggableLayout) {
        this.f277387d = finderDraggableLayout;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f277387d.setSettling(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        gx2.s sVar = gx2.s.f277383g;
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout finderDraggableLayout = this.f277387d;
        finderDraggableLayout.setCurrentState(sVar);
        finderDraggableLayout.setSettling(false);
    }
}
