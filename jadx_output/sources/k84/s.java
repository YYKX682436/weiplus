package k84;

/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k84.q1 q1Var) {
        super(0);
        this.f305232d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContinuousContent$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContinuousContent$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView L = this.f305232d.L();
        android.view.ViewGroup viewGroup = L != null ? (android.view.ViewGroup) L.findViewById(com.tencent.mm.R.id.q4a) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContinuousContent$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContinuousContent$2");
        return viewGroup;
    }
}
