package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class o0 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public final f54.j B;
    public com.tencent.mm.ui.widget.dialog.u3 C;
    public int D;
    public int E;
    public int F;

    public o0(android.content.Context context, f54.j jVar, android.view.ViewGroup viewGroup) {
        super(context, jVar, viewGroup);
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.B = jVar;
    }

    public static void h0(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o0 o0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        o0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAppointmentStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAppointmentStatusResult, errCode is " + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        d44.h.b(o0Var.f165049d, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        if (o0Var.W() == null || o0Var.B == null) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAppointmentStatusResult, button or mAdLandingFinderLivingNoticeBtnMutiInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAppointmentStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        } else {
            if (i17 == 0) {
                o0Var.F = 513;
                o0Var.j0(513);
            } else if (i17 == -200045 || i17 == -200023) {
                o0Var.E = 2;
                o0Var.l0();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAppointmentStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        boolean z17 = this.f165055m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        if (!z17) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "viewWillAppear, curComp is " + X().f2817d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doViewWillAppearReqLogic", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            if (this.E == 2) {
                l0();
                com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "viewAppeared, mLivingStatus is FINDER_LIVE_STARTED");
            } else {
                f54.j jVar = this.B;
                int i17 = jVar.B1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpire", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                int syncServerTimeSecond = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getSyncServerTimeSecond();
                com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "isExpire, currentTime is " + syncServerTimeSecond + ", finderLiveStartTime is " + i17);
                boolean z18 = i17 > 0 && syncServerTimeSecond > i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpire", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                if (z18) {
                    this.E = 2;
                    l0();
                } else {
                    this.E = 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    this.D = 1;
                    ab4.n0 u17 = u();
                    if (u17 != null) {
                        java.lang.String t07 = ca4.z0.t0(n0(u17.k()));
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("sns_id", t07);
                        java.lang.String str = jVar.C1;
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (str == null) {
                            str = "";
                        }
                        bundle.putString("finderUsername", str);
                        java.lang.String str2 = jVar.D1;
                        bundle.putString("finderLiveNoticeId", str2 != null ? str2 : "");
                        com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "acquireLivingNoticeStatus, snsId is " + t07 + ", finderUsername is " + jVar.C1 + ", finderLiveNoticeId is " + jVar.D1);
                        o64.a aVar = new o64.a();
                        aVar.d(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.k0());
                        aVar.c(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l0(this, true));
                        q64.a a17 = aVar.a();
                        if (a17 != null) {
                            ((r64.b) a17).c(bundle);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    } else {
                        com.tencent.mars.xlog.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "the page data or info is null, it can't do anything!!!!!");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doViewWillAppearReqLogic", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
        super.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        if (this.E == 2) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mLivingStatus is FINDER_LIVE_STARTED, jumpToFinderProfileUI");
            m0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        } else {
            if (this.D != 2) {
                com.tencent.mars.xlog.Log.w("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mRequestStatus not finish, the mRequestStatus is " + this.D);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                return;
            }
            if (this.F == 513) {
                com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mAppointmentStatus is FINDER_LIVING_NOTICE_SUBSCRIBED, jumpToFinderProfileUI");
                m0();
            } else {
                com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mAppointmentStatus is FINDER_LIVING_NOTICE_NO_SUBSCRIBED, subscribe");
                o0();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
    }

    public void i0(int i17) {
        f54.j jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        try {
            ib4.h hVar = this.f165386t;
            if (hVar != null && (jVar = this.B) != null) {
                hVar.b("finderUsername", jVar.C1);
                this.f165386t.b("finderLiveNoticeId", jVar.D1);
                this.f165386t.a("opType", i17);
                this.f165386t.a("isSimpleFinderLiveNotice", jVar.E1);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    public final void j0(int i17) {
        f54.j jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAcquireStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAcquireStatusResult, status is " + i17);
        this.F = i17;
        android.widget.Button W = W();
        if (W == null || (jVar = this.B) == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAcquireStatusResult, button or mAdLandingFinderLivingNoticeBtnMutiInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAcquireStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            return;
        }
        if (i17 == 513) {
            W.setText(jVar.f259724z1);
            a0();
        } else {
            b0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAcquireStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    public final void l0() {
        f54.j jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillLivingStartedText", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        android.widget.Button W = W();
        if (W == null || (jVar = this.B) == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillLivingStartedText, button or mAdLandingFinderLivingNoticeBtnMutiInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingStartedText", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        } else {
            if (this.E == 2) {
                W.setText(jVar.A1);
                a0();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingStartedText", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
    }

    public final void m0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        java.lang.String o17 = u().o();
        java.lang.String k17 = u().k();
        com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, uxInfo = " + o17 + ", snsId = " + k17);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doJumpToFinderProfileUI(this.f165049d, this.B.C1, o17, k17, 5);
        i0(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    public final long n0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        if (str != null) {
            try {
                long parseLong = java.lang.Long.parseLong(str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                return parseLong;
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "string to long has something wrong!!");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        return 0L;
    }

    public final void o0() {
        f54.j jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        ab4.n0 u17 = u();
        if (u17 == null || (jVar = this.B) == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "the page data is null, it can't do anything!!!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            return;
        }
        o64.a aVar = new o64.a();
        aVar.d(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.n0());
        aVar.c(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l0(this, false));
        q64.a a17 = aVar.a();
        if (a17 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String t07 = ca4.z0.t0(n0(u17.k()));
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            bundle.putString("sns_id", t07 == null ? "" : t07);
            java.lang.String n17 = u17.n();
            if (android.text.TextUtils.isEmpty(n17)) {
                n17 = u17.o();
            }
            if (n17 == null) {
                n17 = "";
            }
            bundle.putString("uxInfo", n17);
            java.lang.String a18 = u17.a();
            if (a18 == null) {
                a18 = "";
            }
            bundle.putString("adExtInfo", a18);
            java.lang.String str = jVar.C1;
            if (str == null) {
                str = "";
            }
            bundle.putString("finderUsername", str);
            java.lang.String str2 = jVar.D1;
            bundle.putString("finderLiveNoticeId", str2 != null ? str2 : "");
            com.tencent.mars.xlog.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "subscribe, snsId is " + t07 + ", finderUsername is " + jVar.C1 + ", finderLiveNoticeId is " + jVar.D1);
            ((r64.b) a17).c(bundle);
        }
        i0(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.C;
        if (u3Var == null) {
            u3Var = l54.a.h(this.f165049d, com.tencent.mm.R.string.gga, null);
            this.C = u3Var;
        }
        if (u3Var != null && !u3Var.isShowing()) {
            u3Var.show();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }
}
