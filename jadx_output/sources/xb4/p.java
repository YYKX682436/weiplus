package xb4;

/* loaded from: classes4.dex */
public class p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f452972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f452973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xb4.q f452974f;

    public p(xb4.q qVar, java.util.List list, android.view.View view) {
        this.f452974f = qVar;
        this.f452972d = list;
        this.f452973e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDynamicCardBackAnimation", "onAnimation end");
        android.view.View view = this.f452973e;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        this.f452973e.setScaleY(1.0f);
        android.view.View view2 = this.f452973e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        for (int i17 = 0; i17 < this.f452972d.size(); i17++) {
            android.view.View view3 = (android.view.View) this.f452972d.get(i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(valueOf);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        xb4.x xVar = this.f452974f.f452997a;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        xb4.q qVar = this.f452974f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation");
        s74.p0 p0Var = qVar.f452977b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation");
        p0Var.f169303w0 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDynamicCardBackAnimation", "onAnimation start");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f452972d;
            if (i17 >= list.size()) {
                break;
            }
            android.view.View view = (android.view.View) list.get(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardBackAnimation$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            i17++;
        }
        xb4.x xVar = this.f452974f.f452997a;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardBackAnimation$4");
    }
}
