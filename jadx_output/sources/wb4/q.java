package wb4;

/* loaded from: classes4.dex */
public class q extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.r f444421d;

    public q(wb4.r rVar) {
        this.f444421d = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailClickAnimation", "onAnimation end");
        wb4.r rVar = this.f444421d;
        android.view.View view = wb4.r.b(rVar).B;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        wb4.r.b(rVar).B.setScaleY(1.0f);
        android.view.View view2 = wb4.r.b(rVar).B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = wb4.r.b(rVar).C;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(valueOf);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (wb4.r.b(rVar).Y && a84.y0.e(wb4.r.b(rVar).W)) {
            android.view.View childAt = wb4.r.b(rVar).W.getChildAt(0);
            if (childAt instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView) {
                ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) childAt).M(0, false);
            }
        }
        xb4.x xVar = rVar.f444413a;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$3");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailClickAnimation", "onAnimation start");
        xb4.x xVar = this.f444421d.f444413a;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailClickAnimation$3");
    }
}
