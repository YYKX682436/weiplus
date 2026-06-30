package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes4.dex */
public class b3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149296d;

    public b3(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149296d = sightCaptureUI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149296d;
        wu5.c cVar = sightCaptureUI.f149250x1;
        if (cVar == null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.mmsight.ui.m2(sightCaptureUI));
        } else {
            if (cVar.isDone()) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.mmsight.ui.m2(sightCaptureUI));
                return;
            }
            android.view.View view = sightCaptureUI.f149243s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$26", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$26", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f149296d.f149241q.setEnabled(false);
    }
}
