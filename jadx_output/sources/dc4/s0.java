package dc4;

/* loaded from: classes4.dex */
public class s0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.u0 f228815a;

    public s0(dc4.u0 u0Var) {
        this.f228815a = u0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
        dc4.u0 u0Var = this.f228815a;
        dc4.v0.l(u0Var.f228830a).setVisibility(8);
        dc4.v0.l(u0Var.f228830a).setImageDrawable(new android.graphics.drawable.ColorDrawable(dc4.v0.l(u0Var.f228830a).getResources().getColor(com.tencent.mm.R.color.f478492d)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
    }
}
