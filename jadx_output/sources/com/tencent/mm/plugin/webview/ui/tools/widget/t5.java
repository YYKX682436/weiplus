package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class t5 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187543a;

    public t5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187543a = z5Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation ani) {
        kotlin.jvm.internal.o.g(ani, "ani");
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187543a;
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var2 = z5Var.getWeakThis$plugin_webview_release().get();
        kotlin.jvm.internal.o.e(z5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
        z5Var2.setVisibility(8);
        z5Var.D.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
