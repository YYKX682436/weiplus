package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes11.dex */
public class v implements vg3.w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.messenger.foundation.a0 f148733a = new com.tencent.mm.plugin.messenger.foundation.a0(null);

    public static void b(final r45.tn4 tn4Var, java.lang.String str, byte[] bArr, boolean z17, boolean z18, int i17) {
        com.tencent.mm.storage.z3 z3Var;
        r45.d74 d74Var;
        boolean z19;
        if (tn4Var == null) {
            com.tencent.mars.xlog.Log.f("MicroMsg.ContactSyncExtension", "unable to parse mod contact");
            return;
        }
        java.lang.String g17 = !com.tencent.mm.sdk.platformtools.t8.K0(tn4Var.P1) ? tn4Var.P1 : x51.j1.g(tn4Var.f386589d);
        java.lang.String str2 = tn4Var.Z;
        java.lang.String str3 = str2 == null ? "" : str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17) && com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactSyncExtension", "processModContact user is null user:%s enuser:%s", g17, str3);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "processModContact begin username %s mobileHash %s mobileFullHash %s modContactScene %s fromGetContactService:%s", tn4Var.f386589d, tn4Var.f386613y0, tn4Var.f386595l1, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.storage.z3 e07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e0(g17);
        if (e07 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "oldContact.getEncryptUsername() :%s %s", e07.J0(), java.lang.Integer.valueOf((int) e07.E2));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "oldContact is null ");
        }
        if (!com.tencent.mm.storage.z3.R4(g17) && e07 != null && g17.equals(e07.J0()) && com.tencent.mm.storage.z3.E4(g17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactSyncExtension", "cat's replace user with stranger  user:%s", g17);
            return;
        }
        if (e07 == null || (z3Var = e07.t3()) == null) {
            z3Var = e07;
            e07 = null;
        }
        if (e07 == null) {
            e07 = new com.tencent.mm.storage.z3(g17);
        }
        e07.X1(g17);
        e07.k1(tn4Var.f386586J);
        e07.setType(tn4Var.f386596m & tn4Var.f386597n);
        e07.W1(tn4Var.U1 & tn4Var.V1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "processModContactType user:%s cmdMC.BitMask:%s cmdMC.BitVal:%s BitMask2:%s BitValue2:%s, uctTypeIsConv:%s uctUiTypeIsConv:%s uctIsTop:%s isMute:%s", g17, java.lang.Integer.valueOf(tn4Var.f386596m), java.lang.Integer.valueOf(tn4Var.f386597n), java.lang.Long.valueOf(tn4Var.U1), java.lang.Long.valueOf(tn4Var.V1), java.lang.Boolean.valueOf(e07.z2()), java.lang.Boolean.valueOf(e07.A2()), java.lang.Boolean.valueOf(e07.w2()), java.lang.Boolean.valueOf(c01.e2.P(e07)));
        if (z17 && z3Var != null && ((int) z3Var.E2) > 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactSyncExtension", "processModContact bad GETCONTACT can't give the REAL_TYPE (mariohuang), user:%s old:%d get:%d", g17, java.lang.Integer.valueOf(z3Var.getType()), java.lang.Integer.valueOf(e07.getType()));
            if ((e07.getType() & 1) == 0 && (z3Var.getType() & 1) == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "processModContact resetNoContact!!");
                z19 = true;
            } else {
                z19 = false;
            }
            e07.setType(e07.getType() | z3Var.getType());
            e07.W1(e07.c1() | z3Var.c1());
            if (z19) {
                e07.s3();
            }
        }
        if ("filehelper".equals(g17)) {
            int type = e07.getType();
            l75.e0 e0Var = com.tencent.mm.contact.s.G2;
            e07.setType(type | 1);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            e07.K1(str3);
        } else if (z3Var != null && ((int) z3Var.E2) > 0) {
            e07.K1(z3Var.J0());
        }
        e07.E2 = z3Var == null ? 0L : (int) z3Var.E2;
        e07.M1(x51.j1.g(tn4Var.f386590e));
        e07.R1(x51.j1.g(tn4Var.f386591f));
        e07.S1(x51.j1.g(tn4Var.f386592g));
        e07.g3(tn4Var.f386593h);
        e07.M2(tn4Var.f386604s);
        e07.D1(x51.j1.g(tn4Var.f386607v));
        e07.J2(tn4Var.f386608w);
        e07.Z2(tn4Var.B);
        e07.c3(com.tencent.mm.storage.ha.q(tn4Var.S, tn4Var.f386612y, tn4Var.f386615z));
        e07.h3(tn4Var.A);
        e07.Z1(tn4Var.D);
        e07.o3(tn4Var.E);
        if (tn4Var.G == 9 && !com.tencent.mm.sdk.platformtools.t8.K0(tn4Var.M1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "fix addContactScene!");
            tn4Var.G = 14;
        }
        e07.j3(tn4Var.G);
        e07.a2(tn4Var.M);
        e07.b2(tn4Var.L);
        e07.U1(tn4Var.M1);
        e07.F2(tn4Var.O1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "username:%s nickname:%s SourceExtInfo:%s source:%s ChatroomBusinessType:%s", e07.d1(), com.tencent.mm.sdk.platformtools.t8.G1(e07.P0()), e07.Z0(), java.lang.Integer.valueOf(tn4Var.G), java.lang.Long.valueOf(tn4Var.O1));
        if (c01.e2.Y(tn4Var.H)) {
            e07.p3(tn4Var.H);
        }
        if (e07.X4()) {
            e07.K2((int) com.tencent.mm.sdk.platformtools.t8.i1());
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            e07.C2(str);
        }
        boolean z27 = j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigContactFieldUpdateControl()) == 1;
        r45.hs0 G = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().G(g17);
        r45.hs0 hs0Var = tn4Var.f386588b2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = G != null ? G.toJSON() : "";
        objArr[1] = hs0Var != null ? hs0Var.toJSON() : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "processModContact localFieldUpdateInfo:%s srvFieldUpdateInfo:%s", objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "remark (%s -> %s), remarkpyshort:%s, nickname:%s, pyinitial:%s, quanpin:%s isFieldUpdateOpen:%s", e07.w0(), x51.j1.g(tn4Var.f386599p), x51.j1.g(tn4Var.f386602q), com.tencent.mm.sdk.platformtools.t8.G1(x51.j1.g(tn4Var.f386590e)), x51.j1.g(tn4Var.f386591f), x51.j1.g(tn4Var.f386592g), java.lang.Boolean.valueOf(z27));
        r45.hs0 hs0Var2 = tn4Var.f386588b2;
        com.tencent.mm.storage.z3 z3Var2 = e07;
        boolean z28 = z27;
        com.tencent.mm.plugin.messenger.foundation.c0.b(z3Var2, G, hs0Var2, 10, z28, new com.tencent.mm.plugin.messenger.foundation.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$a
            @Override // com.tencent.mm.plugin.messenger.foundation.u
            public final void a(com.tencent.mm.storage.z3 z3Var3) {
                z3Var3.n1(x51.j1.g(r45.tn4.this.f386599p));
            }
        });
        com.tencent.mm.plugin.messenger.foundation.c0.b(z3Var2, G, hs0Var2, 12, z28, new com.tencent.mm.plugin.messenger.foundation.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$b
            @Override // com.tencent.mm.plugin.messenger.foundation.u
            public final void a(com.tencent.mm.storage.z3 z3Var3) {
                z3Var3.o1(x51.j1.g(r45.tn4.this.f386603r));
            }
        });
        com.tencent.mm.plugin.messenger.foundation.c0.b(z3Var2, G, hs0Var2, 11, z28, new com.tencent.mm.plugin.messenger.foundation.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$c
            @Override // com.tencent.mm.plugin.messenger.foundation.u
            public final void a(com.tencent.mm.storage.z3 z3Var3) {
                z3Var3.p1(x51.j1.g(r45.tn4.this.f386602q));
            }
        });
        com.tencent.mm.plugin.messenger.foundation.c0.b(z3Var2, G, hs0Var2, 61, z28, new com.tencent.mm.plugin.messenger.foundation.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$d
            @Override // com.tencent.mm.plugin.messenger.foundation.u
            public final void a(com.tencent.mm.storage.z3 z3Var3) {
                z3Var3.r1(r45.tn4.this.F1);
            }
        });
        com.tencent.mm.plugin.messenger.foundation.c0.b(z3Var2, G, hs0Var2, 59, z28, new com.tencent.mm.plugin.messenger.foundation.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$e
            @Override // com.tencent.mm.plugin.messenger.foundation.u
            public final void a(com.tencent.mm.storage.z3 z3Var3) {
                z3Var3.d3(r45.tn4.this.D1);
            }
        });
        com.tencent.mm.plugin.messenger.foundation.c0.b(z3Var2, G, hs0Var2, 60, z28, new com.tencent.mm.plugin.messenger.foundation.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$f
            @Override // com.tencent.mm.plugin.messenger.foundation.u
            public final void a(com.tencent.mm.storage.z3 z3Var3) {
                z3Var3.e3(r45.tn4.this.E1);
            }
        });
        com.tencent.mm.plugin.messenger.foundation.c0.b(z3Var2, G, hs0Var2, 87, z28, new com.tencent.mm.plugin.messenger.foundation.u() { // from class: com.tencent.mm.plugin.messenger.foundation.v$$g
            @Override // com.tencent.mm.plugin.messenger.foundation.u
            public final void a(com.tencent.mm.storage.z3 z3Var3) {
                z3Var3.u1(r45.tn4.this.Z1);
            }
        });
        byte[] d17 = x51.j1.d(tn4Var.W1);
        if (com.tencent.mm.sdk.platformtools.t8.M0(d17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "ContactExtraInfoBuf is null!");
            e07.O2(null);
        } else {
            r45.o80 o80Var = new r45.o80();
            try {
                o80Var.parseFrom(d17);
                e07.O2(o80Var);
            } catch (java.io.IOException unused) {
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j(g17);
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactSyncExtension", "[processModContact] cmdBuf is null! user:%s", g17);
        } else {
            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            Bi.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContactStorage", "getCmdbuf failed user is null");
            } else {
                com.tencent.mm.storage.a4 a4Var = new com.tencent.mm.storage.a4();
                a4Var.field_cmdbuf = bArr;
                a4Var.field_username = g17;
                l75.k0 k0Var = Bi.f195071d;
                if (k0Var.p("ContactCmdBuf", a4Var.convertTo(), "username=?", new java.lang.String[]{g17}) <= 0) {
                    k0Var.l("ContactCmdBuf", dm.i4.COL_USERNAME, a4Var.convertTo());
                }
            }
        }
        e07.z1(tn4Var.C1);
        r45.b5 b5Var = tn4Var.f386601p1;
        if (b5Var != null && (d74Var = b5Var.f370529d) != null) {
            e07.W2(d74Var.f372202e);
            e07.X2(tn4Var.f386601p1.f370529d.f372201d);
            e07.Y2(tn4Var.f386601p1.f370529d.f372203f);
        }
        if ((z3Var == null || z3Var.r2() || !e07.r2()) ? false : true) {
            com.tencent.mm.plugin.messenger.foundation.o.f148701a.a(g17, str3);
        }
        if (c01.e2.D(g17)) {
            e07.U2();
        }
        if (e07.k2()) {
            e07.setType(e07.getType() & (-65));
        }
        java.lang.String str4 = tn4Var.H1;
        if (!com.tencent.mm.sdk.platformtools.t8.D0(e07.D1, str4)) {
            e07.D1 = str4;
            e07.f236581u = true;
            e07.j2();
        }
        e07.G1 = tn4Var.L1;
        e07.f236581u = true;
        e07.setFromType(i17);
        java.lang.Object[] objArr2 = new java.lang.Object[24];
        objArr2[0] = g17;
        objArr2[1] = str3;
        objArr2[2] = java.lang.Integer.valueOf((int) e07.E2);
        objArr2[3] = com.tencent.mm.sdk.platformtools.t8.G1(e07.P0());
        objArr2[4] = e07.U0();
        objArr2[5] = java.lang.Integer.valueOf(e07.F0());
        objArr2[6] = java.lang.Integer.valueOf(e07.getType());
        objArr2[7] = java.lang.Integer.valueOf(tn4Var.f386596m);
        objArr2[8] = java.lang.Integer.valueOf(tn4Var.f386597n);
        objArr2[9] = java.lang.Long.valueOf(e07.c1());
        objArr2[10] = java.lang.Long.valueOf(tn4Var.U1);
        objArr2[11] = java.lang.Long.valueOf(tn4Var.V1);
        objArr2[12] = java.lang.Integer.valueOf(e07.Q);
        objArr2[13] = java.lang.Integer.valueOf(e07.T);
        objArr2[14] = tn4Var.S;
        objArr2[15] = tn4Var.f386612y;
        objArr2[16] = tn4Var.f386615z;
        objArr2[17] = java.lang.Integer.valueOf(e07.getSource());
        objArr2[18] = e07.D0();
        objArr2[19] = java.lang.Boolean.valueOf(z17);
        objArr2[20] = java.lang.Boolean.valueOf(tn4Var.D1 == null);
        java.lang.String str5 = tn4Var.D1;
        objArr2[21] = java.lang.Integer.valueOf(str5 == null ? 0 : str5.length());
        java.lang.String str6 = tn4Var.D1;
        objArr2[22] = str6 != null ? com.tencent.mm.sdk.platformtools.t8.G1(str6) : "";
        objArr2[23] = java.lang.Integer.valueOf(tn4Var.D);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "processModContact:user[%s,%s] id:%d nick:%s pin:%s delflag:%d type:%d [%d,%d] uitype:%d [%d,%d] contype:%d notify:%d region[%s,%s,%s] src:%d LabelIDList:%s fromGetContactService:%b remark_Description:(%s,%s,%s) verifyFlag:%d", objArr2);
        com.tencent.mm.storage.z3 z3Var3 = e07;
        com.tencent.mm.storage.z3 z3Var4 = z3Var;
        java.lang.String str7 = str3;
        f148733a.b0(z3Var3, z3Var, tn4Var, bArr, z18);
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(vg3.o4.class)).all()).iterator();
        while (it.hasNext()) {
            ((vg3.o4) ((fs.q) it.next()).get()).b0(z3Var3, z3Var4, tn4Var, bArr, z18);
        }
        com.tencent.mm.contact.a.d(z3Var3);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n0(g17, com.tencent.mm.plugin.messenger.foundation.c0.a(G, tn4Var.f386588b2));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(z3Var3);
        } else {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q0(str7, z3Var3);
        }
        f148733a.M(z3Var3, z3Var4, tn4Var, bArr, z18);
        java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(vg3.o4.class)).all()).iterator();
        while (it6.hasNext()) {
            ((vg3.o4) ((fs.q) it6.next()).get()).M(z3Var3, z3Var4, tn4Var, bArr, z18);
        }
        boolean z29 = (z3Var3.getType() & 2048) != 0;
        boolean K = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(z3Var3.d1());
        boolean z37 = (z3Var4 == null || (z3Var4.getType() & 2048) == 0) ? false : true;
        if (!z29 || K) {
            if (!z29 && K) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(z3Var3.d1());
            }
        } else if (!z37) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(z3Var3.d1());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "processModContact end username:%s isSnsBlackContact:%s uctIsTop:%s convIsTop:%s oldIsTop:%s", g17, java.lang.Boolean.valueOf(z3Var3.x2()), java.lang.Boolean.valueOf(z29), java.lang.Boolean.valueOf(K), java.lang.Boolean.valueOf(z37));
    }

    @Override // vg3.w4
    public void a(java.lang.Object obj, r45.b50 b50Var, int i17, byte[] bArr, boolean z17, r45.cx4 cx4Var, vg3.z4 z4Var) {
        com.tencent.mm.storage.z3 n17;
        int i18 = b50Var.f370530d;
        if (i18 != 2) {
            if (i18 == 4) {
                r45.xb0 xb0Var = (r45.xb0) new r45.xb0().parseFrom(bArr);
                java.lang.String g17 = x51.j1.g(xb0Var.f389941d);
                boolean R4 = com.tencent.mm.storage.z3.R4(g17);
                com.tencent.mm.plugin.messenger.foundation.o oVar = com.tencent.mm.plugin.messenger.foundation.o.f148701a;
                com.tencent.mm.plugin.messenger.foundation.a0 a0Var = f148733a;
                if (R4) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "processDelContact user:%s, but not del conv", g17);
                    com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true);
                    a0Var.m1(n18, xb0Var);
                    java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(vg3.o4.class)).all()).iterator();
                    while (it.hasNext()) {
                        ((vg3.o4) ((fs.q) it.next()).get()).m1(n18, xb0Var);
                    }
                    oVar.c(n18);
                    java.util.Set set = c01.e2.f37117a;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(g17) && (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true)) != null) {
                        n17.s3();
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(g17, n17);
                    }
                    ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).wi(g17);
                    vg3.b5.b(4, xb0Var);
                    return;
                }
                boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigDelContactDelConv()) == 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncExtension", "processDelContact user:%s isDelContactDelConv:%s", g17, java.lang.Boolean.valueOf(z18));
                if (z18) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(g17);
                } else if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(g17)) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(g17);
                }
                com.tencent.mm.storage.z3 n19 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true);
                a0Var.m1(n19, xb0Var);
                java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(vg3.o4.class)).all()).iterator();
                while (it6.hasNext()) {
                    ((vg3.o4) ((fs.q) it6.next()).get()).m1(n19, xb0Var);
                }
                oVar.c(n19);
                c01.e2.G0(g17);
                vg3.b5.b(4, xb0Var);
                return;
            }
            if (i18 != 17) {
                return;
            }
        }
        r45.tn4 tn4Var = (r45.tn4) new r45.tn4().parseFrom(bArr);
        if (!z17) {
            bArr = null;
        }
        b(tn4Var, "", bArr, false, z17, 0);
    }
}
