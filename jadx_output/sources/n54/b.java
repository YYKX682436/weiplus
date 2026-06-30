package n54;

/* loaded from: classes4.dex */
public class b implements n54.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n54.f f335124a;

    public b(n54.f fVar) {
        this.f335124a = fVar;
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStayToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
        com.tencent.mars.xlog.Log.i("AdHalfScreenLandingPageHelper", "onStayToTop");
        n54.f fVar = this.f335124a;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a17 = n54.f.a(fVar);
        a17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var = a17.E2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (e5Var != null && n54.f.a(fVar).T7()) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a18 = n54.f.a(fVar);
            a18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var2 = a18.E2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            e5Var2.R();
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a19 = n54.f.a(fVar);
            a19.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var3 = a19.E2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGlobalFloatBtnsLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            e5Var3.K();
        }
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a27 = n54.f.a(fVar);
        a27.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = a27.f166696b2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (yVar != null && n54.f.a(fVar).T7()) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a28 = n54.f.a(fVar);
            a28.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar2 = a28.f166696b2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (yVar2.X()) {
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI a29 = n54.f.a(fVar);
                a29.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar3 = a29.f166696b2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFloatBarViewWrapper", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                yVar3.d0();
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z76 = n54.f.a(fVar).z7();
                if (z76 != null) {
                    z76.A0();
                }
            } else {
                n54.f.a(fVar).t8();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStayToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$2");
    }
}
