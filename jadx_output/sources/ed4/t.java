package ed4;

/* loaded from: classes4.dex */
public class t implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.p0 f251324a;

    public t(ed4.v vVar, com.tencent.mm.plugin.sns.ui.item.p0 p0Var) {
        this.f251324a = p0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
        com.tencent.mm.plugin.sns.ui.item.p0 p0Var = this.f251324a;
        p0Var.M0.setVisibility(8);
        p0Var.M0.setImageDrawable(new android.graphics.drawable.ColorDrawable(p0Var.M0.getContext().getResources().getColor(com.tencent.mm.R.color.f478492d)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
    }
}
