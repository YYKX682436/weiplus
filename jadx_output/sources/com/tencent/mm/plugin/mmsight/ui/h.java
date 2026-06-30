package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton f149336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f149337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f149338f;

    public h(com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton, boolean z17, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f149336d = improveMMSightRecordButton;
        this.f149337e = z17;
        this.f149338f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "outerView ani end");
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton = this.f149336d;
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularCustomProgressBar improveMMSightCircularCustomProgressBar = improveMMSightRecordButton.f149151g;
        if (improveMMSightCircularCustomProgressBar != null) {
            improveMMSightCircularCustomProgressBar.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startProgress ");
        sb6.append(improveMMSightRecordButton.D);
        sb6.append(", ");
        sb6.append(improveMMSightRecordButton.E);
        sb6.append(", ");
        sb6.append(improveMMSightRecordButton.isEnabled());
        sb6.append(", ");
        boolean z17 = this.f149337e;
        sb6.append(z17);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ImproveMMSightRecordButton", sb6.toString(), new java.lang.Object[0]);
        if (improveMMSightRecordButton.f149161t) {
            improveMMSightRecordButton.G = java.lang.System.currentTimeMillis();
            if (z17) {
                com.tencent.mm.plugin.mmsight.ui.r rVar = improveMMSightRecordButton.f149155n;
                if (rVar != null) {
                    ((yt3.w2) rVar).f465707a.n(true);
                }
            } else {
                com.tencent.mm.plugin.mmsight.ui.r rVar2 = improveMMSightRecordButton.f149155n;
                if (rVar2 != null) {
                    ((yt3.w2) rVar2).f465707a.n(false);
                }
            }
            improveMMSightRecordButton.f149162u = true;
            com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar = improveMMSightRecordButton.f149150f;
            if (improveMMSightCircularProgressBar != null) {
                improveMMSightCircularProgressBar.setVisibility(0);
            }
            com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar2 = improveMMSightRecordButton.f149150f;
            if (improveMMSightCircularProgressBar2 != null) {
                int i17 = improveMMSightRecordButton.D;
                int i18 = improveMMSightRecordButton.E;
                com.tencent.mm.plugin.mmsight.ui.m mVar = new com.tencent.mm.plugin.mmsight.ui.m(improveMMSightRecordButton);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightCircularProgressBar", "setInitData >> " + i17 + ", " + i18);
                improveMMSightCircularProgressBar2.f149143o = (float) i17;
                improveMMSightCircularProgressBar2.f149144p = (float) i18;
                improveMMSightCircularProgressBar2.f149141m = mVar;
            }
            com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar improveMMSightCircularProgressBar3 = improveMMSightRecordButton.f149150f;
            if (improveMMSightCircularProgressBar3 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightCircularProgressBar", "startProgress");
                com.tencent.mm.plugin.mmsight.ui.q qVar = improveMMSightCircularProgressBar3.f149146r;
                if (qVar != null) {
                    qVar.f149402j = false;
                    kotlinx.coroutines.r2 r2Var = qVar.f149396d;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                    qVar.f149396d = null;
                    qVar.f149399g = 0L;
                    qVar.f149403k = null;
                    improveMMSightCircularProgressBar3.f149146r = null;
                }
                com.tencent.mm.plugin.mmsight.ui.q qVar2 = new com.tencent.mm.plugin.mmsight.ui.q(improveMMSightCircularProgressBar3.f149143o, improveMMSightCircularProgressBar3.f149144p);
                qVar2.f149403k = new com.tencent.mm.plugin.mmsight.ui.d(improveMMSightCircularProgressBar3);
                qVar2.f149399g = java.lang.System.currentTimeMillis();
                qVar2.f149402j = true;
                kotlinx.coroutines.r2 r2Var2 = qVar2.f149396d;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
                qVar2.f149396d = kotlinx.coroutines.l.d(qVar2.f149395c, null, null, new com.tencent.mm.plugin.mmsight.ui.o(qVar2, null), 3, null);
                improveMMSightCircularProgressBar3.f149146r = qVar2;
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImproveMMSightRecordButton", "startProgress but is enable, is cancel");
        }
        this.f149338f.setListener(null);
    }
}
