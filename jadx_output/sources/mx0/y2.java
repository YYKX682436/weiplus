package mx0;

/* loaded from: classes5.dex */
public final class y2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton f332449d;

    public y2(com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton) {
        this.f332449d = recordButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playReverseAni record ani >> ani end ");
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton = this.f332449d;
        sb6.append(recordButton.f69511q);
        sb6.append(", ");
        sb6.append(recordButton.C);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", sb6.toString());
        if (!recordButton.C) {
            recordButton.f69511q = false;
            return;
        }
        if (recordButton.f69511q) {
            mx0.a0 a0Var = recordButton.f69506i;
            if (a0Var != null) {
                ((mx0.e3) a0Var).a();
            }
            recordButton.f69511q = false;
            return;
        }
        if (recordButton.D) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "tap to auto record");
            com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton.a(recordButton, true);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "tap to take picture");
        mx0.x9 x9Var = recordButton.f69507m;
        if (x9Var != null) {
            mx0.g3 g3Var = ((mx0.d3) x9Var).f331916a;
            long j17 = g3Var.f331999p;
            if (j17 != -1) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (android.os.SystemClock.elapsedRealtime() - j17 <= g3Var.f331998o) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap too often! %s", com.tencent.mm.sdk.platformtools.z3.b(true));
                    dx1.g.f244489a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f36310e);
                }
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap %s", com.tencent.mm.sdk.platformtools.z3.b(true));
            g3Var.f331993g.setTouchEnable(false);
            ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) g3Var.f331991e).e1();
            g3Var.f331999p = android.os.SystemClock.elapsedRealtime();
            dx1.g.f244489a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f36310e);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "playReverseAni record ani >> ani start");
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton.G;
        this.f332449d.e();
    }
}
