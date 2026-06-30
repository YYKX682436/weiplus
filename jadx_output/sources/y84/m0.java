package y84;

/* loaded from: classes4.dex */
public final class m0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f460149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460150e;

    public m0(y84.h3 h3Var) {
        this.f460150e = h3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$handleInteractType$1$1$2$1$cardAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f460149d = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$handleInteractType$1$1$2$1$cardAnim$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$handleInteractType$1$1$2$1$cardAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        boolean z17 = this.f460149d;
        y84.h3 h3Var = this.f460150e;
        if (z17) {
            com.tencent.mars.xlog.Log.w(h3Var.j(), "select card init status, anim is canceled");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$handleInteractType$1$1$2$1$cardAnim$1$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout c07 = h3Var.c0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (c07 != null) {
            c07.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRecyclerContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout n07 = h3Var.n0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRecyclerContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (n07 != null) {
            n07.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.view.View i07 = h3Var.i0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (i07 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(i07, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$handleInteractType$1$1$2$1$cardAnim$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i07.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(i07, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$handleInteractType$1$1$2$1$cardAnim$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.view.View p07 = h3Var.p0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (p07 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p07, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$handleInteractType$1$1$2$1$cardAnim$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p07.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p07, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$handleInteractType$1$1$2$1$cardAnim$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCardAnimContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout X = h3Var.X();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCardAnimContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (X != null) {
            X.setVisibility(4);
        }
        y84.h3.O(h3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$handleInteractType$1$1$2$1$cardAnim$1$1");
    }
}
