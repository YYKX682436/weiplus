package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class w4 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {
    public dn.h A;
    public final com.tencent.mm.sdk.event.IListener B;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f189113d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f189114e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f189117h;

    /* renamed from: i, reason: collision with root package name */
    public final long f189118i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f189119m;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f189122p;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.d f189115f = null;

    /* renamed from: g, reason: collision with root package name */
    public ot0.q f189116g = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f189120n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f189121o = true;

    /* renamed from: q, reason: collision with root package name */
    public z25.d f189123q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f189124r = false;

    /* renamed from: s, reason: collision with root package name */
    public long f189125s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f189126t = "";

    /* renamed from: u, reason: collision with root package name */
    public boolean f189127u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f189128v = false;

    /* renamed from: w, reason: collision with root package name */
    public final z25.e f189129w = new com.tencent.mm.pluginsdk.model.app.j4(this);

    /* renamed from: x, reason: collision with root package name */
    public final dn.k f189130x = new com.tencent.mm.pluginsdk.model.app.v4(this);

    /* renamed from: y, reason: collision with root package name */
    public boolean f189131y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f189132z = 0;

    public w4(long j17, java.lang.String str, java.lang.String str2) {
        this.f189118i = -1L;
        this.f189119m = null;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach$6
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                java.lang.String str3;
                ot0.q v17;
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                java.lang.String str4 = "";
                java.lang.String str5 = recogQBarOfImageFileResultEvent2.f54661g.f6368a;
                com.tencent.mm.pluginsdk.model.app.w4 w4Var = com.tencent.mm.pluginsdk.model.app.w4.this;
                if (str5.equals(w4Var.f189115f.field_fileFullPath)) {
                    com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
                    java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent2);
                    int c17 = s6Var.c(recogQBarOfImageFileResultEvent2);
                    try {
                        str3 = java.net.URLEncoder.encode(e17, com.tencent.mapsdk.internal.rv.f51270c);
                    } catch (java.io.UnsupportedEncodingException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneUploadAppAttach", e18, "", new java.lang.Object[0]);
                        str3 = "";
                    }
                    if (w4Var.f189132z == 1) {
                        com.tencent.mm.pluginsdk.model.app.d dVar = w4Var.f189115f;
                        com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
                        m21.x xVar = new m21.x();
                        xVar.a("20toUser", w4Var.f189117h + ",");
                        xVar.a("21source", "4,");
                        xVar.a("22qrUrl", str3 + ",");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        dn.h hVar = w4Var.A;
                        sb6.append(hVar == null ? "" : hVar.field_filemd5);
                        sb6.append(",");
                        xVar.a("23md5", sb6.toString());
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        dn.h hVar2 = w4Var.A;
                        sb7.append(hVar2 == null ? "" : hVar2.field_fileId);
                        sb7.append(",");
                        xVar.a("24cdnFileId", sb7.toString());
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        dn.h hVar3 = w4Var.A;
                        sb8.append(hVar3 == null ? "" : hVar3.field_aesKey);
                        sb8.append(",");
                        xVar.a("25cdnAesKey", sb8.toString());
                        if (Li.k2() && (v17 = ot0.q.v(Li.j())) != null) {
                            str4 = v17.f348646d;
                        }
                        xVar.a("26appip", str4 + ",");
                        xVar.a("27toUsersCount", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(w4Var.f189117h) + ",");
                        xVar.a("28codeType", c17 + ",");
                        xVar.a("29msgid", java.lang.Long.valueOf(Li.I0()));
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "report qrCodeImgChatting(13628): " + xVar.c());
                        v90.x xVar2 = (v90.x) i95.n0.c(v90.x.class);
                        java.lang.String xVar3 = xVar.toString();
                        ((u90.v) xVar2).getClass();
                        com.tencent.mm.modelstat.i0.g(13628, xVar3);
                    }
                    w4Var.B.dead();
                }
                return false;
            }
        };
        this.f189118i = j17;
        this.f189119m = str;
        this.f189122p = str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pt6();
        lVar.f70665b = new r45.qt6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/uploadappattach";
        lVar.f70667d = 220;
        lVar.f70668e = 105;
        lVar.f70669f = 1000000105;
        this.f189113d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig new NetSceneUploadAppAttach rowid[%d], emoticonmd5[%s], stack[%s]", java.lang.Long.valueOf(j17), str, new com.tencent.mm.sdk.platformtools.z3());
    }

    public static void H(com.tencent.mm.pluginsdk.model.app.w4 w4Var, java.lang.String str) {
        w4Var.getClass();
        e40.u uVar = (e40.u) i95.n0.c(e40.u.class);
        java.lang.String str2 = w4Var.f189115f.field_fileFullPath;
        ((bf5.o) uVar).getClass();
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(w4Var.f189115f.field_fileFullPath, com.tencent.mm.vfs.w6.k(str2) >= ez.v0.f257777a.h() ? 130 : 6, str, null);
        java.lang.String str3 = w4Var.f189115f.field_fileFullPath;
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

    public final void J(dn.h hVar) {
        if (this.f189115f.field_type != 2) {
            return;
        }
        this.f189132z = 1;
        if (this.f189131y) {
            return;
        }
        this.A = hVar;
        this.f189131y = true;
        com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
        this.B.alive();
        java.lang.String str = this.f189115f.field_fileFullPath;
        am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
        aqVar.f6175b = str;
        aqVar.f6174a = java.lang.System.currentTimeMillis();
        recogQBarOfImageFileEvent.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0401 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x05b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x06de  */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r43, com.tencent.mm.modelbase.u0 r44) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.w4.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 220;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 3 && i19 == -1 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f189126t)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadAppAttach", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", this.f189126t);
            return;
        }
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + i18 + ", errCode = " + i19);
            fp.k.a();
            this.f189114e.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.qt6 qt6Var = (r45.qt6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (qt6Var.getString(1) != null && this.f189119m == null && (!qt6Var.getString(1).equals(this.f189115f.field_appId) || !qt6Var.getString(3).equals(this.f189115f.field_clientAppDataId))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "argument is not consistent");
            fp.k.a();
            this.f189114e.onSceneEnd(3, -1, "", this);
            return;
        }
        if (qt6Var.getInteger(5) >= 0 && qt6Var.getInteger(5) == this.f189115f.field_totalLen && qt6Var.getInteger(6) >= 0) {
            long integer = qt6Var.getInteger(6);
            com.tencent.mm.pluginsdk.model.app.d dVar = this.f189115f;
            if (integer <= dVar.field_totalLen) {
                dVar.field_offset = qt6Var.getInteger(6);
                this.f189115f.field_mediaSvrId = com.tencent.mm.pluginsdk.model.app.k0.b(qt6Var.getString(2)) ? qt6Var.getString(2) : "";
                com.tencent.mm.pluginsdk.model.app.d dVar2 = this.f189115f;
                if (dVar2.field_status == 105) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd STATUS PAUSE [" + this.f189115f.field_mediaSvrId + "," + this.f189115f.field_offset + "] ");
                    this.f189114e.onSceneEnd(i18, -1, "", this);
                    return;
                }
                if (dVar2.field_offset == dVar2.field_totalLen) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(dVar2.field_mediaSvrId)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "finish upload but mediaid == null!");
                        fp.k.a();
                        this.f189114e.onSceneEnd(3, -1, "", this);
                        com.tencent.mm.pluginsdk.model.app.k0.N(this.f189115f.systemRowid, bu.a.d(-4));
                        return;
                    }
                    this.f189115f.field_status = 199L;
                }
                boolean update = com.tencent.mm.pluginsdk.model.app.u5.wi().update(this.f189115f, new java.lang.String[0]);
                if (!update) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd update info ret:" + update);
                    fp.k.a();
                    J(null);
                    this.f189114e.onSceneEnd(3, -1, "", this);
                    return;
                }
                if (this.f189115f.field_status == 199) {
                    this.f189114e.onSceneEnd(0, 0, "", this);
                    return;
                } else {
                    if (doScene(dispatcher(), this.f189114e) < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : doScene fail");
                        this.f189114e.onSceneEnd(3, -1, "", this);
                        return;
                    }
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "dataLen, startPos or totalLen is incorrect");
        fp.k.a();
        this.f189114e.onSceneEnd(3, -1, "", this);
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
