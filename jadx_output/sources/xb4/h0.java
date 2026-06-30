package xb4;

/* loaded from: classes4.dex */
public class h0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.i0 f452941d;

    public h0(xb4.i0 i0Var) {
        this.f452941d = i0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdClickAnimation", "onAnimation end");
        xb4.i0.b(this.f452941d).E0.setScaleX(1.0f);
        xb4.i0.b(this.f452941d).E0.setScaleY(1.0f);
        xb4.i0.b(this.f452941d).E0.setAlpha(1.0f);
        xb4.i0.b(this.f452941d).F0.setAlpha(1.0f);
        if (xb4.i0.b(this.f452941d).Y0 && a84.y0.e(xb4.i0.b(this.f452941d).X0)) {
            android.view.View childAt = xb4.i0.b(this.f452941d).X0.getChildAt(0);
            if (childAt instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView) {
                ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) childAt).M(0, false);
            }
        }
        xb4.x xVar = this.f452941d.f453001b;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        xb4.i0.b(this.f452941d).f169303w0 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdClickAnimation", "onAnimation start");
        xb4.x xVar = this.f452941d.f453001b;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
    }
}
