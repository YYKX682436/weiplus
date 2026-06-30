package g84;

/* loaded from: classes2.dex */
public final class c extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f269548e;

    public c(android.widget.TextView textView) {
        this.f269548e = textView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView$doDisappearAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f269548e.setVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView$doDisappearAnim$1");
    }
}
