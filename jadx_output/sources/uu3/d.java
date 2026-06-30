package uu3;

/* loaded from: classes5.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout f431273d;

    public d(com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout mMCustomDraggableLayout) {
        this.f431273d = mMCustomDraggableLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout mMCustomDraggableLayout = this.f431273d;
        mMCustomDraggableLayout.k(mMCustomDraggableLayout.getTranslation(), "settle");
    }
}
