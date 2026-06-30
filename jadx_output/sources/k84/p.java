package k84;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k84.q1 q1Var) {
        super(0);
        this.f305174d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContent$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContent$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView L = this.f305174d.L();
        android.view.ViewGroup viewGroup = L != null ? (android.view.ViewGroup) L.findViewById(com.tencent.mm.R.id.cgi) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContent$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$attitudeContent$2");
        return viewGroup;
    }
}
