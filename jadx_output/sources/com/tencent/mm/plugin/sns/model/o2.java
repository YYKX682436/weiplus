package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class o2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164537d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f164538e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.OutputStream f164539f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f164540g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f164541h;

    /* renamed from: i, reason: collision with root package name */
    public final int f164542i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f164543m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f164544n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164545o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.jj4 f164546p;

    public o2(r45.jj4 jj4Var, java.lang.String str, java.lang.String str2, int i17, boolean z17, int i18, java.lang.String str3) {
        this.f164538e = "";
        this.f164542i = -1;
        this.f164543m = true;
        this.f164544n = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        this.f164538e = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        this.f164546p = jj4Var;
        this.f164543m = z17;
        this.f164542i = i18;
        this.f164544n = str3;
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str);
        this.f164540g = d17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.i86();
        lVar.f70665b = new r45.j86();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsdownload";
        lVar.f70667d = 208;
        lVar.f70668e = 96;
        lVar.f70669f = 1000000096;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164537d = a17;
        r45.i86 i86Var = (r45.i86) a17.f70710a.f70684a;
        com.tencent.mm.plugin.sns.storage.l2 o17 = com.tencent.mm.plugin.sns.model.l4.Hj().o1(str);
        o17 = o17 == null ? new com.tencent.mm.plugin.sns.storage.l2() : o17;
        o17.k(str);
        o17.j(0);
        com.tencent.mm.plugin.sns.model.l4.Hj().F2(str, o17);
        if (z17) {
            this.f164541h = ca4.z0.a0(jj4Var);
        } else {
            this.f164541h = ca4.z0.W(jj4Var);
        }
        com.tencent.mm.vfs.w6.u(d17);
        com.tencent.mm.vfs.w6.h(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str) + this.f164541h);
        i86Var.f376817f = str2;
        i86Var.f376819h = 0;
        i86Var.f376815d = 0;
        i86Var.f376816e = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        i86Var.f376818g = i17;
    }

    public java.lang.String H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        java.lang.String str = this.f164538e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return str;
    }

    public int I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestDownloadType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestDownloadType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return this.f164542i;
    }

    public final void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.tencent.mm.plugin.sns.model.l4.Cj().B(this.f164544n);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
    }

    public final void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseFileHandle", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        try {
            java.io.OutputStream outputStream = this.f164539f;
            if (outputStream != null) {
                outputStream.flush();
                this.f164539f.close();
                this.f164539f = null;
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsDownload", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseFileHandle", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        this.f164545o = u0Var;
        int dispatch = dispatch(sVar, this.f164537d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return 208;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        boolean z17;
        int i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.tencent.mm.modelbase.n nVar = (com.tencent.mm.modelbase.n) v0Var.getRespObj();
        r45.j86 j86Var = (r45.j86) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        int retCode = nVar.getRetCode();
        java.lang.String str2 = this.f164544n;
        if (retCode != 0) {
            this.f164545o.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.model.l4.Cj().B(str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        com.tencent.mm.plugin.sns.storage.l2 o17 = com.tencent.mm.plugin.sns.model.l4.Hj().o1(H());
        int i28 = j86Var.f377649e;
        if (i28 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsDownload", "error 1");
            J();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        r45.cu5 cu5Var = j86Var.f377650f;
        if (cu5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsDownload", "error 2");
            J();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        int i29 = j86Var.f377648d;
        if (i29 < 0 || cu5Var.f371841f.f192156a.length + i29 > i28) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsDownload", "error 3");
            J();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        if (i29 != o17.d()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsDownload", "error 4");
            J();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        byte[] g17 = j86Var.f377650f.f371841f.g();
        java.lang.String str3 = this.f164540g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        boolean j07 = ca4.z0.j0(com.tencent.mm.plugin.sns.model.l4.Bi());
        java.lang.String str4 = this.f164541h;
        if (j07) {
            try {
                try {
                    if (this.f164539f == null) {
                        com.tencent.mm.vfs.w6.u(str3);
                        this.f164539f = com.tencent.mm.vfs.w6.K(str3 + str4, false);
                    }
                    this.f164539f.write(g17);
                    K();
                    i27 = g17.length;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                    z17 = false;
                } catch (java.io.IOException e17) {
                    z17 = false;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsDownload", e17, "appendBuf failed: " + str4, new java.lang.Object[0]);
                    K();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                    i27 = -1;
                }
            } catch (java.lang.Throwable th6) {
                K();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                throw th6;
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            z17 = false;
            i27 = 0;
        }
        if (i27 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsDownload", "error 5");
            J();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        o17.j(o17.d() + i27);
        int i37 = j86Var.f377649e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        o17.f166050g = i37;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        com.tencent.mm.plugin.sns.model.l4.Hj().F2(H(), o17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGetCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        if (o17.d() == o17.f() && o17.f() != 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGetCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            r45.jj4 jj4Var = this.f164546p;
            int i38 = this.f164542i;
            java.lang.String U = i38 == 1 ? ca4.z0.U(jj4Var) : i38 == 10 ? ca4.z0.d0(jj4Var) : i38 == 11 ? ca4.z0.N(jj4Var) : ca4.z0.J(jj4Var);
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), H());
            com.tencent.mm.vfs.w6.h(d17 + U);
            com.tencent.mm.vfs.w6.P(d17, str4, U);
            if (this.f164543m) {
                com.tencent.mm.plugin.sns.storage.m2.i1(d17, U, ca4.z0.e0(jj4Var), com.tencent.mm.plugin.sns.model.l4.mj());
            } else {
                java.lang.String U2 = ca4.z0.U(jj4Var);
                if (!com.tencent.mm.vfs.w6.j(d17 + U2)) {
                    com.tencent.mm.plugin.sns.storage.m2.W0(d17, U, U2, com.tencent.mm.plugin.sns.model.l4.tj());
                }
                java.lang.String e07 = ca4.z0.e0(jj4Var);
                if (!com.tencent.mm.vfs.w6.j(d17 + e07)) {
                    com.tencent.mm.plugin.sns.storage.m2.i1(d17, U, e07, com.tencent.mm.plugin.sns.model.l4.mj());
                }
            }
            com.tencent.mm.plugin.sns.model.l4.Cj().B(str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            this.f164545o.onSceneEnd(i18, i19, str, this);
        } else {
            doScene(dispatcher(), this.f164545o);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return 100;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        com.tencent.mm.modelbase.o1 o1Var = com.tencent.mm.modelbase.o1.EOk;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return o1Var;
    }
}
