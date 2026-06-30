package lm4;

/* loaded from: classes14.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout f319577d;

    public j(com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout tingPlayerDraggableLayout) {
        this.f319577d = tingPlayerDraggableLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout tingPlayerDraggableLayout = this.f319577d;
        tingPlayerDraggableLayout.i(tingPlayerDraggableLayout.getTranslation(), "settle");
    }
}
