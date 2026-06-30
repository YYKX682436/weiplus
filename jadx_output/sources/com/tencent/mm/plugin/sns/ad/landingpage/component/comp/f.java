package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public final f54.b B;
    public com.tencent.mm.ui.widget.dialog.u3 C;

    public f(android.content.Context context, f54.b bVar, android.view.ViewGroup viewGroup) {
        super(context, bVar, viewGroup);
        this.B = bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        try {
            ib4.h hVar = this.f165386t;
            if (hVar != null && bVar != null) {
                hVar.b("appId", bVar.f259699z1);
                this.f165386t.b("stockId", bVar.A1);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
    }

    public static void h0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f fVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("responseTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        try {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = fVar.C;
            if (u3Var != null && u3Var.isShowing()) {
                fVar.C.dismiss();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        if (bundle != null) {
            if (com.tencent.mm.sdk.platformtools.c2.f(bundle, "call_ipc_result_key", 0) == 0) {
                fVar.j0(com.tencent.mm.sdk.platformtools.c2.f(bundle, "ret", -1), com.tencent.mm.sdk.platformtools.c2.k(bundle, "msg"));
            } else {
                fVar.j0(-1, "");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("responseTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        try {
            o64.a aVar = new o64.a();
            aVar.d(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e());
            aVar.c(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d(this));
            q64.a a17 = aVar.a();
            if (a17 != null) {
                l0();
                ((r64.b) a17).c(i0());
            } else {
                com.tencent.mars.xlog.Log.e("SnsAd.CouponCardBtnComp", "the ipc request object is null, please check the log to find the reason!");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
    }

    public final android.os.Bundle i0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        f54.b bVar = this.B;
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (!android.text.TextUtils.isEmpty(bVar.f259699z1)) {
            bundle.putString("COUPON_APP_ID", bVar.f259699z1);
        }
        if (!android.text.TextUtils.isEmpty(bVar.A1)) {
            bundle.putString("COUPON_STOCK_ID", bVar.A1);
        }
        if (!android.text.TextUtils.isEmpty(bVar.f2817d)) {
            bundle.putString("COMP_ID", bVar.f2817d);
        }
        ab4.n0 u17 = u();
        if (u17 != null) {
            java.lang.String n17 = u17.n();
            if (android.text.TextUtils.isEmpty(n17)) {
                n17 = u17.o();
            }
            if (!android.text.TextUtils.isEmpty(n17)) {
                bundle.putString("UX_INFO", n17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeRequestParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0(int r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f.j0(int, java.lang.String):void");
    }

    public final void l0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
        android.content.Context context = this.f165049d;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                if (this.C == null) {
                    this.C = l54.a.h(context, com.tencent.mm.R.string.j7l, null);
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var = this.C;
                if (u3Var != null && !u3Var.isShowing()) {
                    this.C.show();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp");
    }
}
