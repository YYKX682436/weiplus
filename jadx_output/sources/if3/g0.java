package if3;

/* loaded from: classes12.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f291170d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f291171e;

    /* renamed from: f, reason: collision with root package name */
    public final if3.y f291172f;

    /* renamed from: g, reason: collision with root package name */
    public final int f291173g;

    /* renamed from: h, reason: collision with root package name */
    public final fp.j f291174h;

    /* renamed from: i, reason: collision with root package name */
    public int f291175i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f291176m = false;

    public g0(if3.y yVar, boolean z17, int i17) {
        this.f291172f = null;
        this.f291174h = null;
        this.f291175i = 0;
        this.f291172f = yVar;
        this.f291173g = i17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        yVar.f291213f = java.lang.System.currentTimeMillis();
        int i18 = yVar.f291219o;
        if (i18 == 43) {
            yVar.f291212e = 104;
            yVar.f291224t = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, yVar.d(), false));
            yVar.f291222r = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, yVar.d(), false));
            this.f291175i = 2500;
            if (yVar.f291225u == 2) {
                this.f291175i = 2500;
            }
        } else if (i18 == 34) {
            this.f291175i = 40;
            yVar.f291212e = 104;
            yVar.f291222r = w21.v0.d(null, yVar.d());
            yVar.f291224t = 0;
        } else {
            int i19 = 1;
            if (i18 == 3) {
                this.f291175i = 40;
                if (i17 == 1) {
                    this.f291175i = 1250;
                } else {
                    i19 = 0;
                }
                yVar.f291226v = i19;
                yVar.f291212e = 104;
                yVar.f291224t = 0;
                yVar.f291222r = (int) com.tencent.mm.vfs.w6.k(if3.f0.a() + yVar.d());
            } else if (i18 == 49) {
                this.f291175i = 1;
                yVar.f291212e = 104;
                yVar.f291222r = yVar.d().getBytes().length;
                yVar.f291224t = 0;
            } else if (i18 == 47) {
                this.f291175i = 1;
                yVar.f291212e = 104;
                byte[] bArr = yVar.f291229y;
                yVar.f291222r = (bArr == null ? new byte[0] : bArr).length;
                yVar.f291224t = 0;
            } else if (i18 == 1) {
                this.f291175i = 1;
                yVar.f291212e = 104;
                yVar.f291222r = yVar.d().getBytes().length;
                yVar.f291224t = 0;
            } else {
                iz5.a.g("error msgtype:" + yVar.f291219o, false);
            }
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ri4();
        lVar.f70665b = new r45.si4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/masssend";
        lVar.f70667d = 193;
        lVar.f70668e = 84;
        lVar.f70669f = 1000000084;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f291171e = a17;
        r45.ri4 ri4Var = (r45.ri4) a17.f70710a.f70684a;
        ri4Var.f384919e = kk.k.g(yVar.e().getBytes());
        ri4Var.f384931t = yVar.f291218n;
        ri4Var.f384918d = yVar.e();
        yVar.f291211d = "" + java.lang.System.currentTimeMillis();
        ri4Var.f384920f = yVar.c();
        ri4Var.f384921g = yVar.f291219o;
        ri4Var.f384922h = yVar.f291220p;
        ri4Var.f384932u = z17 ? 1 : 0;
        ri4Var.f384933v = i17;
        this.f291174h = new fp.j();
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        this.f291176m = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0381 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e6 A[RETURN] */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r17, com.tencent.mm.modelbase.u0 r18) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: if3.g0.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 193;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.cu5 cu5Var;
        com.tencent.mm.protobuf.g gVar;
        r45.cu5 cu5Var2;
        com.tencent.mm.protobuf.g gVar2;
        updateDispatchId(i17);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd FAILED errtype:" + i18 + " errCode:" + i19);
            fp.k.a();
            this.f291170d.onSceneEnd(i18, i19, str, this);
            return;
        }
        if3.y yVar = this.f291172f;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd Get INFO FAILED :");
            fp.k.a();
            this.f291170d.onSceneEnd(i18, i19, str, this);
            return;
        }
        int i27 = yVar.f291212e;
        if (i27 != 104 && i27 != 103) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd STATUS ERR: status:" + yVar.f291212e);
            fp.k.a();
            this.f291170d.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mm.modelbase.o oVar = this.f291171e;
        r45.si4 si4Var = (r45.si4) oVar.f70711b.f70700a;
        r45.ri4 ri4Var = (r45.ri4) oVar.f70710a.f70684a;
        if (ri4Var.f384926o > 0 && (cu5Var2 = ri4Var.f384928q) != null && (gVar2 = cu5Var2.f371841f) != null && !com.tencent.mm.sdk.platformtools.t8.M0(gVar2.g()) && ri4Var.f384927p != si4Var.f385761e - ri4Var.f384928q.f371839d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Thumb ");
            fp.k.a();
            this.f291170d.onSceneEnd(3, -1, "doScene failed", this);
            return;
        }
        if (ri4Var.f384925n > 0 && (cu5Var = ri4Var.f384923i) != null && (gVar = cu5Var.f371841f) != null && !com.tencent.mm.sdk.platformtools.t8.M0(gVar.g()) && ri4Var.f384924m != si4Var.f385760d - ri4Var.f384923i.f371839d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Data ");
            fp.k.a();
            this.f291170d.onSceneEnd(3, -1, "doScene failed", this);
            return;
        }
        yVar.f291214g = com.tencent.mm.sdk.platformtools.t8.i1();
        int i28 = yVar.f291212e;
        if (i28 == 103) {
            int i29 = ri4Var.f384927p + ri4Var.f384928q.f371839d;
            yVar.f291223s = i29;
            if (i29 >= yVar.f291224t) {
                yVar.f291212e = 199;
            }
        } else {
            if (i28 != 104) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneMasSend", "onGYNetEnd ERROR STATUS:" + i28);
                fp.k.a();
                this.f291170d.onSceneEnd(3, -1, "doScene failed", this);
                return;
            }
            int i37 = ri4Var.f384924m + ri4Var.f384923i.f371839d;
            yVar.f291221q = i37;
            if (i37 >= yVar.f291222r) {
                if (yVar.f291224t > 0) {
                    yVar.f291212e = 103;
                } else {
                    yVar.f291212e = 199;
                }
            }
        }
        if (yVar.f291212e != 199) {
            if (doScene(dispatcher(), this.f291170d) == -1) {
                fp.k.a();
                this.f291170d.onSceneEnd(3, -1, "doScene failed", this);
                return;
            }
            return;
        }
        yVar.f291227w = java.lang.Long.toString(si4Var.f385763g);
        if3.z Ai = if3.k0.Ai();
        Ai.getClass();
        yVar.f291230z = -1;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((yVar.f291230z & 1) != 0) {
            contentValues.put("clientid", yVar.c());
        }
        if ((yVar.f291230z & 2) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(yVar.f291212e));
        }
        if ((yVar.f291230z & 4) != 0) {
            contentValues.put("createtime", java.lang.Long.valueOf(yVar.f291213f));
        }
        if ((yVar.f291230z & 8) != 0) {
            contentValues.put("lastmodifytime", java.lang.Long.valueOf(yVar.f291214g));
        }
        if ((yVar.f291230z & 16) != 0) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME, yVar.d());
        }
        if ((yVar.f291230z & 32) != 0) {
            java.lang.String str2 = yVar.f291216i;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("thumbfilename", str2);
        }
        if ((yVar.f291230z & 64) != 0) {
            contentValues.put("tolist", yVar.e());
        }
        if ((yVar.f291230z & 128) != 0) {
            contentValues.put("tolistcount", java.lang.Integer.valueOf(yVar.f291218n));
        }
        if ((yVar.f291230z & 256) != 0) {
            contentValues.put("msgtype", java.lang.Integer.valueOf(yVar.f291219o));
        }
        if ((yVar.f291230z & 512) != 0) {
            contentValues.put("mediatime", java.lang.Integer.valueOf(yVar.f291220p));
        }
        if ((yVar.f291230z & 1024) != 0) {
            contentValues.put("datanetoffset", java.lang.Integer.valueOf(yVar.f291221q));
        }
        if ((yVar.f291230z & 2048) != 0) {
            contentValues.put("datalen", java.lang.Integer.valueOf(yVar.f291222r));
        }
        if ((yVar.f291230z & 4096) != 0) {
            contentValues.put("thumbnetoffset", java.lang.Integer.valueOf(yVar.f291223s));
        }
        if ((yVar.f291230z & 8192) != 0) {
            contentValues.put("thumbtotallen", java.lang.Integer.valueOf(yVar.f291224t));
        }
        if ((yVar.f291230z & 16384) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(yVar.f291225u));
        }
        if ((yVar.f291230z & 32768) != 0) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(yVar.f291226v));
        }
        if ((yVar.f291230z & 65536) != 0) {
            java.lang.String str3 = yVar.f291227w;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved3", str3);
        }
        if ((yVar.f291230z & 131072) != 0) {
            java.lang.String str4 = yVar.f291228x;
            contentValues.put("reserved4", str4 != null ? str4 : "");
        }
        if (((int) Ai.f291232d.l("massendinfo", "clientid", contentValues)) != -1) {
            boolean z17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p("masssendapp") == null;
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
            l4Var.b2("masssendapp");
            l4Var.l1(Ai.y0(yVar));
            l4Var.n1(yVar.f291213f);
            l4Var.M1(0);
            l4Var.Y1(0);
            l4Var.T1(null);
            if (z17) {
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).G(l4Var);
            } else {
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(l4Var, "masssendapp");
            }
            Ai.doNotify();
        }
        fp.j jVar = this.f291174h;
        if (jVar != null) {
            jVar.a();
        }
        this.f291170d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 2500;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
    }
}
