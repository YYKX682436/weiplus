package w21;

/* loaded from: classes12.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {
    public final com.tencent.mm.sdk.platformtools.b4 A;
    public final com.tencent.mm.modelcdntran.q0 B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442430d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f442431e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f442432f;

    /* renamed from: g, reason: collision with root package name */
    public long f442433g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f442434h;

    /* renamed from: i, reason: collision with root package name */
    public final int f442435i;

    /* renamed from: m, reason: collision with root package name */
    public long f442436m;

    /* renamed from: n, reason: collision with root package name */
    public int f442437n;

    /* renamed from: o, reason: collision with root package name */
    public int f442438o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f442439p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f442440q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f442441r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f442442s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f442443t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f442444u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f442445v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f442446w;

    /* renamed from: x, reason: collision with root package name */
    public int f442447x;

    /* renamed from: y, reason: collision with root package name */
    public long f442448y;

    /* renamed from: z, reason: collision with root package name */
    public long f442449z;

    public o(java.lang.String str, boolean z17) {
        this(str, 0);
        this.f442439p = z17;
    }

    public final void H(int i17, java.lang.String str) {
        if (this.f442444u) {
            w21.u.c(this.f442432f, 3, i17, this.f442449z, this.f442445v, str);
        } else if (this.f442439p) {
            w21.u.c(this.f442432f, 2, i17, this.f442449z, this.f442445v, str);
        } else {
            w21.u.c(this.f442432f, 1, i17, this.f442449z, this.f442445v, str);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int format;
        w21.t d17;
        int i17;
        int i18;
        int i19;
        r15.b Bi;
        com.tencent.mm.modelbase.g1 g1Var;
        this.f442430d = u0Var;
        this.f442446w = false;
        java.lang.String str = this.f442432f;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "doScene:  filename null!");
            this.f442437n = fp.k.a() + 10000;
            return -1;
        }
        w21.w0 j17 = w21.x0.j(str);
        if (j17 == null || !j17.d()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + this.f442432f);
            this.f442437n = fp.k.a() + 10000;
            return -1;
        }
        this.f442433g = j17.f442496m;
        this.f442434h = j17.f442486c;
        if (!w21.x0.c(this.f442432f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "checkVoiceNetTimes Failed file:" + this.f442432f);
            w21.x0.s(this.f442432f);
            this.f442437n = fp.k.a() + 10000;
            return -1;
        }
        this.f442445v = com.tencent.mm.storage.z3.R4(j17.f442486c);
        w21.t tVar = new w21.t();
        int i27 = j17.f442492i;
        if (i27 == 8) {
            this.f442447x = 0;
            w21.x0.b(j17.f442485b);
            format = 0;
            d17 = tVar;
            i17 = 1;
        } else {
            if (i27 == 3) {
                this.f442446w = true;
            }
            w21.j i28 = w21.x0.i(null, this.f442432f);
            if (i28 == null) {
                this.f442437n = fp.k.a() + 10000;
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "doScene: fileOp is null, fileName:%s", this.f442432f);
                return -1;
            }
            format = i28.getFormat();
            d17 = i28.d(j17.f442489f, 6000);
            if (d17 == null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 242L, 1L, false);
                this.f442437n = fp.k.a() + 10000;
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "doScene: readRes is null, fileName:%s", this.f442432f);
                return -1;
            }
            fp.k.a();
            if (d17.f442467d < 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 241L, 1L, false);
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f442432f + "] read ret:" + d17.f442467d + " readlen:" + d17.f442465b + " newOff:" + d17.f442466c + " netOff:" + j17.f442489f);
                w21.x0.s(this.f442432f);
                this.f442437n = fp.k.a() + 10000;
                return -1;
            }
            int i29 = d17.f442466c;
            this.f442438o = i29;
            if (i29 < j17.f442489f || i29 >= 469000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 240L, 1L, false);
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f442432f + "] newOff:" + this.f442438o + " OldtOff:" + j17.f442489f);
                w21.x0.s(this.f442432f);
                this.f442437n = fp.k.a() + 10000;
                return -1;
            }
            this.f442447x = 0;
            int i37 = d17.f442465b;
            if (i37 == 0 && !this.f442446w) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "doScene:  file:" + this.f442432f + " No Data temperature , will be retry");
                this.f442437n = fp.k.a() + 10000;
                return -1;
            }
            if (this.f442446w) {
                int i38 = j17.f442491h;
                if (i38 <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f442432f + "] read totalLen:" + j17.f442491h);
                    w21.x0.s(this.f442432f);
                    this.f442437n = fp.k.a() + 10000;
                    return -1;
                }
                if (i38 > i29 && i37 < 6000) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.f442432f + "] readlen:" + d17.f442465b + " newOff:" + d17.f442466c + " netOff:" + j17.f442489f + " totalLen:" + j17.f442491h);
                    w21.x0.s(this.f442432f);
                    this.f442437n = fp.k.a() + 10000;
                    return -1;
                }
                if (i38 <= i29) {
                    com.tencent.mm.storage.f9 Li = pt0.f0.Li(j17.f442486c, j17.f442496m);
                    java.lang.Integer num = (java.lang.Integer) w21.x0.f442512b.get(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(Li, this.f442432f, false));
                    if (num != null && num.intValue() != 0) {
                        int intValue = ((java.lang.Integer) w21.x0.f442513c.get(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(Li, this.f442432f, false))).intValue();
                        w21.t d18 = i28.d(0, intValue);
                        int f17 = w21.x0.f(num.intValue() & 255, d18.f442464a, 0, d18.f442465b);
                        if (num.intValue() != f17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Checksum error file. realChecksum:%d, tempChecksum:%d, total:%d, rr.length:%d", java.lang.Integer.valueOf(f17), num, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(d18.f442465b));
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Checksum error file[" + this.f442432f + "] readlen:" + d17.f442465b + " newOff:" + d17.f442466c + " netOff:" + j17.f442489f + " totalLen:" + j17.f442491h);
                            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            g0Var.idkeyStat(111L, 173L, 1L, false);
                            w21.x0.f442512b.put(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(Li, this.f442432f, false), java.lang.Integer.valueOf(f17));
                            java.lang.Integer num2 = (java.lang.Integer) w21.x0.f442514d.get(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(Li, this.f442432f, false));
                            if (num2 != null && num2.intValue() != 0) {
                                byte[] bArr = d18.f442464a;
                                int i39 = d18.f442465b;
                                synchronized (w21.x0.class) {
                                    if (bArr != null) {
                                        if (bArr.length != 0) {
                                            i18 = 0;
                                            for (int i47 = 0; i47 < i39; i47++) {
                                                i18 += bArr[0 + i47];
                                            }
                                        }
                                    }
                                    i18 = 0;
                                }
                                if (num2.intValue() != i18) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "Checksum error file. cacheSimpleChecksum:%d, realSimpleChecksum:%d", num2, java.lang.Integer.valueOf(i18));
                                    w21.x0.s(this.f442432f);
                                    this.f442437n = fp.k.a() + 10000;
                                    g0Var.idkeyStat(111L, 174L, 1L, false);
                                    return -1;
                                }
                            }
                        }
                    }
                    this.f442447x = 1;
                }
            }
            i17 = 0;
        }
        int i48 = j17.f442495l;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoice", "info.getVoiceLength: %s", java.lang.Integer.valueOf(i48));
        if (i48 == 0) {
            java.lang.String str2 = this.f442432f;
            java.util.HashMap hashMap = w21.x0.f442511a;
            synchronized (hashMap) {
                i48 = (hashMap.get(str2) == null || (g1Var = (com.tencent.mm.modelbase.g1) ((java.lang.ref.WeakReference) hashMap.get(str2)).get()) == null) ? -1 : (int) g1Var.c();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoice", "getCurrentRecordFileLen: %s", java.lang.Integer.valueOf(i48));
            if (i48 < 0) {
                i48 = ((this.f442438o - 6) / 32) * 20;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoice", "getMinTimeByOffset: %s", java.lang.Integer.valueOf(i48));
            }
        }
        if (!this.f442444u && this.f442439p) {
            prepareDispatcher(sVar);
            if (!this.f442446w) {
                this.A.c(500L, 500L);
                return 0;
            }
            this.A.d();
            if (!this.f442440q) {
                jx3.f.INSTANCE.idkeyStat(111L, 50L, 1L, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoice", "start voice cdn upload");
                dn.m mVar = new dn.m();
                mVar.field_fileType = 15;
                mVar.field_fullpath = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f22757j, this.f442432f, false);
                mVar.field_mediaId = "VoiceData" + this.f442432f;
                mVar.field_totalLen = com.tencent.mm.vfs.w6.k(mVar.field_fullpath);
                if (this.f442445v) {
                    mVar.field_chattype = 1;
                } else {
                    mVar.field_chattype = 0;
                }
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.f442448y = android.os.SystemClock.elapsedRealtime();
                if (((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ui(mVar, new java.lang.ref.WeakReference(this.B)) == null) {
                    return -1;
                }
                this.f442440q = true;
                return 0;
            }
            if (!this.f442441r) {
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoice", "start voice cgi");
            this.f442438o = (int) com.tencent.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f22757j, this.f442432f, false));
            this.f442447x = 1;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.cv6();
            lVar.f70665b = new r45.dv6();
            lVar.f70666c = "/cgi-bin/micromsg-bin/uploadvoice";
            lVar.f70667d = 127;
            lVar.f70668e = 19;
            lVar.f70669f = 1000000019;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            this.f442431e = a17;
            r45.cv6 cv6Var = (r45.cv6) a17.f70710a.f70684a;
            cv6Var.set(0, c01.z1.r());
            cv6Var.set(1, j17.f442486c);
            cv6Var.set(2, java.lang.Integer.valueOf(j17.f442489f));
            cv6Var.set(4, j17.f442487d);
            cv6Var.set(6, java.lang.Integer.valueOf(i48));
            cv6Var.set(8, java.lang.Integer.valueOf(this.f442447x));
            cv6Var.set(15, java.lang.Long.valueOf(j17.f442488e));
            cv6Var.set(10, java.lang.Integer.valueOf(i17));
            cv6Var.set(14, java.lang.Integer.valueOf(this.f442435i));
            cv6Var.set(11, c01.ia.f(null));
            if (((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(j17.f442486c)) {
                cv6Var.set(17, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(j17.f442486c));
            }
            cv6Var.set(11, ((aq1.d1) po.a.f357279a).b(j17.f442486c, (int) j17.f442496m));
            cv6Var.set(12, java.lang.Integer.valueOf(format));
            cv6Var.set(18, this.f442442s);
            cv6Var.set(19, this.f442443t);
            cv6Var.set(2, 0);
            cv6Var.set(3, java.lang.Integer.valueOf(this.f442438o));
            ui3.b Ni = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Ni(j17.f442507x, j17.f442496m);
            if (Ni != null && (Bi = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Bi(Ni, true)) != null) {
                cv6Var.set(20, Bi.toXml());
            }
            return dispatch(sVar, this.f442431e, this);
        }
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = new r45.cv6();
        lVar2.f70665b = new r45.dv6();
        lVar2.f70666c = "/cgi-bin/micromsg-bin/uploadvoice";
        lVar2.f70667d = 127;
        lVar2.f70668e = 19;
        lVar2.f70669f = 1000000019;
        com.tencent.mm.modelbase.o a18 = lVar2.a();
        this.f442431e = a18;
        r45.cv6 cv6Var2 = (r45.cv6) a18.f70710a.f70684a;
        cv6Var2.set(0, c01.z1.r());
        cv6Var2.set(1, j17.f442486c);
        cv6Var2.set(2, java.lang.Integer.valueOf(j17.f442489f));
        cv6Var2.set(4, j17.f442487d);
        cv6Var2.set(6, java.lang.Integer.valueOf(i48));
        cv6Var2.set(8, java.lang.Integer.valueOf(this.f442447x));
        cv6Var2.set(15, java.lang.Long.valueOf(j17.f442488e));
        cv6Var2.set(10, java.lang.Integer.valueOf(i17));
        cv6Var2.set(14, java.lang.Integer.valueOf(this.f442435i));
        cv6Var2.set(11, c01.ia.f(null));
        if (((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(j17.f442486c)) {
            cv6Var2.set(17, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(j17.f442486c));
        }
        cv6Var2.set(11, ((aq1.d1) po.a.f357279a).b(j17.f442486c, (int) j17.f442496m));
        cv6Var2.set(12, java.lang.Integer.valueOf(format));
        if (i17 != 1) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.e(d17.f442464a, 0, d17.f442465b);
            cv6Var2.set(7, cu5Var);
            cv6Var2.set(3, java.lang.Integer.valueOf(d17.f442465b));
        } else {
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.c(com.tencent.mm.protobuf.g.b(new byte[1]));
            cv6Var2.set(7, cu5Var2);
            cv6Var2.set(3, 1);
        }
        ui3.b Ni2 = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Ni(j17.f442507x, j17.f442496m);
        if (Ni2 != null) {
            i19 = 1;
            r15.b Bi2 = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Bi(Ni2, true);
            if (Bi2 != null) {
                cv6Var2.set(20, Bi2.toXml());
            }
        } else {
            i19 = 1;
        }
        cv6Var2.getLong(15);
        cv6Var2.getString(i19);
        cv6Var2.getInteger(2);
        int i49 = ((r45.cu5) cv6Var2.getCustom(7)).f371839d;
        cv6Var2.getInteger(8);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoice", "doScene MsgId:" + j17.f442488e + " voiceFormat:" + format + " file:" + this.f442432f + " readBytes:" + d17.f442465b + " neTTTOff:" + j17.f442489f + " neWWWOff:" + this.f442438o + " endFlag:" + this.f442447x + " cancelFlag:" + i17 + " status:" + j17.f442492i + " voiceLen:" + i48 + " ExtCommonInfoXml:" + cv6Var2.getString(20));
        this.f442436m = java.lang.System.currentTimeMillis();
        this.f442448y = android.os.SystemClock.elapsedRealtime();
        return dispatch(sVar, this.f442431e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getDispatchInterceptRet(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        return w11.c1.a(new com.tencent.mm.plugin.msg.MsgIdTalker(this.f442433g, this.f442434h), this) ? org.chromium.net.NetError.ERR_SSL_BAD_RECORD_MAC_ALERT : super.getDispatchInterceptRet(sVar, v0Var, l0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 127;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r36, int r37, int r38, java.lang.String r39, com.tencent.mm.network.v0 r40, byte[] r41) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.o.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 60;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 239L, 1L, false);
        }
        return securityLimitCountReach;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        r45.cv6 cv6Var = (r45.cv6) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        if (!this.f442439p) {
            cv6Var.getLong(15);
            cv6Var.getInteger(2);
            int i17 = ((r45.cu5) cv6Var.getCustom(7)).f371839d;
            cv6Var.getInteger(8);
            if ((cv6Var.getLong(15) == 0 && cv6Var.getInteger(2) != 0) || ((((r45.cu5) cv6Var.getCustom(7)) == null || ((r45.cu5) cv6Var.getCustom(7)).f371839d == 0) && cv6Var.getInteger(8) != 1 && cv6Var.getInteger(10) != 1)) {
                return com.tencent.mm.modelbase.o1.EFailed;
            }
        }
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 238L, 1L, false);
        w21.x0.s(this.f442432f);
    }

    public o(java.lang.String str, int i17) {
        this.f442437n = 0;
        this.f442438o = 0;
        this.f442439p = false;
        this.f442440q = false;
        this.f442441r = false;
        this.f442442s = "";
        this.f442443t = "";
        this.f442444u = false;
        this.f442445v = false;
        this.f442446w = false;
        this.f442447x = 0;
        this.f442448y = 0L;
        this.f442449z = 0L;
        this.A = new com.tencent.mm.sdk.platformtools.b4(new w21.p(this), true);
        this.B = new com.tencent.mm.modelcdntran.q0() { // from class: w21.o$$a
            @Override // com.tencent.mm.modelcdntran.q0
            public final void a(com.tencent.mm.modelcdntran.n1 n1Var) {
                w21.o oVar = w21.o.this;
                oVar.getClass();
                com.tencent.mm.modelcdntran.m1 m1Var = n1Var.f71103a;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(n1Var.f71105c);
                java.lang.String str2 = oVar.f442432f;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoice", "CdnPLCJavaHelperListener fileName:%s %s %s", str2, m1Var, valueOf);
                com.tencent.mm.modelcdntran.m1 m1Var2 = n1Var.f71103a;
                int ordinal = m1Var2.ordinal();
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        jx3.f.INSTANCE.idkeyStat(111L, 51L, 1L, false);
                        dn.h hVar = n1Var.f71108f;
                        if (hVar != null) {
                            java.lang.String str3 = hVar.field_aesKey;
                            oVar.f442442s = str3;
                            java.lang.String str4 = hVar.field_fileId;
                            oVar.f442443t = str4;
                            long j17 = hVar.field_fileLength;
                            oVar.f442441r = true;
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoice", "onUploadVoiceSuccess cdnAesKey:%s cdnVoiceUrl:%s cdnFileLength:%s", str3, str4, java.lang.Long.valueOf(j17));
                            gm0.j1.e().j(new w21.r(oVar));
                            return;
                        }
                        return;
                    }
                    if (ordinal == 5) {
                        dn.g gVar = n1Var.f71107e;
                        if (gVar != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoice", "onUploadVoiceProgress fileName:%s %s/%s", str2, java.lang.Long.valueOf(gVar.field_finishedLength), java.lang.Long.valueOf(n1Var.f71107e.field_toltalLength));
                            return;
                        }
                        return;
                    }
                    if (ordinal != 12 && ordinal != 14 && ordinal != 16) {
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoice", "cdn upload failed, fallback to cgi %s", m1Var2.name());
                oVar.f442444u = true;
                java.lang.String str5 = oVar.f442432f;
                int ordinal2 = m1Var2.ordinal();
                int i18 = ordinal2 != 3 ? ordinal2 != 12 ? ordinal2 != 14 ? ordinal2 != 16 ? 330 : 334 : 332 : 331 : 333;
                long j18 = oVar.f442448y;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                w21.u.c(str5, 2, i18, android.os.SystemClock.elapsedRealtime() - j18, oVar.f442445v, null);
                gm0.j1.e().j(new w21.q(oVar));
            }
        };
        iz5.a.g(null, str != null);
        this.f442432f = str;
        this.f442435i = i17;
    }
}
