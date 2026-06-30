package ox2;

/* loaded from: classes2.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg f349695d;

    public o(com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg) {
        this.f349695d = centerInteractionEasterEgg;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = this.f349695d.f132373h;
        if (finderEmojiView == null) {
            return;
        }
        finderEmojiView.setScaleX(floatValue);
    }
}
