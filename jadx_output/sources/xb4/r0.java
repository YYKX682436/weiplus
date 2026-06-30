package xb4;

/* loaded from: classes4.dex */
public class r0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u74.d f452981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xb4.s0 f452982e;

    public r0(xb4.s0 s0Var, u74.d dVar) {
        this.f452982e = s0Var;
        this.f452981d = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAnim.click", "onAnimation end");
        android.view.View view = this.f452981d.f425165z;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        this.f452981d.f425165z.setScaleY(1.0f);
        android.view.View view2 = this.f452981d.f425165z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f452981d.f425142c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(valueOf);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = this.f452981d.f425145f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(valueOf);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/animation/timeline/FullCardAdClickAnimationNew$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        xb4.x xVar = this.f452982e.f453001b;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        this.f452981d.T.f425134d = false;
        u74.d dVar = this.f452981d;
        if (dVar.T.f425133c) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = dVar.f425162w;
            if (snsTimelineVideoView != null) {
                snsTimelineVideoView.M(0, false);
            }
        } else if (dVar.f425154o.f168417g.getVisibility() == 0) {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView = this.f452981d.f425154o.f168417g;
            snsAdTimelineVideoView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            m3.a aVar = snsAdTimelineVideoView.f170830z;
            if (aVar != null) {
                aVar.accept(java.lang.Boolean.TRUE);
            }
            snsAdTimelineVideoView.k(0, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replayVideos", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAnim.click", "seek newVideoView to 0");
        }
        fd4.l lVar = this.f452981d.T.f425135e;
        if (lVar != null) {
            lVar.e();
        }
        c84.f fVar = this.f452981d.T.f425136f;
        if (fVar != null) {
            fVar.onAnimationEnd(animator);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAnim.click", "onAnimation start");
        xb4.x xVar = this.f452982e.f453001b;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$4");
    }
}
