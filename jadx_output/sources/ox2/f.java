package ox2;

/* loaded from: classes2.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg f349654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349655e;

    public f(com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg, android.view.View view) {
        this.f349654d = centerInteractionEasterEgg;
        this.f349655e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = this.f349654d;
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = centerInteractionEasterEgg.f132373h;
        if (finderEmojiView != null) {
            finderEmojiView.setAlpha(floatValue);
        }
        android.widget.TextView textView = centerInteractionEasterEgg.f132372g;
        if (textView != null) {
            textView.setAlpha(floatValue);
        }
        android.view.View view = this.f349655e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$hideAnimation$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$hideAnimation$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
