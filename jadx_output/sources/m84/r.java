package m84;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m84.u f324786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m84.u uVar) {
        super(0);
        this.f324786d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mSnsAdBreakContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mSnsAdBreakContainer$2");
        android.view.View L = this.f324786d.L();
        com.tencent.mm.plugin.sns.ui.AdFrameLayout adFrameLayout = L != null ? (com.tencent.mm.plugin.sns.ui.AdFrameLayout) L.findViewById(com.tencent.mm.R.id.f486970v72) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mSnsAdBreakContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$mSnsAdBreakContainer$2");
        return adFrameLayout;
    }
}
