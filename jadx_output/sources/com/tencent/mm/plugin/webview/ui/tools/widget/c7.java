package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class c7 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f187140d;

    public c7(com.tencent.mm.plugin.webview.ui.tools.widget.d7 d7Var, java.lang.Runnable runnable) {
        this.f187140d = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Runnable runnable = this.f187140d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
