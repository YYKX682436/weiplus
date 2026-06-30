package v74;

/* loaded from: classes4.dex */
public final class g1 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v74.h1 f433797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f433798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f433799g;

    public g1(v74.h1 h1Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f433797e = h1Var;
        this.f433798f = h0Var;
        this.f433799g = h0Var2;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("SplashCardLogic", "onAnimationEnd, isCanceled=" + this.f39706d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        v74.h1 h1Var = this.f433797e;
        h1Var.f433812l = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsPlayingAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        if (this.f39706d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
            return;
        }
        android.view.View a17 = v74.h1.a(h1Var);
        if (a17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$startAnim$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            a17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$startAnim$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        kotlin.jvm.internal.h0 h0Var = this.f433798f;
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = (com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView) h0Var.f310123d;
        if (overScrollRecyclerView != null) {
            overScrollRecyclerView.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView2 = (com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView) h0Var.f310123d;
        if (overScrollRecyclerView2 != null) {
            overScrollRecyclerView2.setTranslationX(0.0f);
        }
        kotlin.jvm.internal.h0 h0Var2 = this.f433799g;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) h0Var2.f310123d;
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.setAlpha(0.0f);
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout2 = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) h0Var2.f310123d;
        if (roundedCornerFrameLayout2 != null) {
            roundedCornerFrameLayout2.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setRecyclerViewActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        h1Var.f(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setRecyclerViewActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        h1Var.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnAnimEndAction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        yz5.a aVar = h1Var.f433810j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnAnimEndAction$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f39706d = false;
        com.tencent.mars.xlog.Log.i("SplashCardLogic", "onAnimationStart");
        android.view.View a17 = v74.h1.a(this.f433797e);
        if (a17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$startAnim$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            a17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/SplashCardLogic$startAnim$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = (com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView) this.f433798f.f310123d;
        if (overScrollRecyclerView != null) {
            overScrollRecyclerView.setAlpha(1.0f);
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) this.f433799g.f310123d;
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$2");
    }
}
