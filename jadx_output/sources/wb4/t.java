package wb4;

/* loaded from: classes4.dex */
public class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.u f444425d;

    public t(wb4.u uVar) {
        this.f444425d = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation end");
        wb4.u uVar = this.f444425d;
        wb4.u.b(uVar).f228790t.setScaleX(1.0f);
        wb4.u.b(uVar).f228790t.setScaleY(1.0f);
        wb4.u.b(uVar).f228790t.setAlpha(1.0f);
        xb4.x xVar = uVar.f444412a;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation start");
        xb4.x xVar = this.f444425d.f444412a;
        if (xVar != null) {
            xVar.onAnimationStart();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
    }
}
