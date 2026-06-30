package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class f0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f149324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton f149325e;

    public f0(com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton, long j17) {
        this.f149325e = mMSightRecordButton;
        this.f149324d = j17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton mMSightRecordButton = this.f149325e;
        if (mMSightRecordButton.f149194d > 0 && this.f149324d <= 500 && !mMSightRecordButton.f149201n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "on Simple Tap, isDispatchSimpleTap: %s, isDispatchLongPress: %s", java.lang.Boolean.valueOf(mMSightRecordButton.f149200m), java.lang.Boolean.valueOf(mMSightRecordButton.f149201n));
            mMSightRecordButton.f149200m = true;
            if (mMSightRecordButton.f149201n) {
                return;
            }
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.a(mMSightRecordButton);
            com.tencent.mm.plugin.mmsight.ui.j0 j0Var = mMSightRecordButton.f149212y;
            if (j0Var != null) {
                j0Var.a();
                return;
            }
            return;
        }
        if (mMSightRecordButton.f149201n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "on Long Press finish ，isRecordIng:%b", java.lang.Boolean.valueOf(mMSightRecordButton.f149199i));
            if (mMSightRecordButton.f149199i) {
                mMSightRecordButton.f149199i = false;
            }
            com.tencent.mm.plugin.mmsight.ui.h0 h0Var = mMSightRecordButton.f149213z;
            if (h0Var != null) {
                h0Var.c();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "error action up");
        if (mMSightRecordButton.f149199i) {
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.a(mMSightRecordButton);
        }
        com.tencent.mm.plugin.mmsight.ui.g0 g0Var = mMSightRecordButton.B;
        if (g0Var != null) {
            com.tencent.mm.plugin.mmsight.ui.k3 k3Var = (com.tencent.mm.plugin.mmsight.ui.k3) g0Var;
            k3Var.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.TestCaptureUiEvent", "onErrorUp: %s", com.tencent.mm.sdk.platformtools.z3.b(true));
            com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = k3Var.f149357a;
            ei3.m mVar = sightCaptureUI.f149235m;
            if (mVar != null) {
                mVar.cancel();
                if (sightCaptureUI.f149228d == 0) {
                    com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.T6(sightCaptureUI);
                }
            }
        }
    }
}
