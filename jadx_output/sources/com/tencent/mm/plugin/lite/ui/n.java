package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f144446e;

    public n(com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView, float f17) {
        this.f144445d = wxaHalfScreenLiteAppView;
        this.f144446e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.lite.ui.c uiEventListener = this.f144445d.getUiEventListener();
        if (uiEventListener != null) {
            uiEventListener.b(this.f144446e);
        }
    }
}
