package pm4;

/* loaded from: classes15.dex */
public abstract class y {
    public static void a(r45.un6 un6Var, r45.xn6 xn6Var, java.util.Set set, int i17) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isfeedback=1&feedtype=0&businesstype=2&itemtype=");
        stringBuffer.append(xn6Var.A);
        stringBuffer.append("&scene=");
        stringBuffer.append(un6Var.f387506i);
        stringBuffer.append("&searchid=");
        stringBuffer.append(un6Var.f387507m);
        stringBuffer.append("&clicktime=");
        stringBuffer.append(java.lang.System.currentTimeMillis());
        stringBuffer.append("&docid=");
        stringBuffer.append(xn6Var.G);
        stringBuffer.append("&docpos=");
        stringBuffer.append(i17);
        stringBuffer.append("&reasonid=");
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((r45.ir0) it.next()).f377277d);
            stringBuffer.append("#");
        }
        stringBuffer.append("&reasonwording=");
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        java.util.Iterator it6 = set.iterator();
        while (it6.hasNext()) {
            stringBuffer2.append(((r45.ir0) it6.next()).f377278e);
            stringBuffer2.append("#");
        }
        try {
            stringBuffer.append(fp.s0.b(stringBuffer2.toString(), "utf8"));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        stringBuffer.append("&offset=");
        stringBuffer.append(i17);
        stringBuffer.append("&sessionid=");
        stringBuffer.append(su4.r2.f(un6Var.f387506i));
        stringBuffer.append("&reserveexpand=");
        stringBuffer.append(xn6Var.B);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportFeedBackClick %s", stringBuffer.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f379756t = stringBuffer.toString();
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static void b(int i17) {
        if (i17 == -21020) {
            uu4.b.a(10);
        } else if (i17 == -21009) {
            uu4.b.a(9);
        } else if (i17 == -10012) {
            uu4.b.a(7);
        } else if (i17 == -10004) {
            uu4.b.a(8);
        } else if (i17 == -1010) {
            uu4.b.a(4);
        } else if (i17 == -1007) {
            uu4.b.a(5);
        } else if (i17 == -1004) {
            uu4.b.a(6);
        } else if (i17 == 416) {
            uu4.b.a(15);
        } else if (i17 == 502) {
            uu4.b.a(14);
        } else if (i17 != 503) {
            switch (i17) {
                case 403:
                    uu4.b.a(12);
                    break;
                case 404:
                    uu4.b.a(11);
                    break;
                case 405:
                    uu4.b.a(16);
                    break;
                default:
                    uu4.b.a(255);
                    break;
            }
        } else {
            uu4.b.a(13);
        }
        uu4.a.a(7);
    }

    public static void c(r45.xn6 xn6Var, int i17, int i18, int i19, dn.h hVar) {
        dn.h hVar2 = hVar == null ? new dn.h() : hVar;
        java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(xn6Var.U), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(hVar2.field_startTime), java.lang.Long.valueOf(hVar2.field_endTime), java.lang.Integer.valueOf(hVar2.field_averageSpeed), java.lang.Integer.valueOf(hVar2.field_averageConnectCost), java.lang.Integer.valueOf(hVar2.field_firstConnectCost), java.lang.Integer.valueOf(hVar2.field_moovFailReason), java.lang.Integer.valueOf(hVar2.field_httpStatusCode), hVar2.field_clientIP, hVar2.field_serverIP, hVar2.field_xErrorNo, java.lang.Integer.valueOf(hVar2.field_cSeqCheck), java.lang.Integer.valueOf(hVar2.field_isCrossNet ? 1 : 0), java.lang.Integer.valueOf(hVar2.field_usePrivateProtocol ? 1 : 0), java.lang.Integer.valueOf(i19));
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportKvTopStoryCdnDownloadError 16270 %s", format);
        jx3.f.INSTANCE.kvStat(16270, format);
        if (i18 != 0) {
            r45.lq5 lq5Var = new r45.lq5();
            java.lang.String str = "videoplayfailreport=1&vt=" + xn6Var.U + "&errorcode=" + i18 + "&filetype=" + i17 + "&startdownloadtime=" + hVar2.field_startTime + "&enddownloadtime=" + hVar2.field_endTime + "&averagespeed=" + hVar2.field_averageSpeed + "&averageconnectcost=" + hVar2.field_averageConnectCost + "&firstconnectcost=" + hVar2.field_firstConnectCost + "&moovfailreason=" + hVar2.field_moovFailReason + "&httpstatuscode=" + hVar2.field_httpStatusCode + "&clientip=" + hVar2.field_clientIP + "&serverip=" + hVar2.field_serverIP + "&xerrno=" + hVar2.field_xErrorNo + "&cseqresult=" + hVar2.field_cSeqCheck + "&crossnet=" + (hVar2.field_isCrossNet ? 1 : 0) + "&privateprotocol=" + (hVar2.field_usePrivateProtocol ? 1 : 0) + "&nettype=" + i19 + "&cdnsourcetype=" + xn6Var.Q + "&cdnscene=" + xn6Var.P + "&expand=" + xn6Var.f390273x;
            lq5Var.f379756t = str;
            java.lang.String str2 = hVar2.field_httpResponseHeader;
            lq5Var.R = str2;
            java.lang.String str3 = xn6Var.f390256e;
            lq5Var.S = str3;
            java.lang.String str4 = xn6Var.S;
            lq5Var.T = str4;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "NetSceneWebSearchReport16270 [logString:%s], [header:%s], [url:%s], [bypass:%s]", str, str2, str3, str4);
            gm0.j1.d().g(new su4.a2(lq5Var));
        }
    }

    public static void d(r45.xn6 xn6Var, int i17, java.lang.String str, int i18) {
        java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s", java.lang.Integer.valueOf(i17), str, xn6Var != null ? xn6Var.G : "", java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 2 : !com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1 : 3), java.lang.Integer.valueOf(i18));
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportKvTopStoryVideoPlayError %s", format);
        jx3.f.INSTANCE.kvStat(15248, format);
    }

    public static void e(r45.y97 y97Var, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String Q0;
        java.lang.String r17;
        int i17 = 1;
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
            Q0 = f9Var.A0() == 1 ? c01.z1.r() : c01.w9.s(f9Var.j());
            r17 = f9Var.Q0();
            i17 = 2;
        } else if (f9Var.A0() == 1) {
            Q0 = c01.z1.r();
            r17 = f9Var.Q0();
        } else {
            Q0 = f9Var.Q0();
            r17 = c01.z1.r();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isShareClick=1&relevant_vid=");
        stringBuffer.append(y97Var.f390898d);
        stringBuffer.append("&relevant_pre_searchid=");
        stringBuffer.append(y97Var.f390900f);
        stringBuffer.append("&relevant_shared_openid=");
        stringBuffer.append(y97Var.f390901g);
        stringBuffer.append("&rec_category=");
        long j17 = y97Var.f390915x;
        if (j17 > 0) {
            stringBuffer.append(j17);
        } else {
            stringBuffer.append(y97Var.f390902h);
        }
        stringBuffer.append("&source=");
        stringBuffer.append(y97Var.f390910s);
        stringBuffer.append("&fromUser=");
        stringBuffer.append(Q0);
        stringBuffer.append("&fromScene=");
        stringBuffer.append(i17);
        stringBuffer.append("&targetInfo=");
        stringBuffer.append(r17);
        stringBuffer.append("&expand=");
        stringBuffer.append(y97Var.f390899e);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryClickShareItem 15371 %s", stringBuffer.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f379756t = stringBuffer.toString();
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static void f(r45.in6 in6Var, java.lang.String str, long j17) {
        long j18;
        if (in6Var.f377192q.size() > 0) {
            java.util.LinkedList linkedList = in6Var.f377192q;
            if ("clickTopStory".equals(((r45.tn6) linkedList.get(0)).f386617d)) {
                j18 = j17 - ((r45.tn6) linkedList.get(0)).f386618e;
                java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(in6Var.f377187i), in6Var.f377191p, in6Var.f377183e, java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(1)), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(in6Var.f377193r), java.lang.Integer.valueOf(in6Var.f377196u), in6Var.f377198w, java.lang.Long.valueOf(j18), in6Var.f377199x, in6Var.f377189n);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomeUIAction 15466 %s", format);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(15466, format);
            }
        }
        j18 = 0;
        java.lang.String format2 = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(in6Var.f377187i), in6Var.f377191p, in6Var.f377183e, java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(1)), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(in6Var.f377193r), java.lang.Integer.valueOf(in6Var.f377196u), in6Var.f377198w, java.lang.Long.valueOf(j18), in6Var.f377199x, in6Var.f377189n);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomeUIAction 15466 %s", format2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(15466, format2);
    }

    public static final void g(r45.un6 un6Var, long j17, r45.xn6 xn6Var) {
        if (j17 > 0) {
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(un6Var.f387506i);
            objArr[1] = java.lang.Long.valueOf(j17 / 1000);
            objArr[2] = java.lang.Long.valueOf(un6Var.f387505h);
            objArr[3] = 3;
            objArr[4] = "";
            objArr[5] = 2;
            objArr[6] = xn6Var != null ? xn6Var.f390273x : un6Var.f387502e;
            objArr[7] = un6Var.f387507m;
            java.lang.String format = java.lang.String.format("videoflowbrowsereport=1&scene=%s&staytime=%s&channelid=%s&pageid=%s&nettype=%s&source=%s&expand=%s&searchid=%s", objArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoPageBrowseTime 15018 %s", format);
            r45.lq5 lq5Var = new r45.lq5();
            lq5Var.f379756t = format;
            gm0.j1.d().g(new su4.a2(lq5Var));
        }
    }

    public static void h(r45.un6 un6Var, r45.xn6 xn6Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String format = java.lang.String.format("videosharereport=1&scene=%s&searchid=%s&docid=%s&cdnsourcetype=%s&videoid=%s&optype=%s&fromuser=%s&touser=%s&channelid=%s&optypes=%s&expand=%s", java.lang.Integer.valueOf(un6Var.f387506i), un6Var.f387507m, xn6Var.G, java.lang.Integer.valueOf(xn6Var.Q), xn6Var.f390259h, 0, str2, str3, java.lang.Long.valueOf(un6Var.f387505h), str, xn6Var.f390273x);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoShare 15035 %s", format);
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f379756t = format;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoShare:" + format);
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static final void i(r45.un6 un6Var, r45.xn6 xn6Var, int i17) {
        r45.lq5 lq5Var = new r45.lq5();
        java.lang.String format = java.lang.String.format("logname=videopoint&scene=%s&docid=%s&searchid=%s&vid=%s&actiontype=%s&itemtype=%s", java.lang.Integer.valueOf(un6Var.f387506i), xn6Var.G, un6Var.f387507m, xn6Var.f390259h, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(xn6Var.A));
        lq5Var.f379756t = format;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportVideoPointAction %s", format);
        gm0.j1.d().g(new su4.u1(lq5Var));
    }
}
