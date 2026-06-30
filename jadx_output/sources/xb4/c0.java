package xb4;

/* loaded from: classes4.dex */
public class c0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d0 f452919d;

    public c0(xb4.d0 d0Var) {
        this.f452919d = d0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdBackAnimation", "onAnimation end");
        xb4.d0.b(this.f452919d).E0.setScaleX(1.0f);
        xb4.d0.b(this.f452919d).E0.setScaleY(1.0f);
        xb4.d0.b(this.f452919d).E0.setAlpha(1.0f);
        xb4.d0.b(this.f452919d).F0.setAlpha(1.0f);
        xb4.x xVar = this.f452919d.f452997a;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        xb4.d0.b(this.f452919d).f169303w0 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdBackAnimation", "onAnimation start");
        xb4.d0 d0Var = this.f452919d;
        xb4.d0.b(d0Var).F0.setAlpha(0.0f);
        xb4.x xVar = d0Var.f452997a;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
    }
}
