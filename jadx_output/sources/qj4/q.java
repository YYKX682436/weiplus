package qj4;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj4.h2 f363943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f363944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363946g;

    public q(pj4.h2 h2Var, java.lang.Long l17, java.lang.String str, java.lang.String str2) {
        this.f363943d = h2Var;
        this.f363944e = l17;
        this.f363945f = str;
        this.f363946g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = "iconid";
        com.tencent.mm.autogen.mmdata.rpt.TextStatusCliPostStruct textStatusCliPostStruct = new com.tencent.mm.autogen.mmdata.rpt.TextStatusCliPostStruct();
        pj4.h2 h2Var = this.f363943d;
        java.lang.String str2 = h2Var.N;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        textStatusCliPostStruct.f61152d = textStatusCliPostStruct.b("SessionID", str2, true);
        textStatusCliPostStruct.f61156f = h2Var.P;
        java.lang.String str3 = h2Var.f355081d;
        if (str3 == null) {
            str3 = "";
        }
        textStatusCliPostStruct.f61154e = textStatusCliPostStruct.b("CliPostID", str3, true);
        textStatusCliPostStruct.f61158g = h2Var.f355084g;
        java.lang.Long l17 = this.f363944e;
        textStatusCliPostStruct.f61162i = l17 != null ? l17.longValue() : 0L;
        textStatusCliPostStruct.f61164j = c01.id.c();
        java.lang.String str4 = this.f363945f;
        if (str4 == null) {
            str4 = "";
        }
        textStatusCliPostStruct.f61166k = textStatusCliPostStruct.b("ExitTopicID", str4, true);
        java.lang.String str5 = this.f363946g;
        if (str5 == null) {
            str5 = "";
        }
        textStatusCliPostStruct.f61168l = textStatusCliPostStruct.b("ExitTextStatusID", str5, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = h2Var.f355086i.iterator();
        while (it.hasNext()) {
            java.lang.String str6 = (java.lang.String) it.next();
            if (sb6.length() > 0) {
                sb6.append(";");
            }
            sb6.append(str6);
        }
        textStatusCliPostStruct.f61160h = textStatusCliPostStruct.b("StatusIcons", sb6.toString(), true);
        textStatusCliPostStruct.f61170m = h2Var.f355090o;
        textStatusCliPostStruct.f61172n = h2Var.f355091p;
        textStatusCliPostStruct.f61174o = h2Var.f355094q;
        textStatusCliPostStruct.f61176p = h2Var.f355095r;
        textStatusCliPostStruct.f61178q = h2Var.f355096s;
        java.lang.String str7 = h2Var.f355097t;
        if (str7 == null) {
            str7 = "";
        }
        textStatusCliPostStruct.f61180r = textStatusCliPostStruct.b("SourceID", str7, true);
        java.lang.String str8 = h2Var.f355098u;
        if (str8 == null) {
            str8 = "";
        }
        textStatusCliPostStruct.f61182s = textStatusCliPostStruct.b("SourceActivityID", str8, true);
        java.lang.String str9 = h2Var.f355099v;
        if (str9 == null) {
            str9 = "";
        }
        textStatusCliPostStruct.f61184t = textStatusCliPostStruct.b("SourceName", str9, true);
        java.lang.String str10 = h2Var.f355100w;
        if (str10 == null) {
            str10 = "";
        }
        textStatusCliPostStruct.f61186u = textStatusCliPostStruct.b("SourceIcon", str10, true);
        textStatusCliPostStruct.f61188v = h2Var.f355101x;
        textStatusCliPostStruct.f61190w = h2Var.f355104y;
        textStatusCliPostStruct.f61192x = h2Var.f355107z;
        textStatusCliPostStruct.f61194y = h2Var.A;
        textStatusCliPostStruct.f61196z = h2Var.B;
        textStatusCliPostStruct.A = h2Var.C;
        textStatusCliPostStruct.B = h2Var.D;
        textStatusCliPostStruct.C = h2Var.E;
        textStatusCliPostStruct.E = h2Var.F;
        textStatusCliPostStruct.F = h2Var.G;
        textStatusCliPostStruct.G = h2Var.H;
        textStatusCliPostStruct.H = h2Var.I;
        textStatusCliPostStruct.I = h2Var.f355080J;
        textStatusCliPostStruct.f61148J = h2Var.K;
        textStatusCliPostStruct.K = h2Var.L;
        textStatusCliPostStruct.L = h2Var.M;
        textStatusCliPostStruct.P = h2Var.Q;
        textStatusCliPostStruct.Q = h2Var.R;
        textStatusCliPostStruct.R = 0L;
        textStatusCliPostStruct.S = h2Var.U;
        textStatusCliPostStruct.T = h2Var.V;
        textStatusCliPostStruct.D = h2Var.E1;
        textStatusCliPostStruct.U = textStatusCliPostStruct.b("RefBackgroundUser", h2Var.X, true);
        textStatusCliPostStruct.V = textStatusCliPostStruct.b("RefBackgroundStatus", h2Var.Y, true);
        textStatusCliPostStruct.W = h2Var.S;
        textStatusCliPostStruct.X = textStatusCliPostStruct.b("ImgVideoMd5Orig", h2Var.T, true);
        textStatusCliPostStruct.Y = textStatusCliPostStruct.b("FinderPickerSessionId", h2Var.Z, true);
        textStatusCliPostStruct.M = h2Var.f355092p0;
        textStatusCliPostStruct.N = h2Var.f355102x0;
        textStatusCliPostStruct.O = textStatusCliPostStruct.b("FinalCustomTitle", h2Var.f355105y0, true);
        textStatusCliPostStruct.Z = h2Var.f355087l1;
        textStatusCliPostStruct.f61149a0 = h2Var.f355093p1;
        textStatusCliPostStruct.f61150b0 = h2Var.f355103x1;
        textStatusCliPostStruct.f61151c0 = h2Var.f355106y1;
        textStatusCliPostStruct.f61153d0 = h2Var.f355108z1;
        textStatusCliPostStruct.f61155e0 = h2Var.A1;
        textStatusCliPostStruct.f61157f0 = textStatusCliPostStruct.b("FinalEmoticon", h2Var.B1, true);
        textStatusCliPostStruct.f61159g0 = 2L;
        textStatusCliPostStruct.f61161h0 = 2L;
        textStatusCliPostStruct.f61163i0 = textStatusCliPostStruct.b("WeRunInfo", h2Var.C1, true);
        textStatusCliPostStruct.f61165j0 = textStatusCliPostStruct.b("PaymentInfo", h2Var.D1, true);
        textStatusCliPostStruct.f61169l0 = textStatusCliPostStruct.b("PostRecomIconID", bk4.i.a().f(), true);
        textStatusCliPostStruct.f61171m0 = qj4.s.f363958a.e();
        textStatusCliPostStruct.f61173n0 = h2Var.F1;
        textStatusCliPostStruct.f61175o0 = bk4.i.a().y() ? h2Var.G1 : 0L;
        bk4.r rVar = bk4.r.f21544a;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator it6 = ((java.util.ArrayList) rVar.c()).iterator();
            while (it6.hasNext()) {
                ej4.k kVar = (ej4.k) it6.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("iconid", kVar.f253369d);
                pj4.o1 j17 = bk4.i.a().j(kVar.f253369d);
                jSONObject.put("icontype", j17 != null ? j17.f355231g : 0);
                jSONObject.put("customtitle", kVar.f253370e);
                jSONArray.put(jSONObject);
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(",");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(jSONArray2).replaceAll(";");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        textStatusCliPostStruct.f61177p0 = textStatusCliPostStruct.b("FreqIcons", replaceAll, true);
        textStatusCliPostStruct.f61179q0 = textStatusCliPostStruct.b("IconSelections", h2Var.H1, true);
        java.util.LinkedList CustomRecommendIconFromPicker = h2Var.N1;
        kotlin.jvm.internal.o.f(CustomRecommendIconFromPicker, "CustomRecommendIconFromPicker");
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        try {
            java.util.Iterator it7 = CustomRecommendIconFromPicker.iterator();
            while (it7.hasNext()) {
                java.lang.String str11 = (java.lang.String) it7.next();
                java.util.Iterator it8 = it7;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(str, str11);
                java.lang.String str12 = str;
                pj4.o1 j18 = bk4.i.a().j(str11);
                jSONObject2.put("icontype", j18 != null ? j18.f355231g : 0);
                jSONObject2.put("customtitle", "");
                jSONArray3.put(jSONObject2);
                it7 = it8;
                str = str12;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.tsReport", "getIconListReportJson: " + e17);
        }
        java.lang.String jSONArray4 = jSONArray3.toString();
        kotlin.jvm.internal.o.f(jSONArray4, "toString(...)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile(",");
        kotlin.jvm.internal.o.f(compile2, "compile(...)");
        java.lang.String replaceAll2 = compile2.matcher(jSONArray4).replaceAll(";");
        kotlin.jvm.internal.o.f(replaceAll2, "replaceAll(...)");
        textStatusCliPostStruct.f61197z0 = textStatusCliPostStruct.b("RcmdIcons", replaceAll2, true);
        textStatusCliPostStruct.f61181r0 = h2Var.I1;
        java.lang.String str13 = h2Var.J1;
        textStatusCliPostStruct.f61185t0 = textStatusCliPostStruct.b("EnterSceneInfo", str13 != null ? r26.i0.u(str13, ',', ';', false, 4, null) : null, true);
        textStatusCliPostStruct.f61183s0 = h2Var.K1;
        textStatusCliPostStruct.f61191w0 = textStatusCliPostStruct.b("VisibilityRangeDetails", h2Var.L1, true);
        textStatusCliPostStruct.f61193x0 = h2Var.M1;
        if (l17 != null && l17.longValue() == 1) {
            textStatusCliPostStruct.f61195y0 = textStatusCliPostStruct.f61193x0 + 1;
        } else {
            textStatusCliPostStruct.f61195y0 = textStatusCliPostStruct.f61193x0;
        }
        textStatusCliPostStruct.k();
        java.lang.String n17 = textStatusCliPostStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "report%s %s", 22219, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
