package he0;

/* loaded from: classes4.dex */
public class c5 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final i64.j0 f280674d;

    public c5() {
        super(0);
        this.f280674d = new he0.b5(this);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        boolean z18;
        com.tencent.mm.modelsns.SnsAdClick snsAdClick;
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07;
        java.lang.String str3;
        java.lang.StringBuilder sb6;
        com.tencent.mm.modelsns.SnsAdClick snsAdClick2;
        i64.a aVar;
        boolean z19;
        int i17;
        java.lang.String str4;
        java.lang.String str5;
        r45.r2 r2Var;
        r45.r2 r2Var2;
        java.lang.String str6 = "callback";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        com.tencent.mm.autogen.events.ReportAdClickEvent reportAdClickEvent = (com.tencent.mm.autogen.events.ReportAdClickEvent) iEvent;
        java.lang.String str7 = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        if (gm0.j1.a()) {
            try {
                snsAdClick = reportAdClickEvent.f54680g.f8210a;
                y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(snsAdClick.f71468f);
            } catch (java.lang.Exception e17) {
                e = e17;
                str = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                str2 = "MicroMsg.ReportAdClickListener";
            }
            if (y07 != null) {
                com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = y07.convertToSnsInfo();
                com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = snsAdClick.f71466d == 2 ? convertToSnsInfo.getAtAdInfo() : convertToSnsInfo.getAdInfo();
                ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "ClickAdFeed", ca4.z0.t0(convertToSnsInfo.field_snsId));
                if (atAdInfo == null) {
                    str = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                    z17 = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                    z18 = z17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                    return z18;
                }
                java.lang.String str8 = atAdInfo.waidPkg;
                java.lang.String d17 = me4.c.d(str8);
                i64.a aVar2 = new i64.a();
                if (ca4.m0.i0()) {
                    aVar2.f289043a = ca4.m0.t(convertToSnsInfo);
                }
                aVar2.f289044b = ca4.m0.C(convertToSnsInfo);
                aVar2.f289045c = (int) snsAdClick.f71478s;
                aVar2.f289046d = snsAdClick.f71479t;
                aVar2.f289052j = snsAdClick;
                aVar2.f289053k = atAdInfo.uxInfo;
                aVar2.f289055m = atAdInfo.aid;
                aVar2.f289056n = atAdInfo.traceid;
                aVar2.f289057o = atAdInfo.pId;
                aVar2.f289054l = convertToSnsInfo.getAdXml().adExtInfo;
                aVar2.f289058p = snsAdClick.f71480u;
                aVar2.f289059q = convertToSnsInfo.getAdXml().isForbidAutoPlay() ? 1 : 0;
                if (atAdInfo.isWeapp() && l44.u3.b(convertToSnsInfo.getAdXml())) {
                    aVar2.f289047e = l44.u3.a(atAdInfo.actionExtWeApp.f165926a) ? 1 : 0;
                }
                aVar2.f289048f = v34.b.d();
                v34.b.c();
                aVar2.f289049g = "";
                aVar2.f289050h = v34.b.e();
                aVar2.f289051i = v34.b.a();
                aVar2.f289061s = convertToSnsInfo.getAdXml().passThrough;
                if (snsAdClick.f71466d == 0) {
                    java.lang.String O = ca4.m0.O();
                    boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (O != null) {
                        str7 = O;
                    }
                    aVar2.f289060r = str7;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ReportAdClickListener", "timelineSessionId=" + aVar2.f289060r);
                }
                java.lang.String t07 = ca4.z0.t0(convertToSnsInfo.field_snsId);
                int i18 = snsAdClick.f71466d;
                i64.j0 j0Var = this.f280674d;
                try {
                    if (i18 == 2) {
                        try {
                            sb6 = new java.lang.StringBuilder("report ad click, at detail, exposureTime=");
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            str3 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                        }
                        try {
                            sb6.append(snsAdClick.f71477r);
                            sb6.append(", clkPos=");
                            sb6.append(snsAdClick.f71469g);
                            sb6.append(", source=");
                            sb6.append(snsAdClick.f71466d);
                            sb6.append(", snsId=");
                            sb6.append(t07);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ReportAdClickListener", sb6.toString());
                            str3 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                            i64.l0 l0Var = new i64.l0(snsAdClick.f71468f, atAdInfo.viewId, snsAdClick.f71469g, snsAdClick.f71470h, snsAdClick.f71467e, "", convertToSnsInfo.getAdType(), convertToSnsInfo.getTimeLine().statExtStr, snsAdClick.f71476q, convertToSnsInfo.getAdSnsInfo().getAtFriendRemindInfoSourceInfo(), convertToSnsInfo.getAdSnsInfo().getAtFriendRemindInfoSelfInfo(), snsAdClick.f71477r, str8, d17, aVar2, null);
                            l0Var.f289220g = j0Var;
                            gm0.j1.i();
                            gm0.j1.n().f273288b.g(l0Var);
                            i64.u1.c(44, 1, 0, t07);
                            snsAdClick2 = snsAdClick;
                            aVar = aVar2;
                            str2 = "MicroMsg.ReportAdClickListener";
                            z19 = true;
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            str3 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                            str2 = "MicroMsg.ReportAdClickListener";
                            str6 = "callback";
                            str = str3;
                            z17 = false;
                            com.tencent.mars.xlog.Log.printErrStackTrace(str2, e, "report ad click error", new java.lang.Object[0]);
                            ca4.q.c("clickReportError", e);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                            z18 = z17;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                            return z18;
                        }
                    } else {
                        str3 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                        com.tencent.mars.xlog.Log.i("MicroMsg.ReportAdClickListener", "report ad click, exposureTime=" + snsAdClick.f71477r + ", clkPos=" + snsAdClick.f71469g + ", source=" + snsAdClick.f71466d + ", snsId=" + t07);
                        long j17 = snsAdClick.f71468f;
                        java.lang.String str9 = atAdInfo.viewId;
                        int i19 = snsAdClick.f71469g;
                        int i27 = snsAdClick.f71470h;
                        int i28 = snsAdClick.f71467e;
                        int adType = convertToSnsInfo.getAdType();
                        java.lang.String str10 = convertToSnsInfo.getTimeLine().statExtStr;
                        int i29 = snsAdClick.f71476q;
                        com.tencent.mm.protobuf.g timelineRemindInfoSourceInfo = convertToSnsInfo.getAdSnsInfo().getTimelineRemindInfoSourceInfo();
                        com.tencent.mm.protobuf.g timelineRemindInfoSelfInfo = convertToSnsInfo.getAdSnsInfo().getTimelineRemindInfoSelfInfo();
                        long j18 = snsAdClick.f71477r;
                        if (snsAdClick.f71466d == 0) {
                            l44.i iVar = l44.i.f316168a;
                            java.lang.String str11 = "getAdClickQualityInfo";
                            str2 = "MicroMsg.ReportAdClickListener";
                            try {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickQualityInfo", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
                                if (convertToSnsInfo.getSnsId() != null) {
                                    aVar = aVar2;
                                    snsAdClick2 = snsAdClick;
                                    str5 = str10;
                                    str11 = "getAdClickQualityInfo";
                                    str4 = str8;
                                    if (ca4.m0.u0(e42.c0.clicfg_ad_timeline_click_quality_click_report_disabled, 0) != 1) {
                                        r45.r2 r2Var3 = (r45.r2) l44.i.f316171d.get(convertToSnsInfo.getSnsId());
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str11, "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
                                        r2Var2 = r2Var3;
                                        r2Var = r2Var2;
                                    }
                                } else {
                                    snsAdClick2 = snsAdClick;
                                    str4 = str8;
                                    aVar = aVar2;
                                    str5 = str10;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str11, "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
                                r2Var2 = null;
                                r2Var = r2Var2;
                            } catch (java.lang.Exception e27) {
                                e = e27;
                                str6 = "callback";
                                str = str3;
                                z17 = false;
                                com.tencent.mars.xlog.Log.printErrStackTrace(str2, e, "report ad click error", new java.lang.Object[0]);
                                ca4.q.c("clickReportError", e);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                                z18 = z17;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                                return z18;
                            }
                        } else {
                            snsAdClick2 = snsAdClick;
                            str4 = str8;
                            aVar = aVar2;
                            str2 = "MicroMsg.ReportAdClickListener";
                            str5 = str10;
                            r2Var = null;
                        }
                        i64.l0 l0Var2 = new i64.l0(j17, str9, i19, i27, i28, "", adType, str5, i29, timelineRemindInfoSourceInfo, timelineRemindInfoSelfInfo, j18, str4, d17, aVar, r2Var);
                        l0Var2.f289220g = j0Var;
                        gm0.j1.i();
                        gm0.j1.n().f273288b.g(l0Var2);
                        z19 = true;
                        i64.u1.c(44, 1, 1, t07);
                    }
                    l44.z.t(aVar, 4000000);
                    i17 = snsAdClick2.f71470h;
                    str = str3;
                } catch (java.lang.Exception e28) {
                    e = e28;
                }
                try {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdClickTarget", str);
                    if (i17 == 21) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1673, 36);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdClickTarget", str);
                    str6 = "callback";
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                    z18 = z19;
                } catch (java.lang.Exception e29) {
                    e = e29;
                    str6 = "callback";
                    z17 = false;
                    com.tencent.mars.xlog.Log.printErrStackTrace(str2, e, "report ad click error", new java.lang.Object[0]);
                    ca4.q.c("clickReportError", e);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                    z18 = z17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                    return z18;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
                return z18;
            }
            ca4.q.c("clickReportNoadSnsInfo", null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReportAdClickListener", "ReportAdClickEvent arrived before account was ready, ignore it.");
            ca4.q.c("clickReportAccNoReady", null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        }
        str = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
        z18 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str);
        return z18;
    }
}
