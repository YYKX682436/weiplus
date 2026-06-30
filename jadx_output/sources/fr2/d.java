package fr2;

/* loaded from: classes2.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f265711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f265713f;

    public d(android.view.View view, int i17, int i18) {
        this.f265711d = view;
        this.f265712e = i17;
        this.f265713f = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f265711d;
        view.getLayoutParams().width = (int) (this.f265712e + ((this.f265713f - r2) * animatedFraction));
        view.requestLayout();
    }
}
