package g44;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper f268833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper adFinderOpenAppHalfScreenHelper) {
        super(0);
        this.f268833d = adFinderOpenAppHalfScreenHelper;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper$showOpenAppHalfScreen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper$showOpenAppHalfScreen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        android.widget.ScrollView p17 = this.f268833d.p();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(p17.getScrollY() == 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper$showOpenAppHalfScreen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper$showOpenAppHalfScreen$1");
        return valueOf;
    }
}
