package wb4;

/* loaded from: classes4.dex */
public class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wb4.h f444406f;

    public g(wb4.h hVar, android.view.View view, java.util.List list) {
        this.f444406f = hVar;
        this.f444404d = view;
        this.f444405e = list;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailClickAnimation", "onAnimation end");
        android.view.View view = this.f444404d;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f444404d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f444405e;
            if (i17 >= list.size()) {
                break;
            }
            android.view.View view3 = (android.view.View) list.get(i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(valueOf);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/detail/AdDetailDynamicCardClickAnimation$3", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation");
        wb4.h hVar = this.f444406f;
        dc4.p pVar = hVar.f444408b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation");
        s74.o2 l17 = pVar.l();
        if (l17 != null && a84.y0.e(l17.C().b())) {
            android.view.View childAt = l17.C().b().getChildAt(0);
            if (childAt instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView) {
                ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) childAt).M(0, false);
            }
        }
        xb4.x xVar = hVar.f444413a;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation$3");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailClickAnimation", "onAnimation start");
        xb4.x xVar = this.f444406f.f444413a;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.AdDetailDynamicCardClickAnimation$3");
    }
}
