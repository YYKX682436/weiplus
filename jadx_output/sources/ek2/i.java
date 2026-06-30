package ek2;

/* loaded from: classes3.dex */
public final class i extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.h f253461u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253462v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f253463w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f253464x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, long j18, java.lang.String str, byte[] bArr, int i17, r45.ch1 msg, ek2.h hVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f253461u = hVar;
        this.f253462v = "Finder.CgiFinderApplyLiveMic";
        r45.qk1 qk1Var = new r45.qk1();
        this.f253463w = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f253464x = jSONObject;
        qk1Var.set(4, java.lang.Long.valueOf(j17));
        qk1Var.set(1, db2.t4.f228171a.a(5227));
        qk1Var.set(5, java.lang.Long.valueOf(j18));
        qk1Var.set(6, str);
        qk1Var.set(8, xy2.c.f(this.f16135n));
        qk1Var.set(7, java.lang.Integer.valueOf(i17));
        qk1Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        qk1Var.set(3, msg);
        jSONObject.put("liveId", j17);
        jSONObject.put("objectId", j18);
        jSONObject.put(dm.i4.COL_USERNAME, qk1Var.getString(8));
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderApplyLiveMic", "apply live id:" + j17 + " objectId:" + j18 + " objectNonceId:" + str);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = qk1Var;
        r45.rk1 rk1Var = new r45.rk1();
        rk1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) rk1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = rk1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveapplymicwithaudience";
        lVar.f70667d = 5227;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        fm2.c cVar;
        java.lang.String str2 = str;
        r45.rk1 resp = (r45.rk1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253462v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str2 + " thread=" + java.lang.Thread.currentThread());
        ek2.h hVar = this.f253461u;
        if (hVar != null) {
            um2.j5 j5Var = (um2.j5) hVar;
            um2.x5 x5Var = j5Var.f428846a;
            com.tencent.mars.xlog.Log.i(x5Var.f429032f, "ApplyLinkMic errCode:" + i18 + " errType:" + i17 + "  errMsg:" + str2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[linkApplyMic result] ");
            sb6.append(i18);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str3 = x5Var.f429032f;
            com.tencent.mars.xlog.Log.i(str3, sb7);
            java.lang.String string = resp.getString(1);
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.finder.assist.y8 y8Var = com.tencent.mm.plugin.finder.assist.y8.f102732a;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.y8.f102739h, 70L);
                ((mm2.o4) x5Var.c(mm2.o4.class)).Q7(j5Var.f428847b == 1 ? 1 : 2);
                com.tencent.mm.plugin.finder.live.plugin.vi0 vi0Var = x5Var.f429051l0;
                if (vi0Var != null) {
                    vi0Var.w1();
                }
                com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = x5Var.f429075t0;
                if (ag0Var != null) {
                    ag0Var.D1();
                }
                mm2.o4 o4Var = (mm2.o4) x5Var.c(mm2.o4.class);
                java.lang.String string2 = resp.getString(3);
                if (string2 == null) {
                    string2 = "";
                }
                o4Var.P7(string2);
                long j17 = (resp.getLong(4) * 1000) - c01.id.c();
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                if ((valueOf.longValue() <= 0 ? 0 : 1) == 0) {
                    valueOf = null;
                }
                long longValue = valueOf != null ? valueOf.longValue() : 60000L;
                com.tencent.mars.xlog.Log.i(str3, "[linkApplyMic result] success, respSessionId: " + resp.getString(3) + " offestTime: " + j17 + " confirm_expired_time: " + resp.getLong(4) + " applyTime: " + longValue);
                mk2.h hVar2 = mk2.h.f327133a;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("startApplyMicTimer delay:");
                sb8.append(longValue);
                com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", sb8.toString());
                mk2.c cVar2 = mk2.h.f327134b;
                com.tencent.mm.sdk.platformtools.u3.l(cVar2);
                com.tencent.mm.sdk.platformtools.u3.i(cVar2, longValue);
                return;
            }
            pm0.v.X(new um2.n0(x5Var));
            androidx.appcompat.app.AppCompatActivity appCompatActivity = x5Var.f19605b;
            switch (i18) {
                case -200302:
                    db5.t7.g(appCompatActivity, com.tencent.mm.sdk.platformtools.t8.K0(str) ? appCompatActivity.getResources().getString(com.tencent.mm.R.string.lz7) : str2);
                    r7 = -1;
                    break;
                case -200108:
                    db5.t7.g(appCompatActivity, com.tencent.mm.sdk.platformtools.t8.K0(str) ? appCompatActivity.getResources().getString(com.tencent.mm.R.string.duq) : str2);
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.r0.ik((ml2.r0) c17, ml2.n4.f327752s, null, 0, 6, null);
                    ml2.m4[] m4VarArr = ml2.m4.f327717d;
                    r7 = 2;
                    break;
                case -200105:
                    db5.t7.g(appCompatActivity, com.tencent.mm.sdk.platformtools.t8.K0(str) ? appCompatActivity.getResources().getString(com.tencent.mm.R.string.dus) : str2);
                    i95.m c18 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    ml2.r0.ik((ml2.r0) c18, ml2.n4.f327751r, null, 0, 6, null);
                    ml2.m4[] m4VarArr2 = ml2.m4.f327717d;
                    fm2.c cVar3 = x5Var.f19606c;
                    if (cVar3 != null) {
                        dk2.Cif.b(dk2.Cif.f233626a, cVar3, ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0), dk2.hf.f233586d, false, 8, null);
                        break;
                    }
                    break;
                case -200104:
                    db5.t7.g(appCompatActivity, com.tencent.mm.sdk.platformtools.t8.K0(str) ? appCompatActivity.getResources().getString(com.tencent.mm.R.string.duv) : str2);
                    i95.m c19 = i95.n0.c(ml2.r0.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    ml2.r0.ik((ml2.r0) c19, ml2.n4.f327750q, null, 0, 6, null);
                    ml2.m4[] m4VarArr3 = ml2.m4.f327717d;
                    r7 = 0;
                    break;
                case -200018:
                    java.lang.String string3 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? appCompatActivity.getResources().getString(com.tencent.mm.R.string.dn6) : str2;
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(appCompatActivity);
                    u1Var.n(appCompatActivity.getResources().getString(com.tencent.mm.R.string.f490454vi));
                    u1Var.g(string3);
                    u1Var.q(false);
                    r7 = -1;
                    break;
                case -200017:
                case -200010:
                    java.lang.String string4 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? appCompatActivity.getResources().getString(com.tencent.mm.R.string.dn7) : str2;
                    com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(appCompatActivity);
                    u1Var2.n(appCompatActivity.getResources().getString(com.tencent.mm.R.string.f490454vi));
                    u1Var2.g(string4);
                    u1Var2.q(false);
                    r7 = -1;
                    break;
                case -200016:
                    com.tencent.mars.xlog.Log.i(str3, "[linkApplyMic Err] need realname, url:" + string);
                    if (string != null && (cVar = x5Var.f19606c) != null) {
                        cVar.forceScreenToPortrait();
                        new com.tencent.mm.plugin.finder.live.plugin.ah(new com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel(appCompatActivity), cVar).t1(new um2.o0(x5Var));
                    }
                    r7 = -1;
                    break;
                case -200009:
                case -100064:
                    java.lang.String string5 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? appCompatActivity.getResources().getString(com.tencent.mm.R.string.dn8) : str2;
                    com.tencent.mm.ui.widget.dialog.u1 u1Var3 = new com.tencent.mm.ui.widget.dialog.u1(appCompatActivity);
                    u1Var3.n(appCompatActivity.getResources().getString(com.tencent.mm.R.string.f490454vi));
                    u1Var3.g(string5);
                    u1Var3.q(false);
                    r7 = -1;
                    break;
                default:
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        str2 = appCompatActivity.getResources().getString(com.tencent.mm.R.string.lz8);
                    }
                    db5.t7.g(appCompatActivity, str2);
                    long j18 = ((mm2.e1) x5Var.c(mm2.e1.class)).f328988r.getLong(0);
                    com.tencent.mm.plugin.finder.assist.y8 y8Var2 = com.tencent.mm.plugin.finder.assist.y8.f102732a;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.y8.f102739h, 71L);
                    com.tencent.mars.xlog.Log.i("FinderLiveMicWatcher", "onVisitorApplyMicFail errCode: " + i18 + " errType: " + i17 + " liveId: " + j18);
                    pm0.z.b(xy2.b.f458155b, "mic_visitorApplyMicFail", false, null, null, false, false, new dk2.sa(i18, i17, j18), 60, null);
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[linkApplyMic Err] unkonwn errCode:$");
                    sb9.append(i18);
                    com.tencent.mars.xlog.Log.i(str3, sb9.toString());
                    r7 = -1;
                    break;
            }
            if (r7 != -1) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_link_err_event", x5Var.f19606c, kz5.b1.e(new jz5.l("link_err_type", java.lang.Integer.valueOf(r7))), 25561);
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253464x;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f253463w;
    }
}
