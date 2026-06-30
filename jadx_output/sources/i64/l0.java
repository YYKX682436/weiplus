package i64;

/* loaded from: classes4.dex */
public class l0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f289217d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f289218e;

    /* renamed from: f, reason: collision with root package name */
    public final i64.a f289219f;

    /* renamed from: g, reason: collision with root package name */
    public i64.j0 f289220g;

    /* renamed from: h, reason: collision with root package name */
    public long f289221h;

    public l0(long j17, java.lang.String str, int i17, int i18, int i19, java.lang.String str2, int i27, java.lang.String str3, int i28, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, long j18, java.lang.String str4, java.lang.String str5, i64.a aVar, r45.r2 r2Var) {
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s2();
        lVar.f70665b = new r45.t2();
        ((com.tencent.mm.plugin.sns.storage.f2) p94.w0.e()).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        int adRecSrc = W0 == null ? 0 : W0.getAdRecSrc();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (adRecSrc != 2) {
            lVar.f70666c = "/cgi-bin/mmoc-bin/ad/click";
            lVar.f70667d = 1232;
        } else {
            lVar.f70666c = "/cgi-bin/mmux-bin/adclick";
            lVar.f70667d = 1817;
        }
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f289217d = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAdClick", "source %d, uri %s", java.lang.Integer.valueOf(adRecSrc), a17.f70712c);
        r45.s2 s2Var = (r45.s2) a17.f70710a.f70684a;
        s2Var.f385406e = i17;
        s2Var.f385405d = str;
        s2Var.f385408g = i19;
        s2Var.f385407f = str2;
        s2Var.f385411m = java.lang.System.currentTimeMillis();
        s2Var.f385413o = i27;
        s2Var.f385414p = i18;
        s2Var.f385415q = adRecSrc;
        s2Var.f385416r = str3;
        s2Var.f385417s = i28;
        s2Var.f385420v = j18;
        s2Var.f385421w = aVar.f289048f;
        s2Var.C = aVar.f289049g;
        s2Var.f385423y = str4;
        s2Var.f385422x = str5;
        if (gVar2 != null) {
            s2Var.f385419u = gVar2;
        }
        if (gVar != null) {
            s2Var.f385418t = gVar;
        }
        this.f289219f = aVar;
        s2Var.f385424z = aVar.f289045c;
        s2Var.A = aVar.f289044b;
        s2Var.B = aVar.f289043a;
        s2Var.G = aVar.f289051i;
        s2Var.F = aVar.f289050h;
        s2Var.H = aVar.f289046d;
        s2Var.I = j65.e.b() ? 1 : 0;
        s2Var.f385404J = i65.a.o(com.tencent.mm.sdk.platformtools.x2.f193071a);
        s2Var.K = aVar.f289047e;
        java.lang.String str9 = aVar.f289058p;
        s2Var.M = str9 == null ? "" : str9;
        java.lang.String str10 = aVar.f289053k;
        s2Var.L = str10 == null ? "" : str10;
        s2Var.N = aVar.f289059q;
        s2Var.P = aVar.f289060r;
        r45.q2 q2Var = new r45.q2();
        q2Var.f383580d = aVar.f289061s;
        s2Var.R = q2Var;
        java.lang.String str11 = "pass_through_data=" + q2Var.f383580d;
        if (r2Var != null) {
            s2Var.Q = r2Var;
            str6 = str11;
            str7 = "click_feed_x=" + r2Var.f384451d + ", click_feed_y=" + r2Var.f384452e + ", click_screen_x=" + r2Var.f384453f + ", click_screen_y=" + r2Var.f384454g + ", feed_width=" + r2Var.f384455h + ", feed_height=" + r2Var.f384456i + ", screen_width=" + r2Var.f384457m + ", screen_height=" + r2Var.f384458n;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAdClick", "adClickQualityInfoString = " + str7);
        } else {
            str6 = str11;
            str7 = "";
        }
        try {
            try {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2044, 11);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("##snsId:");
                java.lang.String str12 = str7;
                sb6.append(new java.math.BigInteger(java.lang.Long.toBinaryString(j17), 2).toString());
                sb6.append(", minishop_uuid:");
                sb6.append(s2Var.M);
                sb6.append(", clickPos:");
                sb6.append(i17);
                sb6.append(", clickAction:");
                sb6.append(i18);
                sb6.append(", sceneType:");
                sb6.append(i19);
                sb6.append(", descXml:");
                sb6.append(str2);
                sb6.append(", adtype:");
                sb6.append(i27);
                sb6.append(", snsStatStr:");
                sb6.append(str3);
                sb6.append(", flipStatus:");
                sb6.append(i28);
                sb6.append(", remind_source_info.length:");
                sb6.append(gVar == null ? 0 : gVar.f192156a.length);
                sb6.append(", remind_self_info.length:");
                sb6.append(gVar2 == null ? 0 : gVar2.f192156a.length);
                sb6.append(", exposure_start_time:");
                sb6.append(j18);
                sb6.append(", followStatus:");
                sb6.append(s2Var.A);
                sb6.append(", installStatus:");
                sb6.append(s2Var.B);
                sb6.append(", videoCurTime:");
                sb6.append(s2Var.f385424z);
                sb6.append(", oaid:");
                sb6.append(s2Var.f385421w);
                sb6.append(", imei:");
                sb6.append(s2Var.C);
                sb6.append(", waidPkg:");
                sb6.append(str4);
                sb6.append(", waid:");
                sb6.append(str5);
                sb6.append(", ua:");
                sb6.append(s2Var.F);
                sb6.append(", relieved_buy_show:");
                sb6.append(s2Var.K);
                sb6.append(", common_device_id:");
                sb6.append(s2Var.G);
                sb6.append(", sub_clickpos:");
                sb6.append(s2Var.H);
                sb6.append(", elder_mode:");
                sb6.append("" + s2Var.I);
                sb6.append(", font_level:");
                sb6.append("" + s2Var.f385404J);
                sb6.append(", uxInfo:");
                sb6.append(s2Var.L);
                sb6.append(", forbidAutoPlay:");
                sb6.append(s2Var.N);
                sb6.append(", sessionId:");
                sb6.append(s2Var.P);
                sb6.append(", click_quality_info:");
                sb6.append(str12);
                sb6.append(", ad_ext_info:");
                sb6.append(str6);
                str8 = "MicroMsg.NetSceneAdClick";
                try {
                    com.tencent.mars.xlog.Log.i(str8, sb6.toString());
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("viewId.length=");
                    sb7.append(str == null ? 0 : str.length());
                    sb7.append(", viewId=");
                    sb7.append(str);
                    com.tencent.mars.xlog.Log.i(str8, sb7.toString());
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.tencent.mars.xlog.Log.e(str8, th.toString());
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                str8 = "MicroMsg.NetSceneAdClick";
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            str8 = "MicroMsg.NetSceneAdClick";
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f289218e = u0Var;
        if (this.f289220g != null) {
            this.f289221h = java.lang.System.currentTimeMillis();
            ((he0.b5) this.f289220g).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAdClickCGI", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
            l44.z.t(this.f289219f, 4000001);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAdClickCGI", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
        }
        return dispatch(sVar, this.f289217d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1232;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAdClick", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - this.f289221h);
        if (i18 == 0 && i19 == 0) {
            z17 = true;
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2044, 12);
            z17 = false;
        }
        i64.j0 j0Var = this.f289220g;
        if (j0Var != null) {
            ((he0.b5) j0Var).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adClickCGIFinish", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
            java.util.ArrayList arrayList = l44.z.f316428a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            i64.a aVar = this.f289219f;
            if (aVar == null) {
                com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, params is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            } else {
                com.tencent.mm.modelsns.SnsAdClick snsAdClick = aVar.f289052j;
                if (snsAdClick == null) {
                    com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, snsAdClick is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                } else {
                    int i27 = z17 ? 4000003 : 4000002;
                    try {
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, eventId is " + i27 + ", exp is " + th6.toString());
                    }
                    if (l44.z.f316428a.contains(java.lang.Integer.valueOf(snsAdClick.f71469g))) {
                        com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, except current click pos, the pos is " + snsAdClick.f71469g);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    } else {
                        ca4.f fVar = new ca4.f();
                        fVar.m(i27);
                        fVar.o(aVar.f289053k);
                        fVar.c(aVar.f289054l);
                        fVar.g(currentTimeMillis);
                        fVar.p(aVar.f289055m);
                        fVar.n(aVar.f289056n);
                        fVar.q(aVar.f289057o);
                        a84.t0.a(fVar.a());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adClickCGIFinish", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
        }
        try {
            r45.t2 t2Var = (r45.t2) this.f289217d.f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAdClick", "resp=" + t2Var.f386073d + ", msg=" + t2Var.f386074e);
        } catch (java.lang.Exception unused) {
        }
        this.f289218e.onSceneEnd(i18, i19, str, this);
    }
}
