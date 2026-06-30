package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class e implements p64.b, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public q64.b f162791d;

    @Override // p64.b
    public android.os.Bundle a(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
        try {
            java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "COUPON_APP_ID");
            java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "COUPON_STOCK_ID");
            java.lang.String k19 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "COMP_ID");
            java.lang.String k27 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "UX_INFO");
            this.f162791d = bVar;
            java.lang.System.currentTimeMillis();
            gm0.j1.d().a(4743, this);
            gm0.j1.d().g(new k64.p(k17, k18, k27, k19));
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.CouponCardBtnComp", "CouponRemoteCall::onServerCall has something invalid!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
        return null;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            gm0.j1.d().q(4743, this);
            if (i17 == 0 && i18 == 0 && (m1Var instanceof k64.p)) {
                r45.eo3 eo3Var = (r45.eo3) ((k64.p) m1Var).I();
                if (eo3Var != null) {
                    bundle.putInt("ret", eo3Var.f373620d);
                    if (!android.text.TextUtils.isEmpty(eo3Var.f373621e)) {
                        bundle.putString("msg", eo3Var.f373621e);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("SnsAd.CouponCardBtnComp", "CouponRemoteCall::onSceneEnd, the response is null!!!!");
                    bundle.putInt("call_ipc_result_key", -1);
                }
            } else {
                com.tencent.mars.xlog.Log.e("SnsAd.CouponCardBtnComp", "CouponRemoteCall::onSceneEnd is return error errType is " + i17 + ", the error code is " + i18);
                bundle.putInt("call_ipc_result_key", -1);
            }
            q64.b bVar = this.f162791d;
            if (bVar != null) {
                ((r64.b) bVar).e(bundle);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.CouponCardBtnComp", "CouponRemoteCall::onSceneEnd has something invalid!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
    }
}
