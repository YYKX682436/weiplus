package p44;

/* loaded from: classes4.dex */
public final class n0 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p44.o0 f351809e;

    public n0(p44.o0 o0Var) {
        this.f351809e = o0Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$startTitleChangeAnim$1$a1$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTitleText$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        p44.o0 o0Var = this.f351809e;
        android.widget.TextView textView = o0Var.f351817g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTitleText$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        if (textView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRandomPickCardAdInfo$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            p44.r rVar = o0Var.f351825o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRandomPickCardAdInfo$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
            if (rVar == null || (str = rVar.b()) == null) {
                str = "";
            }
            textView.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$startTitleChangeAnim$1$a1$1$1");
    }
}
