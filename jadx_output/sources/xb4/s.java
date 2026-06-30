package xb4;

/* loaded from: classes4.dex */
public class s extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.v f452983d;

    public s(xb4.v vVar) {
        this.f452983d = vVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation$2");
        xb4.v vVar = this.f452983d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        s74.p0 p0Var = vVar.f452992c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        if (!p0Var.f169303w0) {
            xb4.v vVar2 = this.f452983d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
            s74.p0 p0Var2 = vVar2.f452992c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
            p0Var2.f169303w0 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdDynamicCardClickAnimation", "holder is busy");
        xb4.v vVar3 = this.f452983d;
        vVar3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        vVar3.f452994e.end();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdDynamicCardClickAnimation$2");
    }
}
