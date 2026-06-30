package mx0;

/* loaded from: classes5.dex */
public final class z2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton f332463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f332465f;

    public z2(com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton, boolean z17, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f332463d = recordButton;
        this.f332464e = z17;
        this.f332465f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "outerView ani end");
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton = this.f332463d;
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularCustomProgressBar recordButtonCircularCustomProgressBar = recordButton.f69505h;
        if (recordButtonCircularCustomProgressBar != null) {
            recordButtonCircularCustomProgressBar.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startProgress ");
        sb6.append(recordButton.f69518x);
        sb6.append(", ");
        sb6.append(recordButton.f69519y);
        sb6.append(", ");
        sb6.append(recordButton.isEnabled());
        sb6.append(", ");
        boolean z17 = this.f332464e;
        sb6.append(z17);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.RecordButton", sb6.toString(), new java.lang.Object[0]);
        if (recordButton.f69510p) {
            recordButton.f69520z = java.lang.System.currentTimeMillis();
            if (z17) {
                mx0.a0 a0Var = recordButton.f69506i;
                if (a0Var != null) {
                    ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) ((mx0.e3) a0Var).f331943a.f331991e).q0();
                }
            } else {
                mx0.a0 a0Var2 = recordButton.f69506i;
                if (a0Var2 != null) {
                    ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) ((mx0.e3) a0Var2).f331943a.f331991e).q0();
                }
            }
            recordButton.f69511q = true;
            com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar recordButtonCircularProgressBar = recordButton.f69504g;
            if (recordButtonCircularProgressBar != null) {
                recordButtonCircularProgressBar.setVisibility(recordButton.F ? 0 : 8);
            }
            com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar recordButtonCircularProgressBar2 = recordButton.f69504g;
            if (recordButtonCircularProgressBar2 != null) {
                recordButtonCircularProgressBar2.f69534m = 0.0f;
                recordButtonCircularProgressBar2.invalidate();
            }
            com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButtonCircularProgressBar recordButtonCircularProgressBar3 = recordButton.f69504g;
            if (recordButtonCircularProgressBar3 != null) {
                int i17 = recordButton.f69518x;
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordButtonCircularProgressBar", "setInitData >> " + i17 + ", " + recordButton.f69519y);
                recordButtonCircularProgressBar3.f69535n = (float) i17;
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordButton", "startProgress but is enable, is cancel");
        }
        this.f332465f.setListener(null);
    }
}
