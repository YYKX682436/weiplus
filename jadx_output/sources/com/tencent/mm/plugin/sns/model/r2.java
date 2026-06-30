package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class r2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164624d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.TimeLineObject f164625e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.TimeLineObject f164626f;

    /* renamed from: g, reason: collision with root package name */
    public final int f164627g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164629i;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent f164631n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent f164632o;

    /* renamed from: p, reason: collision with root package name */
    public final int f164633p;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f164641x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f164642y;

    /* renamed from: h, reason: collision with root package name */
    public long f164628h = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f164630m = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f164634q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public int f164635r = 0;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f164636s = "";

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f164637t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f164638u = new java.util.HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f164639v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f164640w = "";

    /* JADX WARN: Can't wrap try/catch for region: R(10:127|(1:129)|130|(2:132|(6:134|135|136|137|138|139))|142|135|136|137|138|139) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r2(java.lang.String r20, int r21, int r22, java.util.List r23, com.tencent.mm.protocal.protobuf.TimeLineObject r24, int r25, java.lang.String r26, int r27, java.util.LinkedList r28, int r29, r45.kj4 r30, r45.y96 r31, com.tencent.mm.protobuf.g r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.r2.<init>(java.lang.String, int, int, java.util.List, com.tencent.mm.protocal.protobuf.TimeLineObject, int, java.lang.String, int, java.util.LinkedList, int, r45.kj4, r45.y96, com.tencent.mm.protobuf.g, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    public static /* synthetic */ java.util.HashMap H(com.tencent.mm.plugin.sns.model.r2 r2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        java.util.HashMap hashMap = r2Var.f164638u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return hashMap;
    }

    public static void I(com.tencent.mm.plugin.sns.model.r2 r2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        r2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkRemoveQRListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        if (r2Var.f164638u.isEmpty()) {
            r2Var.f164641x.dead();
            r2Var.f164642y.dead();
            if (r2Var.f164635r != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(r2Var.f164636s)) {
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = r2Var.f164626f;
                r45.y8 y8Var = timeLineObject.AppInfo;
                java.lang.String str = y8Var == null ? "" : y8Var.f390846d;
                int size = timeLineObject.ContentObj.f369840h.size();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPost", "report qrCodeImgSns(13627), snsId:%s, size:%d, info:%s, appId:%s", r2Var.f164626f.Id, java.lang.Integer.valueOf(size), r2Var.f164636s, str);
                v90.x xVar = (v90.x) i95.n0.c(v90.x.class);
                java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s,%d,%s,%s", r2Var.f164626f.Id, java.lang.Integer.valueOf(size), r2Var.f164636s, str);
                ((u90.v) xVar).getClass();
                com.tencent.mm.modelstat.i0.g(13627, format);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRemoveQRListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
    }

    public static int J(com.tencent.mm.plugin.sns.model.r2 r2Var, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        r2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceMap", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        java.lang.Integer num = (java.lang.Integer) r2Var.f164639v.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceMap", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        } else {
            i18 = num.intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceMap", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return i18;
    }

    public static void K(com.tencent.mm.plugin.sns.model.r2 r2Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        r2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMultiMediaInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        wi3.o oVar = new wi3.o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        long j17 = r2Var.f164628h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        oVar.f446235d = j17;
        oVar.f446236e = 1;
        oVar.f446237f = i17;
        oVar.f446240i = ((r45.jj4) r2Var.f164637t.get(str)).f377858g;
        oVar.f446243o = str3;
        if (((r45.aa6) r2Var.f164624d.f70711b.f70700a).f369870d != null) {
            oVar.f446244p = r12.CreateTime;
        }
        oVar.f446245q = 0;
        oVar.f446246r = 0;
        oVar.f446253y = str2;
        if (com.tencent.mm.plugin.sns.model.l4.Fj().i1(r2Var.L()) != null) {
            ((da0.e) ((ea0.f) i95.n0.c(ea0.f.class))).wi(oVar, 3, r9.getCreateTime(), str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsPost", "report error");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMultiMediaInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
    }

    public int L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return this.f164627g;
    }

    public final void M(long j17, java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportEcsSnsPostInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("ecs_share_wxec_action", "ecs_event_succ", new com.tencent.mm.plugin.sns.model.t2(this, j17, str), 12, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportEcsSnsPostInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
    }

    public final void N(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsPostInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SNS_POST_BIZ_ID_STRING;
        java.lang.String str = (java.lang.String) c17.m(u3Var, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            e42.f0 f0Var = (e42.f0) i95.n0.c(e42.f0.class);
            java.lang.String t07 = ca4.z0.t0(j17);
            w52.g gVar = (w52.g) f0Var;
            gVar.getClass();
            if (!android.text.TextUtils.isEmpty("snspublicid") && !android.text.TextUtils.isEmpty(t07) && !android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HellBizService", "HABBYGE-MALI, %d putBizData key[%s] data[%s] bizId[%s]", java.lang.Integer.valueOf(gVar.hashCode()), "snspublicid", t07, str);
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.AsyncBizCollector", "collectBizData: %s, %s, %s", "snspublicid", t07, str);
                r45.kw3 kw3Var = new r45.kw3();
                kw3Var.f379000f = str;
                kw3Var.f378998d = t07;
                kw3Var.f378999e = "snspublicid";
                d52.d.a().d(502, kw3Var);
            }
            gm0.j1.u().c().x(u3Var, "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsPostInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
    }

    public final boolean O(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2) {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject3 = timeLineObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMediaFileName", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        int i17 = 0;
        if (timeLineObject3 == null || timeLineObject2 == null || timeLineObject3.ContentObj == null || timeLineObject2.ContentObj == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMediaFileName", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            return false;
        }
        java.lang.String Di = com.tencent.mm.plugin.sns.model.l4.Di();
        while (i17 < timeLineObject3.ContentObj.f369840h.size() && i17 < timeLineObject2.ContentObj.f369840h.size()) {
            r45.jj4 jj4Var = (r45.jj4) timeLineObject3.ContentObj.f369840h.get(i17);
            r45.jj4 jj4Var2 = (r45.jj4) timeLineObject2.ContentObj.f369840h.get(i17);
            java.lang.String W = ca4.z0.W(jj4Var);
            java.lang.String a07 = ca4.z0.a0(jj4Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTmpUser", "com.tencent.mm.plugin.sns.data.SnsUtil");
            java.lang.String str = "sns_tmpu_" + ca4.z0.s(jj4Var.f377855d);
            if (jj4Var.D == 1) {
                str = l21.c.a(str + ca4.z0.f0(jj4Var), jj4Var.E);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpUser", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTmpUser", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
            java.lang.String Y = ca4.z0.Y(jj4Var);
            java.lang.String J2 = ca4.z0.J(jj4Var2);
            java.lang.String U = ca4.z0.U(jj4Var2);
            java.lang.String e07 = ca4.z0.e0(jj4Var2);
            java.lang.String R = ca4.z0.R(jj4Var2);
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(Di, jj4Var.f377855d);
            java.lang.String d18 = com.tencent.mm.plugin.sns.model.f6.d(Di, jj4Var2.f377855d);
            com.tencent.mm.vfs.w6.u(d18);
            com.tencent.mm.vfs.w6.w(d17 + W, d18 + J2);
            com.tencent.mm.vfs.w6.w(d17 + a07, d18 + U);
            com.tencent.mm.vfs.w6.w(d17 + str, d18 + e07);
            if (com.tencent.mm.vfs.w6.j(d17 + Y)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPost", "post done copy file %s", d18 + R);
                com.tencent.mm.vfs.w6.w(d17 + Y, d18 + R);
            }
            i17++;
            timeLineObject3 = timeLineObject;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMediaFileName", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        this.f164629i = u0Var;
        int dispatch = dispatch(sVar, this.f164624d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
        return 209;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x06f4, code lost:
    
        if (r28.f164626f.sightFolded == 1) goto L181;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x076e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r29, int r30, int r31, java.lang.String r32, com.tencent.mm.network.v0 r33, byte[] r34) {
        /*
            Method dump skipped, instructions count: 2900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.r2.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
