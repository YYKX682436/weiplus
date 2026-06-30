package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class l0 implements p64.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.Reference f162876d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162877e;

    public l0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o0 o0Var, boolean z17) {
        this.f162876d = new java.lang.ref.WeakReference(o0Var);
        this.f162877e = z17;
    }

    @Override // p64.a
    @o64.b
    public void onCallbackFromServer(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o0 o0Var;
        boolean z17 = this.f162877e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnFinderLivingNoticeStatusOnClient");
        try {
            o0Var = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o0) this.f162876d.get();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", th6, "onFinderLivingNoticeStatusOnClient failed.", new java.lang.Object[0]);
        }
        if (o0Var == null) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnFinderLivingNoticeStatusOnClient onCallbackFromServer, comp is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnFinderLivingNoticeStatusOnClient");
            return;
        }
        int f17 = com.tencent.mm.sdk.platformtools.c2.f(bundle, "status", 257);
        int f18 = com.tencent.mm.sdk.platformtools.c2.f(bundle, com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 0);
        com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "OnFinderLivingNoticeStatusOnClient onCallbackFromServer, mRequestNoticeStatus is " + z17 + ", status is " + f17 + ", errorCode is " + f18);
        if (z17) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", " request status, status is " + f17 + ", errorCode is " + f18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            o0Var.j0(f17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        } else {
            com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", " do appointment callback, status is " + f17 + ", errorCode is " + f18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = o0Var.C;
            if (u3Var != null && u3Var.isShowing()) {
                u3Var.dismiss();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o0.h0(o0Var, f18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        o0Var.D = 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp$OnFinderLivingNoticeStatusOnClient");
    }
}
