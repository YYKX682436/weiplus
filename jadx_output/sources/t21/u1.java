package t21;

/* loaded from: classes12.dex */
public class u1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f414959d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f414960e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f414961f;

    /* renamed from: g, reason: collision with root package name */
    public final int f414962g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f414963h;

    /* renamed from: i, reason: collision with root package name */
    public dn.h f414964i;

    /* renamed from: m, reason: collision with root package name */
    public final m11.a0 f414965m;

    /* renamed from: n, reason: collision with root package name */
    public t21.v2 f414966n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f414967o;

    /* renamed from: p, reason: collision with root package name */
    public t21.v2 f414968p;

    /* renamed from: q, reason: collision with root package name */
    public dn.h f414969q;

    /* renamed from: r, reason: collision with root package name */
    public p25.e f414970r;

    /* renamed from: s, reason: collision with root package name */
    public final z25.e f414971s = new t21.w1(this);

    public u1(java.lang.String str, int i17, dn.h hVar, m11.a0 a0Var) {
        this.f414961f = null;
        this.f414962g = 0;
        this.f414964i = null;
        this.f414965m = null;
        iz5.a.g(null, str != null);
        iz5.a.g(null, a0Var != null);
        this.f414961f = str;
        this.f414964i = hVar;
        this.f414965m = a0Var;
        this.f414962g = i17;
    }

    public static int H(t21.u1 u1Var) {
        int i17;
        u1Var.getClass();
        int i18 = 0;
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, u1Var.f414966n.d(), false);
        if (d61.c.a(rj6)) {
            d61.b bVar = new d61.b();
            long a17 = bVar.a(rj6);
            long j17 = bVar.f226711a;
            if (a17 < 131072 && a17 > 0 && (i17 = u1Var.f414966n.f415015m) > 5) {
                long j18 = bVar.f226712b;
                if (j18 > 0 && j17 > 0 && (i18 = ((int) j17) + ((int) ((j18 * 5) / i17))) <= 131072) {
                    i18 += 131072;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]", u1Var.K(), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(a17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(u1Var.f414966n.f415015m), java.lang.Long.valueOf(bVar.f226712b));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideoOriginCgi", "%s check preload length but it not mp4.", u1Var.K());
        }
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String I(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.u1.I(java.lang.String):java.lang.String");
    }

    public final void J(t21.v2 v2Var, dn.h hVar, dn.h hVar2) {
        zz.b hj6;
        t21.v2 h17;
        v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var.f415011i = 199;
        v2Var.U = 2098436;
        t21.d3.Q(v2Var);
        java.lang.String str = v2Var.S;
        if (t21.d3.s() && hVar2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str) && (h17 = t21.d3.h(str)) != null) {
            h17.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
            h17.f415011i = 199;
            h17.U = cc1.y.CTRL_INDEX;
            t21.d3.Q(h17);
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f414966n.h(), this.f414966n.f415016n);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1) {
            java.lang.String str2 = this.f414961f;
            if (hVar != null) {
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f22571s, str2, false);
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, str2, false);
                if (com.tencent.mm.vfs.w6.j(rj6)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(v2Var.f())) {
                        java.lang.String p17 = com.tencent.mm.vfs.w6.p(tj6);
                        hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj6, Li.getType(), hVar.field_filemd5, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "check video thumb dup, fileName = " + str2 + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, Li.getType(), p17, null).f477691a);
                    } else {
                        hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).hj(this.f414966n.f(), rj6, tj6, Li.getType(), this.f414966n.f415015m, com.tencent.mm.vfs.w6.p(this.f414966n.f()));
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "check video dup, fileName = " + str2 + " result = " + hj6.f477691a);
                }
            }
            if (hVar2 == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(Li, false);
            if (com.tencent.mm.vfs.w6.j(Ai)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "check video dup origin, fileName = " + str2 + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(Ai, Li.getType(), hVar2.field_filemd5, null).f477691a);
            }
        }
    }

    public final java.lang.String K() {
        return this.f414961f + "_" + hashCode();
    }

    public final void L(int i17, int i18, java.lang.String str, r45.c06 c06Var, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        this.f414966n.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        if (c06Var != null) {
            this.f414966n.f415004c = c06Var.f371195d;
            this.f414963h = c06Var.f371196e;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s dkmsgid  set svrmsgid %d -> %d", K(), java.lang.Long.valueOf(this.f414966n.f415004c), java.lang.Integer.valueOf(x51.o1.f452065r));
        if (10007 == x51.o1.f452064q && (i19 = x51.o1.f452065r) != 0) {
            t21.v2 v2Var = this.f414966n;
            if (v2Var.f415004c != 0) {
                v2Var.f415004c = i19;
                x51.o1.f452065r = 0;
            }
        }
        t21.v2 v2Var2 = this.f414966n;
        v2Var2.U = 1028;
        t21.d3.Q(v2Var2);
        java.lang.String str2 = this.f414961f;
        if (c06Var != null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f414966n.h(), true);
            if (((n17 == null || ((int) n17.E2) <= 0) ? false : n17.k2()) || com.tencent.mm.storage.z3.z4(this.f414966n.h())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s upload to biz :%s", K(), this.f414966n.h());
                if (this.f414966n.f415004c < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: finish video invaild MSGSVRID :" + this.f414966n.f415004c + " file:" + str2 + " toUser:" + this.f414966n.h());
                    t21.d3.G(str2);
                    this.f414965m.a(3, -1, 0L, "");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s not upload to biz", K());
                if (this.f414966n.f415004c <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: finish video invaild MSGSVRID :" + this.f414966n.f415004c + " file:" + str2 + " toUser:" + this.f414966n.h());
                    t21.d3.G(str2);
                    this.f414965m.a(3, -1, 0L, "");
                }
            }
        }
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, str2, false);
        java.lang.String I = I(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str2, false));
        z25.f fVar = new z25.f();
        t21.v2 v2Var3 = this.f414966n;
        fVar.f469799j = v2Var3.f415016n;
        fVar.f469804o = v2Var3.h();
        fVar.f469792c = this.f414971s;
        fVar.f469791b = 2;
        fVar.f469790a = 4;
        fVar.f469793d = rj6;
        fVar.f469794e = I;
        ((o25.t) ((p25.f) i95.n0.c(p25.f.class))).getClass();
        z25.d dVar = new z25.d();
        this.f414970r = dVar;
        dVar.d(fVar);
        f65.y0.f260019a.j(str2, f65.y.f260015f);
        this.f414959d.onSceneEnd(i17, i18, str, m1Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        p25.e eVar = this.f414970r;
        if (eVar != null) {
            ((z25.d) eVar).f();
        }
        super.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r21, com.tencent.mm.modelbase.u0 r22) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.u1.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6828;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "%s cdntra onGYNetEnd errtype[%d %d]", K(), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.c06 c06Var = (r45.c06) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        java.lang.String str2 = this.f414961f;
        t21.v2 h17 = t21.d3.h(str2);
        this.f414966n = h17;
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd Get INFO FAILED :" + str2);
            this.f414959d.onSceneEnd(i18, i19, str, this);
            this.f414965m.a(3, -1, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == 102) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f414966n.h());
            this.f414959d.onSceneEnd(i18, i19, str, this);
            this.f414965m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == -22) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd BLACK  errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f414966n.h());
            t21.d3.D(str2);
            this.f414959d.onSceneEnd(i18, i19, str, this);
            this.f414965m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd SERVER FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f414966n.h());
            t21.d3.G(str2);
            this.f414959d.onSceneEnd(i18, i19, str, this);
            this.f414965m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 0 && i19 == 0) {
            L(i18, i19, str, c06Var, this);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOriginCgi", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f414966n.h());
        t21.d3.G(str2);
        this.f414959d.onSceneEnd(i18, i19, str, this);
        this.f414965m.a(i18, i19, 0L, "");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        t21.d3.G(this.f414961f);
    }
}
