package ul5;

/* loaded from: classes4.dex */
public final class a0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.pulldown.NestedBounceView f428626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428627e;

    public a0(com.tencent.mm.ui.widget.pulldown.NestedBounceView nestedBounceView, android.view.View view) {
        this.f428626d = nestedBounceView;
        this.f428627e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f428626d.b(this.f428627e, ((java.lang.Integer) animatedValue).intValue());
    }
}
