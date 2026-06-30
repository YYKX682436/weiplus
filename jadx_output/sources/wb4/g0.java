package wb4;

/* loaded from: classes4.dex */
public class g0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.h0 f444407d;

    public g0(wb4.h0 h0Var) {
        this.f444407d = h0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereCardAdDetailClickAnimation", "onAnimation end");
        wb4.h0 h0Var = this.f444407d;
        android.view.View view = wb4.h0.b(h0Var).f228850z;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        wb4.h0.b(h0Var).f228850z.setScaleY(1.0f);
        android.view.View view2 = wb4.h0.b(h0Var).f228850z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = wb4.h0.b(h0Var).f228841q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(valueOf);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = wb4.h0.b(h0Var).f228842r;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(valueOf);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/animation/detail/SphereCardAdDetailClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        xb4.x xVar = h0Var.f444413a;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        wb4.h0.b(h0Var).f228848x.k();
        wb4.h0.b(h0Var).f228848x.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereCardAdDetailClickAnimation", "onAnimation start");
        xb4.x xVar = this.f444407d.f444413a;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SphereCardAdDetailClickAnimation$4");
    }
}
