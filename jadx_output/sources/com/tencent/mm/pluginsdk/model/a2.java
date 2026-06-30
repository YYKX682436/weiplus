package com.tencent.mm.pluginsdk.model;

/* loaded from: classes9.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f188779a;

    static {
        f188779a = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavCheckCdnFixSwitch()) == 1;
    }

    public static r45.gp0 a(r45.gp0 gp0Var, boolean z17) {
        r45.gp0 gp0Var2 = new r45.gp0();
        r45.hp0 hp0Var = new r45.hp0();
        r45.ip0 ip0Var = new r45.ip0();
        r45.ip0 ip0Var2 = gp0Var.J1.f376353d;
        if (ip0Var2.f377232g) {
            ip0Var.i(ip0Var2.f377231f);
        }
        if (ip0Var2.f377234i) {
            ip0Var.n(ip0Var2.f377233h);
        }
        if (ip0Var2.f377238p) {
            ip0Var.k(ip0Var2.f377237o);
        }
        if (ip0Var2.f377246x) {
            ip0Var.f(ip0Var2.f377245w);
        }
        if (ip0Var2.E) {
            ip0Var.D = ip0Var2.D;
            ip0Var.E = true;
        }
        ip0Var.l(1);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ip0Var.f377239q = java.lang.System.currentTimeMillis();
        ip0Var.f377240r = true;
        hp0Var.f376353d = ip0Var;
        hp0Var.f376369w = gp0Var.J1.f376369w;
        gp0Var2.J1 = hp0Var;
        gp0Var2.k0(gp0Var.K1);
        gp0Var2.l0(gp0Var.M1);
        gp0Var2.G0(gp0Var.f375415i2);
        gp0Var2.f375417k2 = gp0Var.f375417k2;
        gp0Var2.f375419l2 = true;
        gp0Var2.f375409f2 = gp0Var.f375409f2;
        gp0Var2.f375407e2 = gp0Var.f375407e2;
        gp0Var2.f375411g2 = gp0Var.f375411g2;
        gp0Var2.f375413h2 = gp0Var.f375413h2;
        gp0Var2.f375405d2 = gp0Var.f375405d2;
        gp0Var2.z0(true);
        gp0Var2.x0(true);
        gp0Var2.a0(gp0Var.f375438u);
        gp0Var2.b0(gp0Var.f375434s);
        gp0Var2.o0(gp0Var.G);
        gp0Var2.t0(gp0Var.P1);
        gp0Var2.j0(gp0Var.X1);
        gp0Var2.p0(gp0Var.M);
        gp0Var2.r0(gp0Var.P);
        gp0Var2.q0(gp0Var.R);
        gp0Var2.N0(gp0Var.Z);
        gp0Var2.M0(gp0Var.f375445x0);
        gp0Var2.L0(gp0Var.f375418l1);
        gp0Var2.n0(gp0Var.f375448y);
        if (z17) {
            gp0Var2.e0(gp0Var.T);
        }
        return gp0Var2;
    }

    public static r45.gp0 b(r45.gp0 gp0Var, int i17, boolean z17) {
        r45.gp0 a17 = a(gp0Var, z17);
        a17.h0(i17);
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var != null && hp0Var.f376356g != null) {
            r45.aq0 aq0Var = new r45.aq0();
            aq0Var.g(gp0Var.J1.f376356g.f370188d);
            aq0Var.d(gp0Var.J1.f376356g.f370190f);
            aq0Var.i(gp0Var.J1.f376356g.f370196o);
            aq0Var.e(gp0Var.J1.f376356g.f370194m);
            aq0Var.f(gp0Var.J1.f376356g.f370192h);
            a17.J1.f376356g = aq0Var;
        }
        return a17;
    }

    public static void c(r45.gp0 gp0Var, r45.gp0 gp0Var2) {
        gp0Var.I0(gp0Var2.C);
        gp0Var.J0(gp0Var2.E);
        gp0Var.K0(gp0Var2.A);
        gp0Var.O0(gp0Var2.f375404d);
        gp0Var.m0(gp0Var2.f375408f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0068. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(com.tencent.mm.autogen.events.DoFavoriteEvent r19, com.tencent.mm.storage.f9 r20) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.a2.d(com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f9):boolean");
    }

    public static void e(int i17, int i18, com.tencent.mm.storage.f9 f9Var, ot0.q qVar, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, r45.bq0 bq0Var) {
        r45.gp0 o17 = o(f9Var, qVar, i18);
        com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = (com.tencent.mm.pluginsdk.ui.tools.i0) qVar.y(com.tencent.mm.pluginsdk.ui.tools.i0.class);
        if (i0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(i0Var.f191708t)) {
            bq0Var.f370962d.i(i0Var.f191708t);
        }
        bq0Var.f370964f.add(o17);
        doFavoriteEvent.f54090g.f6317c = i17;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0139. Please report as an issue. */
    public static boolean f(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, ot0.q qVar, r45.bq0 bq0Var, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        java.lang.String str;
        int i17;
        r45.gp0 a17;
        int i18;
        r45.gp0 a18;
        r45.gp0 a19;
        int i19;
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 0;
        eqVar.f6584b = qVar.f348663h0;
        recordOperationEvent.e();
        r45.ul5 ul5Var = recordOperationEvent.f54664h.f6692a;
        if (ul5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, parse record msg null");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cam;
            return false;
        }
        if (z17) {
            java.lang.String str2 = ul5Var.f387463d;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            bq0Var.p(str2);
        } else {
            if (android.text.TextUtils.isEmpty(ul5Var.f387463d)) {
                if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                    ul5Var.f387463d = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hsy);
                } else {
                    java.lang.String l17 = c01.z1.l();
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String y07 = f9Var.y0();
                    ((sg3.a) v0Var).getClass();
                    java.lang.String b17 = c01.a2.b(y07);
                    if (l17.equals(b17)) {
                        ul5Var.f387463d = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cc6, l17);
                    } else {
                        ul5Var.f387463d = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491208cc5, l17, b17);
                    }
                }
            }
            java.lang.String str3 = ul5Var.f387463d;
            java.lang.String str4 = qVar.f348654f;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = str4;
            }
            bq0Var.p(str3);
        }
        java.util.Iterator it = ul5Var.f387465f.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            int i28 = i27 + 1;
            java.lang.String format = f9Var.A0() == 1 ? (com.tencent.mm.storage.z3.R4(f9Var.Q0()) || f9Var.Q0().equals("filehelper")) ? java.lang.String.format("%d$%d", java.lang.Long.valueOf(f9Var.I0()), java.lang.Integer.valueOf(i27)) : java.lang.String.format("%s#%d$%d", f9Var.Q0(), java.lang.Long.valueOf(f9Var.I0()), java.lang.Integer.valueOf(i27)) : java.lang.String.format("%d$%d", java.lang.Long.valueOf(f9Var.I0()), java.lang.Integer.valueOf(i27));
            int i29 = gp0Var.I;
            java.util.Iterator it6 = it;
            r45.ul5 ul5Var2 = ul5Var;
            switch (i29 == 10130 ? 8 : i29) {
                case 1:
                    str = format;
                    i17 = i28;
                    a17 = a(gp0Var, z17);
                    a17.h0(1);
                    a17.m0(gp0Var.f375408f);
                    doFavoriteEvent.f54090g.f6316b.f385906d++;
                    i27 = i17;
                    break;
                case 2:
                    str = format;
                    java.lang.String Q0 = f9Var.Q0();
                    long msgId = f9Var.getMsgId();
                    r45.gp0 a27 = a(gp0Var, z17);
                    a27.h0(2);
                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent2 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                    am.eq eqVar2 = recordOperationEvent2.f54663g;
                    i17 = i28;
                    eqVar2.f6583a = 1;
                    eqVar2.f6585c = gp0Var;
                    eqVar2.f6586d = msgId;
                    eqVar2.f6587e = Q0;
                    recordOperationEvent2.e();
                    am.fq fqVar = recordOperationEvent2.f54664h;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar.f6694c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneImgItem:not record plugin ? get paths error");
                    }
                    a27.A0(fqVar.f6693b);
                    a27.B0(fqVar.f6694c);
                    a27.z0(false);
                    a27.x0(false);
                    if (com.tencent.mm.pluginsdk.model.z1.f189508b) {
                        a27.f375409f2 = gp0Var.f375409f2;
                        a27.f375413h2 = gp0Var.f375413h2;
                        a27.f375405d2 = gp0Var.f375405d2;
                        a27.f375407e2 = gp0Var.f375407e2;
                        a27.f375411g2 = gp0Var.f375411g2;
                        a27.q0(gp0Var.R);
                        a27.c0(gp0Var.f375420m);
                        a27.d0(gp0Var.f375412h);
                        a27.L0(gp0Var.f375418l1);
                        a27.N0(gp0Var.Z);
                        a27.a0(gp0Var.f375438u);
                        a27.b0(gp0Var.f375434s);
                        a27.p0(gp0Var.M);
                        com.tencent.mars.xlog.Log.i("MicroMsg.FillFavMsgHelper", "fillFavRecordImg, origin tpthumburl:" + gp0Var.f375405d2 + ", tpdataurl:" + gp0Var.f375411g2 + ", cdnDataUrl:" + gp0Var.f375434s + ", cdnThumbUrl:" + gp0Var.f375412h);
                    }
                    doFavoriteEvent.f54090g.f6316b.f385907e++;
                    a17 = a27;
                    i27 = i17;
                    break;
                case 3:
                    str = format;
                    java.lang.String Q02 = f9Var.Q0();
                    long msgId2 = f9Var.getMsgId();
                    r45.gp0 a28 = a(gp0Var, z17);
                    a28.h0(3);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.P1)) {
                        i18 = 1;
                    } else {
                        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent3 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                        am.eq eqVar3 = recordOperationEvent3.f54663g;
                        eqVar3.f6583a = 1;
                        eqVar3.f6585c = gp0Var;
                        eqVar3.f6586d = msgId2;
                        eqVar3.f6587e = Q02;
                        recordOperationEvent3.e();
                        am.fq fqVar2 = recordOperationEvent3.f54664h;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar2.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar2.f6694c)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneImgItem:not record plugin ? get paths error");
                        }
                        a28.A0(fqVar2.f6693b);
                        a28.n0(gp0Var.f375448y);
                        i18 = 1;
                        a28.z0(true);
                        a28.x0(false);
                        a28.i0(gp0Var.K);
                    }
                    doFavoriteEvent.f54090g.f6316b.f385908f += i18;
                    a17 = a28;
                    i27 = i28;
                    break;
                case 4:
                case 15:
                    java.lang.String Q03 = f9Var.Q0();
                    long msgId3 = f9Var.getMsgId();
                    r45.gp0 a29 = a(gp0Var, z17);
                    c(a29, gp0Var);
                    if (gp0Var.I == 15) {
                        a29.h0(15);
                    } else {
                        a29.h0(4);
                    }
                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent4 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                    am.eq eqVar4 = recordOperationEvent4.f54663g;
                    str = format;
                    eqVar4.f6583a = 1;
                    eqVar4.f6585c = gp0Var;
                    eqVar4.f6586d = msgId3;
                    eqVar4.f6587e = Q03;
                    recordOperationEvent4.e();
                    am.fq fqVar3 = recordOperationEvent4.f54664h;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar3.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar3.f6694c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneVideoItem:not record plugin ? get paths error");
                    }
                    a29.x0(false);
                    a29.A0(fqVar3.f6693b);
                    a29.J1 = gp0Var.J1;
                    a29.z0(false);
                    a29.B0(fqVar3.f6694c);
                    a29.n0(gp0Var.f375448y);
                    if (com.tencent.mm.pluginsdk.model.z1.f189508b) {
                        a29.f375409f2 = gp0Var.f375409f2;
                        a29.f375413h2 = gp0Var.f375413h2;
                        a29.f375405d2 = gp0Var.f375405d2;
                        a29.f375407e2 = gp0Var.f375407e2;
                        a29.f375411g2 = gp0Var.f375411g2;
                        a29.q0(gp0Var.R);
                        a29.c0(gp0Var.f375420m);
                        a29.d0(gp0Var.f375412h);
                        a29.L0(gp0Var.f375418l1);
                        a29.N0(gp0Var.Z);
                        a29.b0(gp0Var.f375434s);
                        a29.p0(gp0Var.M);
                        a29.q0(gp0Var.R);
                        a29.a0(gp0Var.f375438u);
                        com.tencent.mars.xlog.Log.i("MicroMsg.FillFavMsgHelper", "fillFavRecordVideo, origin tpthumburl:" + gp0Var.f375405d2 + ", tpdataurl:" + gp0Var.f375411g2 + ", cdnDataUrl:" + gp0Var.f375434s + ", cdnThumbUrl:" + gp0Var.f375412h);
                    }
                    doFavoriteEvent.f54090g.f6316b.f385909g++;
                    a17 = a29;
                    i27 = i28;
                    break;
                case 5:
                    java.lang.String Q04 = f9Var.Q0();
                    long msgId4 = f9Var.getMsgId();
                    a18 = a(gp0Var, z17);
                    c(a18, gp0Var);
                    a18.h0(5);
                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent5 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                    am.eq eqVar5 = recordOperationEvent5.f54663g;
                    eqVar5.f6583a = 1;
                    eqVar5.f6585c = gp0Var;
                    eqVar5.f6586d = msgId4;
                    eqVar5.f6587e = Q04;
                    recordOperationEvent5.e();
                    am.fq fqVar4 = recordOperationEvent5.f54664h;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar4.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar4.f6694c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneUrlItem:not record plugin ? get paths error");
                    }
                    if ((com.tencent.mm.sdk.platformtools.t8.K0(fqVar4.f6694c) || !com.tencent.mm.vfs.w6.j(fqVar4.f6694c)) && (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375420m))) {
                        a18.z0(true);
                    } else {
                        a18.B0(fqVar4.f6694c);
                        a18.z0(false);
                    }
                    r45.hp0 hp0Var = gp0Var.J1;
                    if (hp0Var != null && hp0Var.f376355f != null) {
                        r45.tq0 tq0Var = new r45.tq0();
                        tq0Var.p(gp0Var.J1.f376355f.f386664d);
                        tq0Var.j(gp0Var.J1.f376355f.f386666f);
                        tq0Var.o(gp0Var.J1.f376355f.f386670m);
                        tq0Var.n(gp0Var.J1.f376355f.f386672o);
                        tq0Var.i(gp0Var.J1.f376355f.f386668h);
                        tq0Var.l(gp0Var.J1.f376355f.f386680w);
                        tq0Var.k(gp0Var.J1.f376355f.A);
                        a18.J1.f376355f = tq0Var;
                    }
                    doFavoriteEvent.f54090g.f6316b.f385910h++;
                    a17 = a18;
                    str = format;
                    i27 = i28;
                    break;
                case 6:
                    a17 = a(gp0Var, z17);
                    a17.h0(6);
                    r45.hp0 hp0Var2 = gp0Var.J1;
                    if (hp0Var2 != null && hp0Var2.f376354e != null) {
                        r45.pp0 pp0Var = new r45.pp0();
                        pp0Var.t(gp0Var.J1.f376354e.f383272m);
                        pp0Var.u(gp0Var.J1.f376354e.f383268f);
                        pp0Var.w(gp0Var.J1.f376354e.f383266d);
                        pp0Var.E(gp0Var.J1.f376354e.f383270h);
                        pp0Var.C(gp0Var.J1.f376354e.f383274o);
                        pp0Var.B(gp0Var.J1.f376354e.f383276q);
                        pp0Var.y(gp0Var.J1.f376354e.f383278s);
                        pp0Var.x(gp0Var.J1.f376354e.f383280u);
                        pp0Var.z(gp0Var.J1.f376354e.f383282w);
                        pp0Var.A(gp0Var.J1.f376354e.f383284y);
                        pp0Var.s(gp0Var.J1.f376354e.A);
                        pp0Var.q(gp0Var.J1.f376354e.C);
                        pp0Var.r(gp0Var.J1.f376354e.E);
                        a17.J1.f376354e = pp0Var;
                    }
                    doFavoriteEvent.f54090g.f6316b.f385911i++;
                    str = format;
                    i27 = i28;
                    break;
                case 7:
                    java.lang.String Q05 = f9Var.Q0();
                    long msgId5 = f9Var.getMsgId();
                    a19 = a(gp0Var, z17);
                    c(a19, gp0Var);
                    a19.D0(gp0Var.f375421m2);
                    a19.E0(gp0Var.f375425o2);
                    a19.h0(7);
                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent6 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                    am.eq eqVar6 = recordOperationEvent6.f54663g;
                    eqVar6.f6583a = 1;
                    eqVar6.f6585c = gp0Var;
                    eqVar6.f6586d = msgId5;
                    eqVar6.f6587e = Q05;
                    recordOperationEvent6.e();
                    am.fq fqVar5 = recordOperationEvent6.f54664h;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar5.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar5.f6694c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneMusicItem:not record plugin ? get paths error");
                    }
                    a19.B0(fqVar5.f6694c);
                    a19.z0(false);
                    doFavoriteEvent.f54090g.f6316b.f385912m++;
                    a17 = a19;
                    str = format;
                    i27 = i28;
                    break;
                case 8:
                    java.lang.String Q06 = f9Var.Q0();
                    long msgId6 = f9Var.getMsgId();
                    a18 = a(gp0Var, z17);
                    c(a18, gp0Var);
                    a18.h0(gp0Var.I);
                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent7 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                    am.eq eqVar7 = recordOperationEvent7.f54663g;
                    eqVar7.f6583a = 1;
                    eqVar7.f6585c = gp0Var;
                    eqVar7.f6586d = msgId6;
                    eqVar7.f6587e = Q06;
                    recordOperationEvent7.e();
                    am.fq fqVar6 = recordOperationEvent7.f54664h;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar6.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar6.f6694c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneFileItem:not record plugin ? get paths error");
                    }
                    a18.A0(fqVar6.f6693b);
                    a18.B0(fqVar6.f6694c);
                    a18.x0(false);
                    a18.i0(gp0Var.K);
                    doFavoriteEvent.f54090g.f6316b.f385913n++;
                    a17 = a18;
                    str = format;
                    i27 = i28;
                    break;
                case 9:
                case 13:
                case 18:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                case 34:
                default:
                    str = format;
                    i17 = i28;
                    if (i29 > 10000 && i29 == 10132) {
                        r45.gp0 a37 = a(gp0Var, z17);
                        a37.O0(gp0Var.f375404d);
                        java.lang.String str5 = gp0Var.f375408f;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                            str5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490589za) + gp0Var.f375404d;
                        }
                        a37.m0(str5);
                        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent8 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                        am.eq eqVar8 = recordOperationEvent8.f54663g;
                        eqVar8.f6583a = 1;
                        eqVar8.f6585c = gp0Var;
                        eqVar8.f6586d = f9Var.getMsgId();
                        eqVar8.f6587e = f9Var.Q0();
                        recordOperationEvent8.e();
                        am.fq fqVar7 = recordOperationEvent8.f54664h;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar7.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar7.f6694c)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneLiteAppItem:not record plugin ? get paths error");
                        }
                        a37.B0(fqVar7.f6694c);
                        r45.wp0 wp0Var = gp0Var.J1.K;
                        r45.wp0 wp0Var2 = new r45.wp0();
                        wp0Var2.f389359d = wp0Var.f389359d;
                        wp0Var2.f389360e = wp0Var.f389360e;
                        wp0Var2.f389361f = wp0Var.f389361f;
                        wp0Var2.f389362g = wp0Var.f389362g;
                        wp0Var2.f389363h = wp0Var.f389363h;
                        a37.J1.K = wp0Var2;
                        a37.h0(10132);
                        a17 = a37;
                        i27 = i17;
                        break;
                    } else {
                        i28 = i17 - 1;
                        a17 = null;
                        i27 = i28;
                        break;
                    }
                    break;
                case 10:
                    a17 = b(gp0Var, i29, z17);
                    doFavoriteEvent.f54090g.f6316b.f385915p++;
                    str = format;
                    i27 = i28;
                    break;
                case 11:
                    a17 = b(gp0Var, i29, z17);
                    doFavoriteEvent.f54090g.f6316b.f385916q++;
                    str = format;
                    i27 = i28;
                    break;
                case 12:
                case 14:
                    a17 = a(gp0Var, z17);
                    a17.h0(14);
                    r45.hp0 hp0Var3 = gp0Var.J1;
                    if (hp0Var3 != null && hp0Var3.f376357h != null) {
                        r45.mq0 mq0Var = new r45.mq0();
                        mq0Var.g(gp0Var.J1.f376357h.f380735d);
                        mq0Var.d(gp0Var.J1.f376357h.f380737f);
                        mq0Var.e(gp0Var.J1.f376357h.f380741m);
                        mq0Var.f(gp0Var.J1.f376357h.f380739h);
                        a17.J1.f376357h = mq0Var;
                    }
                    doFavoriteEvent.f54090g.f6316b.f385919t++;
                    str = format;
                    i27 = i28;
                    break;
                case 16:
                    a17 = a(gp0Var, z17);
                    a17.h0(16);
                    a17.m0(gp0Var.f375408f);
                    doFavoriteEvent.f54090g.f6316b.f385920u++;
                    str = format;
                    i27 = i28;
                    break;
                case 17:
                    a17 = a(gp0Var, z17);
                    a17.O0(gp0Var.f375404d);
                    a17.m0(gp0Var.f375408f);
                    a17.x0(false);
                    a17.h0(17);
                    a17.C0(gp0Var.Z1);
                    a17.f375451y2 = com.tencent.mm.pluginsdk.model.x1.d(gp0Var.Z1, format, f9Var.Q0(), f9Var.getMsgId(), false);
                    str = format;
                    i27 = i28;
                    break;
                case 19:
                    java.lang.String Q07 = f9Var.Q0();
                    long msgId7 = f9Var.getMsgId();
                    a18 = a(gp0Var, z17);
                    a18.O0(gp0Var.f375404d);
                    a18.m0(gp0Var.f375408f);
                    a18.h0(19);
                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent9 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                    am.eq eqVar9 = recordOperationEvent9.f54663g;
                    eqVar9.f6583a = 1;
                    eqVar9.f6585c = gp0Var;
                    eqVar9.f6586d = msgId7;
                    eqVar9.f6587e = Q07;
                    recordOperationEvent9.e();
                    am.fq fqVar8 = recordOperationEvent9.f54664h;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar8.f6694c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneAppBrandItem:not record plugin ? get paths error");
                    } else {
                        a18.z0(false);
                        a18.B0(fqVar8.f6694c);
                    }
                    r45.hp0 hp0Var4 = gp0Var.J1;
                    if (hp0Var4 != null && hp0Var4.f376368v != null) {
                        r45.dp0 dp0Var = new r45.dp0();
                        r45.dp0 dp0Var2 = gp0Var.J1.f376368v;
                        dp0Var.f372634d = dp0Var2.f372634d;
                        dp0Var.f372635e = dp0Var2.f372635e;
                        dp0Var.f372636f = dp0Var2.f372636f;
                        dp0Var.f372637g = dp0Var2.f372637g;
                        dp0Var.f372638h = dp0Var2.f372638h;
                        dp0Var.f372639i = dp0Var2.f372639i;
                        dp0Var.f372640m = dp0Var2.f372640m;
                        dp0Var.f372641n = dp0Var2.f372641n;
                        dp0Var.f372646s = dp0Var2.f372646s;
                        dp0Var.f372642o = dp0Var2.f372642o;
                        dp0Var.f372644q = dp0Var2.f372644q;
                        a18.J1.f376368v = dp0Var;
                    }
                    a17 = a18;
                    str = format;
                    i27 = i28;
                    break;
                case 20:
                    a17 = a(gp0Var, z17);
                    a17.h0(20);
                    a17.n0(gp0Var.f375448y);
                    str = format;
                    i27 = i28;
                    break;
                case 21:
                    a17 = a(gp0Var, z17);
                    a17.O0(gp0Var.f375404d);
                    a17.m0(gp0Var.f375408f);
                    a17.x0(false);
                    a17.h0(21);
                    a17.C0(gp0Var.Z1);
                    a17.f375451y2 = com.tencent.mm.pluginsdk.model.x1.d(gp0Var.Z1, format, f9Var.Q0(), f9Var.getMsgId(), false);
                    str = format;
                    i27 = i28;
                    break;
                case 22:
                    a17 = a(gp0Var, z17);
                    a17.O0(gp0Var.f375404d);
                    a17.m0(gp0Var.f375408f);
                    a17.J1.f376371y = gp0Var.J1.f376371y;
                    a17.h0(22);
                    str = format;
                    i27 = i28;
                    break;
                case 29:
                case 32:
                    java.lang.String Q08 = f9Var.Q0();
                    long msgId8 = f9Var.getMsgId();
                    a19 = a(gp0Var, z17);
                    c(a19, gp0Var);
                    r45.hp0 hp0Var5 = gp0Var.J1;
                    if (hp0Var5 != null) {
                        a19.J1.C = hp0Var5.C;
                    }
                    a19.D0(gp0Var.f375421m2);
                    a19.E0(gp0Var.f375425o2);
                    a19.h0(gp0Var.I);
                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent10 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                    am.eq eqVar10 = recordOperationEvent10.f54663g;
                    eqVar10.f6583a = 1;
                    eqVar10.f6585c = gp0Var;
                    eqVar10.f6586d = msgId8;
                    eqVar10.f6587e = Q08;
                    recordOperationEvent10.e();
                    am.fq fqVar9 = recordOperationEvent10.f54664h;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar9.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar9.f6694c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneMusicItem:not record plugin ? get paths error");
                    }
                    a19.B0(fqVar9.f6694c);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375420m)) {
                        i19 = 1;
                        a19.z0(true);
                    } else {
                        a19.z0(false);
                        i19 = 1;
                    }
                    doFavoriteEvent.f54090g.f6316b.f385912m += i19;
                    a17 = a19;
                    str = format;
                    i27 = i28;
                    break;
                case 31:
                    a17 = a(gp0Var, z17);
                    a17.h0(31);
                    a17.m0(gp0Var.f375408f);
                    str = format;
                    i27 = i28;
                    break;
                case 33:
                    java.lang.String Q09 = f9Var.Q0();
                    long msgId9 = f9Var.getMsgId();
                    a19 = a(gp0Var, z17);
                    c(a19, gp0Var);
                    r45.hp0 hp0Var6 = gp0Var.J1;
                    if (hp0Var6 != null) {
                        a19.J1.G = hp0Var6.G;
                    }
                    a19.h0(gp0Var.I);
                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent11 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                    am.eq eqVar11 = recordOperationEvent11.f54663g;
                    eqVar11.f6583a = 1;
                    eqVar11.f6585c = gp0Var;
                    eqVar11.f6586d = msgId9;
                    eqVar11.f6587e = Q09;
                    recordOperationEvent11.e();
                    am.fq fqVar10 = recordOperationEvent11.f54664h;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar10.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar10.f6694c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneMusicItem:not record plugin ? get paths error");
                    }
                    a19.B0(fqVar10.f6694c);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375420m)) {
                        a19.z0(true);
                    } else {
                        a19.z0(false);
                    }
                    a17 = a19;
                    str = format;
                    i27 = i28;
                    break;
                case 35:
                    a17 = a(gp0Var, z17);
                    a17.O0(gp0Var.f375404d);
                    a17.m0(gp0Var.f375408f);
                    a17.h0(35);
                    a17.C0(gp0Var.Z1);
                    a17.f375451y2 = com.tencent.mm.pluginsdk.model.x1.d(gp0Var.Z1, format, f9Var.Q0(), f9Var.getMsgId(), false);
                    str = format;
                    i27 = i28;
                    break;
                case 36:
                    a17 = a(gp0Var, z17);
                    a17.O0(gp0Var.f375404d);
                    java.lang.String str6 = gp0Var.f375408f;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                        str6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490589za) + gp0Var.f375404d;
                    }
                    a17.m0(str6);
                    com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent12 = new com.tencent.mm.autogen.events.RecordOperationEvent();
                    am.eq eqVar12 = recordOperationEvent12.f54663g;
                    eqVar12.f6583a = 1;
                    eqVar12.f6585c = gp0Var;
                    eqVar12.f6586d = f9Var.getMsgId();
                    eqVar12.f6587e = f9Var.Q0();
                    recordOperationEvent12.e();
                    am.fq fqVar11 = recordOperationEvent12.f54664h;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(fqVar11.f6693b) && com.tencent.mm.sdk.platformtools.t8.K0(fqVar11.f6694c)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "cloneLiteAppItem:not record plugin ? get paths error");
                    }
                    a17.B0(fqVar11.f6694c);
                    r45.op0 op0Var = gp0Var.J1.H;
                    r45.op0 op0Var2 = new r45.op0();
                    op0Var2.f382417q = op0Var.f382417q;
                    op0Var2.f382416p = op0Var.f382416p;
                    op0Var2.f382415o = op0Var.f382415o;
                    op0Var2.f382418r = op0Var.f382418r;
                    op0Var2.f382420t = op0Var.f382420t;
                    a17.J1.H = op0Var2;
                    a17.h0(36);
                    str = format;
                    i27 = i28;
                    break;
            }
            if (a17 != null) {
                a17.g0(str);
                a17.w0(gp0Var.f375431q2);
                bq0Var.f370964f.add(a17);
            }
            it = it6;
            ul5Var = ul5Var2;
        }
        if (com.tencent.mm.plugin.fav.ui.x5.f((r45.gp0) ul5Var.f387465f.get(0))) {
            doFavoriteEvent.f54090g.f6317c = 18;
            return true;
        }
        doFavoriteEvent.f54090g.f6317c = 14;
        return true;
    }

    public static boolean g(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, int i17, java.lang.String str) {
        if (doFavoriteEvent == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || (f188779a && !com.tencent.mm.vfs.w6.j(str))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", str, java.lang.Integer.valueOf(i17));
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(2);
        gp0Var.A0(str);
        gp0Var.e0(kk.k.g((gp0Var.toString() + 2 + java.lang.System.currentTimeMillis()).getBytes()));
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 27;
        z9Var.f8533f = gp0Var;
        favoriteOperationEvent.e();
        java.lang.String str2 = favoriteOperationEvent.f54244h.f6137d;
        com.tencent.mm.sdk.platformtools.x.x(str, 150, 150, android.graphics.Bitmap.CompressFormat.JPEG, 90, str2, true);
        gp0Var.B0(str2);
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(i17);
        jq0Var.c(java.lang.System.currentTimeMillis());
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = gp0Var.f375404d;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 2;
        return true;
    }

    public static boolean h(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, boolean z17) {
        com.tencent.mm.vfs.x1 m17;
        if (doFavoriteEvent == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || (f188779a && !com.tencent.mm.vfs.w6.j(str))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            }
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", str3, str4, str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str5 = a17.f213279f;
        if (str5 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        long j17 = 0;
        if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
            j17 = m17.f213233c;
        }
        if (j17 > ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Bj()) {
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cds;
            return false;
        }
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.A0(str);
        gp0Var.h0(4);
        gp0Var.i0(com.tencent.mm.vfs.w6.n(str));
        gp0Var.B0(str2);
        gp0Var.n0(i18);
        gp0Var.O0(str3);
        gp0Var.m0(str4);
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(i17);
        jq0Var.c(java.lang.System.currentTimeMillis());
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        java.lang.String str6 = gp0Var.f375404d;
        c4Var.f6318d = str6;
        c4Var.f6319e = str6;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 4;
        return true;
    }

    public static boolean i(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, long j17, java.lang.String str) {
        return j(doFavoriteEvent, pt0.f0.Li(str, j17), false);
    }

    public static boolean j(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        am.c4 c4Var;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2;
        java.lang.String str;
        boolean z18;
        r45.uf6 uf6Var;
        boolean z19;
        boolean z27;
        r45.gp0 gp0Var;
        java.lang.Class cls;
        java.lang.String str2;
        if (doFavoriteEvent == null || f9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event or msg is null");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            return false;
        }
        com.tencent.mm.storage.f9 M1 = com.tencent.mm.storage.f9.M1(f9Var);
        boolean b37 = M1.b3();
        am.c4 c4Var2 = doFavoriteEvent.f54090g;
        if (b37) {
            r45.bq0 bq0Var = new r45.bq0();
            bq0Var.o(n(M1));
            c4Var2.f6315a = bq0Var;
            c4Var2.f6319e = M1.j();
            c4Var2.f6317c = 1;
            if (com.tencent.mm.ui.tools.v4.f(c4Var2.f6319e) > ip.c.d()) {
                c4Var2.f6326l = com.tencent.mm.R.string.cdn;
                doFavoriteEvent2 = doFavoriteEvent;
                z19 = false;
                c4Var = c4Var2;
            }
            doFavoriteEvent2 = doFavoriteEvent;
            c4Var = c4Var2;
            z19 = true;
        } else {
            m11.b0 b0Var = null;
            if (M1.g3()) {
                r45.bq0 bq0Var2 = new r45.bq0();
                bq0Var2.o(n(M1));
                r45.gp0 gp0Var2 = new r45.gp0();
                p(gp0Var2, M1);
                gp0Var2.v0(M1.I0());
                if (com.tencent.mm.storage.z3.I4(M1.Q0())) {
                    tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.h1.c(ys3.l.a(), "recbiz_", M1.z0(), ".rec", 2);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                        c17 = null;
                    } else {
                        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c17);
                        java.lang.String str3 = a17.f213279f;
                        if (str3 != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                            if (!str3.equals(l17)) {
                                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                        if (m17.a()) {
                            m17.f213266a.F(m17.f213267b);
                        }
                    }
                    gp0Var2.A0(((k90.b) u0Var).xj(M1, null, c17, false));
                } else {
                    gp0Var2.A0(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).xj(M1, M1.z0(), null, false));
                }
                gp0Var2.h0(3);
                gp0Var2.z0(true);
                int format = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Bi(M1, M1.z0()).getFormat();
                gp0Var2.i0(format == 1 ? "speex" : format == 4 ? "silk" : "amr");
                gp0Var2.n0((int) new w21.u0(M1.j()).f442480b);
                com.tencent.mm.pluginsdk.model.z1.f189507a.c(M1, gp0Var2);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(gp0Var2);
                bq0Var2.d(linkedList);
                c4Var2.f6315a = bq0Var2;
                c4Var2.f6317c = 3;
            } else if (M1.L2()) {
                r45.bq0 bq0Var3 = new r45.bq0();
                bq0Var3.o(n(M1));
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(M1.j(), "msg", null);
                if (d17 != null) {
                    try {
                        r45.pp0 pp0Var = new r45.pp0();
                        pp0Var.t((java.lang.String) d17.get(".msg.location.$label"));
                        pp0Var.u(java.lang.Double.parseDouble((java.lang.String) d17.get(".msg.location.$x")));
                        pp0Var.w(java.lang.Double.parseDouble((java.lang.String) d17.get(".msg.location.$y")));
                        pp0Var.E(java.lang.Integer.valueOf((java.lang.String) d17.get(".msg.location.$scale")).intValue());
                        pp0Var.C((java.lang.String) d17.get(".msg.location.$poiname"));
                        pp0Var.B((java.lang.String) d17.get(".msg.location.$poiid"));
                        pp0Var.y((java.lang.String) d17.get(".msg.location.$poiCategoryTips"));
                        pp0Var.x((java.lang.String) d17.get(".msg.location.$poiBusinessHour"));
                        pp0Var.z((java.lang.String) d17.get(".msg.location.$poiPhone"));
                        pp0Var.A(com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) d17.get(".msg.location.$poiPriceTips")));
                        pp0Var.s(com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) d17.get(".msg.location.$isFromPoiList"), false));
                        pp0Var.q((java.lang.String) d17.get(".msg.location.$buildingId"));
                        pp0Var.r((java.lang.String) d17.get(".msg.location.$floorName"));
                        bq0Var3.j(pp0Var);
                        c4Var2.f6317c = 6;
                        c4Var2.f6315a = bq0Var3;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "parse failed, %s", e17.getStackTrace().toString());
                    }
                }
                c4Var2.f6326l = com.tencent.mm.R.string.cam;
                doFavoriteEvent2 = doFavoriteEvent;
                z19 = false;
                c4Var = c4Var2;
            } else if (M1.J2()) {
                if (M1.getMsgId() > 0) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    b0Var = m11.b1.Di().T1(M1.Q0(), M1.getMsgId());
                }
                if ((b0Var == null || b0Var.f322633a <= 0) && M1.I0() > 0) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    b0Var = m11.b1.Di().b2(M1.Q0(), M1.I0());
                }
                m11.b0 b0Var2 = b0Var;
                if (b0Var2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "getImgDataPath: try get imgInfo fail");
                    c4Var2.f6326l = com.tencent.mm.R.string.cai;
                    doFavoriteEvent2 = doFavoriteEvent;
                    c4Var = c4Var2;
                    z19 = false;
                } else {
                    r45.bq0 bq0Var4 = new r45.bq0();
                    bq0Var4.o(n(M1));
                    ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                    java.lang.String c18 = m11.c0.c(M1, b0Var2);
                    ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(c18, M1.getMsgId(), 1);
                    ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                    java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(M1, bm5.c0.f22550a.d(b0Var2.j()), m11.c0.b(b0Var2), "", "");
                    r45.gp0 gp0Var3 = new r45.gp0();
                    p(gp0Var3, M1);
                    gp0Var3.h0(2);
                    gp0Var3.v0(M1.I0());
                    gp0Var3.A0(c18);
                    if (b0Var2.j()) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(b0Var2.f322649q));
                        if (C1.f322636d > C1.f322635c) {
                            tg3.u0 u0Var2 = (tg3.u0) i95.n0.c(tg3.u0.class);
                            bm5.f0 f0Var = bm5.f0.f22563h;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SERVERID://");
                            cls = tg3.u0.class;
                            sb6.append(M1.I0());
                            gp0Var = gp0Var3;
                            str2 = aj6;
                            gp0Var.A0(((k90.b) u0Var2).aj(M1, f0Var, sb6.toString(), "", ""));
                        } else {
                            gp0Var = gp0Var3;
                            str2 = aj6;
                            cls = tg3.u0.class;
                        }
                        if (z17) {
                            gp0Var.u0(true);
                            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavImageEventInfo: isForceOriginal=true, hasHdImg=true, set isHighQualityResources=true, midImgPath=%s, bigImgPath=%s", c18, str2);
                            if (com.tencent.mm.vfs.w6.j(str2)) {
                                gp0Var.A0(str2);
                            } else {
                                gp0Var.A0("");
                            }
                        } else if (com.tencent.mm.vfs.w6.j(str2)) {
                            gp0Var.A0(str2);
                            boolean a18 = o72.c2.a();
                            gp0Var.u0(a18);
                            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavImageEventInfo: bigImg exists, set isHighQualityResources=%b, bigImgPath=%s", java.lang.Boolean.valueOf(a18), str2);
                        } else if (o72.c2.a() && !com.tencent.mm.vfs.w6.j(c18)) {
                            gp0Var.u0(true);
                            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavImageEventInfo: neither midImg nor bigImg exists, hasHdImg=true, set isHighQualityResources=true, midImgPath=%s, bigImgPath=%s", c18, str2);
                        }
                        c4Var = c4Var2;
                        if (C1.f322636d > ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).wj()) {
                            c4Var.f6326l = com.tencent.mm.R.string.cds;
                            c4Var.f6317c = 2;
                            doFavoriteEvent2 = doFavoriteEvent;
                            z19 = false;
                        }
                    } else {
                        gp0Var = gp0Var3;
                        cls = tg3.u0.class;
                        c4Var = c4Var2;
                    }
                    gp0Var.B0(((k90.b) ((tg3.u0) i95.n0.c(cls))).mj(M1, M1.z0(), true));
                    gp0Var.w0(c01.ia.v(M1.G));
                    com.tencent.mm.pluginsdk.model.z1.f189507a.a(M1, gp0Var);
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList2.add(gp0Var);
                    bq0Var4.d(linkedList2);
                    c4Var.f6315a = bq0Var4;
                    c4Var.f6317c = 2;
                    z19 = true;
                    doFavoriteEvent2 = doFavoriteEvent;
                }
            } else {
                c4Var = c4Var2;
                if (M1.isVideo() || M1.Y2()) {
                    doFavoriteEvent2 = doFavoriteEvent;
                    r45.bq0 bq0Var5 = new r45.bq0();
                    bq0Var5.o(n(M1));
                    r45.gp0 gp0Var4 = new r45.gp0();
                    p(gp0Var4, M1);
                    tg3.u0 u0Var3 = (tg3.u0) i95.n0.c(tg3.u0.class);
                    bm5.f0 f0Var2 = bm5.f0.f22571s;
                    gp0Var4.A0(((k90.b) u0Var3).rj(M1, f0Var2, M1.z0(), false));
                    gp0Var4.B0(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(M1, M1.z0(), false));
                    gp0Var4.i0(com.tencent.mm.vfs.w6.n(gp0Var4.V));
                    gp0Var4.v0(M1.I0());
                    gp0Var4.F0(M1.getMsgId());
                    if (M1.Y2()) {
                        c4Var.f6317c = 16;
                        gp0Var4.h0(15);
                    } else {
                        c4Var.f6317c = 4;
                        gp0Var4.h0(4);
                    }
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String z07 = M1.z0();
                    ((vf0.y1) x1Var).getClass();
                    t21.v2 h17 = t21.d3.h(z07);
                    if (h17 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "[doFillFavVideoEventInfo] null == info");
                        c4Var.f6326l = com.tencent.mm.R.string.cab;
                    } else {
                        str = "";
                        ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(gp0Var4.V, M1.getMsgId(), 3);
                        wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
                        java.lang.String str4 = h17.S;
                        ((vf0.y1) x1Var2).getClass();
                        t21.v2 h18 = t21.d3.h(str4);
                        if (h18 != null && h18.f415011i == 199) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "origin video length is %d", java.lang.Integer.valueOf(h18.f415008f));
                            h17 = h18;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "video length is %d", java.lang.Integer.valueOf(h17.f415008f));
                        if (h17.f415008f > ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Bj()) {
                            c4Var.f6326l = com.tencent.mm.R.string.cds;
                        } else if (M1.Y2() && t21.d3.b(M1.z0())) {
                            c4Var.f6326l = com.tencent.mm.R.string.cab;
                        } else {
                            if (z17) {
                                int intValue = ((java.lang.Integer) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(M1).f302833d).intValue();
                                if (intValue != 0) {
                                    gp0Var4.u0(true);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavVideoEventInfo: isForceOriginal=true, originVideoStatus=%d, set isHighQualityResources=true", java.lang.Integer.valueOf(intValue));
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavVideoEventInfo: isForceOriginal=true, but VIDEO_STATE_NO_ORIGIN, skip isHighQualityResources");
                                }
                                if (h17.i()) {
                                    str = h17.d().endsWith(ya.b.ORIGIN) ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(M1, bm5.f0.f22570r, h17.d(), false) : "";
                                    com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavVideoEventInfo: isForceOriginal, video hadFinishDownload, set orgn path [%s]", str);
                                    gp0Var4.A0(str);
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavVideoEventInfo: isForceOriginal, video not downloaded, set orgn path empty");
                                    gp0Var4.A0(str);
                                }
                            } else if (h17.i()) {
                                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(M1, f0Var2, h17.d(), false);
                                if (h17.d().endsWith(ya.b.ORIGIN)) {
                                    rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(M1, bm5.f0.f22570r, h17.d(), false);
                                    if (o72.c2.a()) {
                                        gp0Var4.u0(true);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavVideoEventInfo: hadFinishDownload, set isHighQualityResources=true");
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "this video had finish download, set orgn path [%s]", rj6);
                                gp0Var4.A0(rj6);
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "this video had not finish download, set orgn path null");
                                gp0Var4.A0(str);
                                if (o72.c2.a()) {
                                    int intValue2 = ((java.lang.Integer) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(M1).f302833d).intValue();
                                    if (intValue2 != 0) {
                                        z18 = true;
                                        gp0Var4.u0(true);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavVideoEventInfo: video not downloaded, originVideoStatus=%d, set isHighQualityResources=true", java.lang.Integer.valueOf(intValue2));
                                    } else {
                                        z18 = true;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "doFillFavVideoEventInfo: video not downloaded, VIDEO_STATE_NO_ORIGIN, skip isHighQualityResources");
                                    }
                                    gp0Var4.n0(h17.f415015m);
                                    gp0Var4.w0(c01.ia.v(M1.G));
                                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                                    linkedList3.add(gp0Var4);
                                    bq0Var5.d(linkedList3);
                                    c4Var.f6315a = bq0Var5;
                                    wf0.x1 x1Var3 = (wf0.x1) i95.n0.c(wf0.x1.class);
                                    java.lang.String z08 = M1.z0();
                                    ((vf0.y1) x1Var3).getClass();
                                    t21.v2 h19 = t21.d3.h(z08);
                                    gp0Var4.H0(h19.F);
                                    com.tencent.mm.pluginsdk.model.z1.f189507a.b(M1, gp0Var4);
                                    uf6Var = h19.E;
                                    if (uf6Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(uf6Var.f387339m)) {
                                        r45.jp0 jp0Var = new r45.jp0();
                                        jp0Var.f377998d = uf6Var.f387333d;
                                        jp0Var.f377999e = uf6Var.f387334e;
                                        jp0Var.f378000f = uf6Var.f387335f;
                                        jp0Var.f378001g = uf6Var.f387336g;
                                        jp0Var.f378002h = uf6Var.f387337h;
                                        jp0Var.f378003i = uf6Var.f387338i;
                                        jp0Var.f378004m = uf6Var.f387339m;
                                        jp0Var.f378005n = uf6Var.f387340n;
                                        gp0Var4.O1 = jp0Var;
                                    }
                                    z19 = z18;
                                }
                            }
                            z18 = true;
                            gp0Var4.n0(h17.f415015m);
                            gp0Var4.w0(c01.ia.v(M1.G));
                            java.util.LinkedList linkedList32 = new java.util.LinkedList();
                            linkedList32.add(gp0Var4);
                            bq0Var5.d(linkedList32);
                            c4Var.f6315a = bq0Var5;
                            wf0.x1 x1Var32 = (wf0.x1) i95.n0.c(wf0.x1.class);
                            java.lang.String z082 = M1.z0();
                            ((vf0.y1) x1Var32).getClass();
                            t21.v2 h192 = t21.d3.h(z082);
                            gp0Var4.H0(h192.F);
                            com.tencent.mm.pluginsdk.model.z1.f189507a.b(M1, gp0Var4);
                            uf6Var = h192.E;
                            if (uf6Var != null) {
                                r45.jp0 jp0Var2 = new r45.jp0();
                                jp0Var2.f377998d = uf6Var.f387333d;
                                jp0Var2.f377999e = uf6Var.f387334e;
                                jp0Var2.f378000f = uf6Var.f387335f;
                                jp0Var2.f378001g = uf6Var.f387336g;
                                jp0Var2.f378002h = uf6Var.f387337h;
                                jp0Var2.f378003i = uf6Var.f387338i;
                                jp0Var2.f378004m = uf6Var.f387339m;
                                jp0Var2.f378005n = uf6Var.f387340n;
                                gp0Var4.O1 = jp0Var2;
                            }
                            z19 = z18;
                        }
                    }
                    z19 = false;
                } else if (M1.M2()) {
                    ot0.q v17 = ot0.q.v(M1.U1());
                    if (v17 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "doFillMpVideoEventInfo content is null");
                    } else {
                        r45.bq0 bq0Var6 = new r45.bq0();
                        bq0Var6.o(n(M1));
                        r45.gp0 gp0Var5 = new r45.gp0();
                        p(gp0Var5, M1);
                        gp0Var5.B0(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(M1, M1.z0(), false));
                        gp0Var5.i0(com.tencent.mm.vfs.w6.n(gp0Var5.V));
                        gp0Var5.v0(M1.I0());
                        gp0Var5.A0("");
                        gp0Var5.o0(v17.f348734z);
                        r45.qp0 g17 = ot0.g0.g(M1);
                        if (g17 == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "doFillMpVideoEventInfo favMpMsgItem is null");
                        } else {
                            gp0Var5.n0(g17.f384167i);
                            gp0Var5.O0(v17.f348654f);
                            gp0Var5.K0(v17.f348674k);
                            gp0Var5.x0(true);
                            gp0Var5.z0(true);
                            r45.hp0 hp0Var = new r45.hp0();
                            if (M1.M2()) {
                                hp0Var.f376370x = g17;
                            }
                            gp0Var5.J1 = hp0Var;
                            java.util.LinkedList linkedList4 = new java.util.LinkedList();
                            linkedList4.add(gp0Var5);
                            bq0Var6.d(linkedList4);
                            c4Var.f6315a = bq0Var6;
                            c4Var.f6317c = 4;
                            gp0Var5.h0(4);
                            z19 = true;
                            doFavoriteEvent2 = doFavoriteEvent;
                        }
                    }
                    doFavoriteEvent2 = doFavoriteEvent;
                    z19 = false;
                } else {
                    if (M1.t2()) {
                        r45.bq0 bq0Var7 = new r45.bq0();
                        r45.jq0 n17 = n(M1);
                        bq0Var7.o(n17);
                        try {
                            ot0.m0 Di = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(M1.getMsgId(), M1.j());
                            java.util.LinkedList linkedList5 = Di.f348581i;
                            n17.B = Di.f348578f;
                            n17.C = true;
                            if (linkedList5 != null) {
                                int size = linkedList5.size();
                                int i17 = c4Var.f6321g;
                                if (size > i17) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "favorite biz msg, index is %d", java.lang.Integer.valueOf(i17));
                                    ot0.s0 s0Var = (ot0.s0) linkedList5.get(c4Var.f6321g);
                                    if (k01.o.a(s0Var.f348775r)) {
                                        c4Var.f6326l = com.tencent.mm.R.string.cak;
                                    } else {
                                        n17.f(s0Var.f348762e);
                                        if (c4Var.f6321g > 0) {
                                            n17.i("");
                                        }
                                        r45.gp0 gp0Var6 = new r45.gp0();
                                        gp0Var6.O0(s0Var.f348761d);
                                        gp0Var6.m0(s0Var.f348769n);
                                        p(gp0Var6, M1);
                                        gp0Var6.v0(M1.I0());
                                        java.lang.String j17 = ot0.g0.j(s0Var);
                                        if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                                            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                                            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(M1.Q0());
                                            if (n07 != null) {
                                                j17 = n07.c();
                                            }
                                        }
                                        if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                                            z27 = true;
                                            gp0Var6.z0(true);
                                        } else {
                                            gp0Var6.B0(tv.a.b(j17));
                                            gp0Var6.z0(false);
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var6.X) || !com.tencent.mm.vfs.w6.j(gp0Var6.X)) {
                                                gp0Var6.o0(j17);
                                                gp0Var6.z0(true);
                                            }
                                            z27 = true;
                                        }
                                        gp0Var6.x0(z27);
                                        gp0Var6.h0(5);
                                        bq0Var7.f370964f.add(gp0Var6);
                                        c4Var.f6315a = bq0Var7;
                                        c4Var.f6319e = s0Var.f348761d;
                                        c4Var.f6317c = 5;
                                        r45.tq0 tq0Var = new r45.tq0();
                                        tq0Var.o(j17);
                                        tq0Var.p(s0Var.f348761d);
                                        tq0Var.j(s0Var.f348769n);
                                        bq0Var7.r(tq0Var);
                                        bq0Var7.k(ot0.g0.f(s0Var, tq0Var, Di.f348578f, Di.f348579g));
                                        z19 = true;
                                        doFavoriteEvent2 = doFavoriteEvent;
                                    }
                                }
                            }
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetFavDataSource", e18, "", new java.lang.Object[0]);
                            com.tencent.mars.xlog.Log.e("MicroMsg.GetFavDataSource", "retransmit app msg error : %s", e18.getLocalizedMessage());
                        }
                        c4Var.f6326l = com.tencent.mm.R.string.cam;
                    } else {
                        if (M1.E2() || M1.K2()) {
                            doFavoriteEvent2 = doFavoriteEvent;
                            c4Var.f6326l = com.tencent.mm.R.string.cak;
                        } else if (!M1.k2()) {
                            doFavoriteEvent2 = doFavoriteEvent;
                            c4Var.f6326l = com.tencent.mm.R.string.cak;
                        } else if (M1.m2()) {
                            c4Var.f6326l = com.tencent.mm.R.string.cak;
                        } else {
                            doFavoriteEvent2 = doFavoriteEvent;
                            z19 = d(doFavoriteEvent2, M1);
                        }
                        z19 = false;
                    }
                    doFavoriteEvent2 = doFavoriteEvent;
                    z19 = false;
                }
            }
            doFavoriteEvent2 = doFavoriteEvent;
            c4Var = c4Var2;
            z19 = true;
        }
        c4Var.f6320f = M1.j();
        if (z19 || c4Var.f6326l == 0) {
            com.tencent.mm.plugin.fav.ui.u1.a(M1, doFavoriteEvent2, z19);
        }
        return z19;
    }

    public static boolean k(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.vfs.x1 m17;
        if (doFavoriteEvent == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || (f188779a && !com.tencent.mm.vfs.w6.j(str))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            if (doFavoriteEvent != null) {
                doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            }
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d, fmt %s", str2, str3, str, java.lang.Integer.valueOf(i17), str4);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str5 = a17.f213279f;
        if (str5 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        long j17 = 0;
        if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
            j17 = m17.f213233c;
        }
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
        if (j17 > ip.c.g()) {
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cds;
            return false;
        }
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.A0(str);
        gp0Var.h0(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            gp0Var.i0(com.tencent.mm.vfs.w6.n(str));
        } else {
            gp0Var.i0(str4);
        }
        gp0Var.z0(true);
        gp0Var.O0(str2);
        gp0Var.m0(str3);
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(i17);
        jq0Var.c(java.lang.System.currentTimeMillis());
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        java.lang.String str6 = gp0Var.f375404d;
        c4Var.f6318d = str6;
        c4Var.f6319e = str6;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 8;
        return true;
    }

    public static boolean l(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, android.content.Intent intent) {
        if (doFavoriteEvent == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null");
            return false;
        }
        double doubleExtra = intent.getDoubleExtra("kwebmap_slat", 0.0d);
        double doubleExtra2 = intent.getDoubleExtra("kwebmap_lng", 0.0d);
        int intExtra = intent.getIntExtra("kwebmap_scale", 0);
        java.lang.String stringExtra = intent.getStringExtra("Kwebmap_locaion");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("kPoiName");
        intent.getCharSequenceExtra("kRemark");
        intent.getStringArrayListExtra("kTags");
        java.lang.String stringExtra3 = intent.getStringExtra("kPoiid");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        boolean booleanExtra = intent.getBooleanExtra("KIsFromPoiList", false);
        java.lang.String stringExtra4 = intent.getStringExtra("KPoiCategoryTips");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        java.lang.String stringExtra5 = intent.getStringExtra("kPoiBusinessHour");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        java.lang.String stringExtra6 = intent.getStringExtra("KPoiPhone");
        java.lang.String str = stringExtra6 != null ? stringExtra6 : "";
        float floatExtra = intent.getFloatExtra("KPoiPriceTips", 0.0f);
        java.lang.String stringExtra7 = intent.getStringExtra("kBuildingID");
        java.lang.String stringExtra8 = intent.getStringExtra("kFloorName");
        r45.pp0 pp0Var = new r45.pp0();
        pp0Var.t(stringExtra);
        pp0Var.u(doubleExtra);
        pp0Var.w(doubleExtra2);
        pp0Var.E(intExtra);
        pp0Var.C(stringExtra2);
        pp0Var.B(stringExtra3);
        pp0Var.s(booleanExtra);
        pp0Var.y(stringExtra4);
        pp0Var.x(stringExtra5);
        pp0Var.z(str);
        pp0Var.A(floatExtra);
        pp0Var.q(stringExtra7);
        pp0Var.r(stringExtra8);
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        java.lang.String r17 = c01.z1.r();
        jq0Var.e(r17);
        jq0Var.j(r17);
        jq0Var.g(6);
        jq0Var.c(java.lang.System.currentTimeMillis());
        bq0Var.j(pp0Var);
        bq0Var.o(jq0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 6;
        return true;
    }

    public static boolean m(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str, int i17) {
        if (doFavoriteEvent == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            return false;
        }
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(i17);
        jq0Var.c(java.lang.System.currentTimeMillis());
        bq0Var.o(jq0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6319e = str;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 1;
        return true;
    }

    public static r45.jq0 n(com.tencent.mm.storage.f9 f9Var) {
        r45.jq0 jq0Var = new r45.jq0();
        if (f9Var.A0() == 1) {
            jq0Var.e(c01.z1.r());
            jq0Var.j(f9Var.Q0());
            if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                jq0Var.f378042o = jq0Var.f378036f;
                jq0Var.f378043p = true;
            }
        } else {
            jq0Var.e(f9Var.Q0());
            jq0Var.j(c01.z1.r());
            if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                java.lang.String substring = f9Var.j() != null ? f9Var.j().substring(0, java.lang.Math.max(0, f9Var.j().indexOf(58))) : "";
                jq0Var.f378042o = substring;
                jq0Var.f378043p = true;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(substring) && !f9Var.g3()) {
                    f9Var.d1(f9Var.j().substring(jq0Var.f378042o.length() + 1));
                    if (f9Var.j().length() > 0 && '\n' == f9Var.j().charAt(0)) {
                        f9Var.d1(f9Var.j().substring(1));
                    }
                    if (f9Var.i2()) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(f9Var.W0()) && f9Var.W0().startsWith(jq0Var.f378042o)) {
                            f9Var.D1(f9Var.W0().substring(jq0Var.f378042o.length() + 1));
                        }
                        if (f9Var.W0().length() > 0 && '\n' == f9Var.W0().charAt(0)) {
                            f9Var.D1(f9Var.W0().substring(1));
                        }
                    }
                }
            }
        }
        jq0Var.g(1);
        jq0Var.c(f9Var.getCreateTime());
        jq0Var.f378046s = f9Var.I0() + "";
        jq0Var.f378047t = true;
        if (f9Var.I0() > 0) {
            jq0Var.i(f9Var.I0() + "");
        }
        return jq0Var;
    }

    public static r45.gp0 o(com.tencent.mm.storage.f9 f9Var, ot0.q qVar, int i17) {
        com.tencent.mm.pluginsdk.ui.tools.i0 i0Var;
        il4.a aVar;
        r45.gp0 gp0Var = new r45.gp0();
        p(gp0Var, f9Var);
        gp0Var.I0(qVar.V);
        gp0Var.J0(qVar.W);
        gp0Var.K0(qVar.f348674k);
        gp0Var.x0(true);
        gp0Var.v0(f9Var.I0());
        java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(mj6));
        if (r6Var.m()) {
            gp0Var.B0(r6Var.o());
            if (f188779a) {
                gp0Var.z0(false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "getUrlDataItem, orgnThumbPath:" + r6Var.o());
        } else {
            gp0Var.z0(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "getUrlDataItem, setNotCheckThumb");
            if (i17 == 32 && (i0Var = (com.tencent.mm.pluginsdk.ui.tools.i0) qVar.y(com.tencent.mm.pluginsdk.ui.tools.i0.class)) != null) {
                gp0Var.o0(i0Var.f191690b);
            }
        }
        gp0Var.O0(qVar.f348654f);
        gp0Var.m0(qVar.f348658g);
        gp0Var.Z(qVar.C2);
        gp0Var.h0(i17);
        gp0Var.H0(qVar.Y1);
        com.tencent.mm.pluginsdk.ui.tools.i0 i0Var2 = (com.tencent.mm.pluginsdk.ui.tools.i0) qVar.y(com.tencent.mm.pluginsdk.ui.tools.i0.class);
        if (i0Var2 != null) {
            gp0Var.D0(i0Var2.f191690b);
            gp0Var.E0(i0Var2.f191691c);
            if (i17 == 29 || i17 == 32) {
                r45.hp0 hp0Var = new r45.hp0();
                hp0Var.C = com.tencent.mm.pluginsdk.ui.tools.i0.f(i0Var2);
                gp0Var.J1 = hp0Var;
            }
        }
        if (i17 == 33 && (aVar = (il4.a) qVar.y(il4.a.class)) != null) {
            r45.hp0 hp0Var2 = new r45.hp0();
            hp0Var2.G = il4.a.f(aVar);
            gp0Var.J1 = hp0Var2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "getUrlDataItem, NotCheckThumb:" + gp0Var.D1);
        return gp0Var;
    }

    public static void p(r45.gp0 gp0Var, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.A0() != 1) {
            gp0Var.g0(java.lang.String.valueOf(f9Var.I0()));
            return;
        }
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0()) || f9Var.Q0().equals("filehelper")) {
            gp0Var.g0(java.lang.String.valueOf(f9Var.I0()));
            return;
        }
        gp0Var.g0(f9Var.Q0() + "#" + java.lang.String.valueOf(f9Var.I0()));
    }
}
