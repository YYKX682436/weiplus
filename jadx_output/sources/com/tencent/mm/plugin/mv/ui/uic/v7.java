package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes2.dex */
public final class v7 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f151506f;

    public v7(int i17, int i18, android.view.View view) {
        this.f151504d = i17;
        this.f151505e = i18;
        this.f151506f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator value) {
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(value, "value");
        float animatedFraction = value.getAnimatedFraction();
        float f17 = this.f151504d + ((this.f151505e - r0) * animatedFraction);
        android.view.View view = this.f151506f;
        android.view.ViewGroup.LayoutParams layoutParams = (view == null || (findViewById = view.findViewById(com.tencent.mm.R.id.ojy)) == null) ? null : findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) f17;
        }
        android.view.View findViewById2 = view != null ? view.findViewById(com.tencent.mm.R.id.ojy) : null;
        if (findViewById2 == null) {
            return;
        }
        findViewById2.setLayoutParams(layoutParams);
    }
}
