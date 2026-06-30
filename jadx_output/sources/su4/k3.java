package su4;

/* loaded from: classes8.dex */
public abstract class k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final su4.j3 f412979a = new su4.j3();

    public static void a(int i17, java.lang.String str) {
        jx3.f.INSTANCE.d(12070, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0)), str, 4, 0, "", 1, 0);
    }

    public static void b(int i17, int i18, java.lang.String str, int i19, int i27, java.lang.String str2, int i28) {
        jx3.f.INSTANCE.d(12098, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0)), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str2, java.lang.Integer.valueOf(i28));
    }

    public static void c(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mm.autogen.mmdata.rpt.GlobalWebSearchClickRateStruct globalWebSearchClickRateStruct = new com.tencent.mm.autogen.mmdata.rpt.GlobalWebSearchClickRateStruct();
        globalWebSearchClickRateStruct.f58367d = globalWebSearchClickRateStruct.b("Query", str.replace(',', ' '), true);
        globalWebSearchClickRateStruct.f58368e = i17;
        globalWebSearchClickRateStruct.f58369f = i18;
        globalWebSearchClickRateStruct.f58371h = i19;
        globalWebSearchClickRateStruct.f58370g = 0L;
        globalWebSearchClickRateStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchReportLogic", "report12639 %s", globalWebSearchClickRateStruct.n().replace(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " "));
    }

    public static void d(int i17, java.lang.String str, int i18, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i27, java.lang.String str6, long j17, long j18, int i28, java.lang.String str7, java.lang.String str8, int i29, int i37) {
        com.tencent.mm.autogen.mmdata.rpt.FingerWebSearchActionStruct fingerWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FingerWebSearchActionStruct();
        fingerWebSearchActionStruct.f58089e = i17;
        fingerWebSearchActionStruct.f58088d = fingerWebSearchActionStruct.b("RequestId", str, true);
        fingerWebSearchActionStruct.f58090f = i18;
        fingerWebSearchActionStruct.f58091g = i19;
        fingerWebSearchActionStruct.f58092h = fingerWebSearchActionStruct.b("HitWordList", str2, true);
        fingerWebSearchActionStruct.f58093i = fingerWebSearchActionStruct.b("HitWordVersion", str3, true);
        fingerWebSearchActionStruct.f58094j = fingerWebSearchActionStruct.b("MsgId", str4, true);
        fingerWebSearchActionStruct.f58095k = fingerWebSearchActionStruct.b("MsgFromUsername", "", true);
        fingerWebSearchActionStruct.f58096l = i27;
        fingerWebSearchActionStruct.f58097m = fingerWebSearchActionStruct.b("ChatRoomID", str6, true);
        fingerWebSearchActionStruct.f58098n = j17;
        fingerWebSearchActionStruct.f58099o = j18;
        fingerWebSearchActionStruct.f58100p = i28;
        fingerWebSearchActionStruct.f58101q = fingerWebSearchActionStruct.b("ShowHitWord", str7, true);
        fingerWebSearchActionStruct.f58102r = fingerWebSearchActionStruct.b("MatchTypeList", str8, true);
        fingerWebSearchActionStruct.f58103s = i29;
        fingerWebSearchActionStruct.f58104t = i37;
        fingerWebSearchActionStruct.k();
        m(fingerWebSearchActionStruct);
    }

    public static final void e(int i17) {
        jx3.f.INSTANCE.idkeyStat(649L, i17, 1L, true);
    }

    public static final void f(int i17, int i18) {
        if (i17 == 21) {
            jx3.f.INSTANCE.idkeyStat(649L, i18, 1L, true);
        }
    }

    public static void g(int i17, int i18, int i19, int i27, java.lang.String str) {
        jx3.f.INSTANCE.d(14457, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i17 == 21 ? com.tencent.mm.plugin.websearch.l2.a(1) : com.tencent.mm.plugin.websearch.l2.a(0)), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str);
    }

    public static void h() {
        su4.j3 j3Var = f412979a;
        if (j3Var.f412970g) {
            return;
        }
        jx3.f.INSTANCE.d(12044, java.lang.Integer.valueOf(j3Var.f412964a), java.lang.Integer.valueOf(j3Var.f412965b), java.lang.Long.valueOf(j3Var.f412967d / 1000), java.lang.Long.valueOf(j3Var.f412969f / 1000));
        j3Var.f412970g = true;
    }

    public static void i(r45.qn6 qn6Var, int i17, int i18, int i19, long j17, java.lang.String str) {
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            return;
        }
        if (qn6Var == null) {
            qn6Var = new r45.qn6();
            qn6Var.f384113d = "";
            qn6Var.f384121o = 0L;
            qn6Var.f384118i = 0;
        }
        if (qn6Var.f384118i == 0) {
            qn6Var.f384118i = i18;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("reddotreport=1&reddotid=");
        java.lang.String str2 = qn6Var.f384113d;
        stringBuffer.append(str2 != null ? str2 : "");
        stringBuffer.append("&reddotts=");
        stringBuffer.append(qn6Var.f384121o);
        stringBuffer.append("&nettype=");
        stringBuffer.append(com.tencent.mm.plugin.websearch.l2.b());
        stringBuffer.append("&optype=");
        stringBuffer.append(i17);
        stringBuffer.append("&reddottype=");
        stringBuffer.append(qn6Var.f384118i);
        stringBuffer.append("&reddotcnt=");
        stringBuffer.append(i19);
        stringBuffer.append("&reddotconsumets=");
        stringBuffer.append(j17);
        stringBuffer.append("&notshowreason=");
        stringBuffer.append(str);
        stringBuffer.append("&reddotseq=");
        stringBuffer.append(qn6Var.f384126t);
        if (i17 == 100 || i17 == 101 || i17 == 102 || i17 == 108) {
            int i27 = !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().l(68377, null)) ? 1 : 0;
            int f17 = ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).wi() != null ? ((com.tencent.mm.plugin.sns.storage.w1) ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).wi()).f() : 0;
            if (f17 > 0) {
                stringBuffer.append("&snsreddottype=2&snsreddotcnt=");
                stringBuffer.append(f17);
            } else if (i27 > 0) {
                stringBuffer.append("&snsreddottype=1&snsreddotcnt=0");
            } else {
                stringBuffer.append("&snsreddottype=0&snsreddotcnt=0");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory", "reportTopStoryRedDot 16399 %s", stringBuffer.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f379756t = stringBuffer.toString();
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static void j(java.lang.String str, long j17, int i17, int i18, int i19, long j18, java.lang.String str2, int i27) {
        ((ku5.t0) ku5.t0.f312615d).h(new su4.h3(str, j17, i17, i18, i19, j18, str2, i27), "ReportTopStoryRedDotKv");
    }

    public static void k(int i17, int i18, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("recnondocreport=1&type=51&content=");
        stringBuffer.append(i17);
        stringBuffer.append("|");
        stringBuffer.append(i18);
        stringBuffer.append("|");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        stringBuffer.append(str);
        stringBuffer.append("|");
        stringBuffer.append(z17 ? 1 : 0);
        stringBuffer.append("&searchid=");
        if (str2 == null) {
            str2 = "";
        }
        stringBuffer.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory", "reportTopStoryRedDot 14791 %s", stringBuffer.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f379756t = stringBuffer.toString();
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static void l() {
        su4.j3 j3Var = f412979a;
        j3Var.f412967d += java.lang.System.currentTimeMillis() - j3Var.f412966c;
    }

    public static void m(jx3.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchReportLogic", "report%s %s", java.lang.Integer.valueOf(aVar.g()), aVar.n().replace(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " "));
    }
}
