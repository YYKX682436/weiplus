package k84;

/* loaded from: classes4.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(k84.d4 d4Var) {
        super(0);
        this.f305349d = d4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$cheerIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$cheerIcon$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView J2 = this.f305349d.J();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = J2 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) J2.findViewById(com.tencent.mm.R.id.emj) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$cheerIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$cheerIcon$2");
        return weImageView;
    }
}
