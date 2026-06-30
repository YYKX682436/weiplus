package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f144436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.a f144437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f144438g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f144439h;

    public m(com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView, yz5.q qVar, com.tencent.mm.plugin.lite.ui.a aVar, float f17, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f144435d = wxaHalfScreenLiteAppView;
        this.f144436e = qVar;
        this.f144437f = aVar;
        this.f144438g = f17;
        this.f144439h = viewPropertyAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f144435d.setDoingPropertyAnimation(false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd the translationX  ");
        float f17 = this.f144438g;
        sb6.append(f17);
        com.tencent.mars.xlog.Log.i("ScrollableFrameLayout", sb6.toString());
        com.tencent.mm.plugin.lite.ui.a aVar = com.tencent.mm.plugin.lite.ui.a.f144378d;
        com.tencent.mm.plugin.lite.ui.a aVar2 = this.f144437f;
        if (aVar == aVar2) {
            this.f144439h.alpha(0.0f);
        }
        yz5.q qVar = this.f144436e;
        if (qVar != null) {
            qVar.invoke(aVar2, 1, java.lang.Float.valueOf(f17));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f144435d.setDoingPropertyAnimation(true);
        yz5.q qVar = this.f144436e;
        if (qVar != null) {
            qVar.invoke(this.f144437f, 0, java.lang.Float.valueOf(0.0f));
        }
    }
}
