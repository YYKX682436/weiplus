package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class en implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.TranslateControllerView f198991d;

    public en(com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView) {
        this.f198991d = translateControllerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        com.tencent.mm.ui.chatting.component.TranslateControllerView.a(this.f198991d, ((java.lang.Integer) animatedValue).intValue());
    }
}
