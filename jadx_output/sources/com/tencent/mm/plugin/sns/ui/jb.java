package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class jb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f169505d;

    public jb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f169505d = snsAdNativeLandingPagesUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$16");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f169505d;
        snsAdNativeLandingPagesUI.m8();
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            java.lang.String str2 = snsAdNativeLandingPagesUI.f166700d;
            switch (itemId) {
                case 1:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShareToChat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y7()) {
                        snsAdNativeLandingPagesUI.o7(new com.tencent.mm.plugin.sns.ui.wb(snsAdNativeLandingPagesUI));
                    } else {
                        snsAdNativeLandingPagesUI.p7(snsAdNativeLandingPagesUI.C, null);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShareToChat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 1);
                    break;
                case 2:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y7()) {
                        snsAdNativeLandingPagesUI.o7(new com.tencent.mm.plugin.sns.ui.yb(snsAdNativeLandingPagesUI));
                    } else {
                        snsAdNativeLandingPagesUI.q7(snsAdNativeLandingPagesUI.C, null);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 2);
                    break;
                case 3:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFav", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    snsAdNativeLandingPagesUI.f166758y0.f471101l++;
                    com.tencent.mars.xlog.Log.i(str2, "doFav snsAdNativeLadingPagesUI");
                    long j17 = snsAdNativeLandingPagesUI.getIntent().getExtras().getLong("msg_id", -2147483648L);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(snsAdNativeLandingPagesUI.P)) {
                        str = null;
                    } else {
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getSnsInfo(snsAdNativeLandingPagesUI.P);
                        if (snsInfo == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFav", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 3);
                            break;
                        } else {
                            str = snsInfo.getLocalid();
                        }
                    }
                    java.lang.String stringExtra = snsAdNativeLandingPagesUI.getIntent().getStringExtra("prePublishId");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    java.lang.String str3 = stringExtra;
                    com.tencent.mm.plugin.sns.ui.tc B7 = snsAdNativeLandingPagesUI.B7();
                    java.lang.String v76 = snsAdNativeLandingPagesUI.v7();
                    java.lang.String u76 = snsAdNativeLandingPagesUI.u7(new com.tencent.mm.plugin.sns.ui.z7(snsAdNativeLandingPagesUI.C, null, true, true));
                    if (B7 != null) {
                        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doFavAdlanding(j17, str, snsAdNativeLandingPagesUI.I, snsAdNativeLandingPagesUI.N, str3, B7.f170504a, B7.f170505b, u76, 34, snsAdNativeLandingPagesUI.C7(B7.f170506c), v76);
                    } else {
                        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doFavAdlanding(j17, str, snsAdNativeLandingPagesUI.I, snsAdNativeLandingPagesUI.N, str3, snsAdNativeLandingPagesUI.L, snsAdNativeLandingPagesUI.M, u76, 34, snsAdNativeLandingPagesUI.C7(snsAdNativeLandingPagesUI.K), v76);
                    }
                    o72.e4 e4Var = (o72.e4) i95.n0.c(o72.e4.class);
                    com.tencent.mm.ui.widget.snackbar.g gVar = snsAdNativeLandingPagesUI.f166717i3;
                    ((com.tencent.mm.pluginsdk.model.s1) e4Var).getClass();
                    com.tencent.mm.plugin.fav.ui.u1.g(0, 34, snsAdNativeLandingPagesUI, gVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFav", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 3);
                case 4:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    java.lang.String str4 = snsAdNativeLandingPagesUI.G;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    java.lang.String str5 = snsAdNativeLandingPagesUI.H;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    snsAdNativeLandingPagesUI.d8(snsAdNativeLandingPagesUI, str4, str5, 1, 14);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 4);
                    break;
                case 5:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOpenUrlInBrowser", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper floatWebViewHelper = snsAdNativeLandingPagesUI.f166737p2;
                    if (floatWebViewHelper != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
                        ab4.f fVar = floatWebViewHelper.f168500d;
                        if (fVar != null && !android.text.TextUtils.isEmpty(fVar.F)) {
                            java.lang.String str6 = fVar.F;
                            java.lang.String n17 = snsAdNativeLandingPagesUI.A7().n();
                            if (android.text.TextUtils.isEmpty(n17)) {
                                n17 = snsAdNativeLandingPagesUI.A7().o();
                            }
                            if (!android.text.TextUtils.isEmpty(n17)) {
                                str6 = ca4.z0.b(str6, n17);
                            }
                            ((yg0.e4) ((zg0.g3) i95.n0.c(zg0.g3.class))).getClass();
                            ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).getClass();
                            new com.tencent.mm.plugin.webview.modeltools.h().c(snsAdNativeLandingPagesUI, str6);
                            com.tencent.mars.xlog.Log.i(str2, "doOpenInBrowser, url=" + str6);
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOpenUrlInBrowser", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 5);
                    break;
                case 6:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOpenLBSAuthManagerPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    android.content.Intent intent = new android.content.Intent();
                    ab4.n0 A7 = snsAdNativeLandingPagesUI.A7();
                    java.lang.String m17 = ca4.m0.m(A7.k());
                    java.lang.String o17 = A7.o();
                    intent.putExtra("sns_landig_pages_from_source", A7.l());
                    intent.putExtra("sns_landing_pages_rawSnsId", m17);
                    intent.putExtra("sns_landing_pages_ux_info", o17);
                    j45.l.j(snsAdNativeLandingPagesUI, "sns", ".ui.SnsAdLBSAuthManagerUI", intent, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOpenLBSAuthManagerPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 6);
                    break;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$16");
    }
}
