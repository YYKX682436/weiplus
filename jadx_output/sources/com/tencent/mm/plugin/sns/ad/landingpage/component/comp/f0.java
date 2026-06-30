package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class f0 implements p64.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.Reference f162797d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162798e;

    public f0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.i0 i0Var, boolean z17) {
        this.f162797d = new java.lang.ref.WeakReference(i0Var);
        this.f162798e = z17;
    }

    @Override // p64.a
    @o64.b
    public void onCallbackFromServer(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnFinderLivingNoticeStatusOnClient");
        try {
            int f17 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "status", 257);
            int f18 = com.tencent.mm.sdk.platformtools.c2.f(bundle, com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 0);
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.i0 i0Var = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.i0) this.f162797d.get();
            if (i0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                com.tencent.mm.ui.widget.dialog.u3 u3Var = i0Var.C;
                if (u3Var != null && u3Var.isShowing()) {
                    u3Var.dismiss();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                if (!this.f162798e) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                    d44.h.b(i0Var.f165049d, f18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
                }
                i0Var.i0(f17);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp$OnFinderLivingNoticeStatusOnClient");
    }
}
