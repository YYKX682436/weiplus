package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class i2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164287d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164288e;

    /* renamed from: f, reason: collision with root package name */
    public final int f164289f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.l76 f164290g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164291h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f164292i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f164293m;

    /* renamed from: n, reason: collision with root package name */
    public final int f164294n;

    public i2(r45.l76 l76Var, java.lang.String str, java.lang.String str2, int i17) {
        r45.ud6 ud6Var;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        this.f164294n = 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.c76();
        lVar.f70665b = new r45.d76();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsadcomment";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.pay.o1.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164287d = a17;
        r45.c76 c76Var = (r45.c76) a17.f70710a.f70684a;
        c76Var.f371351d = l76Var;
        this.f164289f = l76Var.f379205f.f378462h;
        this.f164290g = l76Var;
        c76Var.f371352e = str;
        c76Var.f371356i = i17;
        this.f164288e = str;
        long j17 = l76Var.f379203d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseStatSnsAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17);
        if (y07 == null || (timeLine = y07.getTimeLine()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStatSnsAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            ud6Var = null;
        } else {
            ud6Var = com.tencent.mm.modelstat.k0.h(timeLine.statExtStr);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStatSnsAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        }
        if (ud6Var != null) {
            c76Var.f371355h = x51.j1.i(com.tencent.mm.modelstat.k0.g(ud6Var));
            c76Var.f371354g = ud6Var.f387270g;
        }
        c76Var.f371353f = x51.j1.i(str2 == null ? "" : str2);
        if (l44.h3.e()) {
            c76Var.f371359o = l44.e.b();
        }
        java.lang.String e17 = m54.j.e();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            c76Var.f371360p = e17;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdComment", "the req vangogh version is " + c76Var.f371360p);
        }
        this.f164294n = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdComment", l76Var.f379205f.f378458d + " " + l76Var.f379205f.f378459e + " type " + l76Var.f379205f.f378462h + " aduxinfo " + str2 + ", SnsStat=" + c76Var.f371355h + ", source=" + c76Var.f371354g + ", scene=" + i17 + ", SupportCapability = " + c76Var.f371359o);
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        this.f164291h = u0Var;
        int dispatch = dispatch(sVar, this.f164287d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        return com.tencent.mm.plugin.appbrand.jsapi.pay.o1.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.d76 d76Var;
        int i27;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject2;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.plugin.sns.model.l4.xj().v(this.f164290g.f379203d, this.f164289f, this.f164288e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            r45.k76 k76Var = this.f164290g.f379205f;
            int i28 = k76Var.f378462h;
            if (i28 == 1 || i28 == 2 || i28 == 3 || i28 == 5 || i28 == 7 || i28 == 8 || i28 == 16) {
                r45.e86 e86Var = new r45.e86();
                e86Var.f373131i = k76Var.f378464m;
                e86Var.f373129g = k76Var.f378462h;
                e86Var.f373128f = k76Var.f378463i;
                e86Var.f373126d = k76Var.f378458d;
                e86Var.f373127e = k76Var.f378460f;
                e86Var.f373130h = k76Var.f378465n;
                e86Var.f373139t = k76Var.f378472u;
                try {
                    com.tencent.mm.modelbase.o oVar = this.f164287d;
                    r45.c76 c76Var = (r45.c76) oVar.f70710a.f70684a;
                    d76Var = (r45.d76) oVar.f70711b.f70700a;
                    i27 = c76Var.f371354g;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsAdComment", e17, "", new java.lang.Object[0]);
                }
                if (i27 != 1 && i27 != 2) {
                    synchronized (com.tencent.mm.plugin.sns.model.x.f164745a) {
                        try {
                            r45.f76 f76Var = d76Var.f372207d;
                            snsObject = f76Var.f374076d;
                            boolean z18 = com.tencent.mm.plugin.sns.model.x.h() == 1;
                            java.lang.String str2 = "";
                            if (z18) {
                                z17 = com.tencent.mm.plugin.sns.model.x.z(f76Var);
                                if (z17) {
                                    java.lang.String g17 = x51.j1.g(f76Var.f374079g);
                                    if (g17 == null) {
                                        g17 = "";
                                    }
                                    str2 = g17;
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1802, 2);
                                } else {
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1802, 3);
                                }
                            } else {
                                z17 = false;
                            }
                            int i29 = (!z18 || z17) ? z18 ? 2 : 0 : 1;
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsAdComment", "adDynamic, graySwitch=" + z18 + ", isValid=" + z17 + ", replaceMode=" + i29 + ", dynamicAdInfoStr=" + str2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                            com.tencent.mm.plugin.sns.model.x.r(f76Var, str2, i29, false);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                        } finally {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                        }
                    }
                    this.f164293m = snsObject;
                    snsObject.toString();
                    snsObject.LikeUserList.size();
                    snsObject.CommentUserList.size();
                    if (k76Var.f378462h == 7 && (snsObject2 = this.f164293m) != null) {
                        l44.b3 b3Var = l44.b3.f316041a;
                        java.lang.String j17 = com.tencent.mm.plugin.sns.storage.w2.j("ad_table_", snsObject2.Id);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdLikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                        com.tencent.mars.xlog.Log.i("AdInteractHelper", "onAdLikeResponse() called with: snsId = " + j17);
                        ((kotlinx.coroutines.flow.q2) l44.b3.f316053m).e(j17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdLikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                    }
                }
                r45.ca6 ca6Var = d76Var.f372208e;
                snsObject = ca6Var.f371402d;
                java.lang.Object obj = com.tencent.mm.plugin.sns.model.x.f164745a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                r45.f76 d17 = com.tencent.mm.plugin.sns.model.x.d(ca6Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                com.tencent.mm.plugin.sns.model.x.r(d17, "", 0, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                this.f164293m = snsObject;
                snsObject.toString();
                snsObject.LikeUserList.size();
                snsObject.CommentUserList.size();
                if (k76Var.f378462h == 7) {
                    l44.b3 b3Var2 = l44.b3.f316041a;
                    java.lang.String j172 = com.tencent.mm.plugin.sns.storage.w2.j("ad_table_", snsObject2.Id);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdLikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                    com.tencent.mars.xlog.Log.i("AdInteractHelper", "onAdLikeResponse() called with: snsId = " + j172);
                    ((kotlinx.coroutines.flow.q2) l44.b3.f316053m).e(j172);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdLikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                }
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            }
            com.tencent.mm.plugin.sns.model.l4.xj().g();
        } else if (i18 == 4) {
            com.tencent.mm.plugin.sns.model.l4.xj().v(this.f164290g.f379203d, this.f164289f, this.f164288e);
        }
        this.f164291h.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
    }
}
