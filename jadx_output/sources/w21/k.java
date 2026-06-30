package w21;

/* loaded from: classes12.dex */
public class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: t, reason: collision with root package name */
    public static c01.v8 f442399t;

    /* renamed from: u, reason: collision with root package name */
    public static c01.v8 f442400u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.List f442401v = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442402d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f442403e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f442404f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f442405g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f442406h;

    /* renamed from: i, reason: collision with root package name */
    public int f442407i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f442408m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f442409n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f442410o = false;

    /* renamed from: p, reason: collision with root package name */
    public long f442411p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f442412q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f442413r = new com.tencent.mm.sdk.platformtools.b4(new w21.n(this), false);

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.modelcdntran.q0 f442414s = new com.tencent.mm.modelcdntran.q0() { // from class: w21.k$$a
        @Override // com.tencent.mm.modelcdntran.q0
        public final void a(com.tencent.mm.modelcdntran.n1 n1Var) {
            int i17;
            w21.k kVar = w21.k.this;
            kVar.getClass();
            dn.m mVar = n1Var.f71106d;
            java.lang.String fileName = kVar.f442404f;
            java.lang.String str = (mVar == null || android.text.TextUtils.isEmpty(mVar.field_fullpath)) ? fileName : mVar.field_fullpath;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(n1Var.f71105c);
            com.tencent.mm.modelcdntran.m1 m1Var = n1Var.f71103a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", "CdnPLCJavaHelperListener fullPath: %s, fileName:%s %s %s", str, fileName, m1Var, valueOf);
            int ordinal = m1Var.ordinal();
            hg0.i iVar = hg0.i.f281325a;
            java.lang.String str2 = kVar.f442406h;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    jx3.f.INSTANCE.idkeyStat(111L, 57L, 1L, false);
                    if (n1Var.f71108f != null) {
                        boolean R4 = com.tencent.mm.storage.z3.R4(str2);
                        w21.j h17 = w21.x0.h(bm5.y.a(w21.x0.k(fileName), bm5.f0.f22573u), kVar.f442405g, fileName, true);
                        if (h17 != null) {
                            i17 = h17.a(str);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "cdn download, fileOperator is null");
                            com.tencent.mm.vfs.w6.h(str);
                            i17 = -1;
                        }
                        int u17 = w21.x0.u(fileName, (int) n1Var.f71108f.field_fileLength, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", "cdn voice download success %s ret:%s", java.lang.Long.valueOf(n1Var.f71108f.field_fileLength), java.lang.Integer.valueOf(u17));
                        if (i17 < 0 || u17 == 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "cdn voice Write Failed File:" + fileName + " ret:" + u17 + "newSize: " + i17);
                            hg0.k kVar2 = (hg0.k) ((eg0.e) i95.n0.c(eg0.e.class));
                            kVar2.getClass();
                            kotlin.jvm.internal.o.g(fileName, "fileName");
                            kVar2.f281331d.computeIfPresent(fileName, iVar);
                            kVar.f442408m = true;
                            kVar.doScene(kVar.dispatcher(), kVar.f442402d);
                            w21.u.a(kVar.f442404f, 2, 220, android.os.SystemClock.elapsedRealtime() - kVar.f442411p, R4, null);
                            return;
                        }
                        if (u17 >= 0) {
                            if (u17 != 1) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "cdn voice download unreachable code");
                                return;
                            }
                            w21.u.a(kVar.f442404f, 2, 100, android.os.SystemClock.elapsedRealtime() - kVar.f442411p, R4, null);
                            kVar.H();
                            kVar.f442402d.onSceneEnd(0, 0, "", kVar);
                            return;
                        }
                        w21.u.a(kVar.f442404f, 2, 225, android.os.SystemClock.elapsedRealtime() - kVar.f442411p, R4, u17 + "");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 229L, 1L, false);
                        kVar.f442402d.onSceneEnd(0, 0, "", kVar);
                        return;
                    }
                    return;
                }
                if (ordinal == 2) {
                    dn.g gVar = n1Var.f71107e;
                    if (gVar != null) {
                        long j17 = gVar.field_finishedLength;
                        if (j17 != gVar.field_toltalLength) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", "cdn voice download progress filename:%s %s/%s ret:%s", fileName, java.lang.Long.valueOf(n1Var.f71107e.field_finishedLength), java.lang.Long.valueOf(n1Var.f71107e.field_toltalLength), java.lang.Integer.valueOf(w21.x0.u(fileName, (int) j17, null)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ordinal != 6 && ordinal != 7 && ordinal != 10) {
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "cdn download error, fallback to cgi download %s", m1Var.name());
            boolean R42 = com.tencent.mm.storage.z3.R4(str2);
            java.lang.String str3 = kVar.f442404f;
            int ordinal2 = m1Var.ordinal();
            int i18 = ordinal2 != 0 ? ordinal2 != 10 ? ordinal2 != 6 ? ordinal2 != 7 ? 230 : 232 : 231 : 234 : com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR;
            long j18 = kVar.f442411p;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            w21.u.a(str3, 2, i18, android.os.SystemClock.elapsedRealtime() - j18, R42, null);
            kVar.f442408m = true;
            hg0.k kVar3 = (hg0.k) ((eg0.e) i95.n0.c(eg0.e.class));
            kVar3.getClass();
            kotlin.jvm.internal.o.g(fileName, "fileName");
            kVar3.f281331d.computeIfPresent(fileName, iVar);
            java.util.HashMap hashMap = w21.x0.f442511a;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceLogic", "clearDownloadStatus: %s", fileName);
            w21.w0 j19 = w21.x0.j(fileName);
            if (j19 != null) {
                j19.f442490g = 0;
                j19.f442492i = 5;
                j19.f442484a = 80;
                if (!w21.x0.w(j19)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.VoiceLogic", "clearDownloadStatus: update storage error %s", fileName);
                }
            }
            com.tencent.mm.vfs.w6.h(str);
            kVar.doScene(kVar.dispatcher(), kVar.f442402d);
        }
    };

    public k(w21.w0 w0Var) {
        iz5.a.g(null, w0Var != null);
        java.lang.String str = w0Var.f442485b;
        this.f442404f = str;
        iz5.a.g(null, str != null);
        java.lang.String str2 = w0Var.f442499p;
        this.f442405g = str2;
        java.lang.String str3 = w0Var.f442486c;
        this.f442406h = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", "NetSceneDownloadVoice[%s]:  file[%s] voiceFormat[%s] user[%s]", toString(), str, str2, str3);
    }

    public final void H() {
        com.tencent.mm.storage.f9 k17 = w21.x0.k(this.f442404f);
        if (k17 != null) {
            c01.v8 v8Var = f442399t;
            if (v8Var != null) {
                v8Var.a(k17);
            }
            ((ku5.t0) ku5.t0.f312615d).B(new w21.l(this, k17));
            java.util.Iterator it = ((java.util.ArrayList) f442401v).iterator();
            while (it.hasNext()) {
                com.tencent.mm.sdk.platformtools.u3.h(new w21.m(this, (dg0.e) it.next(), k17));
            }
        }
    }

    public final void I(int i17, java.lang.String str) {
        boolean R4 = com.tencent.mm.storage.z3.R4(this.f442406h);
        if (this.f442408m) {
            w21.u.a(this.f442404f, 3, i17, this.f442412q, R4, str);
        } else {
            w21.u.a(this.f442404f, 1, i17, this.f442412q, R4, str);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        r45.f17 f17Var;
        this.f442402d = u0Var;
        prepareDispatcher(sVar);
        java.lang.String str = this.f442404f;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "doScene:  filename null!");
            this.f442407i = fp.k.a() + 10000;
            return -1;
        }
        w21.w0 j17 = w21.x0.j(str);
        if (j17 != null) {
            int i17 = j17.f442492i;
            if (i17 == 5 || i17 == 6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", "doScene file:" + str + " netTimes:" + j17.f442498o);
                if (!w21.x0.c(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "checkVoiceNetTimes Failed file:".concat(str));
                    w21.x0.s(str);
                    this.f442407i = fp.k.a() + 10000;
                    return -1;
                }
                int i18 = j17.f442489f;
                int i19 = j17.f442490g;
                int i27 = i18 - i19;
                if (i27 <= 0) {
                    if (j17.f442492i != 5) {
                        w21.x0.u(str, i19, null);
                        this.f442407i = fp.k.a() + 10000;
                        return -1;
                    }
                    this.f442410o = true;
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "doScene file:" + str + " Net:" + j17.f442489f + " Local:" + j17.f442490g);
                    this.f442407i = fp.k.a() + 10000;
                    return -1;
                }
                if (j17.f442491h == i18) {
                    this.f442409n = true;
                }
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.f442411p = android.os.SystemClock.elapsedRealtime();
                int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceCdnDownloadSwitch", 0);
                java.lang.String str2 = this.f442406h;
                boolean z18 = b17 == 1 || com.tencent.mm.storage.z3.L4(str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", "canUseCdnDownload %s, forceDisableCdn %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f442408m));
                if (!this.f442408m && z18 && (f17Var = j17.f442506w) != null && !com.tencent.mm.sdk.platformtools.t8.K0(f17Var.f373931d) && !com.tencent.mm.sdk.platformtools.t8.K0(j17.f442506w.f373932e)) {
                    jx3.f.INSTANCE.idkeyStat(111L, 56L, 1L, false);
                    dn.m mVar = new dn.m();
                    mVar.field_mediaId = "VoiceData".concat(str);
                    mVar.field_fullpath = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f22757j, str, true).concat("_cdn");
                    mVar.field_fileType = 15;
                    r45.f17 f17Var2 = j17.f442506w;
                    mVar.field_aesKey = f17Var2.f373932e;
                    mVar.field_fileId = f17Var2.f373931d;
                    if (com.tencent.mm.storage.z3.R4(j17.f442486c)) {
                        mVar.field_chattype = 1;
                    } else {
                        mVar.field_chattype = 0;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", "startCdnVoiceDownload %s %s %s %s", mVar.field_mediaId, mVar.field_fullpath, mVar.field_aesKey, mVar.field_fileId);
                    return ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(this.f442414s)) == null ? -1 : 0;
                }
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = new r45.vf0();
                lVar.f70665b = new r45.wf0();
                lVar.f70666c = "/cgi-bin/micromsg-bin/downloadvoice";
                lVar.f70667d = 128;
                lVar.f70668e = 20;
                lVar.f70669f = 1000000020;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                this.f442403e = a17;
                r45.vf0 vf0Var = (r45.vf0) a17.f70710a.f70684a;
                vf0Var.set(3, j17.f442487d);
                vf0Var.set(5, java.lang.Long.valueOf(j17.f442488e));
                vf0Var.set(2, java.lang.Integer.valueOf(i27));
                vf0Var.set(1, java.lang.Integer.valueOf(j17.f442490g));
                if (com.tencent.mm.storage.z3.R4(str2)) {
                    vf0Var.set(6, str2);
                    vf0Var.set(7, java.lang.Long.valueOf(j17.f442503t));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", "[%s]doScene req.ClientMsgId:%s req.MsgId:%d req.NewMsgId:%d, req.Length:%d req.Offset:%d req.ChatRoomName:%s req.MasterBufId %d", toString(), vf0Var.getString(3), java.lang.Integer.valueOf(vf0Var.getInteger(0)), java.lang.Long.valueOf(vf0Var.getLong(5)), java.lang.Integer.valueOf(vf0Var.getInteger(2)), java.lang.Integer.valueOf(vf0Var.getInteger(1)), vf0Var.getString(6), java.lang.Long.valueOf(vf0Var.getLong(7)));
                return dispatch(sVar, this.f442403e, this);
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "Get info Failed file:".concat(str));
        this.f442407i = fp.k.a() + 10000;
        return -1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 128;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd[");
        sb6.append(toString());
        sb6.append("] file:");
        java.lang.String str2 = this.f442404f;
        sb6.append(str2);
        sb6.append(" + id:");
        sb6.append(i17);
        sb6.append(" errtype:");
        sb6.append(i18);
        sb6.append(" errCode:");
        sb6.append(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", sb6.toString());
        long j17 = this.f442412q;
        long j18 = this.f442411p;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f442412q = j17 + (android.os.SystemClock.elapsedRealtime() - j18);
        r45.wf0 wf0Var = (r45.wf0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (wf0Var.getInteger(8) == 1) {
            w21.x0.a(null, str2);
            I(240, null);
            return;
        }
        if (i19 == -22) {
            w21.x0.s(str2);
            this.f442402d.onSceneEnd(i18, i19, str, this);
            I(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, null);
            return;
        }
        if (i18 == 4 && i19 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 231L, 1L, false);
            w21.x0.s(str2);
            this.f442402d.onSceneEnd(i18, i19, str, this);
            I(223, i19 + "");
            return;
        }
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 230L, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd  errType:" + i18 + " errCode:" + i19 + " resp:" + v0Var.getRespObj().getRetCode());
            this.f442402d.onSceneEnd(i18, i19, str, this);
            I(224, java.lang.String.format("type:%d;code:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
            return;
        }
        int i27 = ((r45.cu5) wf0Var.getCustom(5)).f371839d;
        wf0Var.getInteger(1);
        if (((r45.cu5) wf0Var.getCustom(5)).f371841f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd get recv Buffer null");
            w21.x0.s(str2);
            this.f442402d.onSceneEnd(i18, i19, str, this);
            I(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, null);
            return;
        }
        byte[] g17 = ((r45.cu5) wf0Var.getCustom(5)).f371841f.g();
        if (g17.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Recv Buf ZERO length ");
            w21.x0.s(str2);
            this.f442402d.onSceneEnd(i18, i19, str, this);
            I(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, null);
            return;
        }
        bm5.y a17 = bm5.y.a(w21.x0.k(str2), bm5.f0.f22573u);
        java.lang.String str3 = this.f442405g;
        int c17 = w21.x0.h(a17, str3, str2, true).c(g17, g17.length, wf0Var.getInteger(1));
        if (c17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Write Failed File:" + str2 + " ret:" + c17);
            w21.x0.s(str2);
            this.f442402d.onSceneEnd(i18, i19, str, this);
            I(220, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", "OnRecvEnd : file:" + str2 + " filesize:" + c17 + " voiceFormat:" + str3);
        int u17 = w21.x0.u(str2, c17, null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("OnRecvEnd[");
        sb7.append(toString());
        sb7.append("] : file:%s ret:%s");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVoice", sb7.toString(), str2, java.lang.Integer.valueOf(u17));
        if (u17 >= 0) {
            if (u17 != 1) {
                long j19 = this.f442409n ? 0L : 1000L;
                this.f442413r.c(j19, j19);
                return;
            } else {
                I(100, null);
                H();
                this.f442402d.onSceneEnd(i18, i19, str, this);
                return;
            }
        }
        I(225, u17 + "");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 229L, 1L, false);
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + str2 + "updateAfterRecv Ret:" + u17);
        this.f442402d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 100;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 232L, 1L, false);
        }
        return securityLimitCountReach;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        r45.vf0 vf0Var = (r45.vf0) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        if (vf0Var.getLong(5) != 0 && vf0Var.getString(3) != null && vf0Var.getString(3).length() != 0 && vf0Var.getInteger(2) > 0 && vf0Var.getInteger(1) >= 0) {
            return com.tencent.mm.modelbase.o1.EOk;
        }
        w21.x0.s(this.f442404f);
        return com.tencent.mm.modelbase.o1.EFailed;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 233L, 1L, false);
        w21.x0.s(this.f442404f);
    }
}
