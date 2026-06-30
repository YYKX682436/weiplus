package wb4;

/* loaded from: classes4.dex */
public class w extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.x f444429d;

    public w(wb4.x xVar) {
        this.f444429d = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation end");
        wb4.x xVar = this.f444429d;
        wb4.x.b(xVar).f228790t.setScaleX(1.0f);
        wb4.x.b(xVar).f228790t.setScaleY(1.0f);
        wb4.x.b(xVar).f228790t.setAlpha(1.0f);
        xb4.x xVar2 = xVar.f444413a;
        if (xVar2 != null) {
            xVar2.onAnimationEnd();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation start");
        xb4.x xVar = this.f444429d.f444413a;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailClickAnimation$2");
    }
}
