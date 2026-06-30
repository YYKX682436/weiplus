package ul5;

/* loaded from: classes3.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.pulldown.AppLayoutPullDownBehavior f428624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428625e;

    public a(com.tencent.mm.ui.widget.pulldown.AppLayoutPullDownBehavior appLayoutPullDownBehavior, android.view.View view) {
        this.f428624d = appLayoutPullDownBehavior;
        this.f428625e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        this.f428624d.getClass();
        android.view.View child = this.f428625e;
        kotlin.jvm.internal.o.g(child, "child");
        child.setTranslationY(intValue);
    }
}
