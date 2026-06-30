package n44;

/* loaded from: classes15.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.m0 f334979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n44.m0 m0Var) {
        super(0);
        this.f334979d = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$viewPagerContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$viewPagerContainer$2");
        android.view.View b17 = n44.m0.b(this.f334979d);
        android.widget.FrameLayout frameLayout = b17 != null ? (android.widget.FrameLayout) b17.findViewById(com.tencent.mm.R.id.qr_) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$viewPagerContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$viewPagerContainer$2");
        return frameLayout;
    }
}
