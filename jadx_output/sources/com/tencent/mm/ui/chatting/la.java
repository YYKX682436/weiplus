package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class la {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f201932a = "";

    public static boolean a(com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        return f9Var == null || !f9Var.k2() || (v17 = ot0.q.v(f9Var.j())) == null || v17.f348666i != 40;
    }

    public static boolean b(com.tencent.mm.pluginsdk.ui.tools.h0 h0Var) {
        org.json.JSONObject jSONObject;
        if (h0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(h0Var.f191667d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavMsgHandle", "checkLiteAppCanFav: null");
            return false;
        }
        if (!new com.tencent.mm.repairer.config.fav.RepairerConfigFavAddByLongPressLiteAppCell().p()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMsgHandle", "checkLiteAppCanFav: expt skip");
            return false;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(h0Var.f191667d);
            if (jSONObject2.has("favOptions") && (jSONObject = jSONObject2.getJSONObject("favOptions")) != null) {
                int i17 = jSONObject.getInt("bizId");
                if (i17 == 2 || i17 == 1) {
                    return true;
                }
            }
            return false;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavMsgHandle", e17, "checkLiteAppCanFav err", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean c(com.tencent.mm.storage.f9 f9Var) {
        ot0.a aVar;
        if (f9Var == null) {
            return true;
        }
        if (!com.tencent.mm.storage.z3.m4(f9Var.Q0()) && !com.tencent.mm.storage.z3.m4(c01.w9.s(f9Var.j()))) {
            return true;
        }
        if (f9Var.k2() || f9Var.n2()) {
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                return true;
            }
            ez.v0 v0Var = ez.v0.f257777a;
            if (v0Var.k(java.lang.Integer.valueOf(v17.f348666i))) {
                return false;
            }
            if (!v0Var.j(java.lang.Integer.valueOf(v17.f348666i)) || com.tencent.mm.sdk.platformtools.t8.K0(v17.A)) {
                int i17 = v17.f348666i;
                if (i17 == 19) {
                    java.util.Iterator it = bt3.g2.A(v17.f348663h0).f387465f.iterator();
                    while (it.hasNext()) {
                        r45.gp0 gp0Var = (r45.gp0) it.next();
                        java.lang.String t17 = bt3.g2.t(gp0Var, f9Var.Q0(), f9Var.getMsgId(), 1);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375411g2) && !com.tencent.mm.vfs.w6.j(t17)) {
                            return false;
                        }
                        java.lang.String H = bt3.g2.H(gp0Var, f9Var.Q0(), f9Var.getMsgId(), 1);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375405d2) && !com.tencent.mm.vfs.w6.j(H)) {
                            return false;
                        }
                    }
                } else if (i17 == 48 && ((aVar = (ot0.a) v17.y(ot0.a.class)) == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.G) || com.tencent.mm.sdk.platformtools.t8.K0(aVar.I))) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavMsgHandle", "hy: can not fav or retransmit because of not having remote url");
                    return false;
                }
            } else {
                com.tencent.mm.pluginsdk.model.app.d o17 = com.tencent.mm.pluginsdk.model.app.k0.o(f9Var, v17.f348694p);
                if (o17 != null && (!com.tencent.mm.vfs.w6.j(o17.field_fileFullPath) || com.tencent.mm.vfs.w6.k(o17.field_fileFullPath) != o17.field_totalLen)) {
                    return false;
                }
            }
        }
        if (f9Var.J2()) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            int i18 = b27.f322635c;
            int i19 = b27.f322636d;
            if (!(i18 >= i19 && i19 != 0)) {
                return false;
            }
        }
        if (f9Var.isVideo() || f9Var.Y2()) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(z07);
            if (!(h17 == null || h17.f415011i == 199)) {
                return false;
            }
        }
        return true;
    }

    public final void d(java.lang.Object obj, x72.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.storage.f9 f9Var, java.util.HashSet hashSet) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavMsgHandle", "oreh downloadTpUrl msgId:%d, mediaId:%s, path:%s", java.lang.Long.valueOf(f9Var.getMsgId()), str5, str4);
        hashSet.add(str5);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_FavMsgHandle_1";
        mVar.field_fileType = 19;
        mVar.field_authKey = str3;
        mVar.field_aesKey = str2;
        mVar.f241811z = str;
        mVar.field_fullpath = com.tencent.mm.vfs.w6.i(str4, false);
        mVar.field_mediaId = str5;
        mVar.f241787f = new com.tencent.mm.ui.chatting.ea(this, f9Var, str4, hashSet, obj, bVar);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FavMsgHandle", "recv openim record, add task failed");
    }

    public final void e(java.lang.Object obj, x72.b bVar, boolean z17) {
        java.lang.String str = "";
        this.f201932a = "";
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, bVar.f452435d, z17);
        boolean z18 = obj instanceof com.tencent.mm.ui.MMFragment;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (z18) {
            c4Var.f6324j = (com.tencent.mm.ui.MMFragment) obj;
        } else if (obj instanceof android.app.Activity) {
            c4Var.f6323i = (android.app.Activity) obj;
        }
        c4Var.f6327m = 43;
        doFavoriteEvent.e();
        if (doFavoriteEvent.f54091h.f6433a == 0) {
            com.tencent.mm.storage.f9 f9Var = bVar.f452435d;
            if (f9Var.k2()) {
                v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
                ot0.u.a(f9Var);
                ((u90.a) vVar).getClass();
                com.tencent.mm.modelstat.e.f71505a.getClass();
            } else {
                ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
                com.tencent.mm.modelstat.e.f71505a.getClass();
            }
            if (f9Var.k2() || f9Var.t2()) {
                java.lang.String a17 = c01.n2.a("" + f9Var.I0());
                c01.l2 c17 = c01.n2.d().c(a17, true);
                c17.i("prePublishId", "msg_" + f9Var.I0());
                c17.i("preUsername", com.tencent.mm.ui.chatting.viewitems.a0.v(f9Var, bVar.f452433b, bVar.f452432a));
                c17.i("preChatName", bVar.f452434c);
                c17.i("preMsgIndex", 0);
                c17.i("sendAppMsgScene", 1);
                ((n34.p4) ((p94.o0) i95.n0.c(p94.o0.class))).wi("adExtStr", c17, f9Var);
                c4Var.f6322h = a17;
            }
            java.lang.String j17 = f9Var.j();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            ot0.q v17 = ot0.q.v(j17);
            if (v17 != null && v17.f348666i == 5 && v17.f348674k != null) {
                long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
                try {
                    str = java.net.URLEncoder.encode(v17.f348674k, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavMsgHandle", e17, "", new java.lang.Object[0]);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13378, str, java.lang.Long.valueOf(i17), 2, 2, 1);
            }
            x72.a aVar = bVar.f452436e;
            if (aVar != null) {
                ((com.tencent.mm.ui.chatting.component.hh) aVar).f199166a.f198580d.y();
            }
            com.tencent.mm.ui.chatting.e.c(com.tencent.mm.ui.chatting.c.Fav, com.tencent.mm.ui.chatting.d.Samll, f9Var, 0);
        }
    }
}
