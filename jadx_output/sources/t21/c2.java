package t21;

/* loaded from: classes12.dex */
public class c2 implements t21.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f414720a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public long f414721b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f414722c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f414723d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f414724e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f414725f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f414726g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f414727h = false;

    /* renamed from: i, reason: collision with root package name */
    public t21.v0 f414728i = null;

    /* renamed from: j, reason: collision with root package name */
    public long f414729j = 0;

    public c2() {
        t21.b2 b2Var = new t21.b2(this);
        rq3.i iVar = (rq3.i) ((cc0.k) i95.n0.c(cc0.k.class));
        iVar.getClass();
        if (iVar.f398926d == null) {
            iVar.f398926d = b2Var;
        }
    }

    public static boolean b(t21.c2 c2Var, int i17, int i18) {
        java.util.Iterator it;
        c2Var.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z18 = false;
        boolean z19 = i17 == 111;
        long i19 = com.tencent.mm.sdk.platformtools.t8.i1() - (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PreLoadVideoExpiredTime", 1) * 86400);
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d start to delete expired file limit[%d] status[%d] expiredTime[%d] isC2C[%b]", java.lang.Integer.valueOf(c2Var.hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(i19), java.lang.Boolean.valueOf(z19));
        java.util.List o17 = t21.o2.Ui().o(i17, i18, i19);
        if (o17.isEmpty()) {
            return false;
        }
        java.util.Iterator it6 = o17.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            t21.v2 v2Var = (t21.v2) it6.next();
            if (v2Var != null) {
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, v2Var.d(), z18);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(rj6)) {
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(rj6);
                    if (r6Var.m()) {
                        long C = r6Var.C();
                        it = it6;
                        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%s file[%d %d] lastmodifytime[%d] path[%s]", v2Var.d(), java.lang.Long.valueOf(C), java.lang.Integer.valueOf(v2Var.I), java.lang.Long.valueOf(v2Var.f415013k), rj6);
                        if (C > 0 && C <= v2Var.I) {
                            r6Var.l();
                            i27++;
                        }
                        v2Var.I = 0;
                        v2Var.U = 1;
                        t21.d3.Q(v2Var);
                        it6 = it;
                        z18 = false;
                    }
                }
                it = it6;
                v2Var.I = 0;
                v2Var.U = 1;
                t21.d3.Q(v2Var);
                it6 = it;
                z18 = false;
            }
        }
        if (z19) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 144L, i27, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 145L, i27, false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d delete expire file size %d delete count %d costTime[%d]", java.lang.Integer.valueOf(c2Var.hashCode()), java.lang.Integer.valueOf(((java.util.LinkedList) o17).size()), java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return false;
    }

    public static boolean c(t21.c2 c2Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.pointers.PBool pBool) {
        int i17;
        int i18;
        c2Var.getClass();
        if (f9Var == null) {
            pBool.value = true;
        } else {
            t21.v2 h17 = t21.d3.h(f9Var.z0());
            if (h17 != null && h17.i()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d it finish download all file[%s], needn't preload", java.lang.Integer.valueOf(c2Var.hashCode()), h17.d());
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(h17.g(), "msg", null);
                java.lang.String str = (java.lang.String) d17.get(".msg.videomsg.$newmd5");
                java.lang.String str2 = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
                boolean R4 = com.tencent.mm.storage.z3.R4(h17.h());
                int i19 = R4 ? 2 : 1;
                long j17 = h17.f415008f;
                if (com.tencent.mm.storage.z3.R4(h17.h())) {
                    rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
                    java.lang.String h18 = h17.h();
                    ((c01.w1) eVar).getClass();
                    i18 = c01.v1.o(h18);
                } else {
                    i18 = 0;
                }
                c2Var.f(str, i19, j17, h17.e(), h17.h(), i18, str2, "", "");
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(354L, 146L, 1L, false);
                if (R4) {
                    g0Var.idkeyStat(354L, 126L, 1L, false);
                } else {
                    g0Var.idkeyStat(354L, 125L, 1L, false);
                }
                pBool.value = true;
            } else if (c2Var.h(f9Var.Q0())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d use new preload strategy", java.lang.Integer.valueOf(c2Var.hashCode()));
                pBool.value = true;
            } else {
                if (java.lang.System.currentTimeMillis() - f9Var.getCreateTime() >= 86400000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d more than 1 day don't preload", java.lang.Integer.valueOf(c2Var.hashCode()));
                    pBool.value = true;
                } else if (c2Var.d(true)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d check c2c video preload timestamp[%d]", java.lang.Integer.valueOf(c2Var.hashCode()), java.lang.Long.valueOf(c2Var.f414721b));
                    pBool.value = false;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d check c2c video preload %d %s", java.lang.Integer.valueOf(c2Var.hashCode()), java.lang.Long.valueOf(f9Var.getMsgId()), f9Var.G);
                    c01.ea w17 = c01.w9.w(f9Var.G);
                    if (w17 == null) {
                        pBool.value = true;
                    } else {
                        if (c2Var.h(f9Var.Q0())) {
                            i17 = 1;
                        } else if (w17.f37161t <= 0) {
                            pBool.value = true;
                        } else if (d11.b.a(w17.f37163v)) {
                            pBool.value = false;
                        } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                            i17 = w17.f37162u & 1;
                        } else if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                            i17 = w17.f37162u & 2;
                        } else if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                            i17 = w17.f37162u & 4;
                        } else {
                            pBool.value = false;
                        }
                        if (i17 > 0) {
                            pBool.value = false;
                            return true;
                        }
                        pBool.value = false;
                    }
                }
            }
        }
        return false;
    }

    @Override // t21.u0
    public void a(t21.v0 v0Var, boolean z17, int i17, int i18) {
        if (v0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreloadVideoService", "%d on preload finish but scene is null?", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        if (this.f414728i != v0Var) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PreloadVideoService", "%d on preload finish, but scene callback not same object.", java.lang.Integer.valueOf(hashCode()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d preload video[%s] finish success[%b] range[%d, %d]", java.lang.Integer.valueOf(hashCode()), v0Var.c(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ((ku5.t0) ku5.t0.f312615d).g(new t21.a2(this, v0Var));
    }

    public boolean d(boolean z17) {
        int Ni;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_HAD_PRELOAD_TIME_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, -1L)).longValue();
        this.f414721b = longValue;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.lang.System.currentTimeMillis() - longValue >= 86400000) {
            this.f414721b = java.lang.System.currentTimeMillis();
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(this.f414721b));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_C2C_HAD_PRELOAD_COUNT_INT, 0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_HAD_PRELOAD_COUNT_INT, 0);
            this.f414727h = false;
            this.f414726g = false;
        }
        this.f414722c = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_C2C_HAD_PRELOAD_COUNT_INT, 0)).intValue();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SNS_HAD_PRELOAD_COUNT_INT, 0)).intValue();
        this.f414723d = intValue;
        if (z17) {
            intValue = this.f414722c;
            Ni = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("C2CMaxPreloadVideo", 100);
        } else {
            Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_max_preload, 1000);
        }
        int i17 = Ni > 0 ? Ni : 1000;
        boolean z19 = intValue >= i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d check more preload count result[%b] config[%d] hadPreloadCount[%d %d %d] ", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(this.f414722c), java.lang.Integer.valueOf(this.f414723d));
        if (z19) {
            if (z17) {
                if (!this.f414726g) {
                    this.f414726g = true;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 127L, 1L, false);
                }
            } else if (!this.f414727h) {
                this.f414727h = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 128L, 1L, false);
            }
        }
        return z19;
    }

    public void e(boolean z17) {
        if (z17) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_C2C_HAD_PRELOAD_COUNT_INT;
            this.f414722c = ((java.lang.Integer) c17.m(u3Var, 0)).intValue() + 1;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(this.f414722c));
            return;
        }
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_SNS_HAD_PRELOAD_COUNT_INT;
        this.f414723d = ((java.lang.Integer) c18.m(u3Var2, 0)).intValue() + 1;
        gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(this.f414723d));
    }

    public void f(java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(com.tencent.mm.sdk.platformtools.t8.i1());
        stringBuffer.append(",");
        stringBuffer.append(com.tencent.mm.sdk.platformtools.t8.i1());
        stringBuffer.append(",0,");
        stringBuffer.append(str);
        stringBuffer.append(",");
        stringBuffer.append(i17);
        stringBuffer.append(",0,");
        stringBuffer.append(j17);
        stringBuffer.append(",,");
        stringBuffer.append(str2);
        stringBuffer.append(",");
        stringBuffer.append(str3);
        stringBuffer.append(",");
        stringBuffer.append(i18);
        stringBuffer.append(",");
        stringBuffer.append(str4);
        stringBuffer.append(",");
        stringBuffer.append(str5);
        stringBuffer.append(",");
        stringBuffer.append(fo4.c.a(str6));
        new com.tencent.mm.autogen.mmdata.rpt.PreloadVideoInfoStruct(stringBuffer.toString()).k();
    }

    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d stop download", java.lang.Integer.valueOf(hashCode()));
        ((ku5.t0) ku5.t0.f312615d).g(new t21.y1(this));
    }

    public final boolean h(java.lang.String str) {
        ((rq3.i) ((cc0.k) i95.n0.c(cc0.k.class))).getClass();
        oq3.i iVar = oq3.k.f347394a;
        if (str == null) {
            str = "";
        }
        return iVar.c(3, str) != 0;
    }
}
