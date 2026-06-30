package k84;

/* loaded from: classes4.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f304943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(k84.d4 d4Var) {
        super(0);
        this.f304943d = d4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$commentContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$commentContainer$2");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView J2 = this.f304943d.J();
        android.widget.LinearLayout linearLayout = J2 != null ? (android.widget.LinearLayout) J2.findViewById(com.tencent.mm.R.id.c6o) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$commentContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$commentContainer$2");
        return linearLayout;
    }
}
