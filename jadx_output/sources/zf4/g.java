package zf4;

/* loaded from: classes13.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f472656d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f472657e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f472658f;

    /* renamed from: g, reason: collision with root package name */
    public long f472659g;

    /* renamed from: h, reason: collision with root package name */
    public int f472660h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f472661i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f472662m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f472663n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f472664o = new com.tencent.mm.sdk.platformtools.b4(new zf4.f(this), true);

    public g(java.lang.String str) {
        iz5.a.g(null, str != null);
        this.f472658f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        boolean z17;
        int i17;
        int i18;
        this.f472656d = u0Var;
        this.f472662m = false;
        java.lang.String str = this.f472658f;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  filename null!");
            this.f472660h = fp.k.a() + 10000;
            return -1;
        }
        zf4.q c17 = zf4.r.c(str);
        if (c17 != null) {
            int i19 = c17.field_status;
            if ((i19 > 1 && i19 <= 3) || i19 == 8) {
                zf4.q c18 = zf4.r.c(str);
                if (c18 != null && (i18 = c18.field_nettimes) < 80) {
                    c18.field_nettimes = i18 + 1;
                    c18.U = 16384;
                    z17 = zf4.r.f(c18);
                } else {
                    z17 = false;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "checkVoiceNetTimes Failed file:".concat(str));
                    zf4.r.e(str);
                    this.f472660h = fp.k.a() + 10000;
                    return -1;
                }
                zf4.h hVar = new zf4.h();
                int i27 = c17.field_status;
                if (i27 == 8) {
                    this.f472663n = 1;
                    zf4.r.a(c17.field_filename);
                    i17 = 1;
                } else {
                    if (i27 == 3) {
                        this.f472662m = true;
                    }
                    zf4.i d17 = zf4.r.d(str);
                    if (d17 == null) {
                        this.f472660h = fp.k.a() + 10000;
                        return -1;
                    }
                    hVar = d17.b(c17.field_offset, 6000);
                    fp.k.a();
                    if (hVar.f472668d < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + str + "] read ret:" + hVar.f472668d + " readlen:" + hVar.f472666b + " newOff:" + hVar.f472667c + " netOff:" + c17.field_offset);
                        zf4.r.e(str);
                        this.f472660h = fp.k.a() + 10000;
                        return -1;
                    }
                    int i28 = hVar.f472667c;
                    this.f472661i = i28;
                    if (i28 < c17.field_offset || i28 >= 469000) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + str + "] newOff:" + this.f472661i + " OldtOff:" + c17.field_offset);
                        zf4.r.e(str);
                        this.f472660h = fp.k.a() + 10000;
                        return -1;
                    }
                    this.f472663n = 0;
                    int i29 = hVar.f472666b;
                    if (i29 == 0 && !this.f472662m) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  file:" + str + " No Data temperature , will be retry");
                        zf4.r.e(str);
                        this.f472660h = fp.k.a() + 10000;
                        return -1;
                    }
                    if (this.f472662m) {
                        int i37 = c17.field_totallen;
                        if (i37 <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + str + "] read totalLen:" + c17.field_totallen);
                            zf4.r.e(str);
                            this.f472660h = fp.k.a() + 10000;
                            return -1;
                        }
                        if (i37 > i28 && i29 < 6000) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + str + "] readlen:" + hVar.f472666b + " newOff:" + hVar.f472667c + " netOff:" + c17.field_offset + " totalLen:" + c17.field_totallen);
                            zf4.r.e(str);
                            this.f472660h = fp.k.a() + 10000;
                            return -1;
                        }
                        if (i37 <= i28) {
                            this.f472663n = 1;
                        }
                    }
                    i17 = 0;
                }
                int i38 = c17.field_voicelenght;
                if (i38 == 0) {
                    i38 = ((this.f472661i - 6) / 32) * 20;
                }
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = new r45.cv6();
                lVar.f70665b = new r45.dv6();
                lVar.f70666c = "/cgi-bin/micromsg-bin/uploadvoicerecognize";
                lVar.f70667d = 329;
                lVar.f70668e = 157;
                lVar.f70669f = 1000000157;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                this.f472657e = a17;
                r45.cv6 cv6Var = (r45.cv6) a17.f70710a.f70684a;
                cv6Var.set(0, c01.z1.r());
                cv6Var.set(1, c17.field_user);
                cv6Var.set(2, java.lang.Integer.valueOf(c17.field_offset));
                cv6Var.set(4, c17.field_clientid);
                cv6Var.set(6, java.lang.Integer.valueOf(i38));
                cv6Var.set(8, java.lang.Integer.valueOf(this.f472663n));
                cv6Var.set(15, java.lang.Long.valueOf(c17.field_msgid));
                cv6Var.set(10, java.lang.Integer.valueOf(i17));
                cv6Var.set(13, java.lang.Integer.valueOf((int) (c17.field_createtime / 1000)));
                cv6Var.set(12, 1);
                if (((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(c17.field_user)) {
                    cv6Var.set(17, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(c17.field_user));
                }
                if (i17 != 1) {
                    r45.cu5 cu5Var = new r45.cu5();
                    cu5Var.e(hVar.f472665a, 0, hVar.f472666b);
                    cv6Var.set(7, cu5Var);
                    cv6Var.set(3, java.lang.Integer.valueOf(hVar.f472666b));
                } else {
                    r45.cu5 cu5Var2 = new r45.cu5();
                    cu5Var2.c(com.tencent.mm.protobuf.g.b(new byte[1]));
                    cv6Var.set(7, cu5Var2);
                    cv6Var.set(3, 1);
                }
                cv6Var.getLong(15);
                cv6Var.getString(1);
                cv6Var.getInteger(2);
                int i39 = ((r45.cu5) cv6Var.getCustom(7)).f371839d;
                cv6Var.getInteger(8);
                this.f472659g = java.lang.System.currentTimeMillis();
                return dispatch(sVar, this.f472657e, this);
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:".concat(str));
        this.f472660h = fp.k.a() + 10000;
        return -1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 329;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r23, int r24, int r25, java.lang.String r26, com.tencent.mm.network.v0 r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf4.g.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 240;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        r45.cv6 cv6Var = (r45.cv6) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        cv6Var.getInteger(2);
        int i17 = ((r45.cu5) cv6Var.getCustom(7)).f371839d;
        cv6Var.getInteger(8);
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        zf4.r.e(this.f472658f);
    }
}
