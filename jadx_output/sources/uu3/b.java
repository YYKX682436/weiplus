package uu3;

/* loaded from: classes5.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout f431270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f431271e;

    public b(com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout mMCustomDraggableLayout, float f17) {
        this.f431270d = mMCustomDraggableLayout;
        this.f431271e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f431270d.k(this.f431271e, "settle");
    }
}
