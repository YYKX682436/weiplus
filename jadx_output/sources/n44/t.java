package n44;

/* loaded from: classes15.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.u f335046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n44.u uVar) {
        super(0);
        this.f335046d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter$pageControlView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter$pageControlView$2");
        n44.u uVar = this.f335046d;
        uVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewPagerContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewPagerContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        android.widget.FrameLayout frameLayout = uVar.f335053i;
        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = frameLayout != null ? (com.tencent.mm.ui.base.MMPageControlView) frameLayout.findViewById(com.tencent.mm.R.id.qra) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter$pageControlView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter$pageControlView$2");
        return mMPageControlView;
    }
}
