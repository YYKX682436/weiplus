package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class g implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout f144405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f144406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.a f144407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f144408g;

    public g(com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout, yz5.q qVar, com.tencent.mm.plugin.lite.ui.a aVar, float f17) {
        this.f144405d = scrollableFrameLayout;
        this.f144406e = qVar;
        this.f144407f = aVar;
        this.f144408g = f17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f144405d.f144307w = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd the translationY  ");
        float f17 = this.f144408g;
        sb6.append(f17);
        com.tencent.mars.xlog.Log.i("ScrollableFrameLayout", sb6.toString());
        yz5.q qVar = this.f144406e;
        if (qVar != null) {
            qVar.invoke(this.f144407f, 1, java.lang.Float.valueOf(f17));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f144405d.f144307w = true;
        yz5.q qVar = this.f144406e;
        if (qVar != null) {
            qVar.invoke(this.f144407f, 0, java.lang.Float.valueOf(0.0f));
        }
    }
}
