package com.tencent.mm.view;

/* loaded from: classes10.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f213519d;

    public c(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f213519d = refreshLoadMoreLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f213519d;
        yz5.p onTranslateYCallback = refreshLoadMoreLayout.getOnTranslateYCallback();
        if (onTranslateYCallback != null) {
            onTranslateYCallback.invoke(0, java.lang.Integer.valueOf((int) refreshLoadMoreLayout.getTranslationY()));
        }
        com.tencent.mm.view.RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout = refreshLoadMoreLayout.getStickTopLoadingLayout();
        if (stickTopLoadingLayout != null) {
            stickTopLoadingLayout.a(refreshLoadMoreLayout.getA() - java.lang.Math.abs(refreshLoadMoreLayout.getTranslationY()));
        }
    }
}
