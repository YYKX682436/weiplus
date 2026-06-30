package w11;

/* loaded from: classes11.dex */
public class c implements vg3.w4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg3.w4
    public void a(java.lang.Object obj, r45.b50 b50Var, int i17, byte[] bArr, boolean z17, r45.cx4 cx4Var, vg3.z4 z4Var) {
        java.lang.String str;
        java.lang.Object[] objArr;
        int i18 = b50Var.f370530d;
        if (i18 == 13) {
            r45.ho4 ho4Var = (r45.ho4) new r45.ho4().parseFrom(bArr);
            if (1 != ho4Var.f376329e) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BigBallOfMudSyncExtension", "unknown micro blog type:" + ho4Var.f376329e);
                return;
            }
            xg3.r0 y17 = c01.d9.b().y();
            java.lang.String g17 = x51.j1.g(ho4Var.f376328d);
            boolean z18 = ho4Var.f376331g == 1 ? 1 : 0;
            java.lang.Object[] objArr2 = ho4Var.f376330f == 1;
            com.tencent.mm.storage.ka kaVar = (com.tencent.mm.storage.ka) y17;
            kaVar.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
                return;
            }
            com.tencent.mm.storage.ja n07 = kaVar.n0(g17);
            if (n07 == null) {
                kaVar.u0(new com.tencent.mm.storage.ja(g17, z18, true, 2));
                return;
            }
            if (z18 != 0) {
                n07.f195060d |= z18;
            } else {
                n07.f195060d &= -2;
            }
            if (objArr2 == true) {
                n07.f195060d |= objArr2 == true ? 2 : 0;
            } else {
                n07.f195060d &= -3;
            }
            n07.f195057a = 4;
            kaVar.z0(n07);
            return;
        }
        if (i18 == 15) {
            r45.nn4 nn4Var = (r45.nn4) new r45.nn4().parseFrom(bArr);
            if (nn4Var == null) {
                return;
            }
            java.lang.String g18 = x51.j1.g(nn4Var.f381531d);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(g18, true);
            n17.X1(g18);
            n17.M1(x51.j1.g(nn4Var.f381532e));
            n17.R1(x51.j1.g(nn4Var.f381533f));
            n17.S1(x51.j1.g(nn4Var.f381534g));
            n17.g3(nn4Var.f381535h);
            n17.n1(x51.j1.g(nn4Var.f381538n));
            n17.o1(x51.j1.g(nn4Var.f381540p));
            n17.p1(x51.j1.g(nn4Var.f381539o));
            n17.M2(nn4Var.f381541q);
            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
            r0Var.f70537i = -1;
            r0Var.f70529a = n17.d1();
            r0Var.f70532d = nn4Var.I;
            r0Var.f70533e = nn4Var.H;
            r0Var.f70534f = 1;
            int i19 = nn4Var.f381537m;
            if (i19 == 3 || i19 == 4) {
                n17.V2(i19);
                r0Var.f70530b = nn4Var.f381537m;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
            } else if (i19 == 2) {
                n17.V2(3);
                r0Var.f70530b = 3;
                n17.V2(3);
                if (c01.z1.r().equals(n17.d1())) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
                } else {
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.tencent.mm.modelavatar.d1.wi().j(n17.d1(), r0Var);
                }
            }
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).l0(n17);
            qk.o b17 = r01.q3.cj().b1(n17.d1());
            b17.field_username = n17.d1();
            b17.field_brandList = nn4Var.f381530J;
            r45.va0 va0Var = nn4Var.K;
            if (va0Var != null) {
                b17.field_brandFlag = va0Var.f388021d;
                b17.field_brandInfo = va0Var.f388023f;
                b17.field_brandIconURL = va0Var.f388024g;
                java.lang.String str2 = va0Var.f388022e;
                b17.field_extInfo = str2;
                b17.field_attrSyncVersion = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "update extInfo=%s", str2);
            }
            if (r01.q3.cj().replace(b17)) {
                return;
            }
            r01.q3.cj().insert(b17);
            return;
        }
        if (i18 == 33) {
            r45.kn4 kn4Var = (r45.kn4) new r45.kn4().parseFrom(bArr);
            iz5.a.g(null, kn4Var != null);
            java.lang.String str3 = kn4Var.f378845d;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            iz5.a.g(null, (str3 != null ? str3 : "").length() > 0);
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.X1(kn4Var.f378845d);
            z3Var.setType(kn4Var.f378846e);
            z3Var.g3(kn4Var.f378847f);
            z3Var.c3(com.tencent.mm.storage.ha.q(kn4Var.f378853o, kn4Var.f378849h, kn4Var.f378848g));
            z3Var.h3(kn4Var.f378850i);
            com.tencent.mm.modelavatar.r0 r0Var2 = new com.tencent.mm.modelavatar.r0();
            r0Var2.f70537i = -1;
            r0Var2.f70529a = kn4Var.f378845d;
            r0Var2.f70532d = kn4Var.f378855q;
            r0Var2.f70533e = kn4Var.f378854p;
            int i27 = kn4Var.f378851m;
            r0Var2.f70534f = kn4Var.f378852n != 0 ? 1 : 0;
            if (i27 == 3 || i27 == 4) {
                z3Var.V2(i27);
                r0Var2.f70530b = kn4Var.f378851m;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ni().y0(r0Var2);
            } else if (i27 == 2) {
                z3Var.V2(3);
                r0Var2.f70530b = 3;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.wi().j(kn4Var.f378845d, r0Var2);
            } else {
                z3Var.V2(3);
                r0Var2.f70530b = 3;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ni().y0(r0Var2);
            }
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).m0(z3Var);
            return;
        }
        if (i18 == 35) {
            r45.ep4 ep4Var = (r45.ep4) new r45.ep4().parseFrom(bArr);
            iz5.a.g(null, ep4Var != null);
            java.lang.String r17 = c01.z1.r();
            int i28 = ep4Var.f373654d;
            if (i28 == 2) {
                r17 = com.tencent.mm.storage.z3.Y4(r17);
                str = (java.lang.String) c01.d9.b().p().l(12553, null);
            } else {
                str = (java.lang.String) c01.d9.b().p().l(12297, null);
            }
            if (str == null || !str.equals(ep4Var.f373657g)) {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ai().p(r17, true);
                c01.d9.b().p().w(i28 != 2 ? 12297 : 12553, ep4Var.f373657g);
                objArr = true;
            } else {
                objArr = false;
            }
            java.lang.String str4 = ep4Var.f373658h;
            java.lang.String str5 = ep4Var.f373659i;
            com.tencent.mm.modelavatar.r0 r0Var3 = new com.tencent.mm.modelavatar.r0();
            r0Var3.f70529a = r17;
            r0Var3.f70533e = str4;
            r0Var3.f70532d = str5;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(r0Var3.d())) {
                if (i28 == 1) {
                    c01.d9.b().p().w(59, java.lang.Boolean.TRUE);
                } else {
                    c01.d9.b().p().w(60, java.lang.Boolean.TRUE);
                }
            }
            r0Var3.f70534f = 0;
            r0Var3.f70537i = 56;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ep4Var.f373657g)) {
                r0Var3.f70534f = 1;
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ni().y0(r0Var3);
            if (objArr == true) {
                gm0.j1.e().j(new w11.b(this, r17));
                return;
            }
            return;
        }
        if (i18 == 44) {
            b((r45.dw6) new r45.dw6().parseFrom(bArr));
            return;
        }
        if (i18 == 53) {
            r45.cu4 cu4Var = (r45.cu4) new r45.cu4().parseFrom(bArr);
            int i29 = cu4Var.f371837g;
            if (com.tencent.mm.storage.z3.w4(cu4Var.f371834d)) {
                com.tencent.mm.autogen.events.RollbackTencentNewsEvent rollbackTencentNewsEvent = new com.tencent.mm.autogen.events.RollbackTencentNewsEvent();
                rollbackTencentNewsEvent.f54715g.f6606a = cu4Var.f371838h;
                rollbackTencentNewsEvent.e();
                return;
            }
            return;
        }
        if (i18 == 204) {
            com.tencent.mm.autogen.events.SilenceNotifyEvent silenceNotifyEvent = new com.tencent.mm.autogen.events.SilenceNotifyEvent();
            silenceNotifyEvent.f54786g.f8138a = bArr;
            silenceNotifyEvent.e();
            return;
        }
        if (i18 == 219) {
            r45.gz5 gz5Var = (r45.gz5) new r45.gz5().parseFrom(bArr);
            if (gz5Var != null) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().r0(gz5Var.f375672d, gz5Var.f375673e);
                return;
            }
            return;
        }
        if (i18 == 999999) {
            try {
                int a17 = kk.u.a(bArr, 0);
                if (a17 > 0) {
                    java.lang.Thread.sleep(a17);
                    return;
                }
                return;
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BigBallOfMudSyncExtension", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        switch (i18) {
            case 22:
                r45.o04 o04Var = (r45.o04) new r45.o04().parseFrom(bArr);
                r61.v0 v0Var = new r61.v0();
                v0Var.f392968a = o04Var.f381796d;
                v0Var.f392969b = o04Var.f381797e;
                v0Var.f392970c = (int) com.tencent.mm.sdk.platformtools.t8.i1();
                m61.k.Ni().n0(v0Var);
                return;
            case 23:
                r45.p53 p53Var = (r45.p53) new r45.p53().parseFrom(bArr);
                int i37 = p53Var.f382761d;
                if (i37 == 1) {
                    c01.d9.b().p().w(17, java.lang.Integer.valueOf(p53Var.f382762e));
                    return;
                } else {
                    if (i37 != 4) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BigBallOfMudSyncExtension", "unknown function switch id:" + p53Var.f382761d);
                        return;
                    }
                    return;
                }
            case 24:
                r45.sf5 sf5Var = (r45.sf5) new r45.sf5().parseFrom(bArr);
                iz5.a.g(null, sf5Var != null);
                java.lang.String str6 = sf5Var.f385684d;
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str6 == null) {
                    str6 = "";
                }
                iz5.a.g(null, str6.length() > 0);
                if (!com.tencent.mm.storage.z3.s4(sf5Var.f385684d)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: qcontact should ends with @t.qq.com");
                    return;
                }
                com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(sf5Var.f385684d, true);
                if (n18 == null || ((int) n18.E2) == 0) {
                    com.tencent.mm.storage.z3 z3Var2 = new com.tencent.mm.storage.z3(sf5Var.f385684d);
                    z3Var2.setType(z3Var2.getType() | 2);
                    z3Var2.M1(sf5Var.f385685e);
                    z3Var2.n1(sf5Var.f385685e);
                    z3Var2.M2(4);
                    if (((com.tencent.mm.storage.k4) c01.d9.b().q()).i0(z3Var2) == -1) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: insert contact failed");
                        return;
                    }
                    kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                    java.lang.String d17 = z3Var2.d1();
                    ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
                    com.tencent.mm.modelavatar.g.g(d17);
                } else {
                    java.lang.String str7 = sf5Var.f385685e;
                    if (str7 == null) {
                        str7 = "";
                    }
                    java.lang.String d18 = n18.d1();
                    if (!str7.equals(d18 != null ? d18 : "")) {
                        n18.M1(sf5Var.f385685e);
                        n18.n1(sf5Var.f385685e);
                        if (((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(n18.d1(), n18) == -1) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: update contact failed");
                        }
                    }
                }
                com.tencent.mm.autogen.events.QMessageOperationEvent qMessageOperationEvent = new com.tencent.mm.autogen.events.QMessageOperationEvent();
                qMessageOperationEvent.f54633g.getClass();
                qMessageOperationEvent.e();
                return;
            case 25:
                r45.nj6 nj6Var = (r45.nj6) new r45.nj6().parseFrom(bArr);
                iz5.a.g(null, nj6Var != null);
                java.lang.String str8 = nj6Var.f381452d;
                boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str8 == null) {
                    str8 = "";
                }
                iz5.a.g(null, str8.length() > 0);
                if (!com.tencent.mm.storage.z3.G4(nj6Var.f381452d)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: tcontact should ends with @t.qq.com");
                    return;
                }
                com.tencent.mm.storage.z3 n19 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(nj6Var.f381452d, true);
                if (n19 == null || ((int) n19.E2) == 0) {
                    com.tencent.mm.storage.z3 z3Var3 = new com.tencent.mm.storage.z3(nj6Var.f381452d);
                    z3Var3.n1(nj6Var.f381453e);
                    z3Var3.M2(1);
                    z3Var3.setType(z3Var3.getType() | 2);
                    if (((com.tencent.mm.storage.k4) c01.d9.b().q()).i0(z3Var3) == -1) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: insert contact failed");
                        return;
                    }
                    java.lang.String d19 = z3Var3.d1();
                    if (d19 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
                    } else if (d19.endsWith("@t.qq.com")) {
                        com.tencent.mm.modelavatar.r0 r0Var4 = new com.tencent.mm.modelavatar.r0();
                        r0Var4.f70529a = d19;
                        r0Var4.f70530b = 3;
                        r0Var4.f70537i = 3;
                        com.tencent.mm.modelavatar.d1.Ni().y0(r0Var4);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
                    }
                } else {
                    java.lang.String str9 = nj6Var.f381453e;
                    if (str9 == null) {
                        str9 = "";
                    }
                    java.lang.String d110 = n19.d1();
                    if (!str9.equals(d110 != null ? d110 : "")) {
                        n19.n1(nj6Var.f381453e);
                        if (((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(n19.d1(), n19) == -1) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: update contact failed");
                        }
                    }
                }
                com.tencent.mm.autogen.events.TMessageOperationEvent tMessageOperationEvent = new com.tencent.mm.autogen.events.TMessageOperationEvent();
                tMessageOperationEvent.f54877g.getClass();
                tMessageOperationEvent.e();
                return;
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.BigBallOfMudSyncExtension", "doCmd: no processing method, cmd id=" + b50Var.f370530d);
                return;
        }
    }

    public void b(r45.dw6 dw6Var) {
        r45.cu5 cu5Var;
        int i17;
        int i18;
        java.util.LinkedList linkedList;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "snsExtFlag:%s, snsExtFlagEx:%s, snsPrivacyRecent:%s", java.lang.Integer.valueOf(dw6Var.f372789d.f371428d), java.lang.Integer.valueOf(dw6Var.f372789d.f371431g), java.lang.Integer.valueOf(dw6Var.f372789d.f371432h));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "processModUserInfoExt snsExtFlag:%s, snsExtFlagEx:%s, snsPrivacyRecent:%s", java.lang.Integer.valueOf(dw6Var.f372789d.f371428d), java.lang.Integer.valueOf(dw6Var.f372789d.f371431g), java.lang.Integer.valueOf(dw6Var.f372789d.f371432h));
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(2, null);
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "processModUserInfoExt, userName:%s", str2);
        if (p94.w0.c() != null) {
            ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).z1(str2, dw6Var.f372789d);
        }
        if (o25.w1.a() != null) {
            p94.i0 a17 = o25.w1.a();
            r45.cb6 cb6Var = dw6Var.f372789d;
            com.tencent.mm.plugin.sns.storage.a2 a2Var = (com.tencent.mm.plugin.sns.storage.a2) a17;
            a2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            if (cb6Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                a2Var.f165924f.P6(cb6Var.f371430f);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "finderSetting:%s", java.lang.Long.valueOf(dw6Var.f372800p0));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC, java.lang.Long.valueOf(dw6Var.f372800p0));
        qk.o b17 = r01.z.b(c01.z1.r());
        if (b17 == null) {
            b17 = new qk.o();
        }
        b17.field_username = str2;
        b17.field_brandList = dw6Var.f372790e;
        if (b17.G0() && b17.D0(false) != null && b17.D0(false).d() != null && !com.tencent.mm.sdk.platformtools.t8.K0(b17.y0())) {
            java.lang.String enterpriseFather = b17.y0();
            b17.field_enterpriseFather = enterpriseFather;
            kotlin.jvm.internal.o.g(enterpriseFather, "enterpriseFather");
            bn0.g gVar = bn0.g.f22779a;
            bn0.a f17 = gVar.f(str2);
            gVar.j(str2, new bn0.a(f17 != null ? f17.f22768a : 0, f17 != null ? f17.f22769b : 0, f17 != null ? f17.f22770c : 0, f17 != null ? f17.f22771d : 0, enterpriseFather));
        }
        if (!r01.q3.cj().replace(b17)) {
            r01.q3.cj().insert(b17);
        }
        int i19 = dw6Var.f372793h;
        int i27 = dw6Var.f372794i;
        int i28 = dw6Var.f372796m;
        c01.d9.b().p().w(135175, java.lang.Integer.valueOf(i19));
        c01.d9.b().p().w(135176, java.lang.Integer.valueOf(i27));
        c01.d9.b().p().w(135177, java.lang.Integer.valueOf(i28));
        c01.d9.b().p().w(144385, java.lang.Integer.valueOf(dw6Var.f372806u));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.I));
        c01.je.m(dw6Var.I);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SMCRYPTO_FLAG_TYPE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.f372813y0));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "sync do cmd smcrypto flag:%d", java.lang.Integer.valueOf(dw6Var.f372813y0));
        xp1.d.f();
        c01.d9.b().p().w(339975, java.lang.Integer.valueOf(dw6Var.G));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "hy: sync do cmd pay wallet type: %d %d", java.lang.Integer.valueOf(dw6Var.G), java.lang.Integer.valueOf(dw6Var.I));
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_PROFILE_WEIDIANINFO_STRING;
        java.lang.String str3 = dw6Var.H;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        p17.x(u3Var, str3);
        c01.d9.b().p().w(147457, java.lang.Long.valueOf(dw6Var.f372788J));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.ExtStatus:%s", java.lang.Long.valueOf(dw6Var.f372788J));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(dw6Var.f372814y1));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", dw6Var.f372814y1);
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.ExtStatus2:%s", java.lang.Long.valueOf(dw6Var.f372814y1));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_EXT_USER_STATUS_INT_SYNC, java.lang.Integer.valueOf(dw6Var.L));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.UserStatus:%s", java.lang.Integer.valueOf(dw6Var.L));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, dw6Var.Q);
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.BindXMail:%s", dw6Var.Q);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, java.lang.Long.valueOf(dw6Var.M));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PaySetting:%s", java.lang.Long.toBinaryString(dw6Var.M));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_F2F_RING_TONE_STRING, dw6Var.K);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_BIND_MOBILE_TRANSFER_INT_SYNC, java.lang.Integer.valueOf(dw6Var.N));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PayBindMobileTransfer:%s", java.lang.Integer.valueOf(dw6Var.N));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, dw6Var.R);
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PatSuffix:%s", dw6Var.R);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, java.lang.Integer.valueOf(dw6Var.S));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.PatSuffixVersion:%d", java.lang.Integer.valueOf(dw6Var.S));
        gm0.j1.u().c().w(274436, com.tencent.mm.sdk.platformtools.t8.u1(dw6Var.f372812y, "CN"));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.RegCountry:%s", dw6Var.f372812y);
        int i29 = dw6Var.S;
        com.tencent.mm.sdk.platformtools.o4 o4Var = lp3.p.f320302a;
        try {
            lp3.p.c(str2, "pat_user_suffix_version", java.lang.Integer.valueOf(i29));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PatUserMMKV", e17, "", new java.lang.Object[0]);
        }
        c01.d9.b().p().w(147458, java.lang.Long.valueOf(dw6Var.f372811x1));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.DiscoveryPageCtrlFlag:%s", java.lang.Long.valueOf(dw6Var.f372811x1));
        if (!di4.i.f232782a.e()) {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).uj(dw6Var.X, dw6Var.Y, java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusSkipBigBallSyncDeleteSelf()) == 0));
        }
        boolean z18 = (dw6Var.f372788J & 1099511627776L) != 0;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z18));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "mod contact write isTeenModeEnable: %b", java.lang.Boolean.valueOf(z18));
        int i37 = dw6Var.T;
        boolean a07 = c01.e2.a0();
        if (a07) {
            i37 = 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt write teenMode rang %b %d", java.lang.Boolean.valueOf(a07), java.lang.Integer.valueOf(i37));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, java.lang.Integer.valueOf(i37));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.U));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_MINI_PROGRAM_RANGE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.V));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_EMOTICON_RANGE_INT_SYNC, java.lang.Integer.valueOf(dw6Var.F1));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "ApnsBannerDisplayContentSetting: %d", java.lang.Integer.valueOf(dw6Var.I1));
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC;
        c17.x(u3Var2, java.lang.Integer.valueOf(dw6Var.I1));
        bn0.g.f22779a.g("USERINFO_SETTING_NOTIFICATION_BANNER_TYPE_NEW_INT_SYNC", dw6Var.I1);
        w14.d dVar = w14.d.f442234d;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            w14.b bVar = w14.c.f442226e;
            java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().m(u3Var2, null);
            w14.c a18 = bVar.a(num == null ? 0 : num.intValue());
            if (a18 != w14.d.f442235e) {
                w14.d.f442235e = a18;
                w14.d.f442238h = a18;
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", "update banner type: " + a18);
            }
            long i38 = c01.z1.i();
            if (i38 != w14.d.f442236f) {
                w14.d.f442236f = i38;
                w14.d.f442237g = i38;
                r26.a.a(2);
                java.lang.String l17 = java.lang.Long.toString(i38, 2);
                kotlin.jvm.internal.o.f(l17, "toString(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationHelper", "update extStatus: ".concat(l17));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsNotificationHelper", "updateBannerType not main process");
        }
        boolean z19 = (dw6Var.f372788J & 18014398509481984L) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isCareMode:%s, local:%s, value:%s, ExtStatus:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(j65.e.b()), java.lang.Long.valueOf(dw6Var.f372788J & 18014398509481984L), java.lang.Long.valueOf(dw6Var.f372788J));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z19));
        j65.e.n(true);
        boolean z27 = (dw6Var.f372814y1 & 16) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTTSOpen:%s, local:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(j65.e.f()), java.lang.Long.valueOf(dw6Var.f372814y1));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, java.lang.Boolean.valueOf(z27));
        j65.e.o();
        boolean z28 = (dw6Var.f372814y1 & 16777216) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isMuteOpen:%s, local:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z28), java.lang.Boolean.valueOf(j65.e.g()), java.lang.Long.valueOf(dw6Var.f372814y1));
        j65.e.l(z28);
        boolean z29 = (dw6Var.f372814y1 & 33554432) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isBigFontClose:%s, local:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z29), java.lang.Boolean.valueOf(j65.e.e()), java.lang.Long.valueOf(dw6Var.f372814y1));
        j65.e.k(!z29);
        r45.zu zuVar = new r45.zu();
        try {
            zuVar.parseFrom(dw6Var.J1.f371841f.f192156a);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("HearingAid_");
            long n17 = j62.e.g().n();
            if (n17 == 0) {
                str = "0";
            } else if (n17 > 0) {
                str = java.lang.Long.toString(n17, 10);
            } else {
                char[] cArr = new char[64];
                long j17 = (n17 >>> 1) / 5;
                long j18 = 10;
                char forDigit = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
                int i39 = 63;
                cArr[63] = forDigit;
                for (long j19 = 0; j17 > j19; j19 = 0) {
                    i39--;
                    cArr[i39] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                    j17 /= j18;
                }
                str = new java.lang.String(cArr, i39, 64 - i39);
            }
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "hearingAidMode:%s, uin is %s", java.lang.Long.valueOf(zuVar.f392371d), sb7);
            com.tencent.mm.sdk.platformtools.o4.M(sb7).putInt("hearing_aid_mode_remote", (int) zuVar.f392371d);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BigBallOfMudSyncExtension", e18.getMessage());
        }
        r45.gx6 gx6Var = dw6Var.C1;
        if (gx6Var == null || (i18 = gx6Var.f375631d) <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "verifyContentList is null", java.lang.Integer.valueOf(gx6Var.f375631d));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_COMMON_SAY_HI_STRING_SYNC, "");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "verifyContentList Count:%s", java.lang.Integer.valueOf(i18));
            java.util.LinkedList linkedList2 = gx6Var.f375632e;
            if (linkedList2 != null && linkedList2.size() > 0) {
                r45.fx6 fx6Var = (r45.fx6) gx6Var.f375632e.get(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "verifyContentList VerifyContent:%s", fx6Var.f374718d);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_COMMON_SAY_HI_STRING_SYNC, fx6Var.f374718d);
                r45.dz3 dz3Var = fx6Var.f374719e;
                r45.v60 v60Var = (dz3Var == null || (linkedList = dz3Var.f372869e) == null) ? null : (r45.v60) kz5.n0.Z(linkedList);
                if (v60Var != null) {
                    java.lang.String str4 = v60Var.f387932d;
                    if (!(str4 == null || r26.n0.N(str4))) {
                        java.lang.String str5 = v60Var.f387933e;
                        if (!(str5 == null || r26.n0.N(str5))) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUploader", "trySaveCommonSayHiPicture() called imgInfo.Url:" + v60Var.f387932d + " imgInfo.AESKey:" + v60Var.f387933e);
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_COMMON_SAY_HI_IMG_INFO_STRING_SYNC, android.util.Base64.encodeToString(dz3Var.toByteArray(), 0));
                            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                            if (lifecycleScope != null) {
                                kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new hr3.zf(v60Var, null), 2, null);
                            }
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUploader", "trySaveCommonSayHiPicture() called USERINFO_COMMON_SAY_HI_STRING_SYNC set null");
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_COMMON_SAY_HI_IMG_INFO_STRING_SYNC, "");
            }
        }
        long j27 = dw6Var.f372814y1;
        boolean z37 = (4096 & j27) != 0;
        boolean z38 = (j27 & 32768) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsMute:%s, isTXNewsMuteInit:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z37), java.lang.Boolean.valueOf(z38), java.lang.Long.valueOf(dw6Var.f372814y1));
        if (z38) {
            com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("newsapp", true);
            if (c01.e2.P(n18) != z37) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsMute changed, current:%s", java.lang.Boolean.valueOf(z37));
                if (z37) {
                    c01.e2.p0(n18, false);
                } else {
                    c01.e2.z0(n18, false);
                }
            }
        }
        long j28 = dw6Var.f372814y1;
        boolean z39 = (8192 & j28) != 0;
        boolean z47 = (j28 & 65536) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsTop:%s, isTXNewsTopInit:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z39), java.lang.Boolean.valueOf(z47), java.lang.Long.valueOf(dw6Var.f372814y1));
        if (z47 && ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("newsapp", true).w2() != z39) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isTXNewsTop changed, current:%s", java.lang.Boolean.valueOf(z39));
            if (z39) {
                c01.e2.t0("newsapp", true, false);
            } else {
                c01.e2.B0("newsapp", true, false);
            }
        }
        boolean z48 = (dw6Var.f372814y1 & 131072) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailMute:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z48), java.lang.Long.valueOf(dw6Var.f372814y1));
        com.tencent.mm.storage.z3 n19 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("qqmail", true);
        if (c01.e2.P(n19) != z48) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailMute changed, current:%s", java.lang.Boolean.valueOf(z48));
            if (z48) {
                c01.e2.p0(n19, false);
            } else {
                c01.e2.z0(n19, false);
            }
        }
        boolean z49 = (dw6Var.f372814y1 & 262144) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailTop:%s, ExtStatus2:%s", java.lang.Boolean.valueOf(z49), java.lang.Long.valueOf(dw6Var.f372814y1));
        if (n19.w2() != z49) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "isQQMailTop changed, current:%s", java.lang.Boolean.valueOf(z49));
            if (z49) {
                c01.e2.t0("qqmail", true, false);
            } else {
                c01.e2.B0("qqmail", true, false);
            }
        }
        boolean z57 = (dw6Var.f372788J & 67108864) != 0;
        if (z57) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_VOIP_CLOSE_SOUND_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z57));
        }
        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
        r0Var.f70537i = -1;
        r0Var.f70529a = str2;
        r0Var.f70533e = dw6Var.f372798o;
        r0Var.f70532d = dw6Var.f372799p;
        r0Var.f70534f = 1;
        r0Var.f70530b = 3;
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
        java.lang.String str6 = dw6Var.f372808w;
        c01.d9.b().p().w(274433, dw6Var.f372809x);
        c01.d9.b().p().w(274434, str6);
        if (dw6Var.C != null) {
            c01.d9.b().p().w(286721, dw6Var.C.f372202e);
            c01.d9.b().p().w(286722, dw6Var.C.f372201d);
            c01.d9.b().p().w(286723, dw6Var.C.f372203f);
        }
        r45.q55 q55Var = dw6Var.E;
        if (q55Var != null && (cu5Var = q55Var.f383696e) != null && (i17 = cu5Var.f371839d) > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "tomgest PatternLockInfo %d", java.lang.Integer.valueOf(i17));
            com.tencent.mm.autogen.events.UpdateGestureProtectInfoEvent updateGestureProtectInfoEvent = new com.tencent.mm.autogen.events.UpdateGestureProtectInfoEvent();
            updateGestureProtectInfoEvent.f54919g.f8495a = dw6Var.E;
            updateGestureProtectInfoEvent.e();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "handling xagreement configs");
        r45.kg7 kg7Var = dw6Var.W;
        if (kg7Var != null) {
            c01.je.l(kg7Var.f378689d, kg7Var.f378690e);
        }
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_LQT_VERSION_INT_SYNC;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "LQTVersion Old: %s New: %s", c18.m(u3Var3, 0), java.lang.Integer.valueOf(dw6Var.D1));
        gm0.j1.u().c().x(u3Var3, java.lang.Integer.valueOf(dw6Var.D1));
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "[+] synced yuanbao signed agreement infos.");
        vh0.d1 d1Var = (vh0.d1) i95.n0.c(vh0.d1.class);
        r45.l06 l06Var = dw6Var.H1;
        ((vh0.f2) d1Var).getClass();
        if (l06Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatBotAgreementService", "[-] saveSignedAgreementInfo: value is null.");
        } else {
            xh0.a.z0().J0(str2, l06Var.f379063e);
        }
        if ((dw6Var.K1 & 1) > 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CHATROOM_MUTE_DETAIL_CLIENT_GRAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CHATROOM_MUTE_DETAIL_CLIENT_GRAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        }
        if ((dw6Var.K1 & 2) > 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_OTHER_SEARCH_METHODS_VISIBLE_CLIENT_GRAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_OTHER_SEARCH_METHODS_VISIBLE_CLIENT_GRAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallOfMudSyncExtension", "userinfoExt.ClientGrayFlag: %d", java.lang.Long.valueOf(dw6Var.K1));
    }
}
