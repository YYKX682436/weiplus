package k84;

/* loaded from: classes4.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(k84.d4 d4Var) {
        super(0);
        this.f305364d = d4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$cheerNormalIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$cheerNormalIcon$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView J2 = this.f305364d.J();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = J2 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) J2.findViewById(com.tencent.mm.R.id.em6) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$cheerNormalIcon$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$cheerNormalIcon$2");
        return weImageView;
    }
}
