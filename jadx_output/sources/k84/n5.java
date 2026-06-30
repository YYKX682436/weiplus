package k84;

/* loaded from: classes2.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(android.view.View view) {
        super(0);
        this.f305150d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mShowAdPatAttitudeStub$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mShowAdPatAttitudeStub$2");
        android.view.View view = this.f305150d;
        android.view.ViewStub viewStub = view != null ? (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.s5z) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mShowAdPatAttitudeStub$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$mShowAdPatAttitudeStub$2");
        return viewStub;
    }
}
