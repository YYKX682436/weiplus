package oy2;

/* loaded from: classes8.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout f349998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f349999e;

    public q(com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout, java.lang.Runnable runnable) {
        this.f349998d = scrollFrameLayout;
        this.f349999e = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationCancel ");
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout = this.f349998d;
        sb6.append(scrollFrameLayout.getTranslationY());
        com.tencent.mars.xlog.Log.i("Finder.WebViewFrameLayout", sb6.toString());
        scrollFrameLayout.setAnimating(false);
        scrollFrameLayout.setMPointerTranslateY(0.0f);
        scrollFrameLayout.getClass();
        java.lang.Runnable runnable = this.f349999e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd : ");
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout = this.f349998d;
        sb6.append(scrollFrameLayout.getTranslationY());
        com.tencent.mars.xlog.Log.i("Finder.WebViewFrameLayout", sb6.toString());
        scrollFrameLayout.setAnimating(false);
        scrollFrameLayout.setMPointerTranslateY(0.0f);
        scrollFrameLayout.e();
        java.lang.Runnable runnable = this.f349999e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationStart ");
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout = this.f349998d;
        sb6.append(scrollFrameLayout.getTranslationY());
        com.tencent.mars.xlog.Log.i("Finder.WebViewFrameLayout", sb6.toString());
        scrollFrameLayout.setAnimating(true);
        scrollFrameLayout.setMPointerTranslateY(0.0f);
        scrollFrameLayout.f();
    }
}
