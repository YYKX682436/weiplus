package ul5;

/* loaded from: classes13.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.pulldown.HorizontalNestedBounceView f428634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428635e;

    public g(com.tencent.mm.ui.widget.pulldown.HorizontalNestedBounceView horizontalNestedBounceView, android.view.View view) {
        this.f428634d = horizontalNestedBounceView;
        this.f428635e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f428634d.b(this.f428635e, ((java.lang.Integer) animatedValue).intValue());
    }
}
