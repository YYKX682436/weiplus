package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class z4 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f189183d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f189184e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f189185f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f189186g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.d f189187h;

    /* renamed from: i, reason: collision with root package name */
    public long f189188i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f189190n;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f189189m = true;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f189191o = new com.tencent.mm.pluginsdk.model.app.y4(this, null);

    /* renamed from: p, reason: collision with root package name */
    public long f189192p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f189193q = "";

    /* renamed from: r, reason: collision with root package name */
    public final dn.k f189194r = new com.tencent.mm.pluginsdk.model.app.x4(this);

    public z4(java.lang.String str, com.tencent.mm.pluginsdk.model.app.d dVar) {
        this.f189183d = 8192;
        dVar.field_offset = 0L;
        dVar.field_isUpload = true;
        I(true);
        dVar.field_status = 101;
        dVar.field_netTimes = 0L;
        this.f189186g = str;
        this.f189187h = dVar;
        if (com.tencent.mars.comm.NetStatusUtil.isWifiOr4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            this.f189183d = 32768;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pt6();
        lVar.f70665b = new r45.qt6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/uploadappattach";
        lVar.f70667d = 220;
        lVar.f70668e = 105;
        lVar.f70669f = 1000000105;
        this.f189184e = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig new NetSceneUploadAppAttachForHandOff stack[%s]", new com.tencent.mm.sdk.platformtools.z3());
    }

    public static com.tencent.mm.pluginsdk.model.app.d H(com.tencent.mm.plugin.handoff.model.AbsHandOffFile absHandOffFile) {
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        dVar.field_totalLen = absHandOffFile.getSize();
        dVar.field_fileFullPath = absHandOffFile.getFullPath();
        dVar.field_sdkVer = 0L;
        dVar.field_appId = "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        dVar.field_clientAppDataId = sb6.toString();
        dVar.field_type = 0L;
        dVar.field_status = 200L;
        dVar.field_isUpload = true;
        dVar.field_createTime = c01.id.a();
        dVar.field_lastModifyTime = c01.id.e();
        dVar.field_mediaSvrId = "" + java.lang.System.currentTimeMillis();
        dVar.field_isUseCdn = 0;
        return dVar;
    }

    public final int I(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        return 101;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b6  */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r34, com.tencent.mm.modelbase.u0 r35) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.z4.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 220;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        android.os.Handler handler = this.f189191o;
        if (i18 == 3 && i19 == -1 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f189193q)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadAppAttachForHandOff", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", this.f189193q);
            this.f189190n = false;
            handler.removeMessages(1);
            return;
        }
        java.lang.String str2 = this.f189186g;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd : errType = " + i18 + ", errCode = " + i19);
            this.f189190n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
            return;
        }
        r45.qt6 qt6Var = (r45.qt6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        java.lang.String string = qt6Var.getString(1);
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f189187h;
        if (string != null && (!qt6Var.getString(1).equals(dVar.field_appId) || !qt6Var.getString(3).equals(dVar.field_clientAppDataId))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "argument is not consistent");
            this.f189190n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
            return;
        }
        if (qt6Var.getInteger(5) < 0 || qt6Var.getInteger(5) != dVar.field_totalLen || qt6Var.getInteger(6) < 0 || qt6Var.getInteger(6) > dVar.field_totalLen) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "dataLen, startPos or totalLen is incorrect");
            this.f189190n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
            return;
        }
        dVar.field_offset = qt6Var.getInteger(6);
        dVar.field_mediaSvrId = com.tencent.mm.pluginsdk.model.app.k0.b(qt6Var.getString(2)) ? qt6Var.getString(2) : "";
        if (dVar.field_status == 105) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd STATUS PAUSE [" + dVar.field_mediaSvrId + "," + dVar.field_offset + "] ");
            this.f189190n = false;
            handler.removeMessages(1);
            return;
        }
        long j17 = dVar.field_offset;
        if (j17 != dVar.field_totalLen) {
            this.f189188i = j17;
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(dVar.field_mediaSvrId)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "finish upload but mediaid == null!");
                this.f189190n = false;
                handler.removeMessages(1);
                ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
                return;
            }
            dVar.field_status = 199L;
        }
        if (dVar.field_status == 199) {
            this.f189190n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).e7(str2, dVar.field_appId, (int) dVar.field_sdkVer, dVar.field_mediaSvrId);
        } else if (doScene(dispatcher(), this.f189185f) < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "onGYNetEnd : doScene fail");
            this.f189190n = false;
            handler.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(str2, "");
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 3200;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
