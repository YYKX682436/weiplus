package yr1;

/* loaded from: classes14.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment f464635d;

    public a(com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment bizContactInfoDialogFragment) {
        this.f464635d = bizContactInfoDialogFragment;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f464635d.f94076o;
        if (aVar != null) {
            aVar.a(1.0f - floatValue);
        }
    }
}
