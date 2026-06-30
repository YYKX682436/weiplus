package k84;

/* loaded from: classes4.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k84.q1 q1Var) {
        super(0);
        this.f305072d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$continuousIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$continuousIcon$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView L = this.f305072d.L();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = L != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) L.findViewById(com.tencent.mm.R.id.f483935q46) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$continuousIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$continuousIcon$2");
        return weImageView;
    }
}
