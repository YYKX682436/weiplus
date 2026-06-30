package k84;

/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(k84.q1 q1Var) {
        super(0);
        this.f305089d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$continuousText$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$continuousText$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView L = this.f305089d.L();
        android.widget.TextView textView = L != null ? (android.widget.TextView) L.findViewById(com.tencent.mm.R.id.q4_) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$continuousText$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$continuousText$2");
        return textView;
    }
}
