package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xb implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f171502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f171503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f171504c;

    public xb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, long j17, yz5.l lVar) {
        this.f171504c = snsAdNativeLandingPagesUI;
        this.f171502a = j17;
        this.f171503b = lVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f171504c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
        try {
            java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            a54.e eVar = snsAdNativeLandingPagesUI.D2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            eVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            android.view.View view = eVar.f1594b;
            boolean z17 = view != null && view.getVisibility() == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                a54.e eVar2 = snsAdNativeLandingPagesUI.D2;
                eVar2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                ((ku5.t0) ku5.t0.f312615d).B(new a54.d(eVar2));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
            if (obj instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) obj;
                java.lang.String str2 = snsAdNativeLandingPagesUI.f166700d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestDynamicCanvasXml callback, pageId is ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                java.lang.String str3 = snsAdNativeLandingPagesUI.C2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                sb6.append(str3);
                sb6.append(", pageIdParam is ");
                sb6.append(this.f171502a);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                yz5.l lVar = this.f171503b;
                if (lVar != null) {
                    lVar.invoke(str);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(snsAdNativeLandingPagesUI.f166700d, "doRequestDynamicCanvasXml callback, exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
    }
}
