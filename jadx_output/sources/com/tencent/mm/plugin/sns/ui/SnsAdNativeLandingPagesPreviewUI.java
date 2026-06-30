package com.tencent.mm.plugin.sns.ui;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes4.dex */
public class SnsAdNativeLandingPagesPreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f166678h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f166679d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f166680e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f166681f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f166682g = "";

    public static java.lang.String T6(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return "";
        }
        try {
            java.lang.String str4 = (java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(str, str2, null).get(str3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return str4;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "getXmlValueByTag exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(android.content.Intent r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI.U6(android.content.Intent, java.lang.String):void");
    }

    public final boolean V6(java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0 g0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpWebPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        try {
            g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1898, 18);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "jump WebViewUI exp=" + th6.toString());
            finish();
        }
        if (this.f166680e) {
            com.tencent.mars.xlog.Log.w("SnsAdNativeLandingPagesPreviewUI", "unknown canvas halfScreenMode, showTip");
            if (!this.f166681f) {
                n54.i.d(false);
            }
            db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, getString(com.tencent.mm.R.string.j7a));
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWebPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return true;
        }
        com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "unknown canvas goto webview, " + str);
        java.lang.String T6 = T6(str, dm.n.COL_ADXML, ".adxml.adCanvasInfo.shareWebUrl");
        if (android.text.TextUtils.isEmpty(T6)) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "shareWebUrl is empty");
            T6 = T6(str, dm.n.COL_ADXML, ".adxml.adActionLink");
        }
        java.lang.String T62 = T6(str, dm.n.COL_ADXML, ".adxml.originUxInfo");
        if (android.text.TextUtils.isEmpty(T62)) {
            com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "originUxInfo is empty, use param uxInfo");
            T62 = this.f166682g;
        }
        com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "jumpUrl=" + T6 + ", uxInfo=" + T62);
        java.lang.String b17 = ca4.z0.b(T6, T62);
        if (android.text.TextUtils.isEmpty(b17)) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "error jumpUrl, finish");
            g0Var.A(1898, 30);
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWebPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return false;
        }
        com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "jump WebViewUI, url=" + b17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", b17);
        intent.putExtra("showShare", true);
        ca4.z0.a(intent, 84);
        j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpWebPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        return true;
    }

    public final boolean W6(android.content.Intent intent, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        java.lang.String stringExtra = intent.getStringExtra("sns_landing_pages_extra_param");
        if (l64.a.c(this.f166679d)) {
            l64.a.d(stringExtra, 6);
        }
        boolean z17 = a84.o0.d() && this.f166679d == 5;
        java.lang.String T6 = T6(str, dm.n.COL_ADXML, ".adxml.canvasShareInfo.canvasId");
        if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(T6)) {
            a84.o0.b(com.tencent.mm.sdk.platformtools.t8.E1(T6), this.f166679d, T6(str, dm.n.COL_ADXML, ".adxml.canvasShareInfo.uxInfo"), T6(str, dm.n.COL_ADXML, ".adxml.canvasShareInfo.canvasDynamicInfo"), this, str, new com.tencent.mm.plugin.sns.ui.wa(this, intent), new com.tencent.mm.plugin.sns.ui.xa(this, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return true;
        }
        if (za4.z0.u(str)) {
            if (l64.a.c(this.f166679d)) {
                l64.a.d(stringExtra, 7);
            }
            U6(intent, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return true;
        }
        if (V6(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        return false;
    }

    public void X6(android.content.Intent intent, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openCanvasOnly", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        intent.putExtra("sns_landing_pages_xml", str);
        if (!Z6(intent, str)) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "protectOverSizeXml failed_4");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 21);
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCanvasOnly", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("sns_landing_pages_extra_param");
        if (l64.a.c(this.f166679d)) {
            l64.a.d(stringExtra, 6);
        }
        if (za4.z0.u(str)) {
            if (l64.a.c(this.f166679d)) {
                l64.a.d(stringExtra, 7);
            }
            U6(intent, str);
        } else {
            V6(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCanvasOnly", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
    }

    public void Y6(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Intent intent, m54.y yVar, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openCanvasWithPageElement", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        if (!android.text.TextUtils.isEmpty(yVar.a())) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1898, 19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportWithoutEngineGroup", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            int u07 = ca4.m0.u0(e42.c0.clicfg_sns_ad_vangogh_without_liteapp_engine_group_v2, 1);
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicCanvas", "without engine group: the switch value is " + u07);
            boolean z17 = u07 > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportWithoutEngineGroup", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            if (z17) {
                com.tencent.mm.sdk.platformtools.c2.m(intent, "forbidSharedEngineGroup", true);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportNewOpenVangoghMethod", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            int u08 = ca4.m0.u0(e42.c0.clicfg_sns_ad_vangogh_new_launch_method_v2, 1);
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicCanvas", "use new open vangogh method is " + u08);
            boolean z18 = u08 > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportNewOpenVangoghMethod", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
            if (z18 && android.text.TextUtils.isEmpty(m54.j.e())) {
                com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "use new open vangogh method, and the lib version doesn't exist");
                g0Var.A(1898, 40);
                m54.f.a(j17, str, str2, str3, str4, this, yVar, intent, new com.tencent.mm.plugin.sns.ui.za(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCanvasWithPageElement", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launch$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            m54.f.a(j17, str, str2, str3, str4, this, yVar, intent, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launch$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            finish();
        } else if (android.text.TextUtils.isEmpty(yVar.b())) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "oh, ha, it reaches this statement, but should not!!! ");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 21);
            finish();
        } else {
            java.lang.String b17 = yVar.b();
            if (!android.text.TextUtils.isEmpty(str5)) {
                b17 = a84.o0.h(b17, str5);
                if (android.text.TextUtils.isEmpty(b17)) {
                    b17 = str5;
                }
            }
            X6(intent, b17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openCanvasWithPageElement", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
    }

    public final boolean Z6(android.content.Intent intent, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("protectOverSizeXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preCheckIsXmlOverSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            boolean z17 = str != null && str.length() >= 102400;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preCheckIsXmlOverSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1676, 17);
                java.lang.String h17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.h(str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                    com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "protectOverSizeXml failed");
                    if (this.f166680e && !this.f166681f) {
                        n54.i.d(false);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("protectOverSizeXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    return false;
                }
                intent.putExtra("sns_landing_pages_xml", "");
                intent.putExtra("sns_landing_pages_too_large_xml_path", h17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("protectOverSizeXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        return true;
    }

    public void a7(final long j17, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final android.content.Intent intent, final java.lang.String str5) {
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAndOpenCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        final android.view.View findViewById = findViewById(com.tencent.mm.R.id.lc6);
        a84.y0.p(findViewById, true);
        int i17 = this.f166679d;
        yz5.p pVar = new yz5.p() { // from class: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI$$a
            @Override // yz5.p
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                long j18 = j17;
                java.lang.String str9 = str;
                java.lang.String str10 = str2;
                java.lang.String str11 = str3;
                java.lang.String str12 = str4;
                android.content.Intent intent2 = intent;
                java.lang.String str13 = str5;
                int i18 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI.f166678h;
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI snsAdNativeLandingPagesPreviewUI = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI.this;
                snsAdNativeLandingPagesPreviewUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$requestAndOpenCanvas$0", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                a84.y0.p(findViewById, false);
                snsAdNativeLandingPagesPreviewUI.Y6(j18, str9, str10, str11, str12, intent2, (m54.y) obj2, str13);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$requestAndOpenCanvas$0", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                return jz5.f0.f302826a;
            }
        };
        m54.j jVar = m54.j.f324282a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        try {
            str6 = "";
            str7 = "requestAndOpenCanvas";
            str8 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader";
            try {
                m54.j.f324282a.j(j17, str == null ? "" : str, str4 == null ? "" : str4, i17, this, intent, str3, pVar);
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.tencent.mars.xlog.Log.e("SnsAd.VangoghPageLoader", "requestCanvas has some exception " + th.getMessage());
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    pVar.invoke(java.lang.Boolean.FALSE, m54.k.a(str6, str6));
                    kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th7) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestCanvas", str8);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            str6 = "";
            str7 = "requestAndOpenCanvas";
            str8 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestCanvas", str8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        return com.tencent.mm.R.layout.f489493cq3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String c17;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        java.lang.String str7 = "SnsAdNativeLandingPagesPreviewUI";
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "onCreate, intent==null, hash=" + hashCode());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 21);
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1898, 17);
        boolean booleanExtra = intent.getBooleanExtra("sns_landing_page_is_preview_page_fullscreen", true);
        if (booleanExtra) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.f(this);
        }
        java.lang.String stringExtra = intent.getStringExtra("sns_landing_pages_xml");
        boolean hasExtra = intent.hasExtra("sns_landing_pages_canvasid");
        long longExtra = intent.getLongExtra("sns_landing_pages_pageid", 0L);
        java.lang.String stringExtra2 = intent.getStringExtra("sns_landing_pages_canvasid");
        java.lang.String stringExtra3 = intent.getStringExtra("sns_landing_pages_canvas_ext");
        int intExtra = intent.getIntExtra("sns_landing_pages_no_store", 0);
        this.f166680e = intent.getBooleanExtra("sns_landing_page_half_screen_mode", false);
        com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "onCreate, pageId=" + longExtra + ", canvasId=" + stringExtra2 + ", noStore=" + intExtra + ", isHalf=" + this.f166680e + ", isFullScreen=" + booleanExtra + ", hash=" + hashCode());
        if (!this.f166680e && ca4.m0.c0()) {
            this.f166680e = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdLandingPageHalfScreen()) == 1;
            com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "debugEnv, mIsHalfScreenMode=" + this.f166680e);
        }
        this.f166681f = intent.getBooleanExtra("sns_landing_page_open_from_half_screen_mode", false);
        if (this.f166680e) {
            n54.f.d(this);
            g0Var.A(1898, 7);
        }
        java.lang.String stringExtra4 = intent.getStringExtra("sns_landing_page_canvas_dynamicinfo");
        java.lang.String stringExtra5 = intent.getStringExtra("sns_landing_page_canvas_ext_dynamicinfo");
        java.lang.String stringExtra6 = intent.getStringExtra("sns_landing_pages_ad_info");
        this.f166679d = intent.getIntExtra("sns_landig_pages_from_source", 0);
        java.lang.String Q = ca4.m0.Q(stringExtra6);
        if (android.text.TextUtils.isEmpty(Q)) {
            Q = intent.getStringExtra("sns_landing_pages_ux_info");
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (Q == null) {
                Q = "";
            }
            com.tencent.mars.xlog.Log.w("SnsAdNativeLandingPagesPreviewUI", "parse uxInfo from adInfoXml failed, source=" + this.f166679d);
        }
        java.lang.String str8 = Q;
        this.f166682g = str8;
        com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "paramUxInfo=".concat(str8));
        int i17 = this.f166679d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updagteStateBarColor", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        if (i17 == 24 || i17 == 30) {
            try {
                com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "updagteStateBarColor， source=" + i17);
                getWindow().setStatusBarColor(0);
                getController().W0(this, 0);
                getController().O0(true);
                getController().E0(-16777216);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdNativeLandingPagesPreviewUI", "updagteStateBarColor, exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updagteStateBarColor", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        if (l64.a.c(this.f166679d)) {
            l64.a.d(intent.getStringExtra("sns_landing_pages_extra_param"), 5);
        }
        za4.a aVar = new za4.a();
        aVar.f471056d = false;
        aVar.f471058f = intent.getIntExtra("sns_landing_page_is_direct_download", 0);
        if (!m54.v.a() || hasExtra) {
            z17 = hasExtra;
        } else {
            if (this.f166680e) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportVangoghHalfScreen", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
                e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
                if (e0Var == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportVangoghHalfScreen", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
                    str4 = "SnsAdNativeLandingPagesPreviewUI";
                    z17 = hasExtra;
                    z18 = false;
                } else {
                    z17 = hasExtra;
                    str4 = "SnsAdNativeLandingPagesPreviewUI";
                    int Ni = ((h62.d) e0Var).Ni(e42.c0.clicfg_ad_vangogh_page_half_screen, 1);
                    com.tencent.mars.xlog.Log.i("SnsAd.DynamicCanvas", "Vangogh Half Screen: the switch value is " + Ni);
                    z18 = Ni > 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportVangoghHalfScreen", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
                }
                if (!z18) {
                    str7 = str4;
                }
            } else {
                str4 = "SnsAdNativeLandingPagesPreviewUI";
                z17 = hasExtra;
            }
            if (!android.text.TextUtils.isEmpty(stringExtra) && longExtra == 0) {
                java.lang.String T6 = T6(stringExtra, dm.n.COL_ADXML, ".adxml.canvasShareInfo.canvasId");
                if (android.text.TextUtils.isEmpty(T6)) {
                    X6(intent, stringExtra);
                } else {
                    long E1 = com.tencent.mm.sdk.platformtools.t8.E1(T6);
                    java.lang.String T62 = T6(stringExtra, dm.n.COL_ADXML, ".adxml.canvasShareInfo.uxInfo");
                    java.lang.String T63 = T6(stringExtra, dm.n.COL_ADXML, ".adxml.canvasShareInfo.canvasDynamicInfo");
                    java.lang.String T64 = T6(stringExtra, dm.n.COL_ADXML, ".adxml.canvasShareInfo.canvasDynamicExtInfo");
                    java.lang.String T65 = T6(stringExtra, dm.n.COL_ADXML, ".adxml.canvasShareInfo.canvasDynamicLoadExtInfo");
                    m54.y b17 = m54.j.b(E1, T63, T62, T65);
                    if (b17 == null || !m54.j.g(b17)) {
                        a7(E1, T63, T64, T65, T62, intent, stringExtra);
                    } else {
                        Y6(E1, T63, T64, T65, T62, intent, b17, stringExtra);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                return;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(aVar.f471058f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsDirectDownload", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDownloadUtil");
            if (stringExtra4 == null || valueOf == null || valueOf.intValue() <= 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsDirectDownload", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDownloadUtil");
                str5 = stringExtra4;
            } else {
                try {
                    str6 = new org.json.JSONObject(stringExtra4).put("is_direct_download", valueOf.intValue()).toString();
                } catch (org.json.JSONException unused) {
                    str6 = stringExtra4;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsDirectDownload", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDownloadUtil");
                str5 = str6;
            }
            ca4.m0.j0();
            if (longExtra > 0) {
                m54.y yVar = null;
                if (intExtra != 1) {
                    m54.j jVar = m54.j.f324282a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicElement$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                    yVar = m54.j.b(longExtra, str5, str8, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicElement$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicElement", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
                }
                m54.y yVar2 = yVar;
                if (yVar2 == null || !m54.j.g(yVar2)) {
                    a7(longExtra, str5, stringExtra5, "", str8, intent, stringExtra);
                } else {
                    Y6(longExtra, str5, stringExtra5, "", str8, intent, yVar2, stringExtra);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                return;
            }
            str7 = str4;
            com.tencent.mars.xlog.Log.w(str7, "there is no canvas and page id, do default operation!");
        }
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            if (intExtra != 1) {
                boolean z27 = z17;
                if (z27) {
                    za4.s1 b18 = za4.s1.b();
                    b18.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openForUx", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
                    z17 = z27;
                    str = stringExtra2;
                    str2 = stringExtra3;
                    str3 = "onCreate";
                    c17 = b18.d(str, str2, 0, 0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openForUx", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
                } else {
                    z17 = z27;
                    str = stringExtra2;
                    str2 = stringExtra3;
                    str3 = "onCreate";
                    c17 = za4.s1.b().c(longExtra, 0, 0, 0, this.f166679d, str8, stringExtra4, aVar);
                }
                intent.putExtra("sns_landing_pages_xml", c17);
                stringExtra = c17;
            } else {
                str = stringExtra2;
                str2 = stringExtra3;
                str3 = "onCreate";
            }
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.A(1676, 15);
            if (!android.text.TextUtils.isEmpty(stringExtra)) {
                g0Var2.A(1676, 16);
            }
            if (intExtra == 1) {
                g0Var2.A(1676, 18);
            }
        } else {
            str = stringExtra2;
            str2 = stringExtra3;
            str3 = "onCreate";
            if (!Z6(intent, stringExtra)) {
                com.tencent.mars.xlog.Log.e(str7, "protectOverSizeXml failed_1");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 21);
                finish();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                return;
            }
        }
        java.lang.String str9 = str3;
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.lc6);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!z17 && longExtra > 0) {
                com.tencent.mars.xlog.Log.i(str7, "getAdCanvasInfo, pageId=" + longExtra + ", source=" + this.f166679d + ",canvasDynamicInfo=" + stringExtra4 + ", uxInfo=" + str8 + ", adCanvasParams = " + aVar);
                za4.s1.f(longExtra, 0, 0, this.f166679d, str8, stringExtra4, aVar, new com.tencent.mm.plugin.sns.ui.ua(this, longExtra, findViewById, intent), this);
            } else {
                if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.e(str7, "intent without canvas xml, or pageId!");
                    if (this.f166680e && !this.f166681f) {
                        n54.i.d(false);
                    }
                    finish();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str9, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                    return;
                }
                com.tencent.mars.xlog.Log.i(str7, "getUxCanvasInfo, canvasId=" + str + ", source=" + this.f166679d + ",canvasExt=" + str2);
                za4.s1.g(str, str2, 0, new com.tencent.mm.plugin.sns.ui.va(this, findViewById, intent), this);
            }
        } else {
            if (W6(intent, stringExtra)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str9, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
                return;
            }
            finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str9, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "onDestroy, hash=" + hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i("SnsAdNativeLandingPagesPreviewUI", "onNewIntent, hash=" + hashCode() + ", intent=" + intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
    }
}
