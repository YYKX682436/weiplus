package lm4;

/* loaded from: classes14.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout f319564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f319565e;

    public h(com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout tingPlayerDraggableLayout, float f17) {
        this.f319564d = tingPlayerDraggableLayout;
        this.f319565e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f319564d.i(this.f319565e, "settle");
    }
}
