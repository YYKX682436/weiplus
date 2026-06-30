package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class i1 implements com.tencent.mm.plugin.game.model.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.model.d2 f140335a;

    public i1() {
        com.tencent.mm.plugin.game.model.d2 d2Var = new com.tencent.mm.plugin.game.model.d2();
        this.f140335a = d2Var;
        d2Var.f140263f = new java.lang.ref.WeakReference(this);
    }

    public final void a(com.tencent.mm.plugin.game.model.e1 e1Var, int i17) {
        m53.z3 z3Var;
        int i18;
        int i19;
        if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.field_gameMsgId)) {
            e1Var.field_gameMsgId = e1Var.J2.f140245a;
        }
        if (e1Var.field_needReport) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("reddot_strategy", com.tencent.mm.plugin.game.commlib.util.d.a() ? "1" : "0");
            hashMap.put("channel", java.lang.Integer.toString(e1Var.field_channel));
            dm.r5 y07 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ni().y0(e1Var.field_contentId);
            int i27 = 15;
            if (y07 != null) {
                hashMap.put("preContentId", e1Var.field_contentId);
                hashMap.put("preSvrMsgId", java.lang.Long.toString(y07.field_consumeMsgId));
                i18 = 15;
            } else {
                i18 = i17;
            }
            if (i18 == 0) {
                if (q(e1Var)) {
                    i18 = 8;
                } else {
                    m33.b1 a17 = m33.a1.a();
                    boolean Vi = a17 != null ? ((com.tencent.mm.plugin.game.h0) a17).Vi(com.tencent.mm.sdk.platformtools.x2.f193071a) : false;
                    boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
                    boolean z17 = (c01.z1.j() & 8388608) != 0;
                    if (isTeenMode) {
                        i27 = 10;
                    } else if (!Vi) {
                        i27 = 6;
                    } else if (z17) {
                        i27 = 9;
                    } else {
                        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).getClass();
                        if (!((c01.z1.h() & 2048) != 2048)) {
                            i27 = 7;
                        } else if (((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ni().y0(e1Var.field_contentId) == null) {
                            i27 = 0;
                        }
                    }
                    i19 = i27;
                    com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, 0, 0, 18, i19, e1Var.field_appId, 0, e1Var.S2, e1Var.field_gameMsgId, e1Var.T2, com.tencent.mm.game.report.l.a("resource", java.lang.String.valueOf(e1Var.f140279d2.f140410a), e1Var.U2, hashMap));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 0L, 1L, false);
                }
            }
            i19 = i18;
            com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, 0, 0, 18, i19, e1Var.field_appId, 0, e1Var.S2, e1Var.field_gameMsgId, e1Var.T2, com.tencent.mm.game.report.l.a("resource", java.lang.String.valueOf(e1Var.f140279d2.f140410a), e1Var.U2, hashMap));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 0L, 1L, false);
        }
        long j17 = com.tencent.mm.sdk.platformtools.o4.M("del_game_msg").getLong("del_timestamp", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.tencent.mm.plugin.game.commlib.i.e() != null) {
            z3Var = com.tencent.mm.plugin.game.commlib.i.f139381a.MessageDBStrategy;
        } else {
            com.tencent.mm.plugin.game.commlib.i.s();
            z3Var = null;
        }
        if (z3Var == null || !z3Var.f324230d) {
            return;
        }
        if (currentTimeMillis - j17 > (z3Var.f324231e == 0 ? 1209600000 : r1 * com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER)) {
            com.tencent.mm.sdk.platformtools.o4.M("del_game_msg").putLong("del_timestamp", currentTimeMillis);
            com.tencent.mm.sdk.platformtools.o4.M("del_game_msg").putBoolean("del_mark", true);
        }
    }

    public final void b(java.lang.String str) {
        com.tencent.mm.plugin.game.model.e1 m17 = m();
        if (m17 != null) {
            java.lang.String str2 = m17.field_gameMsgId;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(str)) {
                g();
            }
        }
    }

    public void c(int i17) {
        boolean z17 = false;
        if (!kotlin.jvm.internal.o.b(((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_report_empty_redpoint, "0"), "0")) {
            long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_GAME_REDDOT_LAST_EMPTY_REPORT_TIME_SEC_LONG, 0L);
            long t18 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_GAME_REDDOT_EMPTY_REPORT_MIN_DURATION_SEC_LONG, 86400L);
            com.tencent.mm.sdk.platformtools.t8.i1();
            if (java.lang.Math.abs(com.tencent.mm.sdk.platformtools.t8.H1(t17)) >= t18) {
                z17 = true;
            }
        }
        if (z17) {
            m53.z4 z4Var = new m53.z4();
            z4Var.f324233d = "zh_CN";
            z4Var.f324234e = "";
            m53.g gVar = new m53.g();
            gVar.f323687d = android.os.Build.VERSION.SDK_INT;
            gVar.f323688e = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
            z4Var.f324235f = gVar;
            z4Var.f324236g = i17;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = z4Var;
            lVar.f70665b = new m53.a5();
            lVar.f70666c = "/cgi-bin/mmgame-bin/gamemsgpushappsvr/reportinactiveuser";
            lVar.f70667d = 5063;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_REDDOT_LAST_EMPTY_REPORT_TIME_SEC_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.game.model.j1(this));
        }
    }

    public void d() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.GAME_INDEX_BANNER_MSGID_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        com.tencent.mm.plugin.game.model.e1 L0 = longValue != 0 ? ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.field_isHidden != 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, 0L);
        b(L0.field_gameMsgId);
    }

    public void e() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.GAME_INDEX_BUBBLE_MSGID_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        com.tencent.mm.plugin.game.model.e1 L0 = longValue != 0 ? ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.field_isHidden != 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, 0L);
        b(L0.field_gameMsgId);
    }

    public void f() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.GAME_INDEX_FLOATLAYER_MSGID_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        com.tencent.mm.plugin.game.model.e1 L0 = longValue != 0 ? ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.field_isHidden != 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, 0L);
        b(L0.field_gameMsgId);
    }

    public void g() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        com.tencent.mm.plugin.game.model.e1 L0 = longValue != 0 ? ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.field_isHidden != 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, 0L);
    }

    public void h(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.game.model.e1 o17 = o();
        if (o17 != null) {
            java.lang.String str2 = o17.field_gameMsgId;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(str)) {
                ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().c(com.tencent.mm.plugin.game.model.n1.GAME_REDDOT_EXIT_REVOKE);
            }
        }
        com.tencent.mm.plugin.game.model.e1 b17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().b1(str);
        boolean z19 = false;
        if (b17 == null || !str.equals(b17.field_gameMsgId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageService", "dont have msgId:%s for delete", str);
            b17 = new com.tencent.mm.plugin.game.model.e1();
            b17.field_gameMsgId = str;
        } else {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().delete(b17, new java.lang.String[0]);
            z19 = true;
        }
        int i17 = z19 ? 101 : 102;
        if (z17) {
            com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, 0, 0, 403, i17, b17.field_appId, 0, b17.S2, b17.field_gameMsgId, b17.T2, com.tencent.mm.game.report.l.a("resource", java.lang.String.valueOf(b17.f140279d2.f140410a), b17.U2, null));
        }
    }

    public final void i(java.lang.String str, int i17, boolean z17) {
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_GAME_REDDOT_LAST_PULL_MSG_TIME_SEC_LONG, 0L);
        long t18 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_GAME_REDDOT_PULL_MSG_MIN_DURATION_SEC_LONG, 0L);
        if (t18 != 0 && com.tencent.mm.sdk.platformtools.t8.H1(t17) < t18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameMessageService", "gamelog.srv_msg, service, reddotScore, pullmsg need pull, but pullMsgMinDurationSec is too close , current interval = %d  , pullMsgMinDurationSec = %d", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.H1(t17)), java.lang.Long.valueOf(t18));
            return;
        }
        dm.q5 q5Var = new dm.q5();
        q5Var.field_dateTimeRange = str;
        q5Var.field_pullCount = i17 + 1;
        if (z17) {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ui().insert(q5Var);
        } else {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ui().update(q5Var, new java.lang.String[0]);
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.model.l1(this, ""));
    }

    public com.tencent.mm.plugin.game.model.e1 j() {
        com.tencent.mm.plugin.game.model.e1 L0;
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.GAME_INDEX_BUBBLE_MSGID_LONG_SYNC, 0L)).longValue();
        if (longValue == 0 || (L0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue)) == null || L0.field_isHidden != 0 || r(L0)) {
            return null;
        }
        return L0;
    }

    public com.tencent.mm.plugin.game.model.e1 k() {
        com.tencent.mm.plugin.game.model.e1 m17 = m();
        if (m17 == null) {
            m17 = l();
        }
        if (m17 == null) {
            m17 = j();
        }
        if (m17 == null) {
            long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.GAME_INDEX_BANNER_MSGID_LONG_SYNC, 0L)).longValue();
            if (longValue == 0 || (m17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue)) == null || m17.field_isHidden != 0 || r(m17)) {
                m17 = null;
            }
        }
        if (m17 != null) {
            m17.t0();
        }
        return m17;
    }

    public com.tencent.mm.plugin.game.model.e1 l() {
        com.tencent.mm.plugin.game.model.e1 L0;
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.GAME_INDEX_FLOATLAYER_MSGID_LONG_SYNC, 0L)).longValue();
        if (longValue == 0 || (L0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue)) == null || L0.field_isHidden != 0 || r(L0)) {
            return null;
        }
        return L0;
    }

    public com.tencent.mm.plugin.game.model.e1 m() {
        com.tencent.mm.plugin.game.model.e1 n17 = n();
        if (n17 == null || r(n17)) {
            return null;
        }
        return n17;
    }

    public com.tencent.mm.plugin.game.model.e1 n() {
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L)).longValue();
        com.tencent.mm.plugin.game.model.e1 L0 = longValue != 0 ? ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.field_isHidden != 0) {
            return null;
        }
        return L0;
    }

    public com.tencent.mm.plugin.game.model.e1 o() {
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L)).longValue();
        if (longValue != 0) {
            return ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue);
        }
        return null;
    }

    public boolean p(com.tencent.mm.plugin.game.model.e1 e1Var) {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_MESSAGE_SETTING_HIDE_CONF_STRING, "");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str != null ? str : "";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str2);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    arrayList.add(com.tencent.mm.plugin.game.model.p.a(jSONArray.optString(i17)));
                }
            } catch (org.json.JSONException unused) {
            }
        }
        long i18 = com.tencent.mm.sdk.platformtools.t8.i1();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.game.model.p pVar = (com.tencent.mm.plugin.game.model.p) it.next();
            if (pVar.f140396a <= i18 && pVar.f140397b >= i18) {
                if (e1Var.f140279d2.f140422m == pVar.f140398c) {
                    return true;
                }
                if (((java.util.ArrayList) pVar.f140399d).contains(e1Var.field_gameMsgId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean q(com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (e1Var == null) {
            return false;
        }
        com.tencent.mm.plugin.game.model.q0 q0Var = e1Var.f140279d2;
        if (q0Var.f140423n) {
            return false;
        }
        java.lang.String valueOf = java.lang.String.valueOf(q0Var.f140422m);
        java.lang.String a17 = com.tencent.mm.plugin.game.model.f.a();
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            return false;
        }
        for (java.lang.String str : a17.split(",")) {
            if (str.equals(valueOf)) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (e1Var == null) {
            return true;
        }
        return e1Var.field_expireTime < java.lang.System.currentTimeMillis() / 1000;
    }

    public void s(com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (e1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageService", "onReceiveNewReddotCmd message is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageService", "onReceiveNewReddotCmd gameMsgId:%s msgType:%d", e1Var.field_gameMsgId, java.lang.Integer.valueOf(e1Var.field_msgType));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e1Var.field_gameMsgId)) {
            com.tencent.mm.plugin.game.model.e1 k17 = k();
            if (k17 != null && e1Var.field_gameMsgId.equals(k17.field_gameMsgId)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageService", "onReceiveNewReddotCmd same reddot already showing, gameMsgId:%s currentMsgId:%d newMsgId:%d", e1Var.field_gameMsgId, java.lang.Long.valueOf(k17.field_msgId), java.lang.Long.valueOf(e1Var.field_msgId));
                return;
            }
            com.tencent.mm.plugin.game.model.o1 Di = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
            java.lang.String str = e1Var.field_gameMsgId;
            Di.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageService", "onReceiveNewReddotCmd delete old message, gameMsgId:%s deleted:%b", e1Var.field_gameMsgId, java.lang.Boolean.valueOf(Di.execSQL("GameRawMessage", "delete from GameRawMessage where gameMsgId = \"" + str + "\"")));
        }
        a(e1Var, u(e1Var));
    }

    public final void t(com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (e1Var == null) {
            return;
        }
        com.tencent.mm.plugin.game.model.q0 q0Var = e1Var.f140279d2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f140411b)) {
            return;
        }
        if (q0Var.f140421l) {
            r53.f.B(q0Var.f140411b, 0.083333336f);
        } else {
            r53.f.B(q0Var.f140411b, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x04ca, code lost:
    
        if (r4.moveToFirst() != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x04cc, code lost:
    
        r9 = new com.tencent.mm.plugin.game.model.e1();
        r9.convertFrom(r4);
        r10.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x04db, code lost:
    
        if (r4.moveToNext() != false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x04dd, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x018b, code lost:
    
        if (com.tencent.mm.pluginsdk.model.app.w.r(r5, r0) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x01bd, code lost:
    
        if (com.tencent.mm.pluginsdk.model.app.w.r(r5, r0) != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0954  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u(com.tencent.mm.plugin.game.model.e1 r33) {
        /*
            Method dump skipped, instructions count: 2449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.i1.u(com.tencent.mm.plugin.game.model.e1):int");
    }

    public final void v(com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.G2.f140389a)) {
            d();
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_INDEX_BANNER_MSGID_LONG_SYNC, java.lang.Long.valueOf(e1Var.field_msgId));
        }
    }

    public final void w(com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (e1Var.f140280e2) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_INDEX_BUBBLE_MSGID_LONG_SYNC, java.lang.Long.valueOf(e1Var.field_msgId));
        } else {
            e();
        }
    }

    public void x(com.tencent.mm.plugin.game.model.e1 e1Var) {
        if ((java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.M("game_redot").getLong("red_dot_exit_time", 0L)) / 1000 > com.tencent.mm.plugin.game.commlib.i.j().f323564h) {
            z(e1Var);
            y(e1Var);
            w(e1Var);
            v(e1Var);
        }
    }

    public final void y(com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f140291p2.f140323a)) {
            f();
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_INDEX_FLOATLAYER_MSGID_LONG_SYNC, java.lang.Long.valueOf(e1Var.field_msgId));
        }
    }

    public boolean z(com.tencent.mm.plugin.game.model.e1 e1Var) {
        if (!e1Var.f140277c2) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L);
            return false;
        }
        if (r53.f.n(e1Var.K2.f140561s)) {
            return false;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, java.lang.Long.valueOf(e1Var.field_msgId));
        return true;
    }
}
