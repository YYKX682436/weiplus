package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class v2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164713d;

    /* renamed from: e, reason: collision with root package name */
    public long f164714e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f164715f;

    /* renamed from: g, reason: collision with root package name */
    public final int f164716g;

    /* renamed from: h, reason: collision with root package name */
    public int f164717h = 0;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164718i;

    public v2() {
        this.f164714e = 0L;
        this.f164715f = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ta6();
        lVar.f70665b = new r45.ua6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnspreloadingtimeline";
        lVar.f70667d = 718;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164713d = a17;
        int E = ca4.z0.E();
        this.f164716g = 2;
        r45.ta6 ta6Var = (r45.ta6) a17.f70710a.f70684a;
        ta6Var.f386245m = E;
        ta6Var.f386240e = 0L;
        int i17 = com.tencent.mm.plugin.sns.model.l4.Kj().i();
        long k27 = com.tencent.mm.plugin.sns.model.l4.Fj().k2(0L, i17, true);
        this.f164714e = k27;
        ta6Var.f386241f = k27;
        ta6Var.f386242g = com.tencent.mm.plugin.sns.model.f1.c(k27, 0L, "@__weixintimtline");
        long k28 = com.tencent.mm.plugin.sns.model.l4.Fj().k2(0L, 1, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "newerid " + k28);
        ta6Var.f386243h = k28;
        com.tencent.mm.plugin.sns.storage.d2 J0 = com.tencent.mm.plugin.sns.model.l4.Ej().J0("@__weixintimtline");
        java.lang.String str = J0.field_md5;
        this.f164715f = str;
        if (str == null) {
            this.f164715f = "";
        }
        ta6Var.f386239d = this.f164715f;
        byte[] bArr = J0.field_adsession;
        if (bArr == null) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(new byte[0]);
            ta6Var.f386244i = cu5Var;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "request adsession %s", bArr);
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(J0.field_adsession);
            ta6Var.f386244i = cu5Var2;
        }
        r45.cu5 cu5Var3 = new r45.cu5();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        byte[] b17 = l44.h3.b(null, 0, true, 0L, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPassThroughInfo", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
        cu5Var3.d(b17);
        ta6Var.f386255w = cu5Var3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "This req nextCount: " + i17 + " min:" + this.f164714e + " ReqTime:" + ta6Var.f386242g + " nettype: " + E);
        ca4.z0.t0(this.f164714e);
    }

    public final void H(r45.jj4 jj4Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
            return;
        }
        java.lang.String U = ca4.z0.U(jj4Var);
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
        if (!com.tencent.mm.vfs.w6.j(d17 + U)) {
            if (!com.tencent.mm.vfs.w6.j(d17 + ca4.z0.J(jj4Var))) {
                if (!com.tencent.mm.vfs.w6.j(d17 + ca4.z0.W(jj4Var))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia ready to download:%s", jj4Var.f377855d);
                    ca4.s0 s0Var = new ca4.s0(jj4Var);
                    s0Var.d(z17 ? 1 : 0);
                    s0Var.e(jj4Var.f377855d);
                    com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
                    int i17 = jj4Var.f377856e == 6 ? 5 : 1;
                    com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195299c;
                    Cj.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    Cj.f(jj4Var, i17, s0Var, s7Var, null, "", "", 1);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia exist:%s", jj4Var.f377855d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealwithMedia", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(r45.ua6 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.v2.I(r45.ua6, java.lang.String):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        this.f164718i = u0Var;
        int dispatch = dispatch(sVar, this.f164713d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsPreTimeLine");
        return 718;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0369 A[Catch: all -> 0x03e0, TryCatch #0 {all -> 0x03e0, blocks: (B:38:0x0286, B:41:0x028e, B:44:0x02a2, B:46:0x02a8, B:49:0x02cb, B:51:0x02d1, B:53:0x02df, B:55:0x02e3, B:56:0x02ea, B:58:0x02f1, B:60:0x02f5, B:86:0x033e, B:73:0x035d, B:75:0x0369, B:78:0x03a7, B:80:0x03bd, B:93:0x03c3, B:94:0x03de), top: B:37:0x0286 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03bd A[SYNTHETIC] */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r17, int r18, int r19, java.lang.String r20, com.tencent.mm.network.v0 r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.v2.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
