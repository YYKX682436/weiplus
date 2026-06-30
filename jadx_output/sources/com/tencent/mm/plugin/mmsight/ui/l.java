package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton f149358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f149359e;

    public l(com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton, boolean z17) {
        this.f149358d = improveMMSightRecordButton;
        this.f149359e = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("match max progress to play reverse ani, ani end ");
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton = this.f149358d;
        sb6.append(improveMMSightRecordButton.f149162u);
        sb6.append(", ");
        sb6.append(improveMMSightRecordButton.f149147J);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", sb6.toString());
        if (!improveMMSightRecordButton.f149147J) {
            improveMMSightRecordButton.f149162u = false;
            return;
        }
        if (!improveMMSightRecordButton.f149162u) {
            com.tencent.mm.plugin.mmsight.ui.u3 u3Var = improveMMSightRecordButton.f149157p;
            if (u3Var != null) {
                ((yt3.v2) u3Var).a();
                return;
            }
            return;
        }
        improveMMSightRecordButton.f149162u = false;
        com.tencent.mm.plugin.mmsight.ui.b2 b2Var = improveMMSightRecordButton.F;
        if (b2Var != null) {
            b2Var.a(this.f149359e);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "match max progress to play reverse ani, ani start");
        int i17 = com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton.L;
        this.f149358d.e();
    }
}
