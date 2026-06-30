package com.tencent.mm.pluginsdk.model;

/* loaded from: classes11.dex */
public class q0 implements com.tencent.mm.modelbase.i1 {
    @Override // com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        boolean z17;
        com.tencent.mm.storage.f9 o27;
        r45.j4 j4Var = p0Var.f70726a;
        if (j4Var == null || j4Var.f377560g != 47) {
            com.tencent.mars.xlog.Log.f("MicroMsg.EmojiExtension", "parseEmojiMsg failed, invalid cmdAM");
            return null;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        java.lang.String g18 = x51.j1.g(j4Var.f377559f);
        if (((java.lang.String) c01.d9.b().p().l(2, null)).equals(g17)) {
            g17 = g18;
        }
        java.lang.String g19 = x51.j1.g(j4Var.f377561h);
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        long j17 = j4Var.f377568r;
        java.lang.String str = j4Var.f377566p;
        ((y12.h) wi6).getClass();
        if (com.tencent.mm.storage.z3.K3(g17)) {
            g30.e eVar = (g30.e) i95.n0.c(g30.e.class);
            eVar.getClass();
            com.tencent.mm.storage.g5 a17 = com.tencent.mm.storage.g5.a(com.tencent.mm.sdk.platformtools.aa.d(g19, "msg", null), g17, g19, str);
            if (a17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "prepareEmoji failed. emoji msg info is null.");
            } else {
                a17.f193958h = j17;
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "prepareEmoji msgSvrId[%d], stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
                gm0.j1.e().j(new g30.c(eVar, a17.f193957g));
                r45.j4 j4Var2 = p0Var.f70726a;
                if (j4Var2 != null && j4Var2.f377568r == a17.f193958h) {
                    a17.f193969s = c01.w9.q(p0Var);
                    a17.f193970t = j4Var2.f377569s;
                    a17.f193971u = j4Var2.f377565o;
                }
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(a17.f193954d);
                if (u17 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "downloadEmoji: db emoji info not null %s msgInfomd5 %s svrId %s", u17.field_md5, a17.f193954d, java.lang.Long.valueOf(a17.f193958h));
                    n22.m.b(a17, u17);
                    ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                    com.tencent.mm.storage.n5.f().c().G2(u17);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "downloadEmoji: create emoji info %s", a17.f193954d);
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "createEmojiInfo: %s", a17.f193954d);
                    u17 = new com.tencent.mm.storage.emotion.EmojiInfo();
                    n22.m.b(a17, u17);
                    u17.field_temp = 1;
                    u17.field_state = 8;
                    u17.field_catalog = 65;
                    ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                    com.tencent.mm.storage.n5.f().c().J0(u17);
                }
                if (a17.f193968r) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "insertEmojiMsg: %s, %s msgSvrId: %s", a17.f193954d, u17.field_md5, java.lang.Long.valueOf(a17.f193958h));
                    if (a17.f193958h == 0 || (o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(a17.f193951a, a17.f193958h)) == null || o27.I0() != a17.f193958h) {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(a17.f193951a, true);
                        if (n17 == null || ((int) n17.E2) == 0) {
                            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3(a17.f193951a);
                            z3Var.setType(2);
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
                        }
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.setType(47);
                        f9Var.u1(a17.f193951a);
                        f9Var.j1(c01.z1.J(a17.f193952b) ? 1 : 0);
                        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).fj(f9Var, u17.getMd5());
                        f9Var.o1(a17.f193958h);
                        f9Var.d1(com.tencent.mm.storage.y4.e(a17.f193952b, 0L, (u17.k() || u17.B1()) ? false : true, u17.getMd5(), false, a17.f193959i));
                        f9Var.e1(c01.w9.m(f9Var.Q0(), a17.f193971u));
                        f9Var.r1(3);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f193960j)) {
                            f9Var.u3(a17.f193960j);
                        }
                        c01.w9.n(f9Var, p0Var);
                        c01.w9.x(f9Var);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "start download emoji %s, fileExist %b", u17.getMd5(), java.lang.Boolean.valueOf(u17.E0()));
                if (!u17.E0()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiBypService", "cdnurl and cncrypt url is null. ");
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(a17.f193951a, "update", null, 0));
                }
            }
        } else {
            com.tencent.mm.feature.emoji.b0 b0Var = (com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class);
            b0Var.getClass();
            com.tencent.mm.storage.g5 a18 = com.tencent.mm.storage.g5.a(com.tencent.mm.sdk.platformtools.aa.d(g19, "msg", null), g17, g19, str);
            if (a18 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "prepareEmoji failed. emoji msg info is null.");
            } else {
                a18.f193958h = j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "summerbadcr prepareEmoji msgSvrId[%d]", java.lang.Long.valueOf(j17));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a18.E)) {
                    byte[] decode = android.util.Base64.decode(a18.E, 0);
                    r45.sq4 sq4Var = new r45.sq4();
                    try {
                        sq4Var.parseFrom(decode);
                        com.tencent.mm.storage.n5.f().a().y0(sq4Var, a18.f193957g, a18.f193954d);
                        java.util.LinkedList linkedList = sq4Var.f385925d;
                        if (linkedList != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "emoji desc %s", java.lang.Integer.valueOf(linkedList.size()));
                        }
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiFeatureService", e17, "", new java.lang.Object[0]);
                    }
                }
                java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("C2CEmojiNotAutoDownloadTimeRange");
                int i17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.f97533a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                    try {
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiLogic", "isInNotAutoDownloadTimeRange :%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                    }
                    if (d11.b.a(d17)) {
                        z17 = true;
                        b0Var.wi(a18, p0Var, !z17);
                    }
                }
                z17 = false;
                b0Var.wi(a18, p0Var, !z17);
            }
        }
        c01.ea w17 = c01.w9.w(j4Var.f377566p);
        if (w17 == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiExtension", "bizClientMsgId = %s", w17.f37146e);
        if (w17.f37150i == null || w17.f37151j != 1) {
            return null;
        }
        java.lang.String g27 = x51.j1.g(j4Var.f377558e);
        c01.d9.b().p().w(73729, 1);
        com.tencent.mm.storage.t8 t8Var = new com.tencent.mm.storage.t8();
        t8Var.field_content = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h7a);
        t8Var.field_createtime = com.tencent.mm.sdk.platformtools.t8.i1();
        t8Var.field_imgpath = "";
        t8Var.field_sayhicontent = t8Var.field_content;
        t8Var.field_sayhiuser = g27;
        t8Var.field_scene = 18;
        int i18 = j4Var.f377562i;
        t8Var.field_status = i18 > 3 ? i18 : 3;
        t8Var.field_svrid = j4Var.f377568r;
        t8Var.field_talker = g27;
        t8Var.field_type = j4Var.f377560g;
        t8Var.field_isSend = 0;
        t8Var.field_sayhiencryptuser = g27;
        t8Var.field_ticket = w17.f37150i;
        r21.w.Bi().insert(t8Var);
        com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent = new com.tencent.mm.autogen.events.LbsSayHiEvent();
        lbsSayHiEvent.f54464g.f7426a = g27;
        lbsSayHiEvent.e();
        return null;
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
