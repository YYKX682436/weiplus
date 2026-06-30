package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton f149332d;

    public g(com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton) {
        this.f149332d = improveMMSightRecordButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playReverseAni record ani >> ani end ");
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton = this.f149332d;
        sb6.append(improveMMSightRecordButton.f149162u);
        sb6.append(", ");
        sb6.append(improveMMSightRecordButton.f149147J);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", sb6.toString());
        if (!improveMMSightRecordButton.f149147J) {
            improveMMSightRecordButton.f149162u = false;
            return;
        }
        if (improveMMSightRecordButton.f149162u) {
            com.tencent.mm.plugin.mmsight.ui.r rVar = improveMMSightRecordButton.f149155n;
            if (rVar != null) {
                ((yt3.w2) rVar).a();
            }
            improveMMSightRecordButton.f149162u = false;
            return;
        }
        int i17 = improveMMSightRecordButton.K;
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "tap to auto record");
            com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton.a(improveMMSightRecordButton, true);
            return;
        }
        if (i17 != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "tap to take picture");
            com.tencent.mm.plugin.mmsight.ui.u3 u3Var = improveMMSightRecordButton.f149157p;
            if (u3Var != null) {
                ((yt3.v2) u3Var).a();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "tap to delay record RECORD_MODE_DELAY_WAITING");
        improveMMSightRecordButton.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "changeToRecordDelayRunning");
        improveMMSightRecordButton.K = 4;
        android.view.View view = improveMMSightRecordButton.f149153i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayRunning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayRunning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = improveMMSightRecordButton.f149152h;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view2 = improveMMSightRecordButton.f149148d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayRunning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayRunning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.mmsight.ui.c cVar = improveMMSightRecordButton.f149158q;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "countDownStart");
            ju3.d0.k(((yt3.y2) cVar).f465726a.f465738e, ju3.c0.O2, null, 2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni record ani >> ani start");
        int i17 = com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton.L;
        this.f149332d.e();
    }
}
