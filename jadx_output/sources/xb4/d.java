package xb4;

/* loaded from: classes4.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f452921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w64.x f452922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xb4.f f452923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f452924g;

    public d(java.util.List list, w64.x xVar, xb4.f fVar, android.view.View view) {
        this.f452921d = list;
        this.f452922e = xVar;
        this.f452923f = fVar;
        this.f452924g = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$4");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdCommonBackAnimation", "onAnimation end");
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        android.view.View view = this.f452924g;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        android.view.View view2 = this.f452924g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.List list = this.f452921d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view3 = (android.view.View) list.get(i17);
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(valueOf);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        xb4.f fVar = this.f452923f;
        xb4.x xVar = fVar.f452997a;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        boolean z17 = fVar.f452933c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDetail", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation");
        if (!z17) {
            vb4.a.b(this.f452922e.b(), false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView;
        java.util.List list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$4");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdCommonBackAnimation", "onAnimation start");
        java.util.List list2 = this.f452921d;
        int size = list2.size();
        int i17 = 0;
        while (i17 < size) {
            android.view.View view = (android.view.View) list2.get(i17);
            if (view == null) {
                list = list2;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                list = list2;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            i17++;
            list2 = list;
        }
        w64.u a17 = this.f452922e.a();
        if (a17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("backAnimStart", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1$backAnimListener$1");
            u74.d dVar = ((l44.h4) a17).f316166a;
            u74.c cVar = dVar.T;
            if (cVar != null && cVar.f425138h && (snsAdBreakFrameVideoView = dVar.f425156q) != null) {
                snsAdBreakFrameVideoView.h(true);
                dVar.f425156q.g();
                com.tencent.mars.xlog.Log.i("ClickActionHelper", "mSnsAdBreakFrameVideoView restart");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("backAnimStart", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1$backAnimListener$1");
        }
        xb4.x xVar = this.f452923f.f452997a;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$4");
    }
}
