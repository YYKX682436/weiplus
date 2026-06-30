package xb4;

/* loaded from: classes4.dex */
public final class j extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.l f452948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f452949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f452950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w64.x f452951g;

    public j(xb4.l lVar, android.view.View view, java.util.List list, w64.x xVar) {
        this.f452948d = lVar;
        this.f452949e = view;
        this.f452950f = list;
        this.f452951g = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$4");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdCommonClickAnimation", "onAnimation end");
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        android.view.View view = this.f452949e;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f452949e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.List list = this.f452950f;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view3 = (android.view.View) list.get(i17);
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(valueOf);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        w64.x xVar = this.f452951g;
        w64.w d17 = xVar.d();
        if (d17 != null) {
            d17.a(0);
        }
        xb4.l lVar = this.f452948d;
        xb4.x xVar2 = lVar.f453001b;
        if (xVar2 != null) {
            xVar2.onAnimationEnd();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        boolean z17 = lVar.f452959d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation");
        if (!z17) {
            vb4.a.b(xVar.b(), false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$4");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdCommonClickAnimation", "onAnimation start");
        xb4.x xVar = this.f452948d.f453001b;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonClickAnimation$4");
    }
}
