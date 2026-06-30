package fc4;

/* loaded from: classes3.dex */
public final class b implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.g f261094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f261095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f261096f;

    public b(fc4.g gVar, android.view.View view, com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView) {
        this.f261094d = gVar;
        this.f261095e = view;
        this.f261096f = flexibleVideoView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f261095e.clearAnimation();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getControlLayout$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        android.view.View view = this.f261094d.f261145e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getControlLayout$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f261096f.setClipBounds(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getControlLayout$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        android.view.View view = this.f261094d.f261145e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getControlLayout$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$1");
    }
}
