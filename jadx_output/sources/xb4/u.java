package xb4;

/* loaded from: classes4.dex */
public class u extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f452987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f452988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xb4.v f452989f;

    public u(xb4.v vVar, android.view.View view, java.util.List list) {
        this.f452989f = vVar;
        this.f452987d = view;
        this.f452988e = list;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDynamicCardClickAnimation", "onAnimation end");
        android.view.View view = this.f452987d;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        this.f452987d.setScaleY(1.0f);
        android.view.View view2 = this.f452987d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        for (int i17 = 0; i17 < this.f452988e.size(); i17++) {
            android.view.View view3 = (android.view.View) this.f452988e.get(i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(valueOf);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdDynamicCardClickAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (a84.y0.e(xb4.v.b(this.f452989f).C().b())) {
            android.view.View childAt = xb4.v.b(this.f452989f).C().b().getChildAt(0);
            if (childAt instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView) {
                ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) childAt).M(0, false);
                if (xb4.v.b(this.f452989f) != null) {
                    xb4.v.b(this.f452989f).Z();
                }
            }
        }
        xb4.x xVar = this.f452989f.f453001b;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        xb4.v vVar = this.f452989f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        s74.p0 p0Var = vVar.f452992c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        p0Var.f169303w0 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDynamicCardClickAnimation", "onAnimation start");
        xb4.x xVar = this.f452989f.f453001b;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation$4");
    }
}
