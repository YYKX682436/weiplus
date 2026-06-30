package zx;

/* loaded from: classes5.dex */
public final class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout f476958d;

    public n(com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout controlledRipplesLayout) {
        this.f476958d = controlledRipplesLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout controlledRipplesLayout = this.f476958d;
        controlledRipplesLayout.f65304p = floatValue;
        controlledRipplesLayout.invalidate();
    }
}
