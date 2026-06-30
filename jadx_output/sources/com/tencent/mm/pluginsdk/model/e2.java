package com.tencent.mm.pluginsdk.model;

/* loaded from: classes9.dex */
public abstract class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f189286a = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f189287b;

    static {
        f189287b = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavCheckCdnFixSwitch()) == 1;
    }

    public static void a(r45.gp0 gp0Var) {
        r45.ip0 ip0Var;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var == null || (ip0Var = hp0Var.f376353d) == null) {
            return;
        }
        java.lang.String str = ip0Var.f377231f;
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(str)) {
            java.lang.String Vi = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Vi(str);
            java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(Vi, ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ui(str));
            if (com.tencent.mm.sdk.platformtools.t8.K0(fj6)) {
                return;
            }
            if ("3552365301".equals(Vi)) {
                fj6 = "@" + fj6;
            }
            gp0Var.G0(fj6);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x008c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0095. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0868  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r16, com.tencent.mm.autogen.events.DoFavoriteEvent r17, com.tencent.mm.storage.f9 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 3418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.e2.b(android.content.Context, com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f9, boolean):boolean");
    }

    public static void c(com.tencent.mm.storage.f9 f9Var, r45.hp0 hp0Var, r45.tq0 tq0Var) {
        hp0Var.f376369w = ot0.g0.e(f9Var, tq0Var);
    }

    public static boolean d(android.content.Context context, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String format;
        r45.gp0 n17;
        com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(f9Var.j());
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f376353d = k(f9Var);
        int i17 = D3.f196374q;
        java.util.Set set = c01.e2.f37117a;
        if (com.tencent.mm.storage.z3.D3(i17)) {
            n17 = new r45.gp0();
            n17.g0(m(f9Var));
            n17.h0(16);
            n17.m0(f9Var.j());
            n17.z0(true);
            n17.x0(true);
            n17.J1 = hp0Var;
            n17.k0(o(hp0Var.f376353d));
            n17.l0(p(hp0Var.f376353d));
            n17.v0(f9Var.I0());
            if (com.tencent.mm.storage.z3.m4(hp0Var.f376353d.f377237o)) {
                java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(hp0Var.f376353d.f377237o, true));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    n17.G0(a17);
                }
            }
        } else if (com.tencent.mm.storage.z3.m4(D3.f196358a) || ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Bi(D3)) {
            java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni(D3.f196383z, "openim_card_type_name", j41.a0.TYPE_WORDING);
            if (android.text.TextUtils.isEmpty(Ni)) {
                format = context.getResources().getString(com.tencent.mm.R.string.f490447vb) + " " + D3.c();
            } else {
                format = java.lang.String.format("[%s]", Ni);
            }
            n17 = n(f9Var, format, hp0Var);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(context.getString(com.tencent.mm.R.string.f490447vb));
            sb6.append(" " + D3.c());
            n17 = n(f9Var, sb6.toString(), hp0Var);
        }
        a(n17);
        doFavoriteEvent.f54090g.f6315a.f370964f.add(n17);
        doFavoriteEvent.f54090g.f6316b.f385920u++;
        return true;
    }

    public static boolean e(android.content.Context context, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var) {
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f376353d = k(f9Var);
        j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
        java.lang.String j17 = f9Var.j();
        ((l41.b2) yVar).getClass();
        k41.k0 b17 = k41.o0.b(j17);
        r45.gp0 gp0Var = new r45.gp0();
        if (b17 != null) {
            java.lang.String a17 = b17.a();
            java.lang.String str = b17.f304017a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (a17 == null) {
                a17 = str;
            }
            gp0Var.O0(a17);
        }
        gp0Var.g0(m(f9Var));
        gp0Var.h0(31);
        gp0Var.m0(f9Var.j());
        gp0Var.z0(true);
        gp0Var.x0(true);
        gp0Var.J1 = hp0Var;
        gp0Var.k0(o(hp0Var.f376353d));
        gp0Var.l0(p(hp0Var.f376353d));
        gp0Var.v0(f9Var.I0());
        a(gp0Var);
        doFavoriteEvent.f54090g.f6315a.f370964f.add(gp0Var);
        doFavoriteEvent.f54090g.f6316b.f385920u++;
        return true;
    }

    public static boolean f(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var, boolean z17, boolean z18) {
        boolean z19;
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f376353d = k(f9Var);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.g0(m(f9Var));
        gp0Var.A0(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false));
        gp0Var.B0(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false));
        gp0Var.i0(com.tencent.mm.vfs.w6.n(gp0Var.V));
        gp0Var.v0(f9Var.I0());
        if (f9Var.Y2()) {
            gp0Var.h0(15);
        } else {
            gp0Var.h0(4);
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "video info null");
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cab;
            return false;
        }
        ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(gp0Var.V, f9Var.getMsgId(), 3);
        wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str = h17.S;
        ((vf0.y1) x1Var2).getClass();
        t21.v2 h18 = t21.d3.h(str);
        if (h18 == null || h18.f415011i != 199) {
            z19 = false;
        } else {
            gp0Var.A0(((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, false));
            h17 = h18;
            z19 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "video length is %d", java.lang.Integer.valueOf(h17.f415008f));
        if (h17.f415008f > ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Bj()) {
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cds;
            return false;
        }
        if (f9Var.Y2() && t21.d3.b(h17.d())) {
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cab;
            return false;
        }
        if (z18) {
            int intValue = ((java.lang.Integer) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(f9Var).f302833d).intValue();
            if (intValue != 0) {
                gp0Var.u0(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "doFillFavVideoEventInfo: isForceOriginal=true, originVideoStatus=%d, set isHighQualityResources=true", java.lang.Integer.valueOf(intValue));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "doFillFavVideoEventInfo: isForceOriginal=true, but VIDEO_STATE_NO_ORIGIN, skip isHighQualityResources");
            }
        }
        gp0Var.n0(h17.f415015m);
        gp0Var.J1 = hp0Var;
        gp0Var.k0(o(hp0Var.f376353d));
        gp0Var.l0(p(hp0Var.f376353d));
        if (com.tencent.mm.storage.z3.m4(hp0Var.f376353d.f377237o)) {
            java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(hp0Var.f376353d.f377237o, true));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                gp0Var.G0(a17);
            }
        }
        a(gp0Var);
        gp0Var.F0(f9Var.getMsgId());
        gp0Var.w0(c01.ia.v(f9Var.G));
        gp0Var.q0(h17.f415008f);
        if (z17) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(h17.g(), "msg", null);
            if (d17 != null) {
                gp0Var.b0((java.lang.String) d17.get(".msg.videomsg.$".concat(z19 ? "cdnrawvideourl" : "cdnvideourl")));
                gp0Var.a0((java.lang.String) d17.get(".msg.videomsg.$".concat(z19 ? "cdnrawvideoaeskey" : "aeskey")));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "cdntra parse video recv xml failed");
            }
        }
        com.tencent.mm.pluginsdk.model.z1.f189507a.b(f9Var, gp0Var);
        doFavoriteEvent.f54090g.f6315a.f370964f.add(gp0Var);
        doFavoriteEvent.f54090g.f6316b.f385909g++;
        wf0.x1 x1Var3 = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z08 = f9Var.z0();
        ((vf0.y1) x1Var3).getClass();
        t21.v2 h19 = t21.d3.h(z08);
        gp0Var.H0(h19.F);
        r45.uf6 uf6Var = h19.E;
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
            gp0Var.O1 = jp0Var;
        }
        return true;
    }

    public static boolean g(android.content.Context context, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, com.tencent.mm.storage.f9 f9Var, int i17) {
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f376353d = k(f9Var);
        doFavoriteEvent.f54090g.f6315a.f370964f.add(n(f9Var, i17 == 1 ? context.getString(com.tencent.mm.R.string.f490382tf) : i17 == 2 ? context.getString(com.tencent.mm.R.string.f490512x6) : i17 == 3 ? context.getString(com.tencent.mm.R.string.f490564ym) : null, hp0Var));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x088f A[Catch: Exception -> 0x08b1, TryCatch #1 {Exception -> 0x08b1, blocks: (B:178:0x063a, B:180:0x0654, B:181:0x0659, B:183:0x065f, B:186:0x066e, B:188:0x06aa, B:189:0x06b9, B:191:0x06c9, B:192:0x06ce, B:194:0x06d6, B:195:0x06db, B:197:0x06e3, B:198:0x06ea, B:200:0x06f0, B:201:0x06f6, B:203:0x0718, B:205:0x0737, B:206:0x073a, B:208:0x073e, B:210:0x0746, B:212:0x074e, B:215:0x0767, B:217:0x0796, B:219:0x07a1, B:221:0x07de, B:223:0x07e8, B:224:0x07ec, B:225:0x087c, B:227:0x088f, B:233:0x0758, B:234:0x081e, B:236:0x0827, B:237:0x06b5, B:243:0x08a7), top: B:177:0x063a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(android.content.Context r26, com.tencent.mm.autogen.events.DoFavoriteEvent r27, com.tencent.mm.storage.f9 r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 2376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.e2.h(android.content.Context, com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.storage.f9, boolean, boolean):boolean");
    }

    public static boolean i(android.content.Context context, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str, java.util.List list, boolean z17, boolean z18) {
        return j(context, doFavoriteEvent, str, list, z17, z18, false);
    }

    public static boolean j(android.content.Context context, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str, java.util.List list, boolean z17, boolean z18, boolean z19) {
        int i17;
        char c17;
        if (doFavoriteEvent == null || list == null || list.isEmpty() || context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavRecordDataSource", "fill favorite event fail, event or msgs is null");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            i17 = 49;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            if (c01.ia.A(f9Var)) {
                int type = f9Var.getType() & 65535;
                if (type == 1) {
                    f9Var.d1(context.getString(com.tencent.mm.R.string.f490570ys));
                } else if (type == 3) {
                    f9Var.d1(context.getString(com.tencent.mm.R.string.f490517xd));
                    f9Var.setType(1);
                } else if (type == 43) {
                    f9Var.d1(context.getString(com.tencent.mm.R.string.f490596zi));
                    f9Var.setType(1);
                } else if (type == 49) {
                    f9Var.d1(context.getString(com.tencent.mm.R.string.f490584z5));
                    f9Var.setType(1);
                }
            }
        }
        java.util.Iterator it6 = list.iterator();
        boolean z27 = false;
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) it6.next();
            if (com.tencent.mm.ui.chatting.component.z4.b(f9Var2)) {
                int type2 = f9Var2.getType() & 65535;
                if (type2 != 3) {
                    if (type2 == 43) {
                        f9Var2.d1(context.getString(com.tencent.mm.R.string.f490596zi));
                        f9Var2.setType(1);
                    } else if (type2 == i17) {
                        java.lang.String j17 = f9Var2.j();
                        ot0.q v17 = !com.tencent.mm.sdk.platformtools.t8.K0(j17) ? ot0.q.v(j17) : null;
                        if (v17 == null) {
                            f9Var2.setType(1);
                            f9Var2.d1("");
                        } else {
                            int i18 = v17.f348666i;
                            if (i18 == 6) {
                                java.lang.String str2 = v17.f348654f;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(context.getString(com.tencent.mm.R.string.f490430uv));
                                sb6.append(str2 != null ? str2 : "");
                                f9Var2.d1(sb6.toString());
                            } else if (i18 == 19) {
                                f9Var2.d1(context.getString(com.tencent.mm.R.string.f490535xv));
                            } else if (i18 == 24) {
                                f9Var2.d1(context.getString(com.tencent.mm.R.string.f490506x0));
                            }
                            f9Var2.setType(1);
                        }
                    }
                    c17 = 1225;
                } else {
                    c17 = 1225;
                    f9Var2.d1(context.getString(com.tencent.mm.R.string.f490517xd));
                    f9Var2.setType(1);
                }
                z27 = true;
                i17 = 49;
            }
            c17 = 1225;
            i17 = 49;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "fillEventInfo isExpired:" + z27);
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        boolean g17 = r01.z.g(str);
        int size = list.size();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (size == 1 && !z18) {
            com.tencent.mm.storage.f9 f9Var3 = (com.tencent.mm.storage.f9) list.get(0);
            if (!f9Var3.t2()) {
                boolean j18 = com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, f9Var3, z19);
                if (z27 && c4Var.f6326l == 0) {
                    c4Var.f6326l = -4;
                }
                return j18;
            }
            java.util.LinkedList linkedList = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var3.getMsgId(), f9Var3.j()).f348581i;
            if (linkedList != null && linkedList.size() == 1) {
                return com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, f9Var3, z19);
            }
            c4Var.f6315a = new r45.bq0();
            c4Var.f6316b = new r45.sq0();
            r45.bq0 bq0Var = c4Var.f6315a;
            r45.jq0 jq0Var = new r45.jq0();
            jq0Var.e(str);
            jq0Var.g(1);
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            jq0Var.i("");
            bq0Var.o(jq0Var);
            c4Var.f6317c = 14;
            boolean h17 = h(context, doFavoriteEvent, f9Var3, z17, z19);
            if (z27 && c4Var.f6326l == 0) {
                c4Var.f6326l = -4;
            }
            return h17;
        }
        c4Var.f6315a = new r45.bq0();
        c4Var.f6316b = new r45.sq0();
        if (g17) {
            long t07 = ((com.tencent.mm.storage.f9) list.get(0)).t0();
            java.lang.String str3 = s01.r.f401924a;
            java.lang.String str4 = r01.q3.Ui().z0(t07).field_bizChatServId;
            if (s01.r.o(str4)) {
                c4Var.f6315a.p(context.getString(com.tencent.mm.R.string.hsy));
            } else {
                s01.a0 d17 = s01.r.d(str);
                if (d17 != null) {
                    c4Var.f6315a.p(context.getString(com.tencent.mm.R.string.f491208cc5, d17.field_userName, s01.r.l(str4)));
                }
            }
        } else if (com.tencent.mm.storage.z3.R4(str)) {
            c4Var.f6315a.p(context.getString(com.tencent.mm.R.string.hsy));
        } else {
            java.lang.String l17 = c01.z1.l();
            boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String b17 = c01.a2.b(str);
            if (b17 == null) {
                b17 = "";
            }
            if (l17.equals(b17)) {
                c4Var.f6315a.p(context.getString(com.tencent.mm.R.string.cc6, l17));
            } else {
                r45.bq0 bq0Var2 = c4Var.f6315a;
                java.lang.String l18 = c01.z1.l();
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                bq0Var2.p(context.getString(com.tencent.mm.R.string.f491208cc5, l18, c01.a2.b(str)));
            }
        }
        r45.bq0 bq0Var3 = c4Var.f6315a;
        java.lang.String str5 = bq0Var3.f370972q;
        r45.jq0 jq0Var2 = new r45.jq0();
        jq0Var2.e(str);
        jq0Var2.g(1);
        boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var2.c(java.lang.System.currentTimeMillis());
        jq0Var2.i("");
        bq0Var3.o(jq0Var2);
        c4Var.f6317c = 14;
        java.util.Iterator it7 = list.iterator();
        boolean z38 = true;
        boolean z39 = false;
        while (it7.hasNext()) {
            if (h(context, doFavoriteEvent, (com.tencent.mm.storage.f9) it7.next(), z17, z19)) {
                z39 = true;
            } else {
                z38 = false;
            }
        }
        if (z39 && c4Var.f6326l > 0) {
            c4Var.f6326l = 0;
        }
        if (z27 && c4Var.f6326l == 0) {
            c4Var.f6326l = -4;
        }
        return z38;
    }

    public static r45.ip0 k(com.tencent.mm.storage.f9 f9Var) {
        r45.ip0 ip0Var = new r45.ip0();
        if (f9Var != null) {
            if (f9Var.A0() == 0) {
                ip0Var.i(f9Var.Q0());
                ip0Var.n(c01.z1.r());
                if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                    ip0Var.k(f9Var.j() != null ? f9Var.j().substring(0, java.lang.Math.max(0, f9Var.j().indexOf(58))) : "");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ip0Var.f377237o) && !f9Var.g3()) {
                        f9Var.d1(f9Var.j().substring(ip0Var.f377237o.length() + 1));
                        if (f9Var.j().length() > 0 && '\n' == f9Var.j().charAt(0)) {
                            f9Var.d1(f9Var.j().substring(1));
                        }
                        if (f9Var.i2()) {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(f9Var.W0()) && f9Var.W0().startsWith(ip0Var.f377237o)) {
                                f9Var.D1(f9Var.W0().substring(ip0Var.f377237o.length() + 1));
                            }
                            if (f9Var.W0().length() > 0 && '\n' == f9Var.W0().charAt(0)) {
                                f9Var.D1(f9Var.W0().substring(1));
                            }
                        }
                    }
                }
            } else {
                ip0Var.i(c01.z1.r());
                ip0Var.n(f9Var.Q0());
                if (com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                    ip0Var.k(ip0Var.f377231f);
                }
            }
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String Q0 = f9Var.Q0();
            ((qv.o) u2Var).getClass();
            if (r01.z.g(Q0)) {
                java.lang.String u07 = f9Var.u0();
                if (u07 == null) {
                    u07 = c01.w9.w(f9Var.G).f37156o;
                }
                ip0Var.k(u07);
            }
            ip0Var.l(1);
            ip0Var.f377239q = f9Var.getCreateTime();
            ip0Var.f377240r = true;
            ip0Var.f377241s = f9Var.I0() + "";
            ip0Var.f377242t = true;
            if (f9Var.I0() > 0) {
                ip0Var.f377235m = f9Var.I0() + "";
                ip0Var.f377236n = true;
            }
        }
        return ip0Var;
    }

    public static java.lang.String l(r45.ip0 ip0Var) {
        return ip0Var.f377237o;
    }

    public static java.lang.String m(com.tencent.mm.storage.f9 f9Var) {
        return f9Var.A0() == 1 ? (com.tencent.mm.storage.z3.R4(f9Var.Q0()) || f9Var.Q0().equals("filehelper")) ? java.lang.String.format("%d", java.lang.Long.valueOf(f9Var.I0())) : java.lang.String.format("%s#%d", f9Var.Q0(), java.lang.Long.valueOf(f9Var.I0())) : java.lang.String.valueOf(f9Var.I0());
    }

    public static r45.gp0 n(com.tencent.mm.storage.f9 f9Var, java.lang.String str, r45.hp0 hp0Var) {
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.g0(m(f9Var));
        gp0Var.h0(1);
        gp0Var.m0(str);
        gp0Var.z0(true);
        gp0Var.x0(true);
        gp0Var.J1 = hp0Var;
        gp0Var.k0(o(hp0Var.f376353d));
        gp0Var.l0(p(hp0Var.f376353d));
        if (com.tencent.mm.storage.z3.m4(hp0Var.f376353d.f377237o)) {
            java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(hp0Var.f376353d.f377237o, true));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                gp0Var.G0(a17);
            }
        }
        return gp0Var;
    }

    public static java.lang.String o(r45.ip0 ip0Var) {
        java.lang.String str = ip0Var.f377237o;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = ip0Var.f377231f;
        }
        if (s01.r.n(str)) {
            return s01.r.l(str);
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return c01.a2.b(str);
    }

    public static java.lang.String p(r45.ip0 ip0Var) {
        return f189286a.format(new java.util.Date(ip0Var.f377239q));
    }

    public static r45.gp0 q(com.tencent.mm.storage.f9 f9Var, ot0.q qVar, int i17) {
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.g0(m(f9Var));
        gp0Var.I0(qVar.V);
        gp0Var.J0(qVar.W);
        gp0Var.K0(qVar.f348674k);
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.B)) {
            gp0Var.d0(qVar.M);
            gp0Var.c0(qVar.U);
            gp0Var.N0(qVar.O);
            gp0Var.L0(qVar.N);
            if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.M)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "getUrlDataItem setNotCheckThumb true");
                gp0Var.z0(true);
            } else {
                gp0Var.z0(false);
                com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "getUrlDataItem setNotCheckThumb false, cdnThumbUrl:" + qVar.M);
            }
        } else {
            gp0Var.f375405d2 = qVar.B;
            gp0Var.f375407e2 = qVar.F;
            gp0Var.N0(qVar.D);
            gp0Var.L0(qVar.C);
            gp0Var.f375409f2 = qVar.E;
            gp0Var.z0(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "getUrlDataItem setNotCheckThumb false, tpthumburl:" + qVar.B);
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true)));
        if (r6Var.m()) {
            gp0Var.B0(r6Var.o());
            gp0Var.z0(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavRecordDataSource", "getUrlDataItem setNotCheckThumb false, thumbFile path:" + r6Var.o());
        }
        gp0Var.x0(true);
        gp0Var.O0(qVar.f348654f);
        gp0Var.m0(qVar.f348658g);
        gp0Var.h0(i17);
        gp0Var.Z(qVar.C2);
        gp0Var.v0(f9Var.I0());
        return gp0Var;
    }
}
