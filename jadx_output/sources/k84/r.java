package k84;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k84.q1 q1Var) {
        super(0);
        this.f305214d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContinuousBgAlpha$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContinuousBgAlpha$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView L = this.f305214d.L();
        android.view.ViewGroup viewGroup = L != null ? (android.view.ViewGroup) L.findViewById(com.tencent.mm.R.id.q48) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContinuousBgAlpha$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContinuousBgAlpha$2");
        return viewGroup;
    }
}
