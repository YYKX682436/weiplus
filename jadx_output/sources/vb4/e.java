package vb4;

/* loaded from: classes4.dex */
public class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f434809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.f f434810e;

    public e(vb4.f fVar, boolean z17) {
        this.f434810e = fVar;
        this.f434809d = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        vb4.f fVar = this.f434810e;
        fVar.f434813p = currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        vb4.c cVar = fVar.f434796c;
        if (cVar != null) {
            cVar.onAnimationEnd();
        }
        if (!this.f434809d) {
            android.view.View view = fVar.f434794a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        vb4.f fVar = this.f434810e;
        fVar.f434812o = currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) fVar.f434794a.getLayoutParams();
        layoutParams.leftMargin = fVar.f434797d;
        layoutParams.topMargin = fVar.f434798e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) fVar.f434794a.getParent();
        if (this.f434809d) {
            layoutParams.rightMargin = (viewGroup.getWidth() - (fVar.f434804k - fVar.f434802i)) - layoutParams.leftMargin;
            layoutParams.bottomMargin = (viewGroup.getHeight() - (fVar.f434803j - fVar.f434801h)) - layoutParams.topMargin;
        } else {
            layoutParams.rightMargin = (viewGroup.getWidth() - fVar.f434799f) - layoutParams.leftMargin;
            layoutParams.bottomMargin = (viewGroup.getHeight() - fVar.f434800g) - layoutParams.topMargin;
        }
        fVar.f434794a.setLayoutParams(layoutParams);
        android.view.View view = fVar.f434794a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        vb4.c cVar = fVar.f434796c;
        if (cVar != null) {
            cVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$2");
    }
}
