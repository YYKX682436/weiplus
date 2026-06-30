package gx2;

/* loaded from: classes2.dex */
public final class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout f277385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f277386e;

    public t(com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout finderDraggableLayout, float f17) {
        this.f277385d = finderDraggableLayout;
        this.f277386e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f277385d.l(this.f277386e, "settle");
    }
}
