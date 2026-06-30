package gx2;

/* loaded from: classes2.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout f277388d;

    public v(com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout finderDraggableLayout) {
        this.f277388d = finderDraggableLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout finderDraggableLayout = this.f277388d;
        finderDraggableLayout.l(finderDraggableLayout.getTranslation(), "settle");
    }
}
