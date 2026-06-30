package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class q1 implements com.tencent.mm.pluginsdk.ui.span.c1 {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f170292a;

    /* renamed from: b, reason: collision with root package name */
    public int f170293b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.k4 f170294c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f170295d;

    public q1(android.app.Activity activity, int i17, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        this.f170292a = activity;
        this.f170293b = i17;
        this.f170294c = k4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.c1
    public void a(android.view.View view, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        i64.b1 b1Var;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i17;
        java.lang.String str6;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        android.content.Intent intent = new android.content.Intent();
        if (this.f170292a == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return;
        }
        boolean z17 = obj instanceof ca4.h;
        com.tencent.mm.plugin.sns.model.k4 k4Var = this.f170294c;
        if (z17) {
            ca4.h hVar = (ca4.h) obj;
            java.lang.String str7 = hVar.f39935b;
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            java.lang.String str8 = hVar.f39936c;
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = Fj.k1(str8);
            if (k17 == null) {
                com.tencent.mars.xlog.Log.e("Micro.ClickableCallBack", "onclick info is null. localId:%s", str8);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                return;
            }
            boolean z18 = hVar.f39934a;
            java.lang.String str9 = hVar.f39935b;
            if (z18) {
                try {
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
                    if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(k17) && ((i18 = timeLine.ContentObj.f369837e) == 15 || i18 == 5)) {
                        com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent();
                        snsAdLivingStreamJumpEvent.f54794g.f6405a = ca4.z0.T(k17);
                        snsAdLivingStreamJumpEvent.e();
                    }
                    if (k17.isValidAdHeadStateInfo()) {
                        x84.c.c(k17);
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.tencent.mm.plugin.sns.storage.ADXml adXml = k17.getAdXml();
                java.lang.String str10 = b(k17).viewId;
                int i19 = hVar.f39937d;
                if (i19 <= 0) {
                    i19 = 2;
                }
                int i27 = this.f170293b;
                com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i27, i27 == 0 ? 1 : 2, k17.getAdSnsInfo().field_snsId, i19, 0);
                android.app.Activity context = this.f170292a;
                if (context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) context;
                    snsCommentDetailUI.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    b1Var = snsCommentDetailUI.f166869l1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                } else if (context instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) {
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var = (com.tencent.mm.plugin.sns.ui.improve.component.f2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.f2.class);
                    f2Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
                    b1Var = f2Var.f168794d;
                } else {
                    b1Var = null;
                }
                ca4.m0.f(snsAdClick, b1Var, k17, i19);
                if (adXml == null) {
                    str3 = "Micro.ClickableCallBack";
                    str4 = str9;
                } else {
                    if (adXml.headClickType == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(adXml.headClickParam)) {
                        l44.b0.e(k17);
                        java.lang.String str11 = adXml.headClickParam;
                        com.tencent.mm.plugin.sns.storage.ADInfo b17 = b(k17);
                        if (b17 != null) {
                            str11 = ca4.z0.b(str11, b17.uxInfo);
                        }
                        com.tencent.mars.xlog.Log.i("Micro.ClickableCallBack", "headClickParam url " + str11 + " " + adXml.headClickRightBarShow);
                        android.content.Intent intent2 = new android.content.Intent();
                        boolean z19 = adXml.headClickRightBarShow == 0;
                        intent2.putExtra("KsnsViewId", str10);
                        intent2.putExtra("KRightBtn", z19);
                        intent2.putExtra("jsapiargs", new android.os.Bundle());
                        intent2.putExtra("rawUrl", str11);
                        intent2.putExtra("useJs", true);
                        if (this.f170293b == 0) {
                            ca4.z0.a(intent2, 81);
                        } else {
                            ca4.z0.a(intent2, 82);
                        }
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent2, this.f170292a);
                        ca4.z0.x0(snsAdClick);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                        return;
                    }
                    if (adXml.headClickType == 0) {
                        str6 = "Micro.ClickableCallBack";
                        if (l44.s4.b(this.f170292a, adXml, b(k17), k17.field_snsId, 1)) {
                            l44.b0.e(k17);
                            a84.u0.a(snsAdClick, 41);
                            ca4.z0.x0(snsAdClick);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                            return;
                        }
                    } else {
                        str6 = "Micro.ClickableCallBack";
                    }
                    v64.d dVar = new v64.d();
                    dVar.b("ext_sns_ad_click", snsAdClick);
                    str4 = str9;
                    str3 = str6;
                    if (l44.k4.f316220a.b(view, this.f170292a, k17, this.f170293b, adXml, b1Var, dVar)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                        return;
                    }
                    v64.c c17 = v64.a.c(this.f170292a);
                    if (c17 != null && c17.a(view, this.f170293b, k17, dVar)) {
                        l44.b0.e(k17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                        return;
                    }
                }
                k4Var.a().d(k17, false);
                if (str4.endsWith("@ad")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                    return;
                }
                l44.b0.e(k17);
                a84.u0.a(snsAdClick, 40);
                ca4.z0.x0(snsAdClick);
                intent.putExtra("Contact_User", str4);
                intent.putExtra("KSnsAdTag", snsAdClick);
                intent.putExtra("Contact_Scene", 79);
                if (this.f170293b == 0) {
                    i17 = 6;
                    str5 = "CONTACT_INFO_UI_SOURCE";
                } else {
                    str5 = "CONTACT_INFO_UI_SOURCE";
                    i17 = 1;
                }
                intent.putExtra(str5, i17);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, this.f170292a);
                com.tencent.mars.xlog.Log.i(str3, "startContactInfo, addScene=79");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                return;
            }
            str = "CONTACT_INFO_UI_SOURCE";
            if (this.f170293b == 0) {
                m21.w.d(719);
            } else {
                m21.w.c(719);
            }
            ca4.z0.T(k17);
            k17.isAd();
            k17.getUxinfo();
            m21.w d17 = this.f170293b == 0 ? m21.w.d(746) : m21.w.c(746);
            str9.endsWith(c01.z1.r());
            d17.g(intent);
            if (this.f170293b == 0) {
                k4Var.a().d(k17, false);
            }
            str2 = str9;
        } else {
            str = "CONTACT_INFO_UI_SOURCE";
            str2 = (java.lang.String) obj;
            gm0.j1.i();
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str2);
            if (q17 != null && q17.k2()) {
                intent.putExtra("Contact_User", str2);
                intent.putExtra("Contact_Scene", 37);
                intent.putExtra(str, this.f170293b);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, this.f170292a);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                return;
            }
            if (this.f170293b == 0) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                snsInfo.setUserName(str2);
                k4Var.a().d(snsInfo, false);
            }
        }
        intent.putExtra("Contact_User", str2);
        int i28 = this.f170293b;
        if (i28 == 1) {
            intent.putExtra(str, 106);
        } else {
            intent.putExtra(str, i28);
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f170295d;
        if (snsInfo2 != null) {
            yc4.b0.f460839a.f(intent, snsInfo2, this.f170292a);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, this.f170292a);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        int i29 = this.f170293b;
        ((we0.j1) l0Var).hj(str2, i29 == 0 ? 6L : i29 == 13 ? 7L : 8L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
    }

    public final com.tencent.mm.plugin.sns.storage.ADInfo b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return null;
        }
        if (this.f170293b == 2) {
            com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = snsInfo.getAtAdInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            return atAdInfo;
        }
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        return adInfo;
    }
}
